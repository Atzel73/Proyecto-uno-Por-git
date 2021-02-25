
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Propietario
 */
public class conexion {

    Connection conect = null;
    public Connection konexion () throws ClassNotFoundException, SQLException
    {
        try {
            Class.forName("org.gjt.mm.mysql.Driver");
            conect = DriverManager.getConnection("jdbc:mysql://localhost/basedos", "root", "");
        }catch (Exception e){
              JOptionPane.showMessageDialog(null, "Error");
              
        }
        return conect;
    }
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
