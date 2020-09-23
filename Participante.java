import java.util.Random;

public class Participante {

    private final String Nombre;
    private final String Apellidos;
    private final Integer Edad;
    private final Integer NumeroAleatorio;

    public Participante(String Nombre, String Apellidos, Integer Edad ) {
        this.Nombre = Nombre;
        this.Apellidos = Apellidos;
        this.Edad = Edad;
        this.NumeroAleatorio =(int) (Math.round(Math.random()*5 + 1));
    }

    public String getNombre() {
        return Nombre;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public Integer getEdad() {
        return Edad;
    }

    public Integer getNumeroAleatorio() {
        return NumeroAleatorio;
    }

    @Override
    public String toString() {
        return  "\nNombre: " + getNombre() +
                "\nApellidos " + getApellidos() +
                "\nEdad: " + getEdad() +
                "\nNumero: " + getNumeroAleatorio();
    }
}
