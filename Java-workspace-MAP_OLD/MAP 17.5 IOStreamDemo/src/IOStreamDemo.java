import java.io.*;

public class IOStreamDemo {
// genera una eccezione a console
public static void main(String[] args)
	throws IOException {
	
	
	// 1. Reading input by lines:
	BufferedReader in =new BufferedReader(new FileReader("IOStreamDemo.java"));
	String s, s2 = new String();
	while((s = in.readLine())!= null)
		s2 += s + "\n";
	in.close();
	// 1b. Reading standard input:
	BufferedReader stdin =new BufferedReader(new InputStreamReader(System.in));
	System.out.print("Enter a line:");
	System.out.println(stdin.readLine());
	
	
	// 2. Input from memory
	StringReader in2 = new StringReader(s2);
	int c;
	while((c = in2.read()) != -1)
		//read() legge un carattere alla volta e 
		//restituisce un int
		System.out.print((char)c);
		// 3. Formatted memory input
		// per leggere in modo formattato si usa 
		// DataInputStream che lavora su byte e non su
		// caratteri unicode
	try {
		DataInputStream in3 =new DataInputStream(new ByteArrayInputStream(s2.getBytes()));
		while(true)
			System.out.print((char)in3.readByte());
	} catch(EOFException e) {
		System.err.println("End of stream");
	}
	//per verificare la fine del file si sarebbe 
	//potuto utilizzare il metodo available(), che 
	//restituisce il numero di byte ancora 
	//disponibili
	
	
	// 4. File output
	try {
		BufferedReader in4 =new BufferedReader(new StringReader(s2));
		PrintWriter out1 =new PrintWriter(new BufferedWriter(new FileWriter("IODemo.out")));
		int lineCount = 1;
		while((s = in4.readLine()) != null )
			out1.println(lineCount++ + ": " + s);
		out1.close();//<- ora effettua il flusch
	} catch(EOFException e) {
		System.err.println("End of stream");
	}
	
	
	// 5. Storing & recovering data
	try {
		DataOutputStream out2 =new DataOutputStream(new BufferedOutputStream(new FileOutputStream("Data.txt")));
		out2.writeDouble(3.14159);
		out2.writeChars("That was pi\n");
		out2.writeBytes("That was pi\n");
		out2.close();
		DataInputStream in5 = new DataInputStream(new BufferedInputStream(new FileInputStream("Data.txt")));
		BufferedReader in5br =new BufferedReader(new InputStreamReader(in5));
		// Must use DataInputStream for data:
		System.out.println(in5.readDouble());
		// Can now use the "proper" readLine():
		System.out.println(in5br.readLine());
		// But the line comes out funny.
		// The one created with writeBytes is OK:
		System.out.println(in5br.readLine());
	} catch(EOFException e) {
		System.err.println("End of stream");
	}
	// 6. Reading/writing random access files
	RandomAccessFile rf =new RandomAccessFile("rtest.dat", "rw");
	for(int i = 0; i < 10; i++)
		rf.writeDouble(i*1.414);
	rf.close();
	rf =new RandomAccessFile("rtest.dat", "rw");
	rf.seek(5*8);
	rf.writeDouble(47.0001);
	rf.close();
	rf = new RandomAccessFile("rtest.dat", "r");
	for(int i = 0; i < 10; i++)
		System.out.println("Value " + i + ": " + rf.readDouble());
	rf.close();
	}
}
/*
Output
java IOStreamDemo

Enter a line:pippo il simpatico
pippo il simpatico





import java.io.*;

public class IOStreamDemo {
// genera una eccezione a console
public static void main(String[] args)
throws IOException {
// 1. Reading input by lines:
BufferedReader in =new BufferedReader(
new FileReader("IOStreamDemo.java"));
String s, s2 = new String();
while((s = in.readLine())!= null)
s2 += s + "\n";
in.close();
// 1b. Reading standard input:
BufferedReader stdin =
new BufferedReader(
new InputStreamReader(System.in));
System.out.print("Enter a line:");
System.out.println(stdin.readLine());
// 2. Input from memory
StringReader in2 = new StringReader(s2);
int c;
while((c = in2.read()) != -1)
//read() legge un carattere alla volta e
//restituisce un int
System.out.print((char)c);
// 3. Formatted memory input
// per leggere in modo formattato si usa
// DataInputStream che lavora su byte e non su
// caratteri unicode
try {
DataInputStream in3 =
new DataInputStream(
 new ByteArrayInputStream(s2.getBytes()));
while(true)
System.out.print((char)in3.readByte());

} catch(EOFException e) {
System.err.println("End of stream");
}
//per verificare la fine del file si sarebbe
//potuto utilizzare il metodo available(), che
//restituisce il numero di byte ancora
//disponibili
// 4. File output
try {
BufferedReader in4 =
new BufferedReader(
new StringReader(s2));
PrintWriter out1 =new PrintWriter(
new BufferedWriter(new FileWriter("IODemo.out")));
int lineCount = 1;
while((s = in4.readLine()) != null )
out1.println(lineCount++ + ": " + s);
out1.close();//<- ora effettua il flusch
} catch(EOFException e) {
System.err.println("End of stream");
}

// 5. Storing & recovering data
try {
DataOutputStream out2 =
new DataOutputStream(
new BufferedOutputStream(
new FileOutputStream("Data.txt")));
out2.writeDouble(3.14159);
out2.writeChars("That was pi\n");
out2.writeBytes("That was pi\n");
out2.close();
DataInputStream in5 = new DataInputStream(
new BufferedInputStream(
new FileInputStream("Data.txt")));
BufferedReader in5br =
new BufferedReader(
new InputStreamReader(in5));
// Must use DataInputStream for data:
System.out.println(in5.readDouble());
// Can now use the "proper" readLine():
System.out.println(in5br.readLine());
// But the line comes out funny.
// The one created with writeBytes is OK:
System.out.println(in5br.readLine());
} catch(EOFException e) {
System.err.println("End of stream");
}
// 6. Reading/writing random access files
RandomAccessFile rf =
new RandomAccessFile("rtest.dat", "rw");
for(int i = 0; i < 10; i++)
rf.writeDouble(i*1.414);
rf.close();
rf =new RandomAccessFile("rtest.dat", "rw");
rf.seek(5*8);
rf.writeDouble(47.0001);
rf.close();
rf = new RandomAccessFile("rtest.dat", "r");
for(int i = 0; i < 10; i++)
System.out.println(
"Value " + i + ": " +
rf.readDouble());
rf.close();
}
}
import java.io.*;

public class IOStreamDemo {
// genera una eccezione a console
public static void main(String[] args)
throws IOException {
// 1. Reading input by lines:
BufferedReader in =new BufferedReader(
new FileReader("IOStreamDemo.java"));
String s, s2 = new String();
while((s = in.readLine())!= null)
s2 += s + "\n";
in.close();
// 1b. Reading standard input:
BufferedReader stdin =
new BufferedReader(
new InputStreamReader(System.in));
System.out.print("Enter a line:");
System.out.println(stdin.readLine());
// 2. Input from memory
StringReader in2 = new StringReader(s2);
int c;
while((c = in2.read()) != -1)
//read() legge un carattere alla volta e
//restituisce un int
System.out.print((char)c);
// 3. Formatted memory input
// per leggere in modo formattato si usa
// DataInputStream che lavora su byte e non su
// caratteri unicode
try {
DataInputStream in3 =
new DataInputStream(
 new ByteArrayInputStream(s2.getBytes()));
while(true)
System.out.print((char)in3.readByte());

} catch(EOFException e) {
System.err.println("End of stream");
}
//per verificare la fine del file si sarebbe
//potuto utilizzare il metodo available(), che
//restituisce il numero di byte ancora
//disponibili
// 4. File output
try {
BufferedReader in4 =
new BufferedReader(
new StringReader(s2));
PrintWriter out1 =new PrintWriter(
new BufferedWriter(new FileWriter("IODemo.out")));
int lineCount = 1;
while((s = in4.readLine()) != null )
out1.println(lineCount++ + ": " + s);
out1.close();//<- ora effettua il flusch
} catch(EOFException e) {
System.err.println("End of stream");
}

// 5. Storing & recovering data
try {
DataOutputStream out2 =
new DataOutputStream(
new BufferedOutputStream(
new FileOutputStream("Data.txt")));
out2.writeDouble(3.14159);
out2.writeChars("That was pi\n");
out2.writeBytes("That was pi\n");
out2.close();
DataInputStream in5 = new DataInputStream(
new BufferedInputStream(
new FileInputStream("Data.txt")));
BufferedReader in5br =
new BufferedReader(
new InputStreamReader(in5));
// Must use DataInputStream for data:
System.out.println(in5.readDouble());
// Can now use the "proper" readLine():
System.out.println(in5br.readLine());
// But the line comes out funny.
// The one created with writeBytes is OK:
System.out.println(in5br.readLine());
} catch(EOFException e) {
System.err.println("End of stream");
}
// 6. Reading/writing random access files
RandomAccessFile rf =
new RandomAccessFile("rtest.dat", "rw");
for(int i = 0; i < 10; i++)
rf.writeDouble(i*1.414);
rf.close();
rf =new RandomAccessFile("rtest.dat", "rw");
rf.seek(5*8);
rf.writeDouble(47.0001);
rf.close();
rf = new RandomAccessFile("rtest.dat", "r");
for(int i = 0; i < 10; i++)
System.out.println(
"Value " + i + ": " +
rf.readDouble());
rf.close();
}
}
End of stream
3.14159
 T h a t   w a s   p i
That was pi
Value 0: 0.0
Value 1: 1.414
Value 2: 2.828
Value 3: 4.242
Value 4: 5.656
Value 5: 47.0001
Value 6: 8.484
Value 7: 9.898
Value 8: 11.312
Value 9: 12.725999999999999

*/