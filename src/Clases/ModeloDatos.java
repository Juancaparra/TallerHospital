package Clases;

import General.Medico;
import empleado.EmpleadoEventual;
import empleado.EmpleadoPorPlanilla;

import javax.swing.*;
import java.util.ArrayList;
import java.util.HashMap;

public class ModeloDatos {

    HashMap<String, Paciente> pacientesMap;
    HashMap<String, EmpleadoPorPlanilla> empleadosPlanillaMap;
    HashMap<String, EmpleadoEventual> empleadosEventualMap;
    HashMap<String, Medico> medicosMap;
    ArrayList<CitaMedica> citasMedicas=new ArrayList<>();

    public ModeloDatos() {
        pacientesMap = new HashMap<String, Paciente>();
        empleadosPlanillaMap = new HashMap<String, EmpleadoPorPlanilla>();
        medicosMap = new HashMap<String, Medico>();
        empleadosEventualMap = new HashMap<String, EmpleadoEventual>();
        citasMedicas= new ArrayList<>();
    }

    public void registrarPersona(Paciente miPaciente) {
        if (pacientesMap.containsKey(String.valueOf(miPaciente.getNumDNI()))) {
            System.out.println("Error: El paciente con DNI " + miPaciente.getNumDNI() + " ya está registrado.");
        } else {
            pacientesMap.put(String.valueOf(miPaciente.getNumDNI()), miPaciente);
            System.out.println("Se ha registrado el paciente " + miPaciente.getNombre() + " satisfactoriamente.");
        }
    }

    public void registrarPersona(EmpleadoPorPlanilla miEmpPlanilla) {
        if (empleadosPlanillaMap.containsKey(String.valueOf(miEmpPlanilla.getNumDNI()))) {
            System.out.println("Error: El empleado por planilla con DNI " + miEmpPlanilla.getNumDNI() + " ya está registrado.");
        } else {
            empleadosPlanillaMap.put(String.valueOf(miEmpPlanilla.getNumDNI()), miEmpPlanilla);
            System.out.println("Se ha registrado el empleado por planilla " + miEmpPlanilla.getNombre() + " satisfactoriamente.");
        }
    }

    public void registrarPersona(EmpleadoEventual miEmpEventual) {
        if (empleadosEventualMap.containsKey(String.valueOf(miEmpEventual.getNumDNI()))) {
            System.out.println("Error: El empleado eventual con DNI " + miEmpEventual.getNumDNI() + " ya está registrado.");
        } else {
            empleadosEventualMap.put(String.valueOf(miEmpEventual.getNumDNI()), miEmpEventual);
            System.out.println("Se ha registrado el empleado eventual " + miEmpEventual.getNombre() + " satisfactoriamente.");
        }
    }

    public void registrarPersona(Medico miMedico) {
        if (medicosMap.containsKey(String.valueOf(miMedico.getNumDNI()))) {
            System.out.println("Error: El médico con DNI " + miMedico.getNumDNI() + " ya está registrado.");
        } else {
            medicosMap.put(String.valueOf(miMedico.getNumDNI()), miMedico);
            System.out.println("Se ha registrado el médico " + miMedico.getNombre() + " satisfactoriamente.");
        }
    }


    public Medico consultarMedicoPorNombre(String nombreMedico){

        for (Medico medico: medicosMap.values()){
            if (medico.getNombre().equalsIgnoreCase(nombreMedico)){
                return medico;
            }
        }
        return null;

    }



    public Paciente consultarPacientePorDocumento() {
        String documentoPaciente = JOptionPane.showInputDialog("Ingrese el documento del empleado a consultar");
        Paciente paciente = null;

        if (pacientesMap.containsKey(documentoPaciente)) {
            paciente = pacientesMap.get(documentoPaciente);

            paciente.imprimirDatosPaciente();
        } else {
            System.out.println("Empleado no encontrado.");
        }
        return paciente;
    }

    public void consultarEmpleadoPorPlanillaPorDocumento() {
        String documentoEmpPlanilla = JOptionPane.showInputDialog("Ingrese el documento del empleado a consultar");
        EmpleadoPorPlanilla empleadoPlanilla = null;

        if (empleadosPlanillaMap.containsKey(documentoEmpPlanilla)) {
            empleadoPlanilla = empleadosPlanillaMap.get(documentoEmpPlanilla);

            empleadoPlanilla.imprimirEmpleadoPorPlanilla();
        } else {
            System.out.println("Empleado no encontrado.");
        }
    }

   public void consultarEmpleadoEventualPorDocumento() {
       String documentoEmpEventual = JOptionPane.showInputDialog("Ingrese el documento del empleado a consultar");
       EmpleadoEventual empleadoEventual = null;

       if (empleadosEventualMap.containsKey(documentoEmpEventual)) {
           empleadoEventual = empleadosEventualMap.get(documentoEmpEventual);

           empleadoEventual.imprimirEmpleadoEventual();
       } else {
           System.out.println("Empleado no encontrado.");
       }
    }

    public void consultarMedicoPorDocumento() {
        String documentoMedico = JOptionPane.showInputDialog("Ingrese el documento del empleado a consultar");
        Medico medico = null;

        if (medicosMap.containsKey(documentoMedico)) {
            medico = medicosMap.get(documentoMedico);

            medico.imprimirMedico();
        } else {
            System.out.println("Empleado no encontrado.");
        }
    }

    public void registrarCitaMedica(CitaMedica miCita){
        citasMedicas.add(miCita);
        System.out.println("Se ha registrado la cita exitosamente");
        miCita.imprimirDatosCitaMedica();
    }



    public void imprimirEmpPlanilla(){
        System.out.println("Empleado Planilla Registrado\n");

        if (empleadosPlanillaMap.size()>0) {
            for (EmpleadoPorPlanilla empleadoPorPlanilla : empleadosPlanillaMap.values()) {
                empleadoPorPlanilla.imprimirEmpleadoPorPlanilla();
            }
        }else{
            System.out.println("No hay Empleados de planilla registrados");
        }
    }

    public void imprimirEmpEventual(){
        System.out.println("Empleado Eventual Registrado\n");

        if (empleadosEventualMap.size()>0) {
            for (EmpleadoEventual empleadoEventual : empleadosEventualMap.values()) {
                empleadoEventual.imprimirEmpleadoEventual();
            }
        }else{
            System.out.println("No hay Empleados eventuales registrados");
        }
    }

    public void imprimirMed(){
        System.out.println("Medico Registrado\n");

        if (medicosMap.size()>0) {
            for (Medico medico : medicosMap.values()) {
                medico.imprimirMedico();
            }
        }else{
            System.out.println("No hay Medicos registrados");
        }
    }

    public void imprimirPac(){
        System.out.println("Paciente Registrado\n");

        if (pacientesMap.size()>0) {
            for (Paciente paciente : pacientesMap.values()) {
                paciente.imprimirDatosPaciente();
            }
        }else{
            System.out.println("No hay Pacientes registrados");
        }
    }

    public void imprimirCita(){
        System.out.println("Cita Medica Agendada\n");

        if (citasMedicas.size()>0) {
            for (CitaMedica citaMedica : citasMedicas) {
                citaMedica.imprimirDatosCitaMedica();
            }
        }else{
            System.out.println("No hay citas Medicas agendadas");
        }
    }

}

