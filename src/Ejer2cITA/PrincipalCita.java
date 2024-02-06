package src.Ejer2cITA;

public class PrincipalCita {
    public static void main(String[] args) {
       Cita cita = new Cita();
        System.out.println(cita.crearCita() + " para el paciente " + cita.nombrePaciente);
        System.out.println(cita.consultarDatos());
        System.out.println(cita.cambiarHora());
    }
}
