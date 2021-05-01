/* Insert the record.*/
import java.sql.*;
class EInsert
{
	public static void main(String a[])
	{
		Connection c;
		try
		{
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			c = DriverManager.getConnection("jdbc:odbc:DS7");
			PreparedStatement ps = preparedStatement("insert in to Employee2 values(101,'arun','BE')");
			ps.setInt(1,Integer.parseInt(a[0]));
			ps.setString(2,a[1]);
			ps.setString(3,a[2]);
			int k=ps.executeUpdate();
			if(k>0)
				System.out.println("Record succesfully inserted");
			c.close();
		}catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
