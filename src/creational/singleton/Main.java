package creational.singleton;

import creational.singleton.eager.DBEager;
import creational.singleton.lazy.DBLazy;
import creational.singleton.problem.DBConnectionProblem;

public class Main {
    public static void main(String[] args) {
//        problem - returns a new object every time
        DBConnectionProblem dbp1 = DBConnectionProblem.getInstance();
        DBConnectionProblem dbp2 = DBConnectionProblem.getInstance();
        System.out.println("Problem implementation returns different instance: " + (dbp1 == dbp2));

//        eager - thread safe
        DBEager dbe1 = DBEager.getInstance();
        DBEager dbe2 = DBEager.getInstance();
        System.out.println("Eager singleton returns same instance: " + (dbe1 == dbe2));

//        lazy - not thread safe
        DBLazy dbl1 = DBLazy.getInstance();
        DBLazy dbl2 = DBLazy.getInstance();
        System.out.println("Lazy singleton returns same instance in single-threaded use: " + (dbl1 == dbl2));

//        lazy with double-checked locking - thread safe
        DBConnection db1 = DBConnection.getInstance();
        DBConnection db2 = DBConnection.getInstance();
        System.out.println("Double-checked locking singleton returns same instance: " + (db1 == db2));
    }
}
