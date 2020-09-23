import java.util.InputMismatchException;
import java.util.Scanner;

public class ReceptorDatos {

    private final Scanner Scanner = new Scanner(System.in);
    private Docente Docente;
    private Estudiante Estudiante;

    public ReceptorDatos(){
        ObtenerInfotmacionEstudiante();
        ObtenerInformacionDocente();
    }

    private void ObtenerInfotmacionEstudiante(){
        System.out.println("Estudiante");
        Participante informacionParticipante = ObtenerInformacionParticipante();
        String Grupo = "";

        do {
            System.out.println("Ingrese Grupo");
            Grupo = Scanner.nextLine().toUpperCase();
        }while (!Grupo.matches("([1-9]|1[0-1])°[A-D]"));
        Estudiante = new Estudiante(
                informacionParticipante.getNombre(), informacionParticipante.getApellidos(),
                informacionParticipante.getEdad(), Grupo
        );
    }

    private void ObtenerInformacionDocente(){
        System.out.println("Docente");
        Participante informacionParticipante = ObtenerInformacionParticipante();
        System.out.println("Ingrese Asignatura");
        String Asignatura = Scanner.nextLine();
        Docente = new Docente(
                informacionParticipante.getNombre(), informacionParticipante.getApellidos(),
                informacionParticipante.getEdad(), Asignatura
        );
    }

    public Participante ObtenerInformacionParticipante(){
        System.out.println("Ingrese Su Nombre");
        String Nombre = Scanner.nextLine();
        System.out.println("Ingrese Sus Apellidos");
        String Apellidos = Scanner.nextLine();
        Integer Edad = 0;

        do {

            try {
                System.out.println("Ingrese Su Edad");
                Edad = Scanner.nextInt();

            }catch (InputMismatchException exception) {
                System.out.println("La edad debe ser un numero entero positvo");
                Scanner.nextLine();

            }
        }while (Edad == 0 || Edad < 0);
        Scanner.nextLine();

        return new Participante(Nombre, Apellidos, Edad);
    }

    public Docente getDocente() {
        return Docente;
    }

    public Estudiante getEstudiante() {
        return Estudiante;
    }
}
