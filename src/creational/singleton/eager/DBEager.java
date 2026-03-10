package creational.singleton.eager;

public class DBEager {
    private static final DBEager db = new DBEager();

    // so that no one can create from outside
    private DBEager() {}

    public static DBEager getInstance() {
        return db;
    }
}
