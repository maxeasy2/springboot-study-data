package com.mir.app.springbootstudy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.Statement;


@Component
public class PgSQlRunner implements ApplicationRunner {

    @Autowired
    private DataSource dataSource;

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        try(Connection connection = dataSource.getConnection()) {
            String url = connection.getMetaData().getURL();
            String userName = connection.getMetaData().getUserName();
            String driverName = connection.getMetaData().getDriverName();

            System.out.println("url :: " + url);
            System.out.println("userName :: " + userName);
            System.out.println("driverName :: " + driverName);

            String sql = "CREATE TABLE account (ID INTEGER NOT NULL, name VARCHAR(255), PRIMARY KEY (id))";

            Statement statement = connection.createStatement();
            statement.executeUpdate(sql);
        }

        jdbcTemplate.execute("INSERT INTO account VALUES (1, 'sample')");
    }
}
