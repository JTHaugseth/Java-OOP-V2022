package Step14;

import java.lang.reflect.Array;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

public class LoanOperation{
    HashMap<Integer, LoanInfo> loanHashMap = new HashMap<>();
    static int loanId = 0;

    public void RegisterLoan(LoanInfo loan){
        validateLoan(loan);
        loan.setLoanId(loanId++);
        loanHashMap.put(loan.getLoanId(), loan);
    }

    public boolean validateDate(String startDate) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
        if  (startDate.compareTo(dateFormat.format(new Date()))<0) {
            return false;
        }
        return true;
    }

    public boolean validateAge(Integer age) {
        if (age >= 15 && age <= 60 ) {
            return false;
        }
        return true;
    }

    public void validateLoan(LoanInfo loan) {
        if (loan == null) {
            throw new IllegalArgumentException("You cannot register a loan with null! Try again.");
        }
        if (loan.getCustomer() == null) {
            throw  new IllegalArgumentException("Use an existing customer. Null is not allowed.");
        }
        if (loan.getLoanAmount() <= 0) {
            throw  new IllegalArgumentException("Loan amount has to be bigger than 0.");
        }
        if (!validateAge(loan.getCustomer().getAge())) {
            throw  new IllegalArgumentException("Age has to be between 15 and 60");
        }
        if (!validateDate(loan.startDate)) {
            throw new IllegalArgumentException("you have to pick a valid start date that is not today ;)");
        }
    }

    public LoanInfo getLoanById(Integer loanId) {
        for (LoanInfo loan: loanHashMap.values()) {
            if (loan.loanId == loanId){
                return loan;
            }
        }
        return null;
    }

    public ArrayList<LoanInfo> getLoanByName(String name) {
        ArrayList<LoanInfo> list = new ArrayList<>();
        for (LoanInfo loan : loanHashMap.values()) {
            if (loan.getCustomer().getName().equalsIgnoreCase(name)) {
                list.add(loan);
            }
        }
        return list;
    }

    public ArrayList<LoanInfo> getLoanByStartDate(String startDate) {
        ArrayList<LoanInfo> list = new ArrayList<>();
        for (LoanInfo loan : loanHashMap.values()) {
            if (loan.getStartDate().equalsIgnoreCase(startDate)) {
                list.add(loan);
            }
        }
        return list;
    }
}



