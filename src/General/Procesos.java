package General;

import Clases.CitaMedica;
import Clases.ModeloDatos;
import Clases.Paciente;
import empleado.EmpleadoEventual;
import empleado.EmpleadoPorPlanilla;

import javax.swing.*;
import java.util.ArrayList;

public class Procesos {

    ArrayList<Medico> medicos = new ArrayList<>();
    ArrayList<EmpleadoEventual> empleadoEventuales = new ArrayList<>();
    ArrayList<EmpleadoPorPlanilla> empleadoPlanilla = new ArrayList<>();
    ArrayList<Paciente> paciente = new ArrayList<>();
    ArrayList<CitaMedica> citaMedica = new ArrayList<CitaMedica>();
    ModeloDatos modeloDatos;
    int menu=0;


    public Procesos() {
            modeloDatos = new ModeloDatos();

            do {
                 menu=Integer.parseInt(JOptionPane.showInputDialog("Seleccione el tipo de usuario a ingresar" +
                        "\n1. Registrar empleado por planilla" +
                        "\n2. Registrar empleado eventual" +
                        "\n3. Registrar medico" +
                        "\n4. Registrar Paciente" +
                        "\n5. Registrar cita medica" +
                        "\n6. Imprimir empleado por planilla" +
                        "\n7. Imprimir empleado eventual" +
                        "\n8. Imprimir medico" +
                        "\n9. Imprimir Paciente" +
                        "\n10. Imprimir cita medica" +
                        "\n11.Consultar Empleado Por Planilla Por Documento" +
                        "\n12. Consultar Empleado Eventual Por Documento" +
                        "\n13. Consultar Medico Por Documento" +
                        "\n14. Consultar Paciente Por Documento" +
                        "\n15. Salir"
                ));

                eleccionRegistro();
            }while (menu!=15);
    }

    public void pedirDatosEmpleadoEventual() {
        EmpleadoEventual empleadoEventual = new EmpleadoEventual();
        empleadoEventual.registrarEmpleadoEventual();
        empleadoEventuales.add(empleadoEventual);
        modeloDatos.registrarPersona(empleadoEventual);
    }

    public void pedirDatosEmpleadoPlanilla() {
        EmpleadoPorPlanilla empleadoPorPlanilla = new EmpleadoPorPlanilla();
        empleadoPorPlanilla.registrarEmpleadoPorPlanilla();
        empleadoPlanilla.add(empleadoPorPlanilla);
        modeloDatos.registrarPersona(empleadoPorPlanilla);
    }

    public void pedirDatosMedico() {
        Medico medico = new Medico();
        medico.registrarDatosMedico();
        medicos.add(medico);
        modeloDatos.registrarPersona(medico);
    }

    public void pedirDatosPaciente() {
        Paciente paciente1 = new Paciente();
        paciente1.registrarDatosPaciente();
        paciente.add(paciente1);
        modeloDatos.registrarPersona(paciente1);
    }

    public void registrarCita() {
        CitaMedica citaM = new CitaMedica();
        citaM.registrarCitaMedica();
        citaMedica.add(citaM);
    }



    public void eleccionRegistro(){
        switch (menu){
            case 1: int cant=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de empleados por planilla a ingresar"));
                for (int i = 0; i < cant; i++) {
                    pedirDatosEmpleadoPlanilla();
                }
            break;
            case 2:
                cant = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de empleados eventuales a ingresar"));
                for (int i = 0; i < cant; i++) {
                    pedirDatosEmpleadoEventual();
                }
                break;
            case 3:
                cant = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de medicos a ingresar"));
                for (int i = 0; i < cant; i++) {
                    pedirDatosMedico();
                }
                break;
            case 4:
                cant = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de pacientes a ingresar"));
                for (int i = 0; i < cant; i++) {
                    pedirDatosPaciente();
                }
                break;
            case 5:
                registrarCita();
                break;
            case 6:
                modeloDatos.imprimirEmpPlanilla();
                modeloDatos.imprimirMed();
                break;
            case 7:
                modeloDatos.imprimirEmpEventual();
                break;
            case 8:
                modeloDatos.imprimirMed();
                break;
            case 9:
                modeloDatos.imprimirPac();
                break;
            case 10:
                modeloDatos.imprimirCita();
                break;
            case 11:
                modeloDatos.consultarEmpleadoPorPlanillaPorDocumento();
                break;
            case 12:
                modeloDatos.consultarEmpleadoEventualPorDocumento();
                break;
            case 13:
                modeloDatos.consultarMedicoPorDocumento();
                break;
            case 14:
                modeloDatos.consultarPacientePorDocumento();
                break;
            case 15:
                break;
            default:System.out.println("ingrese una opcion valida");
        }

    }

    }


