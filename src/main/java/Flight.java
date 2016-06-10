import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "flight")
public class Flight implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID", nullable = false)
    private Integer id;

    @Column(name = "DATE")
    @Temporal(value = TemporalType.DATE)
    private Date date;

    @Column(name = "TIME")
    @Temporal(value = TemporalType.TIME)
    private Date time;

    @Column(name = "FLIGHT_NUMBER", nullable = false)
    private String flightNumber;

    @Column(name = "CITY", nullable = false)
    private String city;

    @Column(name = "TERMINAL", nullable = false)
    private Integer terminal;

    @Column(name = "GATE", nullable = false)
    private String gate;

    public Flight() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Integer getTerminal() {
        return terminal;
    }

    public void setTerminal(Integer terminal) {
        this.terminal = terminal;
    }

    public String getGate() {
        return gate;
    }

    public void setGate(String gate) {
        this.gate = gate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Flight flight = (Flight) o;

        if (!id.equals(flight.id)) return false;
        if (!date.equals(flight.date)) return false;
        if (!time.equals(flight.time)) return false;
        if (!flightNumber.equals(flight.flightNumber)) return false;
        if (!city.equals(flight.city)) return false;
        if (!terminal.equals(flight.terminal)) return false;
        return gate.equals(flight.gate);

    }

    @Override
    public int hashCode() {
        int result = id.hashCode();
        result = 31 * result + date.hashCode();
        result = 31 * result + time.hashCode();
        result = 31 * result + flightNumber.hashCode();
        result = 31 * result + city.hashCode();
        result = 31 * result + terminal.hashCode();
        result = 31 * result + gate.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Flight{" +
                "id=" + id +
                ", date=" + date +
                ", time=" + time +
                ", flightNumber='" + flightNumber + '\'' +
                ", city='" + city + '\'' +
                ", terminal=" + terminal +
                ", gate='" + gate + '\'' +
                '}';
    }
}
