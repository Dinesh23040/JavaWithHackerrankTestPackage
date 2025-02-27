
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBCExcel {

	public static Connection getConnection() throws Exception {
	    String driver = "sun.jdbc.odbc.JdbcOdbcDriver";
	    String url = "jdbc:odbc:C:\\Users\\gurramku\\Desktop\\People_bench.xlsx";
	    String username = "yourName";
	    String password = "yourPass";
	    Class.forName(driver);
	    return DriverManager.getConnection(url, username, password);
	  }

	  public static void main(String args[]) throws Exception {
	    Connection conn = null;
	    Statement stmt = null;
	    ResultSet rs = null;

	    conn = getConnection();
	    stmt = conn.createStatement();
	    String excelQuery = "select * from [Sheet2$]";
	    rs = stmt.executeQuery(excelQuery);

	    while (rs.next()) {
	      System.out.println(rs.getString("Name") + " " + rs.getString("Location"));
	    }
	    
	    rs.close();
	    stmt.close();
	    conn.close();
	  }
}
