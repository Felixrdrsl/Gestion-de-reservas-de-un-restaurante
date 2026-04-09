package models;

import java.time.LocalDate;
import java.time.LocalTime;

public class Reserva {

    private long id;
    private Cliente cliente;
    private LocalDate fecha;
    private LocalTime hora;
    private int numPersonas;
    private double importePrevisto;
    private EstadoReserva estado;
    private String zona;

    public Reserva(Cliente cliente, LocalDate fecha, LocalTime hora,
                   int numPersonas, double importePrevisto, EstadoReserva estado, String zona) {
        this.id = id++;
        this.cliente = cliente;
        this.fecha = fecha;
        this.hora = hora;
        this.numPersonas = numPersonas;
        this.importePrevisto = importePrevisto;
        this.estado = estado;
        this.zona = zona;
    }

    public long getId() {
        return id;
    }


    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public LocalTime getHora() {
        return hora;
    }

    public void setHora(LocalTime hora) {
        this.hora = hora;
    }

    public int getNumPersonas() {
        return numPersonas;
    }

    public void setNumPersonas(int numPersonas) {
        this.numPersonas = numPersonas;
    }

    public double getImportePrevisto() {
        return importePrevisto;
    }

    public void setImportePrevisto(double importePrevisto) {
        this.importePrevisto = importePrevisto;
    }

    public EstadoReserva getEstado() {
        return estado;
    }

    public void setEstado(EstadoReserva estado) {
        this.estado = estado;
    }

    public String getZona() {
        return zona;
    }

    public void setZona(String zona) {
        this.zona = zona;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Reserva{");
        sb.append("id=").append(id);
        sb.append(", cliente=").append(cliente);
        sb.append(", fecha=").append(fecha);
        sb.append(", hora=").append(hora);
        sb.append(", numPersonas=").append(numPersonas);
        sb.append(", importePrevisto=").append(importePrevisto);
        sb.append(", estado=").append(estado);
        sb.append(", zona='").append(zona).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
