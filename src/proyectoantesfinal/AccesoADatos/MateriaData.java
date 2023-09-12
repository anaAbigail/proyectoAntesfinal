package proyectoantesfinal.AccesoADatos;

import com.sun.org.apache.bcel.internal.generic.RETURN;
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
        String sql = "UPDATE materia SET nombre = ?, anioMateria = ?, estado = ? WHERE idMateria = ?";
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, materia.getNombre());
            ps.setInt(2, materia.getAnioMateria());
            ps.setBoolean(3, materia.isEstado());
            ps.setInt(4, materia.getIdMateria());
            int sqlUpdate = ps.executeUpdate();
            if (sqlUpdate==1) {
                JOptionPane.showMessageDialog(null, "Materia actualizada correctamente");
            }else{
                JOptionPane.showMessageDialog(null, "La materia no existe");
            }
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se pudo acceder a la tabla Materia"+ ex.getMessage());
        }
    }
    
    public void eliminarMateria(int id){
        try {
            String sql = "UPDATE materia SET estado = 0 WHERE idMateria = ?";
            PreparedStatement ps = null;
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            int sqlDelete = ps.executeUpdate();
            if (sqlDelete==1) {
                JOptionPane.showMessageDialog(null, "Se eliminó materia");
            }else{
                JOptionPane.showMessageDialog(null, "No se encontró materia");
            }
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se pudo acceder a la tabla Materia"+ ex.getMessage());
        }
    }
    
    /*
    public List<Materia> listarMaterias(){
           List<Materia> materias = new ArrayList<>();
           try {
               String sql = "SELECT * FROM materia WHERE estado = 1";
               PreparedStatement ps = con.prepareStatement(sql);
               ResultSet rs = ps.executeQuery();
               while (rs.next()) {
                   Object nextElement = rs.nextElement();
                   
               }
            
        } catch (Exception e) {
        }
           return materias;
    }
    
    */
    
    /*
    public List<Materia> listarMaterias = new ArrayList<>();
        return listarMaterias;*/
    
    
}
