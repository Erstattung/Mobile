package interfaces.Services;

import interfaces.PO.ClientPO;
import interfaces.PO.ContractPO;
import interfaces.PO.OptionPO;
import interfaces.PO.TarifPO;

import java.util.List;

/**
 * Created by echerkas on 26.11.2015.
 */
public interface ClientService {

    ClientPO getClient (String email, String password);

    List<ContractPO> getContracts(long clientId);

    List <TarifPO> getTarifs();

    TarifPO getTarif(long id_tarif);

    ContractPO getContract(long contractId);

    OptionPO getOption(long optionId);

    List<OptionPO> getTarifOptions(long tarifId);

    void changeTarif(long contractId, long tarifId);

    void setOptions(long contractId, long... optionsId);

    void removeOption(long contractId, long optionId);

    void lockNumber(long contractId);

    void unlockNumber(long contractId);

}
