package src.Ejer2cITA;

import javax.swing.*;

public class Cita {
    public int codCita;
    public String fecha;
    public int hora;
    public String consultorio;
    public String nombreMedico;
    public String nombrePaciente;
    private String centroMedico;

    public int getCodCita() {
        return codCita;
    }

    public void setCodCita(int codCita) {
        this.codCita = codCita;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public String getConsultorio() {
        return consultorio;
    }

    public void setConsultorio(String consultorio) {
        this.consultorio = consultorio;
    }

    public String getNombreMedico() {
        return nombreMedico;
    }

    public void setNombreMedico(String nombreMedico) {
        this.nombreMedico = nombreMedico;
    }

    public String getNombrePaciente() {
        return nombrePaciente;
    }

    public void setNombrePaciente(String nombrePaciente) {
        this.nombrePaciente = nombrePaciente;
    }

    public String getCentroMedico() {
        return centroMedico;
    }

    public void setCentroMedico(String centroMedico) {
        this.centroMedico = centroMedico;
    }
    public String crearCita() {
        this.codCita = 123;
        this.fecha = "15 de enero";
        this.hora = 6;
        this.consultorio = "11";
        this.nombreMedico = "Andres";
        this.nombrePaciente = "Nicolas";
        this.centroMedico = "Eps sanitas";
        return "Cita creada";
    }
    public String consultarDatos(){
        return "Paciente " + this.nombrePaciente + " el codigo de su cita es " + this.codCita +
                " para el dia " + this.fecha + " a la hora " + this.hora + " en el consultorio " +
                this.consultorio + " con el medico " + this.nombreMedico;

    }
    public String cambiarHora(){
        this.hora = Integer.parseInt(JOptionPane.showInputDialog(null,"ingrese nueva hora: "));
     return "Hora a sido cambiada por: " + this.hora;
    }
}


