package com.iesam.enrique.domain.models;

public class Horno {
    private Integer id;
    private String nombre;
    private String marca;
    private String temperatura;

    private Pizza pizza;

    public Pizza getPizzaCampera(Campera campera) {
        return pizza;
    }
    public Pizza getPizzaBarbacoa(Barbacoa barbacoa) {
        return pizza;
    }
    public Pizza getPizzaCarbonara(Carbonara carbonara) {
        return pizza;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(String temperatura) {
        this.temperatura = temperatura;
    }
}
