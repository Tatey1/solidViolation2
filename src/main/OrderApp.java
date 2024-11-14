package main;

import modelo.Order;
import modelo.Database;
import bd.DatabaseMysql;

public class OrderApp {
    public static void main(String[] args) {
        // Crear una orden con un ID y un monto
        Database orderDatabase = new DatabaseMysql();
        Order order = new Order("ORD123", 250.75, orderDatabase);

        // Guardar la orden en la base de datos
        order.saveOrder();

        // Generar y mostrar el reporte de la orden
        String report = order.generateOrderReport();
        System.out.println(report);
    }
}
