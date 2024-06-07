public class Address {


    public String createAddress(String country) {
        return String.format("Country: %s", country);
    }

    public String createAddress(String country, String city) {
        return String.format("Country: %s, City: %s", country, city);
    }

    public String createAddress(String country, String city, int zipCode) {
        return String.format("Country: %s, City: %s, Zip Code: %s", country, city, zipCode);
    }

    public String createAddress(String country, String city, int zipCode, String streetName) {
        return String.format("Country: %s, City: %s, Zip Code: %s, Street Name: %s", country, city, zipCode, streetName);
    }

    public String createAddress(String country, String city, int zipCode, String streetName, int apartmentNumber) {
        return String.format("Country: %s, City: %s, Zip Code: %s, Street Name: %s, Apartment Number: %d", country, city, zipCode, streetName, apartmentNumber);
    }

    public static void main(String[] args) {

    }
}