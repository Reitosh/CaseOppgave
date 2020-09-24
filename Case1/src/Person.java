public class Person {
    String seq;
    String firstName;
    String lastName;
    String age;
    String street;
    String city;
    String state;
    String latitude;
    String longitude;
    String ccnumber;


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getCcnumber() {
        return ccnumber;
    }

    public void setCcnumber(String ccnumber) {
        this.ccnumber = ccnumber;
    }

    public String getSeq() {
        return seq;
    }

    public void setSeq(String seq) {
        this.seq = seq;
    }

    @Override public String toString(){
        String output = "Seq: " + seq + "\n" +
                        "Firstname: " + firstName + "\n" +
                        "Lastname: " + lastName + "\n" +
                        "Age: " + age + "\n" +
                        "Street: " + street + "\n" +
                        "City: " + city + "\n" +
                        "State: " + state + "\n" +
                        "Latitude: " + latitude + "\n" +
                        "Longitude: " + longitude + "\n" +
                        "CCnumber: " + ccnumber + "\n" + "\n";
        return output;
    }
}
