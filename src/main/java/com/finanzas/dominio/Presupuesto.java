package com.finanzas.dominio;

import java.util.Map;

public class Presupuesto {

    private int anio;
    private int mes;
    private double montoTotal;
    private Map<CategoriaGasto, Double> montoPorCategoria;

}
