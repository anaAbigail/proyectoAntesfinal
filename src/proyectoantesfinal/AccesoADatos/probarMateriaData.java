/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectoantesfinal.AccesoADatos;

import proyectoantesfinal.Entidades.Materia;

/**
 *
 * @author Ana
 */
public class probarMateriaData {
    public static void main(String[] args) {
        MateriaData probar =new MateriaData();
        Materia mat =new Materia("matematica", 2019, true); 
        probar.guardarMateria(mat);
    
    }
}
