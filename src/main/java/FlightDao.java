import java.util.List;


public interface FlightDao {

    public void insertFlight(Flight flight)throws Exception;

    public void deleteFlight(Flight flight) throws Exception;

    public Flight getFlight(int id) throws Exception;

    public List<Flight> getFlights() throws Exception;
}
