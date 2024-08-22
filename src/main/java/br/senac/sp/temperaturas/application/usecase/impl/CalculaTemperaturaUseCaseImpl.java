package br.senac.sp.temperaturas.application.usecase.impl;

import br.senac.sp.temperaturas.application.dto.TemperaturaRequest;
import br.senac.sp.temperaturas.application.usecase.CalculaTemperaturaUseCase;
import br.senac.sp.temperaturas.domain.entity.TemperaturaEntity;
import org.springframework.stereotype.Service;

@Service
public class CalculaTemperaturaUseCaseImpl implements CalculaTemperaturaUseCase {

    @Override
    public Double calcularTemperatura(TemperaturaRequest request) {
        TemperaturaEntity temperaturaEntity = new TemperaturaEntity(request.getTemperaturaCelsius());
        return temperaturaEntity.converterTemperaturaFahrenheit();
    }

}
