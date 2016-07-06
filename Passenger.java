


public class Passenger  {
    private String mbiemri;
    private String emri;

    public Passenger(String emri, String mbiemri) {
        this.emri = emri;
        this.mbiemri = mbiemri;
    }

    public String getFirstName() {
        return emri;
    }

    public String getLastName() {
        return mbiemri;
    }

    public String toString() {
        return mbiemri + ", " + emri;
    }

}