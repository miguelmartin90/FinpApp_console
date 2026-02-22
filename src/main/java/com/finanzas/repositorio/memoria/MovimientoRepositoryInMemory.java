package com.finanzas.repositorio.memoria;

import com.finanzas.dominio.Movimiento;
import com.finanzas.repositorio.MovimientoRepository;

import java.time.LocalDate;
import java.util.List;

public class MovimientoRepositoryInMemory implements MovimientoRepository {
    @Override
    public Movimiento guardar(Movimiento movimiento) {
        return null;
    }

    @Override
    public List<Movimiento> obtenerTodos() {
        return List.of();
    }

    @Override
    public List<Movimiento> buscarPorRangoFecha(LocalDate desde, LocalDate hasta) {
        return List.of();
    }
}
