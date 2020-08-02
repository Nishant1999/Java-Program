import java.sql.*;
class Database
{
	public static void main(String args[])throws SQLException
	{
		Connection conn;
		conn=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/deepanshu","root","deepanshu9636707431");
		Statement stmt;
		stmt=conn.createStatement();
		ResultSet rs;
		rs=stmt.executeQuery("select * from employees");
		while(rs.next())
		{
			System.out.println(rs.getString("employee_id") + "   " + rs.getString("first_name")+"   "+rs.getString("last_name")+"   "+rs.getString("department_id"));
		}
		//stmt.executeUpdate("insert into deepanshu(employee_id,first_name) values(1,'manoj')");
	}
}
