package Step14;

import java.util.Objects;

public class LoanInfo {
    double loanAmount;
    String startDate;
    int loanId;
    Customer customer;

    public LoanInfo(double loanAmount, String startDate, Customer customer) {
        this.loanAmount = loanAmount;
        this.startDate = startDate;
        this.customer = customer;
    }

    public double getLoanAmount() {
        return loanAmount;
    }

    public void setLoanAmount(double loanAmount) {loanAmount = loanAmount;}

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public int getLoanId() {
        return loanId;
    }

    public void setLoanId(int loanId) {
        this.loanId = loanId;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LoanInfo loanInfo = (LoanInfo) o;
        return Double.compare(loanInfo.loanAmount, loanAmount) == 0 && loanId == loanInfo.loanId && Objects.equals(startDate, loanInfo.startDate) && Objects.equals(customer, loanInfo.customer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(loanAmount, startDate, loanId, customer);
    }

    @Override
    public String toString() {
        return "LoanInfo{" +
                "LoanAmount=" + loanAmount +
                ", startDate='" + startDate + '\'' +
                ", loanId=" + loanId +
                ", customer=" + customer +
                '}';
    }
}
