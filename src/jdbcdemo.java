import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class jdbcdemo {
    public static void main(String[] args) {
        String url = "jdbc:postgresql://localhost:5432/postgres";
        String username = "postgres";
        String password = "1234";

        try {
            Connection connection = DriverManager.getConnection(url, username, password);
            System.out.println("Connected to PostgreSQL database!");

            // Performing a SELECT statement
            String selectQuery = "SELECT * FROM cars";
            PreparedStatement selectStatement = connection.prepareStatement(selectQuery);
            ResultSet resultSet = selectStatement.executeQuery();

            System.out.println("Cars in the database:");
            while (resultSet.next()) {
                // Retrieve data from the result set
                String brand = resultSet.getString("brand");
                String model = resultSet.getString("model");
                int year = resultSet.getInt("year");
                System.out.println("Brand: " + brand + ", Model: " + model + ", Year: " + year);
            }


            // Performing an UPDATE statement based on the model name
            String updateQuery = "UPDATE cars SET brand = ? WHERE model = ?";
            PreparedStatement updateStatement = connection.prepareStatement(updateQuery);
            updateStatement.setString(1, "Audii"); // Set the new brand
            updateStatement.setString(2, "p1800"); // Set the model name of the record to update
            int rowsAffected = updateStatement.executeUpdate();

            System.out.println("Update successful! Rows affected: " + rowsAffected);

            // Performing a DELETE statement
            String deleteQuery = "DELETE FROM cars WHERE model = ?";
            PreparedStatement deleteStatement = connection.prepareStatement(deleteQuery);
            deleteStatement.setString(1, "Celica"); // Set the model name of the record to delete
            int rowAffected = deleteStatement.executeUpdate();

            System.out.println("Delete successful! Rows affected: " + rowAffected);


            // Close resources
            resultSet.close();
            selectStatement.close();
            updateStatement.close();
            deleteStatement.close();
            connection.close();

        } catch (SQLException e) {
            System.out.println("Connection failed or SQL error: " + e.getMessage());
        }
    }
}
