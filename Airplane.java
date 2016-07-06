



public class Airplane  {
    private SeatingClass klasiIPare;
    private SeatingClass klasiEkonomik;

    public Airplane() {
        // create seating classes of fixed size
        klasiEkonomik = new SeatingClass(10, 4);
        klasiIPare = new SeatingClass(5, 4);
    }

    public Seat assignSeatsNP(int klasiIVendeve,int vendet) {
        if (klasiIVendeve == SeatingClass.KLASIIPARE) {
            return klasiIPare.lastResort(vendet);
        } else if (klasiIVendeve == SeatingClass.KLASIEKONOMIK) {
            return klasiEkonomik.lastResort(vendet);
        } else {
            return null;
        }
    }
    public Seat assignSeat(int klasiIVendeve, int preferencaEVendeve) {
        if (klasiIVendeve == SeatingClass.KLASIIPARE) {
            return klasiIPare.assignSeat(preferencaEVendeve);
        } else if (klasiIVendeve == SeatingClass.KLASIEKONOMIK) {
            return klasiEkonomik.assignSeat(preferencaEVendeve);
        } else {
            return null;
        }
    }
    public Seat assignSeats(int klasiIVendeve,int vendet) {
        if (klasiIVendeve == SeatingClass.KLASIIPARE) {
            return klasiIPare.assignSeats(vendet);
        } else if (klasiIVendeve == SeatingClass.KLASIEKONOMIK) {
            return klasiEkonomik.assignSeats(vendet);
        } else {
            return null;
        }
    }
    public void resetSeatsCounter(){
    	klasiIPare.l=0;
    	klasiEkonomik.l=0;
    	klasiIPare.o=0;
    	klasiEkonomik.o=0;
    }
    public void printManifest() {
        System.out.println("Klasi i pare:");
        klasiIPare.printManifest();
        System.out.println("Klasi ekonomik:");
        klasiEkonomik.printManifest();
    }

}