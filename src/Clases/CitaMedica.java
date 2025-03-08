package Clases;
import General.Medico;
import javax.swing.JOptionPane;

public class CitaMedica {
    private ModeloDatos mimodeloDatos;
    private Paciente paciente;
    private Medico medico;
    private String servicio;
    private String fechaCita;
    private String horaCita;

    public CitaMedica(ModeloDatos modelo) {
        this.mimodeloDatos = modelo;
    }

    public CitaMedica(Paciente paciente, Medico medico, String servicio, String fechaCita, String horaCita) {
        this.paciente = paciente;
        this.medico = medico;
        this.servicio = servicio;
        this.fechaCita = fechaCita;
        this.horaCita = horaCita;
    }

    public CitaMedica() {
    }

    public void registrarCitaMedica() {
        if (mimodeloDatos == null) {
            JOptionPane.showMessageDialog(null, "Error: No se ha inicializado el modelo de datos.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        String documentoPaciente = JOptionPane.showInputDialog("Ingrese el documento del paciente");
        Paciente pacienteEncontrado = mimodeloDatos.consultarPacientePorDocumento();

        if (pacienteEncontrado != null) {
            String nombreMedico = JOptionPane.showInputDialog("Ingrese el nombre del médico");
            Medico medicoEncontrado = mimodeloDatos.consultarMedicoPorNombre(nombreMedico);

            if (medicoEncontrado != null) {
                String servicio = JOptionPane.showInputDialog("Ingrese el servicio de la cita médica");
                String fechaCita = JOptionPane.showInputDialog("Ingrese la fecha de la cita");
                String horaCita = JOptionPane.showInputDialog("Ingrese la hora de la cita");

                CitaMedica citaMedica = new CitaMedica(pacienteEncontrado, medicoEncontrado, servicio, fechaCita, horaCita);
                mimodeloDatos.registrarCitaMedica(citaMedica);
                JOptionPane.showMessageDialog(null, "Cita registrada exitosamente.", "Éxito", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Error: Nombre del médico no encontrado.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Error: Documento del paciente no encontrado.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void imprimirDatosCitaMedica() {
        System.out.println("Nombre del Paciente: " + (paciente != null ? paciente.getNombre() : "No disponible"));
        System.out.println("Nombre del Médico: " + (medico != null ? medico.getNombre() : "No disponible"));
        System.out.println("Servicio: " + (servicio != null ? servicio : "No disponible"));
        System.out.println("Fecha de la cita: " + (fechaCita != null ? fechaCita : "No disponible"));
        System.out.println("Hora de la cita: " + (horaCita != null ? horaCita : "No disponible"));
    }
}