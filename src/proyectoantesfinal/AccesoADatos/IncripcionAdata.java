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
    private final MateriaData matData;
    private  AlumnoData aluData;

    public IncripcionAdata() {

        con = Conexion.getConexion();
        matData = new MateriaData();
        aluData = new AlumnoData();
    }

    public void guardarInscripcion(Inscripcion insc) {
        String sql = "INSERT INTO inscripcion (nota, idAlumno, idMateria) VALUES (?, ?, ?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, (int) insc.getNota());
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
    // no entendi (?
     public List<Materia> obtenerMateriasCursadas(int idAlumno) { 
        List<Materia> materias = new ArrayList<>();
        
        
        
        try {
            String sql = "SELECT inscripcion.idMateria,nombre, año FROM inscripcion,"
                +"materia WHERE inscripcion.idMateria = materia.idMateria\n" +
                "AND inscripcion.idAlumno =?;";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idAlumno);
            ResultSet rs = ps.executeQuery();
            Materia materia;
            while (rs.next()) {
                materia = new Materia ();
                materia.setIdMateria(rs.getInt("idMateria"));
                materia.setNombre(rs.getString("nombre"));
                materia.setAnioMateria(rs.getInt("año"));
                materias.add(materia);
                
                
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al obtener materias cursadas por alumno: " + ex.getMessage());
        }
        return materias;
    }
    // tambien podria usar un map creo
      public List<Materia> obtenerMateriasNOCursadas(int idAlumno) {
        List<Materia> materias = new ArrayList<>();
        String sql = "SELECT idMateria FROM materia WHERE idMateria NOT IN (SELECT idMateria FROM inscripcion WHERE idAlumno = ?)";
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
            JOptionPane.showMessageDialog(null, "Error al obtener materias no cursadas por alumno: " + ex.getMessage());
        }
        return materias;
    }
    
     public void borrarInscripcionMateriaAlumno(int idAlumno, int idMateria) {
        String sql = "DELETE FROM inscripcion WHERE idAlumno = ? AND idMateria = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idAlumno);
            ps.setInt(2, idMateria);
            int filasBorradas = ps.executeUpdate();
            if (filasBorradas > 0) {
                JOptionPane.showMessageDialog(null, "Inscripción borrada con éxito.");
            } else {
                JOptionPane.showMessageDialog(null, "No se encontró la inscripción.");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al borrar la inscripción: " + ex.getMessage());
        }
    }

    
    
    
    
    
}
