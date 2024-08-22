package br.senac.sp.temperaturas.domain.entity;

public class TemperaturaEntity {

    private final Double temperaturaCelsius;

    public TemperaturaEntity(Double temperaturaCelsius){
        this.temperaturaCelsius = temperaturaCelsius;
    }

    public Double converterTemperaturaFahrenheit(){
        return (temperaturaCelsius * 1.8) + 32.0;
    }

}