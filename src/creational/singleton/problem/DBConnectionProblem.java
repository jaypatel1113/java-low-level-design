package creational.singleton.problem;

public class DBConnectionProblem {
    private DBConnectionProblem(){}

    public static DBConnectionProblem getInstance(){
        return new DBConnectionProblem();
    }
}
