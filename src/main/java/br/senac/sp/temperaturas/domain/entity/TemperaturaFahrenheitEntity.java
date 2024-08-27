package br.senac.sp.temperaturas.domain.entity;

public class TemperaturaFahrenheitEntity {

    private final Double temperaturaCelsius;

    public TemperaturaFahrenheitEntity(Double temperaturaCelsius){
        this.temperaturaCelsius = temperaturaCelsius;
    }

    public Double converterTemperaturaFahrenheit(){
        return (temperaturaCelsius * 1.8) + 32.0;
    }

}