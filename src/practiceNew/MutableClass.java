package practiceNew;

public class MutableClass {


    private  String address;

    public MutableClass(String address) {

        this.address=address;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "MutableClass{" +
                "address='" + address + '\'' +
                '}';
    }
}
