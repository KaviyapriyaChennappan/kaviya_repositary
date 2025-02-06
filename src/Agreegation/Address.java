package Agreegation;

public class Address {
   private  int streetNumber;
    private String streetName;
    private String city;
    private String province;
    private String postalCode;
    private String Country;

    public Address(int streetNumber, String streetname, String city, String province, String postalCode, String country) {
        this.streetNumber = streetNumber;
        this.streetName = streetname;
        this.city = city;
        this.province = province;
        this.postalCode = postalCode;
        Country = country;
    }

    public int getStreetNumber() {
        return streetNumber;
    }

    public void setStreetNumber(int streetNumber) {
        this.streetNumber = streetNumber;
    }

    public String getStreetname() {
        return streetName;
    }

    public void setStreetname(String streetname) {
        this.streetName = streetname;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getCountry() {
        return Country;
    }

    public void setCountry(String country) {
        Country = country;
    }

    @Override
    public String toString() {
        return "Address{" +
                "streetNumber=" + streetNumber +
                ", streetname='" + streetName + '\'' +
                ", city='" + city + '\'' +
                ", province='" + province + '\'' +
                ", postalCode='" + postalCode + '\'' +
                ", Country='" + Country + '\'' +
                '}';
    }
}
