package Step12;

public class CustomerInfo {
    private String name;
    private String address;
    private String phone;
    private String email;
    private String ssn;

    public CustomerInfo(String name, String address, String phone, String email, String ssn) {
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.email = email;
        this.ssn = ssn;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    @Override
    public String toString(){
        return "The name of the customer is " + this.name + "\nThe address is " + this.address +
                "\nThe phone number is " + this.phone + "\nThe email is " + this.email + "\nThe ssn is " + this.ssn;
    }


}
