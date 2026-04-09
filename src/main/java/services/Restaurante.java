package services;

import models.Cliente;
import models.Reserva;

import java.util.ArrayList;
import java.util.List;

public class Restaurante {

    private String nombre;
    private List<Cliente> clientes;
    private List<Reserva> reservas;

    public Restaurante(String nombre) {
        this.nombre = nombre;
        this.clientes = new ArrayList<>();
        this.reservas = new ArrayList<>();
    }

    public void addClientes(Cliente c){
        clientes.add(c);
    }
    public void addClientes(Reserva r){
        reservas.add(r);
    }
    public Cliente getClientePorDni(String dni){
        for (Cliente c: clientes){
            c.getDni().equals(dni);
            return c;
        }
        return null;
    }

    public List<Reserva> getReservas() {
        return reservas;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Restaurante{");
        sb.append("nombre='").append(nombre).append('\'');
        sb.append(", clientes=").append(clientes);
        sb.append(", reservas=").append(reservas);
        sb.append('}');
        return sb.toString();
    }
}
