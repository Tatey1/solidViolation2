package bd;

import modelo.Database;

public class DatabaseMysql implements Database{

    public void guardar() {
        System.out.println("Creo conexion a la base de datos");
        System.out.println("Guarde en la base de datos");
    }
}
