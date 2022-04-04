package Step14;

import javax.swing.text.html.Option;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Optional;

public class Main {

    public static void main(String[] args) {
        LoanOperation loanOperation = new LoanOperation();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy/MM/dd");
        Date today = new Date();

        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.DATE, +1);
        Date tomorrow = cal.getTime();

        cal.add(Calendar.DATE, -2);
        Date yesterday = cal.getTime();

        Customer customer1 = new Customer(24, "Julian");
        Customer customer2 = new Customer(21, "Ole");
        Customer customer3 = new Customer(23, "Vegard");
        Customer customer4 = new Customer(12, "Lars");

        LoanInfo loan1 = new LoanInfo(5000, simpleDateFormat.format(tomorrow), customer3);
        LoanInfo loan2 = new LoanInfo(400032, simpleDateFormat.format(tomorrow), customer2);
        LoanInfo loan3 = new LoanInfo(10000, simpleDateFormat.format(tomorrow), customer1);

        LoanInfo loan4 = new LoanInfo(6000, simpleDateFormat.format(yesterday), customer1);
        LoanInfo loan5 = new LoanInfo(-5000, simpleDateFormat.format(yesterday), customer2);
        LoanInfo loan6 = new LoanInfo(75000, simpleDateFormat.format(yesterday), customer4);


        try {
            loanOperation.RegisterLoan(loan1);
        } catch (Exception e) {
           e.printStackTrace();
        }
        try {
            loanOperation.RegisterLoan(loan2);
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            loanOperation.RegisterLoan(loan3);
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            loanOperation.RegisterLoan(loan4);
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            loanOperation.RegisterLoan(loan5);
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            loanOperation.RegisterLoan(loan6);
        } catch (Exception e) {
            e.printStackTrace();
        }

        Optional<LoanInfo> loan = loanOperation.getLoanByLoanIdOptional(20);
        if (loan.isPresent()) {
            System.out.println("Loan exists: " + loan.get());
        } else {
            System.out.println("There is no loan with that Id. try again!");
        }

        Optional<List<LoanInfo>> loanP = loanOperation.getLoanByNameOptional("gbyh");
        if (loanP.isEmpty()) {
            System.out.println("There is no loan with that name. try again!");
        } else {
            System.out.println(loanP.get());
        }

    }
}
