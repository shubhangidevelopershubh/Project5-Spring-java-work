package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


import bean.LoginBean;

//Pojo - plain old java object
public class LoginDAO {

	public boolean validate(LoginBean loginBean) throws ClassNotFoundException{
		
		boolean status = false;
		
		Class.forName("com.mysql.cj.jdbc.Driver"); //type 4 driver
		String url = "jdbc:mysql://127.0.0.1:3306/userlogin?";
		String username = "root";
		String password = "root";
		try{
			String SQLQuery = "select * from login where username=? and password=?";
			Connection con = DriverManager.getConnection(url, username, password);
			PreparedStatement pst = con.prepareStatement(SQLQuery);
			
		
			pst.setString(1, loginBean.getUsername());
			pst.setString(2, loginBean.getPassword());
			
			ResultSet rs = pst.executeQuery();
			status = rs.next(); 

		}catch(Exception e){
			System.out.println(e.getMessage());
		}
		return status;
		
	}
}