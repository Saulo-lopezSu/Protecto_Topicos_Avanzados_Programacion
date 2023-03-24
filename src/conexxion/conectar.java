package conexxion;
import java.sql.*;   //librería encargada de establecer la conexion
//import javax.swing.JOptionPane;
public class conectar {
    public Connection conectar;
    public Statement inst;
    public ResultSet result;
    
    public Connection conect(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            //Class.forName("com.mysql.cj.jdbc.Driver");
            //String url = String.format("jdbc:mysql://%s:%d/%s?useSSL=false", host, port, db);
            //conecta=DriverManager.getConnection("jdbc:mysql://localhost:3306/empresa_p1", "saulo", "S4ul=0", "&useSSL=false");
            //String url = String.format("jdbc:mysql://localhost:empresa_p1","saulo","S4ul=0","?useSSL=false");
            conectar = DriverManager.getConnection("jdbc:mysql://localhost:3306/empresa_p1?characterEncoding=utf8","saulo","S4ul=0");
            System.out.println("Conexión exitosa"); 
            
            inst=conectar.createStatement();
            
        }catch(ClassNotFoundException | SQLException e){
            System.out.println("Error: "+e);
        }
        return conectar;
    }
    public static void main(String args[]){
        conectar conn=new conectar();
        conn.conect();
    }
} 



/*Connection conectar = null;
    public Connection conexion(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conectar = DriverManager.getConnection("jdbc:mysql://localhost:3306/empresa_p1","saulo","S4ul=0");
            System.out.println("Conexión exitosa");
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return conectar;
    }
     public static void main(String args[]){
        conectar conn=new conectar();
        conn.conexion();
    }*/