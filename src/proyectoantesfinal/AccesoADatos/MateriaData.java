package proyectoantesfinal.AccesoADatos;

import java.awt.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import proyectoantesfinal.Entidades.Materia;

<<<<<<< Updated upstream
=======

>>>>>>> Stashed changes
public class MateriaData {
    private Connection con = null;
    
    public MateriaData(){
        con = Conexion.getConexion();
    
}
    public void guardarMateria(Materia materia){
        String sql = "INSERT into materia (nombre, anioMateria, estado) VALUES (?,?,?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "algo salió mal dice yadhi");
        }
    }
    /*
    public Materia buscarMateria(int id){
    }
    */
    public void modificarMateria(Materia materia){
        
    }
    
    public void eliminarMateria(int id){
        
    }
    /*
    public List<Materia> listarMaterias = new ArrayList<>();
        return listarMaterias;*/
    
    
}
