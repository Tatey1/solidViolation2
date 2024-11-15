package modelo;

public class Order {
    private String orderId;
    private double amount;

    public Order(String orderId, double amount) {
        this.orderId = orderId;
        this.amount = amount;
    }

    public String getOrderId() {
        return orderId;
    }

    public double getAmount() {
        return amount;
    }

    public String generateOrderReport() {
        // Lógica para generar el reporte
        return "Report for Order ID: " + orderId + " with amount: " + amount;
    }
}

