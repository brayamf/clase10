/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colecc;

/**
 *
 * @author Estudiante
 */
public class main {
 
  public static void main ( String[] args){ 
      

    Empleado e1 = new  Empleado ("123","V",0);
    Empleado e2 = new  Empleado ("456","I",30);
    Sucursal s = new Sucursal("Bogota");
    
    if (!s.IngresaEmpleado(e1))System.out.println("Error");
    if (!s.IngresaEmpleado(e2))System.out.println("Error");
    if (!s.IngresaEmpleado(e2))System.out.println("Error");
    Empleado e =s.BuscarEmpleados("123");
    if (e!=null)System.out.println(e);
    else System.out.println("No existe");
}

}
