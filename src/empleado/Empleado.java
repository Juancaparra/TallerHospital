package empleado;

import Clases.Persona;

import javax.swing.*;

public class Empleado extends Persona {

    private int codEmpleado;
    private int numHorasExtras;
    private String fechaIngreso;
    private String area;
    private String cargo;

    public Empleado(int numDNI, String nombre, String apellido, String fechaDeNacimiento, String direccion, String ciudadProcedencia,int codEmpleado, int numHorasExtras, String fechaIngreso, String area, String cargo) {
        super(numDNI, nombre, apellido, fechaDeNacimiento,direccion, ciudadProcedencia);
        this.codEmpleado = codEmpleado;
        this.numHorasExtras = numHorasExtras;
        this.fechaIngreso = fechaIngreso;
        this.area = area;
        this.cargo = cargo;
    }

    public Empleado() {
    }

    public int getCodEmpleado() {
        return codEmpleado;
    }

    public void setCodEmpleado(int codEmpleado) {
        this.codEmpleado = codEmpleado;
    }

    public int getNumHorasExtras() {
        return numHorasExtras;
    }

    public void setNumHorasExtras(int numHorasExtras) {
        this.numHorasExtras = numHorasExtras;
    }

    public String getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(String fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public void imprimirDatosEmpleado(){
        super.imprimirDatosPersona();
        System.out.println("Codigo empleado.Empleado: " + codEmpleado);
        System.out.println("Numero Horas Extras: " + numHorasExtras);
        System.out.println("Fecha ingreso: " + fechaIngreso);
        System.out.println("Area: " + area);
        System.out.println("Cargo: " + cargo);
    }

    public void registrarDatosEmpleado(){
        super.registrarDatos();
        codEmpleado=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el codigo del empleado: "));
        numHorasExtras=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de horas extras: "));
        fechaIngreso=JOptionPane.showInputDialog("Ingrese la fecha de ingreso: ");
        area=JOptionPane.showInputDialog("Ingrese el area: ");
        cargo=JOptionPane.showInputDialog("Ingrese el cargo: ");
    }

}
