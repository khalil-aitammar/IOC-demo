package dao;

public class DaoImpl implements IDao{
    @Override
    public double getData() {
        System.out.println("version BD");
        double data=34;
        return data;
    }
}
