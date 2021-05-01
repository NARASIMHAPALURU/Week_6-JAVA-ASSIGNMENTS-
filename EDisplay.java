/* Display the record.*/
import java.sql.*;
class EDisplay
{
	public static void main(String [] args)
	{
		Connection c;
		try
		{
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			c = DriverManager.getConnection("jdbc:odbc:DS7");
			Statement s = c.createStatement();
			ResultSet rs = s.executeQuery("select.*from Employee2");
			while(rs.next())
				System.out.println(rs.getInt(1)+""+rs.getString(2)+" "+rs.getString(3));
			c.close();
		}catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
