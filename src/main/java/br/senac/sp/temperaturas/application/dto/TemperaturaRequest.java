package br.senac.sp.temperaturas.application.dto;

import java.util.Objects;

public class TemperaturaRequest {

    private Double temperaturaCelsius;

    public TemperaturaRequest(){}

    public TemperaturaRequest(final Double temperaturaCelsius){
        this.temperaturaCelsius = temperaturaCelsius;
    }

    public Double getTemperaturaCelsius() {
        return temperaturaCelsius;
    }

    public TemperaturaRequest setTemperaturaCelsius(Double temperaturaCelsius) {
        this.temperaturaCelsius = temperaturaCelsius;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TemperaturaRequest that = (TemperaturaRequest) o;
        return Objects.equals(temperaturaCelsius, that.temperaturaCelsius);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(temperaturaCelsius);
    }

}