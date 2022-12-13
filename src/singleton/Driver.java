package singleton;

public class Driver {

    private static Driver driver;

    private Driver(){}

    public static Driver getDriver(){
        if (driver == null) driver = new Driver();
        return driver;
    }

    public static void main(String[] args) {
        Driver d1 = Driver.getDriver();
        Driver d2 = Driver.getDriver();
        Driver d3 = Driver.getDriver();

        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);
    }

}
