package jdbcpro;
import java.sql.*;
public class kothaupdatejdbcmethods
{
	public static void main(String[] args)throws SQLException
	{
		DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql","root","root");
Statement statement=connection.createStatement();
		String query="insert into  account_master (account_number) values"+"('a10009')";
    int count=statement.executeUpdate(query);
    System.out.println(count+"record(s) inserted........");
    statement.close();
    connection.close();
	}
	}
