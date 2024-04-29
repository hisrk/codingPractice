package practiceNew;

public class Mutable {


    private String address;

    public String getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "Mutable{" +
                "address='" + address + '\'' +
                '}';
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Mutable(String address) {
        this.address = address;
    }
}


