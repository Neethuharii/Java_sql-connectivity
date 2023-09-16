package com.JDBC.JDBC.connectivity;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

    public class DMLDelete {
        public static void main(String[] args) throws SQLException {
            String url ="jdbc:mysql://localhost:3306/employee_management_system";
            String uname= "root";
            String upass ="neethuhari@123";
            String query="DELETE FROM employee WHERE id=24";

            //1. Create a connection

            Connection con = DriverManager.getConnection(url,uname,upass);



            //2. Create statement

            Statement stmt = con.createStatement();



            //3. Execute Query

            stmt.execute(query);

            // 4.close the connection

            con.close();


            System.out.println("Query executed");



    }

}
