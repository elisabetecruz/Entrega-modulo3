package Connection;
import java.sql.Connection;
import java.sql.Driver;

public class connectionMysql{
     public static <retrun> Connection ConnectionMysql() throws Exception{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = Driver
				.getConnection();
		retrun connection;
	} 
	
}