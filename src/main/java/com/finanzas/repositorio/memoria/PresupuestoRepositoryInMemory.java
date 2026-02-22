package com.finanzas.repositorio.memoria;

import com.finanzas.dominio.Presupuesto;
import com.finanzas.repositorio.PresupuestoRepository;

import java.util.Optional;

public class PresupuestoRepositoryInMemory implements PresupuestoRepository {
    @Override
    public Presupuesto guardar(Presupuesto presupuesto) {
        return null;
    }

    @Override
    public Optional<Presupuesto> buscarPorAnioYMes(int anio, int mes) {
        return Optional.empty();
    }
}
