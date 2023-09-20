package MAIN;


import java.sql.Connection;
import java.time.LocalDate;
import java.util.List;
import proyectoantesfinal.AccesoADatos.AlumnoData;
import proyectoantesfinal.AccesoADatos.Conexion;
import proyectoantesfinal.AccesoADatos.InscripcionData;
import proyectoantesfinal.AccesoADatos.MateriaData;
import proyectoantesfinal.Entidades.Alumno;
import proyectoantesfinal.Entidades.Inscripcion;
import proyectoantesfinal.Entidades.Materia;
import proyectoantesfinal.Vistas.Menu;

/*  @author Programita  */
public class ProbandoMetodosMain {

    public static void main(String[] args) {
        //Menu.vistas();
       
        //YadhiException
      
      
         AlumnoData probar = new AlumnoData();
         
         //Metodo guardarAlumno
        /*Alumno Yadhira = new Alumno(94327475, "Rebaza", " Yadhira ", LocalDate.of(2003, 03,01), true);
        
        probar.guardarAlumno( Yadhira);
        
        
        //Metodo Buscar Alumno 
        int BuscandoId=1;
        
        Alumno AlumnoEncontrado=probar.buscarAlumno(1);
        if (AlumnoEncontrado != null){
            System.out.println("Alumno encontrado: "+ AlumnoEncontrado.getNombre()+ " "+ AlumnoEncontrado.getApellido() + " "+AlumnoEncontrado.getFechaNacimiento()
            + " " + AlumnoEncontrado.getDni() );
        }else{
            System.out.println("Alumno no encontrado");  
        }
         
            
       // metodo buscarAlumnoPorDni 
       int busquedaxDni = 94327475;
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
        
        int IdAModificar =1; //esto debo remplazar 
        Alumno alumnoAModificar =  probar.buscarAlumno(IdAModificar);
                
        if (alumnoAModificar!=null) {
            alumnoAModificar.setNombre("Isabela");
            alumnoAModificar.setApellido("Sánchez");
            alumnoAModificar.setDni(94327574);
            alumnoAModificar.setFechaNacimiento(LocalDate.of(2003, 03,01));
            alumnoAModificar.setEstado(true);
                    
            probar.modificarAlumno(alumnoAModificar);
        } else {
            System.out.println("No se escontró el alumno que desea modificar ");
        }
        
        
        //Método eliminar alumno 
        int IdEliminar= 1; //se remplaza
        probar.eliminarAlumno(IdEliminar);
        */
    
      /*---------------------------------------------------------------------------------------------*/
      
                             //Probar metodos MateriData (enzo)
                             
       //crear instancia de MateriData 
       
        MateriaData materiaData =new MateriaData();
       
       //GuardarMateria
        //Materia materia = new Materia("Matematica", 2006, true);
       //materiaData.guardarMateria(materia);
       
        //Metodo buscarMateria
        //Materia materiaRecuperada = materiaData.buscarMateria(1);
        //System.out.println(materiaRecuperada);
        
        //metodo modificar materia
        //Materia materiaAModificar = new Materia(1,"Literatura2", 2005, true);
       // materiaData.modificarMateria(materiaAModificar);
    
       //metodo eliminarMateria
       //materiaData.eliminarMateria(2);
       
       //metodo listarMateria
        //List<Materia> listadoDeMateria=materiaData.listarMaterias();
        //System.out.println("listado: "+listadoDeMateria);
        
        //-----------------------------------------------------------------------------------------------
        
        InscripcionData inscripcionData=new InscripcionData();
        
                              //metodo guardarInscripcion
        //Alumno yadhira = new Alumno(33,94327475, "Rebaza", " Yadhira ", LocalDate.of(2003, 03,01), true);
        //probar.guardarAlumno( yadhira);               
        //Materia materia = new Materia(4,"Matematica", 2006, true);
        //Inscripcion inscripcion = new Inscripcion(yadhira, materia, 10);                  
        //inscripcionData.guardarInscripcion(inscripcion);
        
                           //metodo obtenerInscripciones
         
        //List<Inscripcion>listaDeInscripciones=inscripcionData.obtenerInscripciones();
        //System.out.println("lista: "+listaDeInscripciones);
                         
                           //metodo obtenerInscripcionesPorAlumno
        //List<Inscripcion>listaInscripcionPorAlumno=inscripcionData.obtenerInscripcionesPorAlumno(33);
        //System.out.println("lista: "+listaInscripcionPorAlumno);
        
                          //metodo obtenerMateriaCursadas
                         
    }  
    
      
}



