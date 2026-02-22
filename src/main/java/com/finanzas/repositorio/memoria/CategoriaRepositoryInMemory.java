package com.finanzas.repositorio.memoria;

import com.finanzas.dominio.CategoriaGasto;
import com.finanzas.repositorio.CategoriaRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class CategoriaRepositoryInMemory implements CategoriaRepository {

    private final List<CategoriaGasto> categorias = new ArrayList<>();
    private int secuenciaId = 0;

    @Override
    public CategoriaGasto guardar(CategoriaGasto categoria) {
        if (categoria.getId() == 0) {
            categoria.setId(secuenciaId++);
            categorias.add(categoria);
        }
        return categoria;
    }

    @Override
    public List<CategoriaGasto> obtenerTodas() {
        return List.of();
    }

    @Override
    public Optional<CategoriaGasto> buscarPorId(Long id) {
        return Optional.empty();
    }
}
