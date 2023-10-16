package Java_Practice.Oct10.Inheritence.Oct14.Aggregation;

public class Address {
    private String street;
    private String city;
    private String province;
    private String country;
    private String postalCode;

    public Address(String street, String city, String province, String country, String postalCode) {
        this.street = street;
        this.city = city;
        this.province = province;
        this.country = country;
        this.postalCode = postalCode;
    }
    /*void displayAddress(){
        System.out.println("Address: "+street+ " "+city+ " "+province+ " "+country+ " "+postalCode);
    }*/

    @Override
    public String toString() {
        return "Address{" +
                "street='" + street + '\'' +
                ", city='" + city + '\'' +
                ", province='" + province + '\'' +
                ", country='" + country + '\'' +
                ", postalCode='" + postalCode + '\'' +
                '}';
    }
}
