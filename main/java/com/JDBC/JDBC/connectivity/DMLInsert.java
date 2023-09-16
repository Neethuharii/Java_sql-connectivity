package com.JDBC.JDBC.connectivity;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;



    public class DMLInsert {

        public static void main(String[] args) throws SQLException {

            String url ="jdbc:mysql://localhost:3306/employee_management_system";
            String uname= "root";
            String upass ="neethuhari@123";
            String query="INSERT INTO employee VALUES(25,'josel@gmail.com','josel','xavier')";
            //1. Create a connection

            Connection con = DriverManager.getConnection(url,uname,upass);



            //2. Create statement/Query

            Statement stmt = con.createStatement();



            //3. Execute the Query

            stmt.execute(query);

            // 4.close the connection

            con.close();


            System.out.println("Query successfully executed");


        }

    }

