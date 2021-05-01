/* Delete the record.*/
import java.sql.*;
class EDelete
{
	public static void main(String a[])
	{
		Connection c;
		try
		{
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			c = DriverManager.getConnection("jdbc:odbc:DS7");
			PreparedStatement ps = preparedStatement("delete * from Employee2 where eid = ?");
			ps.setInt(1,Integer.parseInt(a[0]));
			int k = ps.executeUpdate();
			if(k>0)
				System.out.println("Record succesfully Deleted");
			c.close();
		}catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
