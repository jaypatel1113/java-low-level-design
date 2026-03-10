package creational.singleton.solution.lazy;

public class DBLazy {
    private static DBLazy db;

    // so that no one can create from outside
    private DBLazy() {}

    public static DBLazy getInstance() {
        if (db == null) db = new DBLazy();
        return db;
    }
}
