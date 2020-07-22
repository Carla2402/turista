package datos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;




public class Conecta {
   
    public String driver="com.mysql.jdbc.Driver";
    public String port="3309";
    public String url="jdbc:mysql://localhost:"+port+"/soriano?useSSL=false";
    public String username="root";
    public String pass="1234";
    public static Statement st=null;
    public static ResultSet rs=null;
    public Connection conectar(){
        
    
     Connection conn=null;
     try{
         Class.forName(driver);
         conn= (Connection) DriverManager.getConnection(url, username, pass);
         System.out.println("Conexion exitosa");
         
     }catch (ClassNotFoundException | SQLException e){
         System.out.println("Error: ");
         e.printStackTrace();
         
     }
     
     return conn;
    }
    public void ingresa(String nom, String ap, String am, String nuss, String pass, String tipo) throws SQLException{
       boolean ok=new datos.Conecta().conectar().createStatement().execute("insert into usuario(nombre, ap, am, n_usuario, password, tipo)  values ('"+nom+"','"+ap+"', '"+am+"', '"+nuss+"', '"+pass +"',0)");
        
    }
    public boolean prueba(String usuario, String password) throws SQLException{
        boolean res=false;
        int c=0;
         ResultSet rs=new datos.Conecta().conectar().createStatement().executeQuery("select * from usuario where n_usuario like'"+usuario+"'"
        + " and password like '"+password+"'");
        while (rs.next()){
            c++;
        }if (c==1){
            res=true;
            
                    
        }
            return res;
    }
    public String tipo(String usuario, String password) throws SQLException{
        String res="";
      ResultSet rs=new datos.Conecta().conectar().createStatement().executeQuery("select * from usuario where n_usuario like'"+usuario+"'"
        + " and password like '"+password+"'");
        while (rs.next()){
            res=rs.getString("tipo");
            
        }
    return res;
    }
     public void registrararchivo(String nombre,String tipo) throws SQLException{
        boolean ok=new datos.Conecta().conectar().createStatement().execute("insert into archivo (nombre ,tipo) values('"+nombre+ "','"+tipo+"')");
        
    }
      public void tuta(String ruta) throws SQLException{
        boolean ok=new datos.Conecta().conectar().createStatement().execute("insert into ruta (ruta) values('"+ruta+"')");
        
    }
       public void eliminam(String nombre) throws SQLException{
        boolean ok=new datos.Conecta().conectar().createStatement().execute("delete from archivo where id='"+nombre+"' ");
}
        public boolean pruebaa(String nombre) throws SQLException{
        boolean res=false;
        int c=0;
         ResultSet rs=new datos.Conecta().conectar().createStatement().executeQuery("select * from archivo where nombre like'"+nombre+"'");
        while (rs.next()){
            c++;
        }
            return res;
    }
         public String tipos(String nombre) throws SQLException{
        String res="";
      ResultSet rs=new datos.Conecta().conectar().createStatement().executeQuery("select * from archivo where nombre like'"+nombre+"'");
        while (rs.next()){
           
            
        }
    return res;
    }
}
