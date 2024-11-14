package modelo;

public class Order {
    private String orderId;
    private double amount;
    private Database database;

    public Order(String orderId, double amount, Database database) {
        this.orderId = orderId;
        this.amount = amount;
        this.database = database;
    }

    public String getOrderId() {
        return orderId;
    }

    public double getAmount() {
        return amount;
    }

    public void saveOrder() {
        System.out.println("Order saved in database");
        database.guardar();
    }

    public String generateOrderReport() {
        // Lógica para generar el reporte
        return "Report for Order ID: " + orderId + " with amount: " + amount;
    }
}

