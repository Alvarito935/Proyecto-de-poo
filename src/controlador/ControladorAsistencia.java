package controlador;

import modelo.Asistencia;
import java.util.ArrayList;
import java.util.List;

public class ControladorAsistencia {

    private List<Asistencia> asistencias;

    public ControladorAsistencia() {
        asistencias = new ArrayList<>();
    }

    public void registrarAsistencia(Asistencia asistencia) {
        asistencias.add(asistencia);
    }

    public List<Asistencia> obtenerAsistencias() {
        return asistencias;
    }
}