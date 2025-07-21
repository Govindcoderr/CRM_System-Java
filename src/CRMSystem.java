import java.sql.*;
import java.util.*;

public class CRMSystem {

    public void  addCustomer( Customer customer){
        try(Connection conn = DBConnection.getConnection()){
            String sql = "INSERT INTO  customers VALUES (?, ?, ?, ?, ?)";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1 ,customer.getId());
            stmt.setString(2, customer.getName());
            stmt.setString(3, customer.getEmail());
            stmt.setString(4, customer.getPhone());
            stmt.setString(5, customer.getAddress());
            stmt.executeUpdate();
            System.out.println("✅ Customer added to database.");
        } catch (SQLException e) {
            System.out.println("❌ Error: " + e.getMessage());
        }
    }

    public void viewCustomers(){
        try(Connection conn = DBConnection.getConnection()){
            String sql = "SELECT * FROM customers";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            System.out.println("📄 Customer Records:");
            while(rs.next()){
                System.out.println(rs.getInt("id") + ", " +
                        rs.getString("name") + ", " +
                        rs.getString("email") + ", " +
                        rs.getString("phone") + ", " +
                        rs.getString("address"));


            }
        } catch (SQLException e) {
            System.out.println("❌ Error: " + e.getMessage());
        }
    }

    public Customer searchCustomer(int id ) {
        try (Connection conn = DBConnection.getConnection()) {
            String sql = "SELECT * FROM customers WHERE id = ?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                return new Customer(id, rs.getString("name"), rs.getString("email"),
                        rs.getString("phone"), rs.getString("address"));
            }
        } catch (SQLException e){
            System.out.println("❌ Error: " + e.getMessage());
        }
        return null;
    }


    public void updateCustomer(int id, String newName) {
        try (Connection conn = DBConnection.getConnection()) {
            String sql = "UPDATE customers SET name = ? WHERE id = ?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, newName);
            stmt.setInt(2, id);
            int rows = stmt.executeUpdate();
            if (rows > 0)
                System.out.println("✅ Customer updated.");
            else
                System.out.println("⚠️ Customer not found.");
        } catch (SQLException e) {
            System.out.println("❌ Error: " + e.getMessage());
        }
    }

    public void deleteCustomer(int id) {
        try (Connection conn = DBConnection.getConnection()) {
            String sql = "DELETE FROM customers WHERE id = ?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1, id);
            int rows = stmt.executeUpdate();
            if (rows > 0)
                System.out.println("🗑️ Customer deleted.");
            else
                System.out.println("⚠️ Customer not found.");
        } catch (SQLException e) {
            System.out.println("❌ Error: " + e.getMessage());
        }
    }
}
