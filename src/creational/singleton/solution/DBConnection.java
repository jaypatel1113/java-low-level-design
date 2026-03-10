package creational.singleton.solution;

public class DBConnection {
    private static volatile DBConnection db;

    private DBConnection(){}

    public static DBConnection getInstance(){
        if (db == null) {
            synchronized (DBConnection.class) {
                if (db == null) {
                    db = new DBConnection();
                }
            }
        }

        return db;
    }
}
