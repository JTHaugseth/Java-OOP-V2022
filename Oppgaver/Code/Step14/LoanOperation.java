package Step14;

import java.lang.reflect.Array;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@FunctionalInterface
interface ValidateAge {
    public boolean validate(Integer age);
}

@FunctionalInterface
interface ValidateDate {
    public boolean validate(String startDate);
}

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
            return true;
        }
        return false;
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

    // STANDARD METHODS

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

    // OPTIONAL METHODS

    public Optional<LoanInfo> getLoanByLoanIdOptional(Integer loanId) {
        for (LoanInfo loan : loanHashMap.values()) {
            if (loan.loanId == loanId){
                return Optional.of(loan);
            }
        }
        return Optional.empty();
    }

    public Optional<List<LoanInfo>> getLoanByNameOptional(String name) {
        List<LoanInfo> loanByName = loanHashMap.entrySet()
                .stream()
                .map(entry -> entry.getValue())
                .filter(loan -> loan.customer.getName().equals(name))
                .collect((Collectors.toList()));
        return Optional.ofNullable(loanByName);
    }

    public Optional<ArrayList<LoanInfo>> getLoanByStartDateOptional(String startDate){
        ArrayList<LoanInfo> filteredLoanList = null;
        if(validateDate(startDate)) {
            filteredLoanList = getLoansByStartDateLambda(startDate);
        }
        return Optional.ofNullable(filteredLoanList);
    }

    // LAMBDA METHODS

    public List<LoanInfo> getLoansByNameLambda(String name) {
        List<LoanInfo> LoansbyName = loanHashMap.entrySet()
                .stream()
                .map(entry->entry.getValue())
                .filter(loan-> loan.customer.getName().equals(name))
                .collect((Collectors.toList()));
        return LoansbyName;
    }

    public ArrayList<LoanInfo> getLoansByStartDateLambda(String startDate) {
        ArrayList<LoanInfo> list = new ArrayList<>();
        Stream<LoanInfo> filtered_data = loanHashMap.values().stream().filter(loan -> loan.getStartDate().equalsIgnoreCase(startDate));
        filtered_data.forEach((loan)->list.add(loan));
        return list;
    }
}



