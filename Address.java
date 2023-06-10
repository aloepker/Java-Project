import java.util.Scanner;
abstract class Address {
    private String zipCode;
    private String houseNum;
    private String streetName;
    private String city;
    private String state;
    private String country;

    //Address Class An address has:
    // a pincode (zipcode?)   --- check!
    public String getZip() {return zipCode;}
    public void setZip(String Z) {this.zipCode = Z;}
    // house number
    public String getHouseNum() {return houseNum;}
    public void setHouseNum(String N) {this.houseNum = N;}
    // street name   --- check!
    public String getStreet() {return streetName;}
    public void setStreet(String S) {this.streetName = S;}
    // city  --  check!
    public String getCity() {return city;}
    public void setCity(String C) {this.city = C;}
    // state or province  --  check!
    public String getState() {return state;}
    public void setState(String St) {this.state = St;}
    // and country  ---  check!
    public String getCountry() {return country;}
    public void setCountry(String Co) {this.country = Co;}
    public void show(Object O){System.out.println(O);}

    public void setAddress(){
        Scanner nScnr = new Scanner(System.in);
        //called while adding a new student/ faculty/ person
      show("Fill out Address? 1:Yes 2:No");
        String response = nScnr.nextLine();
//while (!response.matches("1") || !response.matches("2")){show("Entry Error, please try again"); show("1 for Yes, 2 for No"); response = nScnr.nextLine();}
if (response.matches("1")){//ask to fill in each variable one at a time and call the setter with their input for each
show("Please enter their House or Building Number: ");
response = nScnr.nextLine();
setHouseNum(response);
show("Set to: " + getHouseNum());
show("Please enter their street name (Include unit Number): ");
response = nScnr.nextLine();
setStreet(response);
    show("Set to: " + getStreet());
    show("Please enter their City or town.");
    response = nScnr.nextLine();
    setCity(response);
    show("Set to: " + getCity());
    show("Please enter their State: ");
    response = nScnr.nextLine();
    setState(response);
    show("Set to: " + getState());
    show("Please enter their Country");
    response = nScnr.nextLine();
    setCountry(response);
    show("Set to: " + getCountry()); //yehaw
    show("Please enter their 5 digit Zip Code");
    response = nScnr.nextLine();
    setZip(response);
    show("Set to: " + getZip());
    show("Address Set.");
     }

}
    }

