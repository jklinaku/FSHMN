


public class Seat  {
    // Pozita e vendeve
    public final static int DRITARJA = 1;
 
    public final static int KORRIDORI = 2;

    private Passenger pasagjeri;
    
    
    private int pozita;

    public Seat(int pozita) {
        this.pozita = pozita;
    }
    
    public boolean isReserved() {
        return pasagjeri != null;
    }

    public void reserve(Passenger pasagjeri) {
        this.pasagjeri = pasagjeri;
        
       
    }

    public Passenger getPassenger() {
        return pasagjeri;
    }

   
    

   

    public boolean isPosition(int preferencaEVendeve) {
        return pozita == preferencaEVendeve;
    }

    public String toString() {
        if (isReserved() == false) {
            return "i lire";
        }
        return pasagjeri.toString();
    }
}