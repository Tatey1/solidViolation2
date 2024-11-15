package main;

import modelo.Order;
import modelo.OrdersDatabase;
import bd.DatabaseMysql;

public class OrderApp {
    public static void main(String[] args) {
        // Crear una orden con un ID y un monto
        Order order = new Order("ORD123", 250.75);

        // Guardar la orden en la base de datos
        OrdersDatabase ordersDatabase = new OrdersDatabase(new DatabaseMysql());
        ordersDatabase.saveOrder();

        // Generar y mostrar el reporte de la orden
        String report = order.generateOrderReport();
        System.out.println(report);
    }
}
