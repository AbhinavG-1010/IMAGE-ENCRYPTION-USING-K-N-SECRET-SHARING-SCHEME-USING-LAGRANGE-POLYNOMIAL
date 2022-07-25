import java.sql.*;
import java.util.*;
class Main{
	
public static void main(String args[]) throws Exception{
		
	Class.forName("");
	Connection conn = DriverManager.getConnection("","","");

	Statement stmt = conn.createStatement();
	Scanner sc= new Scanner(System.in);
		int num = sc.nextInt();
		String query="";
		
		while(num>0){
			String name= sc.next();
			int id = sc.nextInt();
			query+="insert into VIT values('"+name+"',"+id+");";
			num--;
		}
	int num2 = stmt.executeUpdate(query);
	
	System.out.println(num2+" xyz");
}
}
