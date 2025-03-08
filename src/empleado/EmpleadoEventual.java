package empleado;

import javax.swing.*;

public class EmpleadoEventual extends Empleado {

    private int honorariosHora;
    private String fechaTerminoContrato;

    public EmpleadoEventual(int numDNI, String nombre, String apellido, String fechaDeNacimiento, String direccion, String ciudadProcedencia, int codEmpleado, int numHorasExtras, String fechaIngreso, String area, String cargo, int honorariosHora, String fechaTerminoContrato) {
        super(numDNI, nombre, apellido, fechaDeNacimiento, direccion, ciudadProcedencia, codEmpleado, numHorasExtras, fechaIngreso, area, cargo);
        this.honorariosHora = honorariosHora;
        this.fechaTerminoContrato = fechaTerminoContrato;
    }

    public EmpleadoEventual(){

    }

    public int getHonorariosHora() {
        return honorariosHora;
    }

    public void setHonorariosHora(int honorariosHora) {
        this.honorariosHora = honorariosHora;
    }

    public String getFechaTerminoContrato() {
        return fechaTerminoContrato;
    }

    public void setFechaTerminoContrato(String fechaTerminoContrato) {
        this.fechaTerminoContrato = fechaTerminoContrato;
    }

    public void registrarEmpleadoEventual(){
        honorariosHora=Integer.parseInt(JOptionPane.showInputDialog("Ingrese los honorarios por hora: "));
        fechaTerminoContrato=JOptionPane.showInputDialog("Ingrese la fecha en la que termina el contrato: ");
    }

    public void imprimirEmpleadoEventual(){
        System.out.println("Honorarios por hora: " + honorariosHora);
        System.out.println("Fecha termino del contrato: " + fechaTerminoContrato);
    }
}
