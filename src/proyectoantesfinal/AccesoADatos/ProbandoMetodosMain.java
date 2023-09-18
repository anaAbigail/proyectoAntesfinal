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
       // metodo buscarAlumnoPorDni 
       int busquedaxDni = 94327574;
        Alumno alumnoPorDni= probar.buscarAlumnoPorDni(busquedaxDni);
         if (alumnoPorDni!= null ){
             System.out.println("Alumno encontrado por DNI: ");
         }else{
             System.out.println("Alumno no encontrado por DNI: ");
         }
             
          //Metodo listar alumnos 
          
          List <Alumno> listaDeAlumno = probar.listarAlumnos();
          System.out.println("Lista de Alumnos ");
          for(Alumno alumno : listaDeAlumno){
              System.out.println(alumno.getNombre());
              
          }
          
        //Método modificarAlumno
        
        int IdAModificar =2; //esto debo remplazar 
        Alumno alumnoAModificar =
                
                probar.buscarAlumno(IdAModificar);
        if (alumnoAModificar!=null) {
            alumnoAModificar.setNombre("El nombre nuevo es ");
            probar.modificarAlumno(alumnoAModificar);
        } else {
            System.out.println("No se escontró el alumno que desea modificar ");
        }
        
        
        //Método eliminar alumno 
        int IdEliminar= 3; //se remplaza
        probar.eliminarAlumno(IdEliminar);
        
        
    }  
 //---------------------------------------------------------------------------------       
       
}


