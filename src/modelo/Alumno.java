package modelo;

public class Alumno extends Persona {

    private String carrera;

    public Alumno(String nombre, String codigo, String carrera) {
        super(nombre, codigo);
        this.carrera = carrera;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    @Override
    public String obtenerDetalles() {
        return getNombre() + " - " + carrera;
    }
}