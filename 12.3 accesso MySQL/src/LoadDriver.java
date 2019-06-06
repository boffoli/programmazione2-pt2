import java.sql.Connection;
import java.io.BufferedReader; 
import java.io.FileReader;
import java.io.IOException;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

// Notice, do not import com.mysql.jdbc.*// or you will have problems!// add as jar to the project

public class LoadDriver {
    public static void main(String[] args) throws IOException {
    	char c[]=new char[20];
        try {
            // The newInstance() call is a work around for some// broken Java implementations

// Dal sito di MySQL
//N.B. L’uso del newInstance() ha lo scopo di //verificare la correttezza del driver (ossia la //capacita di istanziare oggetti
// l’oggetto creato è rimosso alla termine del metodo
            Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
        } catch (Exception ex) {
            // handle the error
       
        }
    
    try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/comuni?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC&user=root&password=");
            Statement s = conn.createStatement();
            
            FileReader fr = new FileReader("02__19_07_2018_immobile x.txt");
            BufferedReader br = new BufferedReader(fr); 
            
            br.read(c); 
            for (int i = 0; i <20 ; i++) { 
                System.out.print(c[i]); 
            } 
            System.out.println(); 
  
            String query="select * from immobile";
            ResultSet r = s.executeQuery(query);
            
            while(r.next())
            	System.out.println(r.getString("Tipo") + "," + r.getString("Indirizzo"));
            
            
        } catch (SQLException ex) {			// Do something with the Connection            
            System.out.println("SQLException: " + ex.getMessage());			// handle any errors
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
        }
 // codice SQL:// può generare l’eccezione SQLException
    }
}
   