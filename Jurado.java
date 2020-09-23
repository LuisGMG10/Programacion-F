public class Jurado {
    private final ReceptorDatos Datos = new ReceptorDatos();

    public void Determinarganador(){
        Estudiante estudiante = Datos.getEstudiante();
        Docente docente = Datos.getDocente();
        if (estudiante.getNumeroAleatorio() > docente.getNumeroAleatorio()) {
            imprimirGanador(estudiante);
        }  else if (estudiante.getNumeroAleatorio() == docente.getNumeroAleatorio()){
            System.out.println("Aqui Hubo Empate");
        } else {
            imprimirGanador(docente);
        }
    }
    public void imprimirGanador(Participante participante){
        System.out.println("El ganador fue: \n" + participante.toString());
    }
}
