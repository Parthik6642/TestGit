package webdriver.day11;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class DataBaseTest {
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		
		//Step 1 Register the Driver
		Class.forName("com.mysql.jdbc.Driver");
		
		//Step2 Establish the DataBase Connection
		
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/organisaton","root","root");
		
		//Step3 Create Statment for writing quries
		
		Statement st=conn.createStatement();
		
		ResultSet rs=st.executeQuery("Select * from employee");
		
		ArrayList actualList=new ArrayList();
		while(rs.next()) {
			actualList.add(rs.getInt(1)+ " "+rs.getString(2) +" "+rs.getInt(3));
		}
		
		System.out.println("List ::: "+actualList);
		
	}

}
