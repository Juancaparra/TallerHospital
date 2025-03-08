package General;

import empleado.EmpleadoPorPlanilla;

import javax.swing.*;

public class Medico extends EmpleadoPorPlanilla {

    private String especialidad;
    private int numConsultorio;

    public Medico(int numDNI, String nombre, String apellido, String fechaDeNacimiento, String direccion, String ciudadProcedencia, int codEmpleado, int numHorasExtras, String fechaIngreso, String area, String cargo, int salarioMensual, int adicionalHoraExtra, String especialidad, int numConsultorio) {
        super(numDNI, nombre, apellido, fechaDeNacimiento, direccion, ciudadProcedencia, codEmpleado, numHorasExtras, fechaIngreso, area, cargo, salarioMensual, adicionalHoraExtra);
        this.especialidad = especialidad;
        this.numConsultorio = numConsultorio;
    }

    public Medico() {
        super();
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public int getNumConsultorio() {
        return numConsultorio;
    }

    public void setNumConsultorio(int numConsultorio) {
        this.numConsultorio = numConsultorio;
    }

    public void imprimirMedico(){
        super.imprimirDatosPersona();
        System.out.println("Especialidad: " + especialidad);
        System.out.println("Numero de Consultorio: " + numConsultorio);
    }

    public void registrarDatosMedico(){
        super.registrarDatos();
        especialidad=JOptionPane.showInputDialog("Ingrese el codigo del empleado: ");
        numConsultorio=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de horas extras: "));
    }
}
