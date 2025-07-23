
package com.gbitd.DataAcess;

import java.sql.Connection;

/**
 * DataSourse
 */
public class DataSourse {

    private Connection connection;
    private String caminhoBancoSQLite;


    public DataSourse(String caminhobancoSQLite){
        this.caminhoBancoSQLite = caminhobancoSQLite;
        String url = "jdbc:sqlite:" + caminhoBancoSQLite;
    }

    public Connection getConnection(){
        return this.connection;
    }

    public void clodeDataSource(){

    }


}
