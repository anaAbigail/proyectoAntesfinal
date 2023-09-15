package proyectoantesfinal.AccesoADatos;

import java.sql.Connection;
import java.time.LocalDate;
import proyectoantesfinal.Entidades.Alumno;

/*  @author Programita  */
public class NewMain {

    public static void main(String[] args) {
        Connection con = Conexion.getConexion();

        //Alumno alicia = new Alumno(8234089, "morales", " alicia", LocalDate.of(1890, 02, 23), true);
        AlumnoData probar = new AlumnoData();
        //probar.guardarAlumno(alicia);
        
        
        Alumno alicia=probar.buscarAlumno(32);
        
        System.out.println("alumno: "+alicia);
                    
        
        

    }

}
