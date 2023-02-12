package com.SistemaMedico.SistemaMedico;

public class Paciente {

    private int cedula;
    private String nombre;
    private HistoriaClinica historia;

    public Paciente (int cedula, String nombre, HistoriaClinica historia){
        this.cedula=cedula;
        this.nombre=nombre;
        this.historia=historia;
    }

    public int getCedula() {
        return cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public HistoriaClinica getHistoria() {
        return historia;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setHistoria(HistoriaClinica historia) {
        this.historia = historia;
    }
}
