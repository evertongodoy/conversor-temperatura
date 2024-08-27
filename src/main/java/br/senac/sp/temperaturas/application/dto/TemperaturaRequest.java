package br.senac.sp.temperaturas.application.dto;

public class TemperaturaRequest {

    private Double temperaturaCelsius;
    private String converterPara;

    public TemperaturaRequest(final Double temperaturaCelsius,
                              final String converterPara){
        this.temperaturaCelsius = temperaturaCelsius;
        this.converterPara = converterPara;
    }

    public Double getTemperaturaCelsius() {
        return temperaturaCelsius;
    }

    public TemperaturaRequest setTemperaturaCelsius(Double temperaturaCelsius) {
        this.temperaturaCelsius = temperaturaCelsius;
        return this;
    }

    public String getConverterPara() {
        return converterPara;
    }

    public TemperaturaRequest setConverterPara(String converterPara) {
        this.converterPara = converterPara;
        return this;
    }
}