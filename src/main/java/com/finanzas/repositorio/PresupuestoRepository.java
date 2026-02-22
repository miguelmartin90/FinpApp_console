package com.finanzas.repositorio;

import com.finanzas.dominio.Presupuesto;

import java.util.Optional;

public interface PresupuestoRepository {

    Presupuesto guardar(Presupuesto presupuesto);
    Optional<Presupuesto> buscarPorAnioYMes(int anio, int mes);
}
