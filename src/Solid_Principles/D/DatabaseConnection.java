package Solid_Principles.D;


// Dependency Inversion Principle (DIP):
// High-level modules should not depend on low-level modules.
// Both should depend on abstractions
public interface DatabaseConnection {
    void connect();
    void disconnect();
}

class MySqlConnection implements DatabaseConnection {
    public void connect() {
        // Code to connect to MySQL database
    }

    public void disconnect() {
        // Code to disconnect from MySQL database
    }
}

class OracleConnection implements DatabaseConnection {
    public void connect() {
        // Code to connect to Oracle database
    }

    public void disconnect() {
        // Code to disconnect from Oracle database
    }
}
