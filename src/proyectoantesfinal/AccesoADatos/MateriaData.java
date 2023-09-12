package proyectoantesfinal.AccesoADatos;

import java.awt.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import org.mariadb.jdbc.Statement;
import proyectoantesfinal.Entidades.Materia;


public class MateriaData {
    private Connection con = null;
    
    public MateriaData(){
        con = Conexion.getConexion();
    
}
    public void guardarMateria(Materia materia){
        String sql = "INSERT into materia (nombre, anioMateria, estado) VALUES (?,?,?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, materia.getNombre());
            ps.setInt(2, materia.getAnioMateria());
            ps.setBoolean(3, materia.isEstado());
            ps.executeUpdate(); 
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "error al guardar materia");
        }
    }
    
    public Materia buscarMateria(int id){
        
            Materia materia=null;
            String sql= "select nombre, anioMateria from materia where idMateria = ? and estado =1 ";
            try {    
                PreparedStatement ps = con.prepareStatement(sql);
                ps.setInt(1, id);
                ResultSet rs = ps.executeQuery();
                if (rs.next()){
                    materia=new Materia();
                    materia.setIdMateria(id);
                    materia.setNombre(rs.getString("nombre"));
                    materia.setAnioMateria(rs.getInt("anioMateria"));
                    materia.setEstado(rs.getBoolean("estado"));
                }else{
                    JOptionPane.showMessageDialog(null, "no existe la materia");
                }
                ps.close();
                
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null,"error al acceder a la tabla materia");
            }
            return materia;
      
 }
    
    public void modificarMateria(Materia materia){
        
    }
    
    public void eliminarMateria(int id){
        
    }
    /*
    public List<Materia> listarMaterias = new ArrayList<>();
        return listarMaterias;*/
    
    
}
