package RepetisionStep14;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

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
    public Loaninfo getLoanByLoanId(Integer loanId) {

        for (Loaninfo loan : map.values()) {
            if (loan.getLoanId() == loanId) {
                return loan;
            }
        }
        return null;
    }

    public ArrayList<Loaninfo> getLoanByName(String name) {
        ArrayList<Loaninfo> list = new ArrayList<>();

        for (Loaninfo loan : map.values()) {
            if (loan.getCustomer().getName().equalsIgnoreCase(name)) {
                list.add(loan);
            }
        }
        return list;
    }

    public ArrayList<Loaninfo> getLoanByStartDate(String startDate) {
        ArrayList<Loaninfo> list = new ArrayList<>();

        for (Loaninfo loan : map.values()) {
            if (loan.getStartDate().equals(startDate));
            list.add(loan);
        }
        return list;
    }

    public Optional<Loaninfo> getLoanByLoanIdOptional(Integer loanId) {
        for (Loaninfo loan : map.values()) {
            if (loan.getLoanId() == loanId) {
                return Optional.of(loan);
            }
        }
        return Optional.empty();
    }

    public Optional<List<Loaninfo>> getLoansByNameOptional(String name) {
        List<Loaninfo> LoansbyName = map.entrySet()
                .stream()
                .map(entry->entry.getValue())
                .filter(loan-> loan.getCustomer().getName().equals(name))
                .collect((Collectors.toList()));
        return Optional.ofNullable(LoansbyName);
    }

    public Optional<ArrayList<Loaninfo>> getLoansByStartDateOptional(String startDate) {
        ArrayList<Loaninfo> filteredLoanList = null;
        if(dateIsValid(startDate)) {
            filteredLoanList = getLoansByStartDateLambda(startDate);
        }
        return Optional.ofNullable(filteredLoanList);
    }

    public List<Loaninfo> getLoansByNameLambda(String name) {
        List<Loaninfo> LoansbyName = map.entrySet()
                .stream()
                .map(entry->entry.getValue())
                .filter(loan-> loan.getCustomer().getName().equals(name))
                .collect((Collectors.toList()));
        return LoansbyName;
    }

    public ArrayList<Loaninfo> getLoansByStartDateLambda(String startDate) {
        ArrayList<Loaninfo> list = new ArrayList<>();
        Stream<Loaninfo> filtered_data = map.values().stream().filter(loan -> loan.getStartDate().equalsIgnoreCase(startDate));
        filtered_data.forEach((loan)->list.add(loan));
        return list;
    }
}
