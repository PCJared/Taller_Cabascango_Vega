/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.intsuperior.vista;

import ec.edu.intsuperior.modelo.Persona;
import java.util.Date;

/**
 *
 * @author usuar
 */
public class Aplicacion {
    public static void main(String[] args) {
       Persona cabascango= new Persona();
       Date fec= new Date(10,07,2003);
       fec.setYear(2003);
       fec.setMonth(7);
       fec.setDate(10);
       Persona p1= new Persona("1754763363", "Jordy", "Jared", "Cabascango", "Perez","Cayambe",fec,"cabascango.jordy@gmail.com");
        System.out.println("Fecha de nacimiento: "+p1.getFechaNacimiento().getYear());
    }
}
