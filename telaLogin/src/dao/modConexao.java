
package dao;

import java.sql.*;

public class modConexao {
   public static Connection conector(){
       Connection conexao;
       String driver = "com.mysql.cj.jdbc.Driver";
       String url = "jdbc:mysql://localhost:3306/login";
       String user = "root";
       String password ="Pipoca1*";
       try{
           Class.forName(driver);
           conexao = DriverManager.getConnection(url, user ,password);
           return conexao;
        } catch (Exception e){ 
            System.out.println(e);
            return null;
        }  
    }
    
}
