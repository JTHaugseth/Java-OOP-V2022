package Step12;

public class CarLoan extends Loan{
    private String carModel;
    private String miles;
    private InsuranceType typeOfInsurance;

    public CarLoan(int numberOfYears, double loanAmount, LoanType loanType, CustomerInfo customer, CustomerProxy customerProxy) throws LoanException {
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

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public String getMiles() {
        return miles;
    }

    public void setMiles(String miles) {
        this.miles = miles;
    }

    public InsuranceType getTypeOfInsurance() {
        return typeOfInsurance;
    }

    public void setTypeOfInsurance(InsuranceType typeOfInsurance) {
        this.typeOfInsurance = typeOfInsurance;
    }
    /**
     * Task 7
     * We want to pass CustomerProxy as an argument to Loan class constructor
     * so that we can use CustomerProxy methods.
     * For example, when we create a loan, the Loan constructor will check if the customer
     * is already registered in CustomerProxy, if not, register the new customer.
     */

    @Override
    void getAnnualInterestRate() {
        annualInterestRate = 0.4;
    }

    @Override
    void printLoanInformation() {
        System.out.println("The customer is "+ customer);
        System.out.println("The car model is "+ carModel);
        System.out.println("The mileage is "+ miles);
        System.out.println("The type of insurance is "+ typeOfInsurance);
        calculateLoanPayment();

    }
}