package com.finanzas.app;
import com.finanzas.dominio.CategoriaGasto;
import com.finanzas.repositorio.CategoriaRepository;
import com.finanzas.repositorio.MovimientoRepository;
import com.finanzas.repositorio.PresupuestoRepository;
import com.finanzas.repositorio.memoria.CategoriaRepositoryInMemory;
import com.finanzas.repositorio.memoria.MovimientoRepositoryInMemory;
import com.finanzas.repositorio.memoria.PresupuestoRepositoryInMemory;
import com.finanzas.servicio.FinanzasService;
import com.finanzas.ui.MenuConsola;

import java.util.ArrayList;
import java.util.List;

public class FinanzasConsoleApp {

    static void main (String[] args){
        IO.println(String.format("\nHello and welcome!"));

        System.out.println("\n------------------------");
        System.out.println("---> Running FinpApp... |");
        System.out.println("------------------------\n");
        System.out.println("------------------------\n");

        FinanzasService service = new FinanzasService(
                new CategoriaRepositoryInMemory(),
                new MovimientoRepositoryInMemory(),
                new PresupuestoRepositoryInMemory()
        );

        new MenuConsola(service).iniciar();
    }

}
