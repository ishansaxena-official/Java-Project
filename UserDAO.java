package dao;

import models.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserDAO {
    private Connection connection;

    public UserDAO(Connection connection) {
        this.connection = connection;
    }

    public boolean addUser(User user) throws SQLException {
        String query = "INSERT INTO users (name, email, password, role) VALUES (?, ?, ?, ?)";
        PreparedStatement stmt = connection.prepareStatement(query);
        stmt.setString(1, user.getName());
        stmt.setString(2, user.getEmail());
        stmt.setString(3, user.getPassword());
        stmt.setString(4, user.getRole());
        return stmt.executeUpdate() > 0;
    }

    public User getUserByEmail(String email) throws SQLException {
        String query = "SELECT * FROM users WHERE email = ?";
        PreparedStatement stmt = connection.prepareStatement(query);
        stmt.setString(1, email);
        ResultSet rs = stmt.executeQuery();

        if (rs.next()) {
            return new User(rs.getInt("id"), rs.getString("name"), rs.getString("email"), rs.getString("password"), rs.getString("role"));
        }
        return null;
    }
}
