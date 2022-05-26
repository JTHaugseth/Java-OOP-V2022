package RepetisionStep14;

import java.util.Objects;

public class Loaninfo {

    private double loanAmount;
    private String startDate;
    private Integer loanId;
    private Customer customer;

    public Loaninfo(double loanAmount, String startDate,  Customer customer) {
        this.loanAmount = loanAmount;
        this.startDate = startDate;
        this.customer = customer;
    }

    public double getLoanAmount() {return loanAmount;}

    public void setLoanAmount(double loanAmount) {this.loanAmount = loanAmount;}

    public String getStartDate() {return startDate;}

    public void setStartDate(String startDate) {this.startDate = startDate;}

    public int getLoanId() {return loanId;}

    public void setLoanId(int loanId) {this.loanId = loanId;}

    public Customer getCustomer() {return customer;}

    public void setCustomer(Customer customer) {this.customer = customer;}

    @Override
    public String toString() {
        return "Loaninfo{" +
                "loanAmount=" + loanAmount +
                ", startDate='" + startDate + '\'' +
                ", customer=" + customer +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Loaninfo loaninfo = (Loaninfo) o;
        return Double.compare(loaninfo.loanAmount, loanAmount) == 0 && Objects.equals(startDate, loaninfo.startDate) && Objects.equals(customer, loaninfo.customer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(loanAmount, startDate, customer);
    }
}
