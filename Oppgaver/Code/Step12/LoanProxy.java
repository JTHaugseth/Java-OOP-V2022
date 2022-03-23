package Step12;

import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class LoanProxy implements ILoanProxy{

    HashMap<Integer, Loan> loanHashMap = new HashMap<>();


    static int loanId = 0;

    public LoanProxy(HashMap<Integer, Loan> loanHashMap) {
        this.loanHashMap = loanHashMap;
    }

    @Override
    public Loan getLoan(Integer loanId) {
        return loanHashMap.get(loanId);
    }

    @Override
    public void registerLoan(Loan loan) throws LoanException {
        loan.setLoanId(loanId++);
        loanHashMap.put(loan.getLoanId(), loan);
    }

    @Override
    public void printAllLoans() throws Exception {
        for(Integer index : loanHashMap.keySet()) {
            System.out.println("Loan Id is " + index);
            loanHashMap.get(index).printLoanInformation();
        }
    }

    /**
     * Task 8
     * For CarLoan and ConsumerLoan, you need to check if loan customer ssn equals to the input argument ssn.
     * For HouseLoan, you will need to check both main LoanTaker and co LoanTaker
     * hint: hashmap,entrySet().stream().map().filter().collect(Collectors.toList()). and this is lambda...
     * YFor HouseLoan you will also use instanceOf and downcasting...
     */
    @Override
    public void printLoanbySsn(String ssn) throws Exception {
        List<Loan> newLoans = loanHashMap.entrySet()
                .stream()
                .map(entry->entry.getValue())
                .filter(loan-> loan instanceof HouseLoan ? ((HouseLoan)loan).getCoLoaner().getSsn().equals(ssn)  || ((HouseLoan)loan).customer.getSsn().equals(ssn)
                        : loan.customer.getSsn().equals(ssn))
                .collect((Collectors.toList()));
        for(Loan loan : newLoans) {
            System.out.println("Loan Id is "+ loan.getLoanId());
            loan.printLoanInformation();
        }
    }
}
