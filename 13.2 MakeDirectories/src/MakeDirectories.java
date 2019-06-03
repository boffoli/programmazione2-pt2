// crea directory e manipola file.

import java.io.*;
public class MakeDirectories {

private final static String usage =
"Usage:MakeDirectories path1 ...\n" +
"Creates each path\n" +
"Usage:MakeDirectories -d path1 ...\n" +
"Deletes each path\n" +
"Usage:MakeDirectories -r path1 path2\n" +
"Renames from path1 to path2\n";

private static void usage() {
	System.err.println(usage);
	System.exit(0);
}

private static void fileData(File f) {
	System.out.println(
	"Absolute path: " + f.getAbsolutePath() +
	"\n Can read: " + f.canRead() +
	"\n Can write: " + f.canWrite() +
	"\n getName: " + f.getName() +
	"\n getParent: " + f.getParent() +
	"\n getPath: " + f.getPath() +
	"\n length: " + f.length() +
	"\n lastModified: " + f.lastModified());
	if(f.isFile())
		System.out.println("it's a file");
	else if(f.isDirectory())
		System.out.println("it's a directory");
}

public static void main(String[] args) {
	if(args.length < 1) usage();
	if(args[0].equals("-r")) {
		if(args.length != 3) usage();
		File old = new File(args[1]),
		rname = new File(args[2]);
		old.renameTo(rname);
		System.out.println("old file\n");
		fileData(old); 
		System.out.println("newle\n");
		fileData(rname);
		return; // Exit main
	}
	int count = 0;
	boolean del = false;
	if(args[0].equals("-d")) {
		count++;
		del = true;
	}
	for( ; count < args.length; count++) {
		File f = new File(args[count]);
		if(f.exists()) {
			System.out.println(f + " exists");
			if(del) {
				System.out.println("deleting..." + f);
				f.delete();
			}
		}
		else { // Non esiste
			if(!del) {
				f.mkdirs();
				System.out.println("created " + f);
			}
		}
		fileData(f);
		}
	}
}

/*

Output
java MakeDirectories "-r" "pippo.dat" "pippo1.dat"

Old file

Absolute path: C:\Documents and Settings\Annalisa\Desktop\HardDisk\Documenti\cor
si\2009\MAP-Brindisi\Teoria\Metodi Avanzati di Programmazione\2008-2009\16 - Il
sistema InputOutput di Java\pippo.dat
 Can read: false
 Can write: false
 getName: pippo.dat
 getParent: null
 getPath: pippo.dat
 length: 0
 lastModified: 0

new file

Absolute path: C:\Documents and Settings\Annalisa\Desktop\HardDisk\Documenti\cor
si\2009\MAP-Brindisi\Teoria\Metodi Avanzati di Programmazione\2008-2009\16 - Il
sistema InputOutput di Java\pippo1.dat
 Can read: true
 Can write: true
 getName: pippo1.dat
 getParent: null
 getPath: pippo1.dat
 length: 0
 lastModified: 1241427904875
it's a file




java MakeDirectories "-d" "pippo1.dat" "pippo"

pippo1.dat exists
deleting...pippo1.dat
Absolute path: C:\Documents and Settings\Annalisa\Desktop\HardDisk\Documenti\co
si\2009\MAP-Brindisi\Teoria\Metodi Avanzati di Programmazione\2008-2009\16 - Il
sistema InputOutput di Java\pippo1.dat
 Can read: false
 Can write: false
 getName: pippo1.dat
 getParent: null
 getPath: pippo1.dat
 length: 0
 lastModified: 0

created pippo
Absolute path: C:\Documents and Settings\Annalisa\Desktop\HardDisk\Documenti\co
si\2009\MAP-Brindisi\Teoria\Metodi Avanzati di Programmazione\2008-2009\16 - Il
sistema InputOutput di Java\pippo
 Can read: true
 Can write: true
 getName: pippo
 getParent: null
 getPath: pippo
 length: 0
 lastModified: 1241428697093
it's a directory
*/