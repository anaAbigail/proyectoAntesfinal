package proyectoantesfinal.AccesoADatos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import proyectoantesfinal.Entidades.Alumno;
import proyectoantesfinal.Entidades.Inscripcion;
import proyectoantesfinal.Entidades.Materia;

/* @author Programita  */
public class IncripcionAdata {

    private Connection con = null;
    private MateriaData matData;
    private AlumnoData aluData;

    public IncripcionAdata() {

        con = Conexion.getConexion();
        matData = new MateriaData();
        aluData = new AlumnoData();
    }

    public void guardarInscripcion(Inscripcion insc) {
        String sql = "INSERT INTO inscripcion (nota, idAlumno, idMateria) VALUES (?, ?, ?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, insc.getNota());
            ps.setInt(2, insc.getAlumno().getIdAlumno());
            ps.setInt(3, insc.getMateria().getIdMateria());
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Inscripción guardada con éxito.");
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al guardar la inscripción: " + ex.getMessage());
        }
    }
    
    public List<Inscripcion> obtenerInscripciones() {
        List<Inscripcion> inscripciones = new ArrayList<>();
        String sql = "SELECT nota, idAlumno, idMateria FROM inscripcion";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                int nota = rs.getInt("nota");
                int idAlumno = rs.getInt("idAlumno");
                int idMateria = rs.getInt("idMateria");
                Alumno alumno = aluData.buscarAlumno(idAlumno);
                Materia materia = matData.buscarMateria(idMateria);
                Inscripcion inscripcion = new Inscripcion(alumno, materia, nota);
                inscripciones.add(inscripcion);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al obtener inscripciones: " + ex.getMessage());
        }
        return inscripciones;
    }
    
    public List<Inscripcion> obtenerInscripcionesPorAlumno(int idAlumno) { // IDEA: PODRIA USAR MAP.HASH MAP
        List<Inscripcion> inscripciones = new ArrayList<>();
        String sql = "SELECT nota, idMateria FROM inscripcion WHERE idAlumno = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idAlumno);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                int nota = rs.getInt("nota");
                int idMateria = rs.getInt("idMateria");
                Alumno alumno = aluData.buscarAlumno(idAlumno);
                Materia materia = matData.buscarMateria(idMateria);//buscar materia un mtodo de materiaData
                Inscripcion inscripcion = new Inscripcion(alumno, materia, nota);
                inscripciones.add(inscripcion);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al obtener inscripciones por alumno: " + ex.getMessage());
        }
        return inscripciones;
    }
    
    //MateriasCursadas es una idea diferente al del pdf. Probaré más 
     public List<Materia> obtenerMateriasCursadas(int idAlumno) { 
        List<Materia> materias = new ArrayList<>();
        String sql = "SELECT idMateria FROM inscripcion WHERE idAlumno = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idAlumno);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                int idMateria = rs.getInt("idMateria");
                Materia materia = matData.buscarMateria(idMateria);
                materias.add(materia);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al obtener materias cursadas por alumno: " + ex.getMessage());
        }
        return materias;
    }
    // tambien podria usar un map creo
    
    public void borrarInscripcionMateriaAlumno(int idAlumno, int idMateria) {
      
    }

    public void actualizarNota(int idAlumno, int idMateria) {
       
    }

    public void actualizarNota(int idAlumno, int idMateria, double nota) {
        
    }

    public List<Alumno> obtenerAlumnosXMateria(int idMateria) {
       
        return null;
    }
    
    
    
    
    
    
}
