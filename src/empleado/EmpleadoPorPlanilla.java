package empleado;

import javax.swing.*;

public class EmpleadoPorPlanilla extends Empleado {

    private int salarioMensual;
    private int adicionalHoraExtra;

    public EmpleadoPorPlanilla(int numDNI, String nombre, String apellido, String fechaDeNacimiento, String direccion, String ciudadProcedencia, int codEmpleado, int numHorasExtras, String fechaIngreso, String area, String cargo, int salarioMensual, int adicionalHoraExtra) {
        super(numDNI, nombre, apellido, fechaDeNacimiento, direccion, ciudadProcedencia, codEmpleado, numHorasExtras, fechaIngreso, area, cargo);
        this.salarioMensual = salarioMensual;
        this.adicionalHoraExtra = adicionalHoraExtra;
    }

    public EmpleadoPorPlanilla(){

    }


    public int getSalarioMensual() {
        return salarioMensual;
    }

    public void setSalarioMensual(int salarioMensual) {
        this.salarioMensual = salarioMensual;
    }

    public int getAdicionalHoraExtra() {
        return adicionalHoraExtra;
    }

    public void setAdicionalHoraExtra(int adicionalHoraExtra) {
        this.adicionalHoraExtra = adicionalHoraExtra;
    }

    public void registrarEmpleadoPorPlanilla() {
        super.registrarDatosEmpleado();
        salarioMensual=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el salario mensual: "));
        adicionalHoraExtra=Integer.parseInt(JOptionPane.showInputDialog("Ingrese las horas extras: "));
    }

    public void imprimirEmpleadoPorPlanilla(){
        super.imprimirDatosEmpleado();
        System.out.println("Salario Mensual: " + salarioMensual);
        System.out.println("Horas extras: " + adicionalHoraExtra);
    }
}
