package Step12;

public interface ICustomerProxy {

    CustomerInfo getCustomer(String ssn) throws LoanException;
    boolean isValidSsn(String personalIdentifyNumber) throws LoanException, Exception;
    void registerCustomer(CustomerInfo customerInfo) throws Exception;
}
