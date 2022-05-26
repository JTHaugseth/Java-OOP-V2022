package RepetisionStep14;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.HashMap;

public class LoanOperation {

    protected HashMap<Integer, Loaninfo> map = new HashMap<>();

    static int loanId = 0;

    public  void registerLoan(Loaninfo loan) {
        validateLoan(loan);
        loan.setLoanId(loanId++);
        map.put(loan.getLoanId(), loan);

    }
    private  void validateLoan(Loaninfo loan){
        if (loan == null){
            throw new IllegalArgumentException("Loaninfo cannot be null!");
        }
        if (loan.getCustomer() == null){
            throw  new IllegalArgumentException("Loan customer cannot be null!");
        }
        if (loan.getLoanAmount()<=0){
            throw new IllegalArgumentException("The loan amount cannot be less than zero or zero");
        }
        if (!ageIsValid(loan.getCustomer().getAge())){
            throw new IllegalArgumentException("The customer has to be the age between 15 and 60.");
        }
        if (!dateIsValid(loan.getStartDate())){
            throw new IllegalArgumentException("The loan start date has to be later than today.");
        }
    }

    private boolean ageIsValid(Integer age) {
        if (age < 15 || age > 60) {
            return false;
        } else {
            return true;
        }
    }

    private boolean dateIsValid(String startDate) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy/MM/dd");
        if (startDate.compareTo(simpleDateFormat.format(new Date())) < 0) {
            return false;
        } else {
            return true;
        }
    }
}
