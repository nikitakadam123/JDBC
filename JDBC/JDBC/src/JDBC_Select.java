import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBC_Select {

	public static void main(String[] args) {
		try
		{
		    Class.forName("oracle.jdbc.driver.OracleDriver");
		    Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","123456789");
            
		    Statement smt=con.createStatement();
		    ResultSet rs=smt.executeQuery("select * from emp");
		    
		    while(rs.next())
		    {
		    	int eid=rs.getInt(1);
		    	String ename=rs.getString(2);
		    	double esal=rs.getDouble(3);
		    	
		    	System.out.println("Emp Id: "+eid);
		    	System.out.println("Emp Ename: "+ename);
		    	System.out.println("Emp Salary: "+esal);
		    	System.out.println("\n");
		    }
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
