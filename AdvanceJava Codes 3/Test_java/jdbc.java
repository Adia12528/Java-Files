import java.sql.*;

public class jdbc {

   static final String DB_URL = "jdbc:mysql://localhost/TUTORIALSPOINT1";
   static final String USER = "root";
   static final String PASS = "A12528@as";

   public static void main(String args[]) {
      try{
         Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
         Statement stmt = conn.createStatement();
         stmt.execute("INSERT INTO star(id, name) VALUES(3, 'Sachin'), (4, 'Kishore')");
         System.out.println("----- Successfully inserted into table star ----\n\n");
         System.out.println("Displaying records from star table, showing inserted values");
         System.out.println("---------------------------");
         ResultSet rs = stmt.executeQuery("select * from star");

         while(rs.next()){
            System.out.println("id: " + rs.getInt(1));
            System.out.println("name: " + rs.getString(2));
         }
      }catch(SQLException e){
         e.printStackTrace();
      }
   }
}