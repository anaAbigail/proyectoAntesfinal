package proyectoantesfinal.AccesoADatos;

/* @author Programita  */
import proyectoantesfinal.Entidades.Alumno;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

//hola soy bongo cat
public class AlumnoData {

    private Connection con = null;

    public AlumnoData() {

        con = Conexion.getConexion();
    }

    public void guardarAlumno(Alumno alumno) {
        //def csql 
        String sql = "INSERT INTO alumno (dni, apellido, nombre, fechaNacimiento, estado) VALUES (?, ?, ?, ?, ?)";
        try {
            //crea prep con sql y soli de keys
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS); //pedis lista de clave generada 

            //establece los valores de los params 
            ps.setInt(1, alumno.getDni());
            ps.setString(2, alumno.getApellido());
            ps.setString(3, alumno.getNombre());
            ps.setDate(4, Date.valueOf(alumno.getFechaNacimiento()));//localDate a Date
            ps.setBoolean(5, alumno.isEstado());// if reducido
            //ejec qsl
            ps.executeUpdate();

            ResultSet rs = ps.getGeneratedKeys();//ob key
            if (rs.next()) {
                //act alumno del id con la key
//                 System.out.println(rs.getInt());
                alumno.setIdAlumno(rs.getInt(1));

                JOptionPane.showMessageDialog(null, "Alumno añadido con exito.");
            }

            ps.close(); //zip prep

        } catch (SQLException ex) {
            //
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Alumno" + ex.getMessage());

        }
    }

    public Alumno buscarAlumno(int id) {
        Alumno alumno = null;
        String sql = "SELECT dni, apellido, nombre, fechaNacimiento FROM alumno WHERE idAlumno = ? AND estado = 1";
        PreparedStatement pss = null;
        try {
            pss = con.prepareStatement(sql);

            pss.setInt(1, id);

            ResultSet rs = pss.executeQuery(); //ejec cst qsl

            if (rs.next()) {
                //recupera los datos del alumno desde rs y se crea un onjeto alumno 
                alumno = new Alumno();
                alumno.setIdAlumno(id);
                alumno.setDni(rs.getInt("dni"));
                alumno.setApellido(rs.getString("apellido"));
                alumno.setNombre(rs.getString("nombre"));
                alumno.setFechaNacimiento(rs.getDate("fechaNacimiento").toLocalDate());

            } else {
                JOptionPane.showMessageDialog(null, "No existe el alumno");
            }
            pss.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Alumno " + ex.getMessage());

        }

        return alumno;
    }

    public Alumno buscarAlumnoPorDni(int dni) {
        Alumno alumno = null;
        String sql = "SELECT * FROM alumno WHERE dni=? ";
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, dni);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                alumno = new Alumno();
                alumno.setIdAlumno(rs.getInt("idAlumno"));
                alumno.setApellido(rs.getString("apellido"));
                alumno.setNombre(rs.getString("nombre"));
                alumno.setFechaNacimiento(rs.getDate("fechaNacimiento").toLocalDate());
                alumno.setEstado(rs.getBoolean("estado"));

            } else {
                JOptionPane.showMessageDialog(null, "No existe el alumno");

            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Alumno " + ex.getMessage());
        }

        return alumno;
    }

    public List<Alumno> listarAlumnos() {

        List<Alumno> alumnos = new ArrayList<>(); //lista vacia de onjetos Alumno
        try {
            String sql = "SELECT * FROM alumno WHERE estado = 1 ";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) { //w para iterar a traves de los regisstros
                Alumno alumnito = new Alumno();

                alumnito.setIdAlumno(rs.getInt("idAlumno"));
                alumnito.setDni(rs.getInt("dni"));
                alumnito.setApellido(rs.getString("apellido"));
                alumnito.setNombre(rs.getString("nombre"));
                alumnito.setFechaNacimiento(rs.getDate("fechaNacimiento").toLocalDate());
                alumnito.setEstado(rs.getBoolean("estado"));
                
                alumnos.add(alumnito);
                //se agrega a la listas de alumnito los valores asignados a la columna 
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla Alumno " + ex.getMessage());
        }
        return alumnos;
    }

    public void modificarAlumno(Alumno alumno) {
       //actu los dt alumnos
        String sql = "UPDATE alumno SET  apellido = ?, nombre = ?, fechaNacimiento = ?, estado = ? WHERE dni=?";
        PreparedStatement ps = null;

        try {
            ps = con.prepareStatement(sql);
            //Asignacion de parametros
            ps.setString(1, alumno.getApellido());
            ps.setString(2, alumno.getNombre());
            ps.setDate(3, Date.valueOf(alumno.getFechaNacimiento()));
            ps.setBoolean(4, alumno.isEstado());
            ps.setInt(5, alumno.getDni());
            
            int exito = ps.executeUpdate();
            
            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Alumno modificado con éxito");
            } else {
                JOptionPane.showMessageDialog(null, "El Alumno no pudo ser modificado");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Alumno " + ex.getMessage());
        }
    }

    public void eliminarAlumno(int dni) {

        try {
            String sql = "UPDATE alumno SET estado = 0 WHERE dni = ? ";
            PreparedStatement ps = con.prepareStatement(sql);
            
            ps.setInt(1, dni);
            
            int fila = ps.executeUpdate();

            if (fila == 1) {
                JOptionPane.showMessageDialog(null, " Se eliminó el alumno.");
            } else {
                JOptionPane.showMessageDialog(null, "Documento no encontrado o no registrado.");
            }
            ps.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla Alumno");
        }
    }
//jkdfbsbkhjdfbsdf
}
