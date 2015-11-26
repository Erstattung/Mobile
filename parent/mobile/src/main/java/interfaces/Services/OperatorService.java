package interfaces.Services;

import interfaces.PO.ClientPO;
import interfaces.PO.ContractPO;
import interfaces.PO.OptionPO;
import interfaces.PO.TarifPO;

import java.util.Date;
import java.util.List;

/**
 * Created by echerkas on 26.11.2015.
 */
public interface OperatorService {

    void addClient(String name, String surname, Date birthday, String address, long passport, String email,
                   String password, long roleId);

    void concludeContract(String name, String surname, long tariffId, long number);

    void setNumber(long num, ContractPO contract);

    void setTariff(ContractPO contract, long tariffId);

    void setOptions(long contractId, long... optionsId);

    void shutDownContractOption(long contractId, long optionId);

    List <ClientPO> getClients();

    List<ContractPO> getContracts();

    void lockNumber(long number);

    void unlockNumber(long number);

    ClientPO find(long number);

    void changeTariff(long contractId, long tariffId);

    void addTariff(String name, long... optionsId);

    void dropTariff(long tariffId);

    void addOption(String name, double optionPrice, double connectionPrice);

    void dropOption(long tariffId, long optionId);

    List <OptionPO> getOptions();

    ContractPO getContract(Long contractId);

    TarifPO getTariff(Long tariffId);

    List<TarifPO> getTariffs();
}
