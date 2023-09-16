//import the package
//load and reg the driver
//create the connection
// create the stmt
//execute the query
//process the result
//close





package com.JDBC.JDBC.connectivity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Demo {

        public static void main(String[]args) throws Exception{
            String url ="jdbc:mysql://localhost:3306/employee_management_system";
            String uname= "root";
            String upass ="neethuhari@123";
            String query="select email_id from employee where id=23";
           //load and register the driver class
            Class.forName("com.mysql.cj.jdbc.Driver");

            //create a connection
            Connection con= DriverManager.getConnection(url,uname,upass);

            //create a statement
            Statement st = con.createStatement();

            //execute the query
            ResultSet rs= st.executeQuery(query);

            //process the result
            rs.next();
            String emailid=rs.getString("email_id");
            System.out.println(emailid);

//close
            st.close();
            con.close();

        }
    }


