package proyectoantesfinal.AccesoADatos;

import java.sql.Connection;
import java.time.LocalDate;
import java.util.List;
import proyectoantesfinal.Entidades.Alumno;

/*  @author Programita  */
public class ProbandoMetodosMain {

    public static void main(String[] args) {
        Connection con = Conexion.getConexion();
         AlumnoData probar = new AlumnoData();
         
         //Metodo guardarAlumno
        Alumno alicia = new Alumno(8234089, "morales", " alicia", LocalDate.of(1890, 02, 23), true);
        
        probar.guardarAlumno(alicia);
        
        //Metodo Buscar Alumno 
        int BuscandoId=1;
        
        Alumno cualEsElAlumno=probar.buscarAlumno(32);
        if (cualEsElAlumno != null){
            System.out.println("Alumno encontrado: "+ cualEsElAlumno.getNombre());
        }else{
            System.out.println("Alumno no encontrado");  
        }
   //terminar
    }  
 //---------------------------------------------------------------------------------       
       
}


