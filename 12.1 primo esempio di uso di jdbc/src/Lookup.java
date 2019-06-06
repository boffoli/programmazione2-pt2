// individua gli indirizzi e-mail in un database locale usando JDBC.

import java.sql.*;

public class Lookup {
public static void main(String[] args) throws SQLException, ClassNotFoundException {
	String dbUrl = "jdbc:odbc:people";
	String user = "";
	String password = "";
	
	// carica il driver (registers itself)
	// può generare l’eccezione ClassNotFoundException 
	
	Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
	
	Connection c = DriverManager.getConnection(dbUrl, user, password);
	Statement s = c.createStatement();
	
	// codice SQL:
	// può generare l’eccezione SQLException
	
	ResultSet r = s.executeQuery("SELECT FIRST, LAST, EMAIL " +"FROM people.csv people " +"WHERE " +"(LAST='" + args[0] + "') " +" AND (EMAIL Is Not Null) " +"ORDER BY FIRST");
	while(r.next()) {
		// Capitalization doesn't matter:
		System.out.println(r.getString("Last") + ", "+ r.getString("fIRST")+ ": " + r.getString("EMAIL") );
		// In alternativa: accesso posizionale
		/*System.out.println(
		r.getString(2) + ", "
		+ r.getString(1)
		+ ": " + r.getString(3) );
					NB: nell’accesso posizionale, gli indici delle colonne 
		del ResultSet partono da 1 */
		}
		s.close(); // Also closes ResultSet
	}
}
