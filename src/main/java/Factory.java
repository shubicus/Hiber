
public class Factory {

    public static Factory ourInstance = new Factory();

    public FlightDao flightDao;

    public static Factory getInstance() {
        return Factory.ourInstance;
    }

    private Factory() {
    }

    public FlightDao getFlightDao() {
        if (flightDao == null) {
            flightDao = new FlightDaoImpl();
        }
        return flightDao;
    }


}
