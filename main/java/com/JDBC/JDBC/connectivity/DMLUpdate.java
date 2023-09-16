package com.JDBC.JDBC.connectivity;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

    public class DMLUpdate {

        public static void main(String[] args) throws SQLException {
            String url ="jdbc:mysql://localhost:3306/employee_management_system";
            String uname= "root";
            String upass ="neethuhari@123";
            String query="UPDATE employee SET first_name='pavi' WHERE ID=1";

            //1. Create a connection

            Connection con = DriverManager.getConnection(url,uname,upass);



            //2. Create statement/Query

            Statement stmt = con.createStatement();


           // String s="UPDATE STUDENT SET NAME='pavi' WHERE STUDENT_ID=1";

            //3. Execute statment/Query

            stmt.execute(query);

            // 4.close the connection

            con.close();


            System.out.println("Query executed");


        }


}
