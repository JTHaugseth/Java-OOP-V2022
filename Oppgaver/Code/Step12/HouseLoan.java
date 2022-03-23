package Step12;

public class HouseLoan extends Loan{

    private String houseAddress;
    private CustomerInfo coLoanTaker;

    public HouseLoan(int numberOfYears, double loanAmount, LoanType loanType, CustomerInfo customer, CustomerProxy customerProxy) throws LoanException {
        super(numberOfYears, loanAmount, loanType, customer, customerProxy);
        getAnnualInterestRate();

        if(customerProxy.getCustomer(customer.getSsn())==null) {
            try {
                customerProxy.registerCustomer(customer);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
    public HouseLoan(int numberOfYears, double loanAmount, LoanType loanType, CustomerInfo customer, CustomerInfo coLoanTaker, CustomerProxy customerProxy) throws LoanException {
        super(numberOfYears, loanAmount, loanType, customer, customerProxy);
        this.coLoanTaker = coLoanTaker;
        getAnnualInterestRate();

        if(customerProxy.getCustomer(customer.getSsn())==null) {
            try {
                customerProxy.registerCustomer(customer);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        if(customerProxy.getCustomer(coLoanTaker.getSsn())==null) {
            try {
                customerProxy.registerCustomer(coLoanTaker);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public String getHouseAddress() {return houseAddress;}

    public void setHouseAddress(String houseAddress) {this.houseAddress = houseAddress;}

    public CustomerInfo getCoLoanTaker() {return coLoanTaker;}

    public void setCoLoanTaker(CustomerInfo coLoanTaker) {this.coLoanTaker = coLoanTaker;}

    @Override
    void getAnnualInterestRate() {
        annualInterestRate = 0.3;
    }

    @Override
    void printLoanInformation() {
        System.out.println("The customer is "+ customer);
        if (coLoanTaker != null)  {
            System.out.println("The coLoaner is "+ coLoanTaker);
        }
        calculateLoanPayment();
    }
}
