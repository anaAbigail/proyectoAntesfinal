package proyectoantesfinal.AccesoADatos;

import java.sql.Connection;

/*  @author Programita  */

public class ProbarInscripcion {

   
    public static void main(String[] args) {
        Connection con = Conexion.getConexion();
     
     //PROBANDO METODOS INSCRIPCION
     // Crear una instancia de la clase IncripcionAdata
        IncripcionAdata ProbarInscripcion = new IncripcionAdata();

        // Ejemplo de cómo guardar una inscripción
       
          
        // NO FUNCIONA HASTA HACER MATERIAS PORQUE INSCRIPCION DEBE RECIBIR UNA MATERI Y UN ALUMNO
        //EXISTENTE 
    }

}
