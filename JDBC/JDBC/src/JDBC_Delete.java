import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class JDBC_Delete {

	public static void main(String[] args) {
		try
		{
		    Class.forName("oracle.jdbc.driver.OracleDriver");
		    Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","123456789");
		
	         Statement smt=con.createStatement();
	         
	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        
	        while(true)
	        {
	        	System.out.println("Enter Deletion Emp id: ");
	        	int eno=Integer.parseInt(br.readLine());
	        	
	        	int count=smt.executeUpdate("delete from emp where eno= "+eno);
	        	if(count==1)
	        	{
	        		System.out.println(count+ " rows inserted");
	        		
	        	}
	        	else {
	        		System.out.println("no record inserted");
	        	}
	        	System.out.println("Do you want to more Record....[yes/no]");
	        	String ch=br.readLine();
	        	if(ch.equalsIgnoreCase("no"))
	        	break;
	        }
		}
		catch(Exception e)
		{
			System.out.println(e);
		}

	}

	}


