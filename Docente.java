public class Docente extends Participante {

    private final String Asignatura;

    public Docente(String Nombre, String Apellidos, Integer Edad, String asignatura) {
        super(Nombre, Apellidos, Edad);
       this.Asignatura = asignatura;
    }

    public String getAsignatura() {
        return Asignatura;
    }

    @Override
    public String toString() { /*Aqui estoy sobre escribiendo el String*/
        return "Docente: " +
                super.toString() +  /*Este toString trae nombre, apellido y edad de la clase participante*/
                "\nAsignatura: " + getAsignatura();
    }
}
