package by.belhard.j19.lessons.lesson11;

import java.sql.Connection;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {

        DBManager dbManager = new DBManager();

        Connection connection = dbManager.getConnection();
    }
}
