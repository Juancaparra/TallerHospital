package Clases;

import javax.swing.*;

public class Persona {
    private int numDNI;
    private String nombre;
    private String apellido;
    private String fechaDeNacimiento;
    private String direccion;
    private String ciudadProcedencia;


    public Persona(int numDNI, String nombre, String apellido, String fechaDeNacimiento, String direccion, String ciudadProcedencia) {
        this.numDNI = numDNI;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaDeNacimiento = fechaDeNacimiento;
        this.direccion = direccion;
        this.ciudadProcedencia = ciudadProcedencia;
    }

    public Persona() {
    }


    public int getNumDNI() {
        return numDNI;
    }

    public void setNumDNI(int numDNI) {
        this.numDNI = numDNI;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }

    public void setFechaDeNacimiento(String fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCiudadProcedencia() {
        return ciudadProcedencia;
    }

    public void setCiudadProcedencia(String ciudadProcedencia) {
        this.ciudadProcedencia = ciudadProcedencia;
    }

    @Override
    public String toString() {
        return "Clases.Persona{" +
                "numDNI=" + numDNI +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", fechaDeNacimiento=" + fechaDeNacimiento +
                ", direccion='" + direccion + '\'' +
                ", ciudadProcedencia='" + ciudadProcedencia + '\'' +
                '}';
    }

    public void imprimirDatosPersona(){
        System.out.println("Numero DNI: " + numDNI);
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
        System.out.println("Fecha de Nacimiento: " + fechaDeNacimiento);
        System.out.println("Direccion: " + direccion);
        System.out.println("Ciudad de Procedencia: " + ciudadProcedencia);
    }

    public void registrarDatos(){
        numDNI=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de DNI: "));
        nombre=JOptionPane.showInputDialog("Ingrese el nombre: ");
        apellido=JOptionPane.showInputDialog("Ingrese el apellido: ");
        fechaDeNacimiento=JOptionPane.showInputDialog("Ingrese de Fecha de nacimiento: ");
        direccion=JOptionPane.showInputDialog("Ingrese la direccion: ");
        ciudadProcedencia=JOptionPane.showInputDialog("Ingrese la ciudad de procedencia: ");
    }




}
