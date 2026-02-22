package com.finanzas.servicio;

import com.finanzas.dominio.CategoriaGasto;
import com.finanzas.repositorio.CategoriaRepository;
import com.finanzas.repositorio.MovimientoRepository;
import com.finanzas.repositorio.PresupuestoRepository;

import java.util.List;

public class FinanzasService {

    private CategoriaRepository categoriaRepo;
    private MovimientoRepository movimientoRepo;
    private PresupuestoRepository presupuestoRepo;

    public FinanzasService(CategoriaRepository categoriaRepo, MovimientoRepository movimientoRepo, PresupuestoRepository presupuestoRepo) {
        this.categoriaRepo = categoriaRepo;
        this.movimientoRepo = movimientoRepo;
        this.presupuestoRepo = presupuestoRepo;
    }

    public void registrarCategoria(String nombre, String tipo) {
        CategoriaGasto categoria = new CategoriaGasto(nombre, tipo );
        categoriaRepo.guardar(categoria);
    }

    public List<CategoriaGasto> obtenerCategorias() {
        return categoriaRepo.obtenerTodas();
    }
}
