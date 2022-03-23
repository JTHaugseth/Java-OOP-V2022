package Step12;

import java.util.Date;

public abstract class Loan implements java.io.Serializable{
    double annualInterestRate;
    int numberOfYears;
    double loanAmount;
    LoanType loanType;
    CustomerInfo customer;
    java.util.Date startDate;
    Integer loanId;
    CustomerProxy customerProxy;

    public Loan(int numberOfYears, double loanAmount, LoanType loanType, CustomerInfo customer,  CustomerProxy customerProxy) {
        this.numberOfYears = numberOfYears;
        this.loanAmount = loanAmount;
        this.loanType = loanType;
        this.customer = customer;
        this.customerProxy = customerProxy;
    }

    public Integer getLoanId() {return loanId;}

    public void setLoanId(Integer loanId) {this.loanId = loanId;}

    public int getNumberOfYears() {return numberOfYears;}

    public void setNumberOfYears(int numberOfYears) {this.numberOfYears = numberOfYears;}

    public double getLoanAmount() {return loanAmount;}

    public void setLoanAmount(double loanAmount) {this.loanAmount = loanAmount;}

    public LoanType getLoanType() {return loanType;}

    public void setLoanType(LoanType loanType) {this.loanType = loanType;}

    public CustomerInfo getCustomer() {return customer;}

    public void setCustomer(CustomerInfo customer) {this.customer = customer;}

    public Date getStartDate() {return startDate;}

    public void setStartDate(Date startDate) {this.startDate = startDate;}

    public void calculateLoanPayment(){
        double monthlyInterestRate = annualInterestRate/1200;
        double monthlyPayment = loanAmount * monthlyInterestRate / (1 - (Math.pow(1 / (1 + monthlyInterestRate), numberOfYears * 12)));
        double totalPayment = monthlyPayment * numberOfYears * 12;

        System.out.println(" The Loan Type:          "+loanType.toString());
        System.out.println(" The Loan starts from:          "+startDate);
        System.out.println(" The Loan Amount:          NOK"+loanAmount);
        System.out.println(" The Annual interest rate:          %"+annualInterestRate);
        System.out.println(" Monthly payment     NOK"+monthlyPayment);
        System.out.println(" Total payment     NOK"+totalPayment);
    }

    abstract void getAnnualInterestRate();

    abstract void printLoanInformation();
}
