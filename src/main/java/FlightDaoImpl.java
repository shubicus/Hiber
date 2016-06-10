import org.hibernate.Session;

import java.util.List;

public class FlightDaoImpl implements FlightDao {


    public void insertFlight(Flight flight) throws Exception {
        Session session = null;
        try {
            session = HibernateUtil.createSessionFactory().openSession();
            session.beginTransaction();
            session.save(flight);
            session.getTransaction().commit();
            session.update(flight);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if ((session != null) && (session.isOpen())) {
                session.close();
            }
        }

    }

    public void deleteFlight(Flight flight) throws Exception {
        Session session = null;
        try {
            session = HibernateUtil.createSessionFactory().openSession();
            session.beginTransaction();
            session.delete(flight);
            session.getTransaction().commit();
            session.update(flight);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if ((session != null) && (session.isOpen())) {
                session.close();
            }
        }
    }

    public Flight getFlight(int id) throws Exception {
        Flight result = null;

        Session session = null;
        try {
            session = HibernateUtil.createSessionFactory().openSession();
            result = (Flight) session.get(Flight.class, id);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if ((session != null) && (session.isOpen())) {
                session.close();
            }
        }
        return result;
    }

    public List<Flight> getFlights() throws Exception {
        List<Flight> flightList = null;

        Session session = null;
        try {
            session = HibernateUtil.createSessionFactory().openSession();
            flightList = session.createCriteria(Flight.class).list();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if ((session != null) && (session.isOpen())) {
                session.close();
            }
        }

        return flightList;
    }

}
