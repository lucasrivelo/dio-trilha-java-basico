package com.example.demo;

import com.example.demo.persistence.migration.MigrationStrategy;
import com.example.demo.ui.MainMenu;

import java.sql.SQLException;

import static com.example.demo.persistence.config.ConnectionConfig.getConnection;


public class Main {

    public static void main(String[] args) throws SQLException {
        try(var connection = getConnection()){
            new MigrationStrategy(connection).executeMigration();
        }
        new MainMenu().execute();
    }

}
