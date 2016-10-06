
package colecc;

public class Empleado {
    private String cedula;
    private int horas;
    private String nombre;
    private int edad;
    private double salario;

    public Empleado(String cedula, String nombre,int edad ) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Empleado{" + "cedula=" + cedula + ", horas=" + horas + ", nombre=" + nombre + ", edad=" + edad + ", salario=" + salario + '}';
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

  

  
    
    
}
