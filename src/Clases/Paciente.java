package Clases;

import javax.swing.*;

public class Paciente extends Persona {

    private int numHistoriaClinica;
    private String sexo;
    private String grupoSanguineo;
    private String listaMedicamentos;

    public Paciente(int numDNI, String nombre, String apellido, String fechaDeNacimiento, String direccion, String ciudadProcedencia, int numHistoriaClinica, String sexo, String grupoSanguineo, String listaMedicamentos) {
        super(numDNI,nombre, apellido, fechaDeNacimiento, direccion, ciudadProcedencia);
        this.numHistoriaClinica = numHistoriaClinica;
        this.sexo = sexo;
        this.grupoSanguineo = grupoSanguineo;
        this.listaMedicamentos = listaMedicamentos;
    }

    public Paciente(){

    }

    public int getNumHistoriaClinica() {

        return numHistoriaClinica;
    }

    public void setNumHistoriaClinica(int numHistoriaClinica) {
        try {
            this.numHistoriaClinica = Integer.parseInt(String.valueOf(numHistoriaClinica));
        } catch (NumberFormatException e) {
            System.out.println("Error: El número de historia clínica debe ser un valor numérico válido.");
        }
    }

    public String getSexo() {

        return sexo;
    }

    public void setSexo(String sexo) {

        this.sexo = sexo;
    }

    public String getGrupoSanguineo() {

        return grupoSanguineo;
    }

    public void setGrupoSanguineo(String grupoSanguineo) {

        this.grupoSanguineo = grupoSanguineo;
    }

    public String getListaMedicamentos() {

        return listaMedicamentos;
    }

    public void setListaMedicamentos(String listaMedicamentos) {

        this.listaMedicamentos = listaMedicamentos;
    }

    public void registrarDatosPaciente(){
        super.registrarDatos();
        numHistoriaClinica=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de historia clinica: "));
        sexo=JOptionPane.showInputDialog("Ingrese el sexo: ");
        grupoSanguineo=JOptionPane.showInputDialog("Ingrese el grupo sanquineo: ");
        listaMedicamentos=JOptionPane.showInputDialog("Ingrese la lista de medicamentos: ");
    }

    public void imprimirDatosPaciente(){
        super.imprimirDatosPersona();
        System.out.println("Numero de historia clinica: " + numHistoriaClinica);
        System.out.println("Sexo: " + sexo);
        System.out.println("FGrupo sanguineo: " + grupoSanguineo);
        System.out.println("lista de medicamentos: " + listaMedicamentos);
    }

}
