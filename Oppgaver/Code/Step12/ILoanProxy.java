package Step12;

public interface ILoanProxy {

    Loan getLoan(Integer loanId);
    void registerLoan(Loan loan) throws Exception;
    void printAllLoans() throws Exception;
    void printLoanbySsn(String ssn) throws Exception;
}
