package modelo;

public class OrdersDatabase {
    private Database database;

    public OrdersDatabase(Database database){
        this.database = database;
    }

    public void saveOrder() {
        // Lógica para guardar la orden en la base de datos
        //Envio a guardar en base de datos
        System.out.println("Order saved in database");
        database.guardar();
    }
}
