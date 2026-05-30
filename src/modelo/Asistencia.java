package modelo;

public class Asistencia {

    private Alumno alumno;
    private Curso curso;
    private boolean presente;

    public Asistencia(Alumno alumno, Curso curso, boolean presente) {
        this.alumno = alumno;
        this.curso = curso;
        this.presente = presente;
    }

    public Alumno getAlumno() {
        return alumno;
    }

    public Curso getCurso() {
        return curso;
    }

    public boolean isPresente() {
        return presente;
    }
}