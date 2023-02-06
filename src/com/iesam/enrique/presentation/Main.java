package com.iesam.enrique.presentation;

import com.iesam.enrique.domain.models.Barbacoa;
import com.iesam.enrique.domain.models.Campera;
import com.iesam.enrique.domain.models.Carbonara;
import com.iesam.enrique.domain.models.Horno;

public class Main {
    public static void main(String[] args) {
        Barbacoa barbacoa = new Barbacoa();
        barbacoa.setId(1);
        barbacoa.setNombre("barbacoa");
        barbacoa.setSalsa("barbacoa");
        barbacoa.setExtras("queso");
        barbacoa.setPicante(false);

        Campera campera = new Campera();
        campera.setId(2);
        campera.setNombre("campero");
        campera.setSalsa("queso");
        campera.setSalsa("chedar");
        campera.setExtras("");
        campera.setCarne(true);

        Carbonara carbonara = new Carbonara();
        carbonara.setId(3);
        carbonara.setNombre("carbonara");
        carbonara.setNombre("Horneada");
        carbonara.setExtras("jamon");
        carbonara.setSalsa("Chedar");
        carbonara.setQueso_azul(true);
        carbonara.setQueso_cabra(true);

        Horno horno1 = new Horno();
        horno1.setId(4);
        horno1.setMarca("Samnsung");
        horno1.setNombre("Hornillo");
        horno1.setTemperatura("500 Cº");
        horno1.getPizzaCampera(campera);

        Horno horno2 = new Horno();
        horno1.setId(5);
        horno1.setMarca("Twingo");
        horno1.setNombre("Hornadizo");
        horno1.setTemperatura("300 Cº");
        horno1.getPizzaBarbacoa(barbacoa);

        Horno horno3 = new Horno();
        horno3.setId(6);
        horno3.setMarca("Lambo");
        horno3.setNombre("Hornazo");
        horno3.setTemperatura("400 Cº");
        horno3.getPizzaBarbacoa(barbacoa);

    }
}