package Step12;

import java.util.HashMap;

public class CustomerProxy implements ICustomerProxy{

    HashMap<String, CustomerInfo> customerInfoHashMap;

    public CustomerProxy(HashMap<String, CustomerInfo> customerInfoHashMap) {
        this.customerInfoHashMap = customerInfoHashMap;
    }

    @Override
    public CustomerInfo getCustomer(String ssn) throws LoanException {
        return customerInfoHashMap.get(ssn);
    }

    @Override
    public boolean isValidSsn(String ssn) throws LoanException {
        if (ssn.length() != 11) throw new LoanException();
        else return true;
    }

    @Override
    public void registerCustomer(CustomerInfo customerInfo) throws LoanException {
        if(isValidSsn(customerInfo.getSsn())) {
            customerInfoHashMap.put(customerInfo.getSsn(), customerInfo);
        }
        else throw new LoanException();
    }
}
