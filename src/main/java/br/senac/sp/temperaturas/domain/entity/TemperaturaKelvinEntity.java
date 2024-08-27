package br.senac.sp.temperaturas.domain.entity;

public class TemperaturaKelvinEntity {

    private final Double temperaturaCelsius;

    public TemperaturaKelvinEntity(Double temperaturaCelsius){
        this.temperaturaCelsius = temperaturaCelsius;
    }

    public Double converterTemperaturKelvin(){
        return temperaturaCelsius + 273.15;
    }

}