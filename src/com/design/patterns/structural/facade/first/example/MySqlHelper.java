package com.design.patterns.structural.facade.first.example;

import java.sql.Connection;

public class MySqlHelper {

    public static Connection getMySqlDBConnection() {
        // get MySql DB Connection using connection parameters
        return null;
    }

    public void generateMySqlPDFReport(String tableName, Connection con) {
        //get data from table and generate pdf report
    }

    public void generateMySqlHTMLReport(String tableName, Connection con) {

    }
}
