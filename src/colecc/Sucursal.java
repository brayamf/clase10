
package colecc;
import java.util.*;
public class Sucursal {
    private String ciudad;
    private int numempleados;
    private HashMap<String,Empleado> emp;

    public Sucursal(String ciudad) {
        this.ciudad = ciudad;
        this.numempleados = 0;
        this.emp = new HashMap<>();
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public int getNumempleados() {
        return numempleados;
    }

    public void setNumempleados(int numempleados) {
        this.numempleados = numempleados;
    }
    public boolean IngresaEmpleado(Empleado e){
        
        if (this.emp.containsKey(e))
            return false;
        else {
        this.emp.put(e.getCedula(),e);
            return true;
        }
    }
    
    public ArrayList<Empleado> ListartodosEmpleados(){
       ArrayList<Empleado> empleados = new ArrayList <>();
       for (Empleado e: this.emp.values())
           empleados.add(e);
       return empleados;
    
    }
    public Empleado ListarEmpleadoMayor(){
        Empleado mayor = null;
        for(Empleado e: this.emp.values())
        {
        if (mayor == null)
            mayor = e;
        else {
        if (e.getEdad()> mayor.getEdad())
            mayor = e;
        }
        }
        return mayor;
        
    }
    public Empleado BuscarEmpleados(String cedula){
       
         Empleado e = null;       
         e = this.emp.get(cedula);
         return e;    
    }
    
    
 }
