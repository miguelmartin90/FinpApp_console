package com.finanzas.ui;

import com.finanzas.dominio.CategoriaGasto;
import com.finanzas.servicio.FinanzasService;

import java.util.List;
import java.util.Scanner;

public class MenuConsola {

    private FinanzasService service;
    private Scanner sc = new Scanner(System.in);

    public MenuConsola(FinanzasService service) {
        this.service = service;
    }

    public void iniciar() {
        int opcion;

        do {
            mostrarMenu();
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1 -> registrarCategoria();
                case 2 -> registrarMovimiento();
                case 3 -> listarMovimientosMes();
                case 4 -> verResumenMes();
                case 5 -> configurarPresupuesto();
                case 6 -> compararGastosVsPresupuesto();
                case 0 -> System.out.println("Saliendo...");
                default -> System.out.println("Opción inválida");
            }
        } while (opcion != 0);
    }

    private void mostrarMenu() {
        System.out.println("\n=== Gestor de Finanzas Personales ===");
        System.out.println("1. Registrar categoría");
        System.out.println("2. Registrar movimiento (ingreso/gasto)");
        System.out.println("3. Listar movimientos de un mes");
        System.out.println("4. Ver resumen de un mes");
        System.out.println("5. Configurar presupuesto mensual");
        System.out.println("6. Comparar gastos vs presupuesto");
        System.out.println("0. Salir");
        System.out.print("Seleccione una opción: ");
    }

    private void registrarCategoria() {
        System.out.print("Nombre de la categoría: ");
        String nombre = sc.nextLine();

        System.out.print("Tipo de la categoría: ");
        String tipo = sc.nextLine();
        service.registrarCategoria(nombre, tipo);

        System.out.println("Categoría registrada");
    }

    private void registrarMovimiento() {
        System.out.print("Monto: ");
        double monto = sc.nextDouble();
        sc.nextLine();

        System.out.print("Tipo (INGRESO/GASTO): ");
        String tipo = sc.nextLine();

        System.out.print("Mes (1-12): ");
        int mes = sc.nextInt();
        sc.nextLine();

        System.out.print("Categoría: ");
        String categoria = sc.nextLine();

        service.registrarMovimiento(monto, tipo, mes, categoria);
        System.out.println("Movimiento registrado");
    }

    private void listarMovimientosMes() {
        System.out.print("Mes (1-12): ");
        int mes = sc.nextInt();
        sc.nextLine();

        List<Movimiento> movimientos = service.obtenerMovimientosPorMes(mes);
        movimientos.forEach(System.out::println);
    }

    private void verResumenMes() {
        System.out.print("Mes (1-12): ");
        int mes = sc.nextInt();
        sc.nextLine();

        System.out.println(service.obtenerResumenMes(mes));
    }

    private void configurarPresupuesto() {
        System.out.print("Mes (1-12): ");
        int mes = sc.nextInt();
        sc.nextLine();

        System.out.print("Monto presupuesto: ");
        double monto = sc.nextDouble();
        sc.nextLine();

        service.configurarPresupuesto(mes, monto);
        System.out.println("Presupuesto configurado");
    }

    private void compararGastosVsPresupuesto() {
        System.out.print("Mes (1-12): ");
        int mes = sc.nextInt();
        sc.nextLine();

        System.out.println(service.compararGastosVsPresupuesto(mes));
    }
}
