package Step12;

public class ConsumerLoan extends Loan{

    public ConsumerLoan(int numberOfYears, double loanAmount, LoanType loanType, CustomerInfo customer, CustomerProxy customerProxy) throws LoanException {
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

    @Override
    void getAnnualInterestRate() {
        annualInterestRate = 0.5;
    }

    @Override
    void printLoanInformation() {
        System.out.println("The customer is "+ customer);
        calculateLoanPayment();
    }

    /**
     * Task 7
     * We want to pass CustomerProxy as an argument to Loan class constructor
     * so that we can use CustomerProxy methods.
     * For example, when we create a loan, the Loan constructor will check if the customer
     * is already registered in CustomerProxy, if not, register the new customer.
     */

    /**
     * Implement getAnnualInterestRate()
     * Don't forget @override annotation!
     */
    /**
     * Implement printLoanInformation()
     * It will call calculateLoanPayment() defined in Loan class
     * It will print extra information related to ConsumerLoan
     * Don't forget @override annotation!
     */
}