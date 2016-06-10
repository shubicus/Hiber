/**
 * Created by Vadim on 10-Jun-16.
 */
public class Main {
    public static void main(String[] args) throws Exception {

        Factory factory = Factory.getInstance();
        FlightDao flightDao = factory.getFlightDao();

        Flight flight = new Flight();

        flight.setDate(java.sql.Date.valueOf("2000-11-11"));
        flight.setTime(java.sql.Time.valueOf("00:00:00"));
        flight.setFlightNumber("ZZ1234");
        flight.setCity("Magadan");
        flight.setTerminal(2);
        flight.setGate("J");

        flightDao.insertFlight(flight);
    }
}
