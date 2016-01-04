package org.zaremba.spring.config;

import org.testng.annotations.Test;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import static org.testng.Assert.*;

/**
 * @author Gorkhover D.
 * @since 2016-01-05
 */
public class H2ConfigTest {

    @Test
    public void testName() throws Exception {
        DbConfig dbConfig = new DbConfig();

        DataSource dataSource = dbConfig.dataSource();

        Connection connection = dataSource.getConnection();

        Statement stat = connection.createStatement();
        stat.execute("CREATE TABLE USER(" +
                "id INT PRIMARY KEY, " +
                "name VARCHAR(255));");

        stat.close();
        connection.commit();

        stat = connection.createStatement();
        stat.execute("INSERT INTO USER(id, name) VALUES(1, 'JOHN');");
        stat.close();
        connection.commit();

        stat = connection.createStatement();
        ResultSet resultSet = stat.executeQuery("SELECT * FROM USER;");

        while (resultSet.next()) {
            int id = resultSet.getInt("id");
            String name = resultSet.getString("name");

            System.out.printf("id: %s, name: %s\n", id, name);
        }

        connection.close();
    }
}