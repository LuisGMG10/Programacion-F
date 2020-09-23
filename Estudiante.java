public class Estudiante extends Participante {

    private final String Grupo;

    public Estudiante(String Nombre, String Apellidos, Integer Edad,  String grupo) {
        super(Nombre, Apellidos, Edad);
        this.Grupo = grupo;
    }

    public String getgrupo() {
        return Grupo;
    }

    @Override
    public String toString() {
        return "Estudiante: " +
                super.toString() +
                "\nGrupo: " + getgrupo();
    }
}
