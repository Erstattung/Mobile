package interfaces.Services;

import interfaces.Implementation.ClientDAOImpl;

import java.util.Date;
import java.util.List;

/**
 * Created by echerkas on 26.11.2015.
 */
public interface OperatorService {

    List<ClientDAOImpl> getClients();

    void addClient(String name, String surname, Date birthday, String address, long passport, String email,
                   String password);

    void concludeContract(String name, String surname, long tariffId, long number);




}
