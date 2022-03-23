package Step12;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class LoanFactory {

    /**
     * Task 9: Design a user interface using Scanner!
     * The new user interface shall be able to handle:
     * 1. create a new customer
     * 2. register a customer after created
     * 3. create a new loan
     * 4. you will be able to choose  the type: CarLoan, ConsumerLoan, HouseLoan
     * 5. register the loan after created
     * 6. print all loans
     * 7. print loan based on SSN
     */

    public static void userInterface() throws LoanException {
        LoanFactory loanFactory = new LoanFactory();
        CustomerProxy customerProxy = new CustomerProxy(new HashMap<>());
        LoanProxy loanProxy = new LoanProxy(new HashMap<Integer, Loan>());
        Scanner input = new Scanner(System.in);

        System.out.println("1. Become a new customer\n2. Create a new loan\n3. Print all loans\n4. Print Loan based on SSN");
        int choice = input.nextInt();

        switch (choice) {
            case 1:
                CustomerInfo customerInfo;
                System.out.println("1. Your first name\n2. Your adress\n3. Your phonenumber\n4. Your Email\n5. Your SSN");
                try {
                    customerProxy.registerCustomer(customerInfo = new CustomerInfo(input.next(), input.next(), input.next(), input.next(), input.next()));
                    System.out.println(customerInfo.toString());
                    System.out.println();
                    System.out.println("The customer has been registered");
                    System.out.println();
                    System.out.println(Arrays.asList(customerProxy.customerInfoHashMap));
                    System.out.println();
                    userInterface();
                } catch (LoanException e) {
                    e.printStackTrace();
                    System.out.println("Something went wrong in customer registration");
                }
            case 2:
                System.out.println(" Choose a Loan type: CarLoan, ConsumerLoan or House loan");
                loanFactory.createLoan(input.next(), input.nextInt(), input.nextDouble(), CustomerInfo, CustomerInfo, customerProxy);
            case 3:
            case 4:
            default:
                System.out.println();
        }
    }

    public static void main(String[] args) throws LoanException {
        LoanFactory loanFactory = new LoanFactory();
        CustomerProxy customerProxy = new CustomerProxy(new HashMap<>());
        LoanProxy loanProxy = new LoanProxy(new HashMap<Integer, Loan>());

        CustomerInfo customer1 = new CustomerInfo("Julian", "Inndalsveien114", "4008795","lol2141sa@gmail.no","23445678911");
        CustomerInfo customer2 = new CustomerInfo("Markus", "Inndals1233", "40085353","lol15142@hotmail.com","28264952751");
        CustomerInfo customer3 = new CustomerInfo("Vegard", "Heiveien123456", "40235223","lofwafwal@ettt.no","38364726531");

        try {
            customerProxy.registerCustomer(customer1);
            customerProxy.registerCustomer(customer2);
            customerProxy.registerCustomer(customer3);
        } catch (LoanException e) {
            e.printStackTrace();
        }

        try {

            Loan houseLoan = loanFactory.createLoan(LoanType.HouseLoan, 25, 400000, customer1, customer2, customerProxy);
            Loan carLoan = loanFactory.createLoan(LoanType.CarLoan, 15, 50000, customer1, null, customerProxy);
            Loan customerLoan = loanFactory.createLoan(LoanType.ConsumerLoan, 5, 100000, customer3, null, customerProxy);

            loanProxy.registerLoan(houseLoan);
            loanProxy.registerLoan(carLoan);
            loanProxy.registerLoan(customerLoan);

        } catch (LoanException e) {
            e.printStackTrace();
        }
        userInterface();
    }

    public Loan createLoan(LoanType loanType, int numberOfYears, double loanAmount, CustomerInfo mainLoaner, CustomerInfo coLoaner,
                           CustomerProxy customerProxy) throws LoanException {

        switch (loanType) {
            case CarLoan:
                if (coLoaner != null) throw new LoanException ("Carloan can't have coLoaner");
                else return new CarLoan(numberOfYears, loanAmount, loanType, mainLoaner, customerProxy);
            case ConsumerLoan:
                if (coLoaner != null) throw new LoanException ("Consumerloan can't have coLoaner");
                return new ConsumerLoan(numberOfYears, loanAmount, loanType, mainLoaner, customerProxy);
            case HouseLoan:
                if (coLoaner != null)
                    return new HouseLoan(numberOfYears, loanAmount, loanType, mainLoaner, coLoaner, customerProxy);
                else return new HouseLoan(numberOfYears, loanAmount, loanType, mainLoaner, null, customerProxy);
            default:
                throw new LoanException();
        }
    }
}
