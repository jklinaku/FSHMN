

import javax.swing.JOptionPane;

public class TicketAgent {
    Airplane aeroplani;

    public TicketAgent() {
        aeroplani = new Airplane();
    }


    

    public void interact() {
    	boolean done=false;
    	System.out.println("*********MIRE SE ERDHET*********");
        while(!done)
        {
        int a=new Integer(JOptionPane.showInputDialog("Cfare deshironi te beni:\n 1.Rezervoni nje vend\n2.Rezervoni me shume se nje vend\n3.Shikoni manifestin\nQe te perfundoni aplikacionin shtypni cfare te doni"));
         switch(a){
         case 1:{reserveSeat();break;}
         case 2:{reserveSeats();break;}
         case 3:{printManifest();break;}
         default:{done=true;}
         
         }
        }
        
        
        printManifest();
        System.out.println("**************JU FALEMINDERIT QE NA ZGJODHET ......... AIRLINES");
    }
    public void reserveSeatsNP(int klasiIVendeve,int vendetqeduhetrezervuar){
    	int	vendet=vendetqeduhetrezervuar;
    	for(int i=0;i<vendetqeduhetrezervuar;i++){
    		Seat caktimiIVendeve = aeroplani.assignSeatsNP(klasiIVendeve, vendet);
            if (caktimiIVendeve == null) {
                JOptionPane.showMessageDialog(null, "Kerkojme falje por nuk kemi vende te lira qe i pershtaten kerkesave te juaja.");
            } else {
                String emri=JOptionPane.showInputDialog("Emri:");
                String mbiemri=JOptionPane.showInputDialog("Mbiemri:");
                Passenger pasagjeri = new Passenger(emri,mbiemri);
               
                caktimiIVendeve.reserve(pasagjeri);
                vendet--;
    	}}
    }
    public void reserveSeats() {
    	
    	
       
        int vendetqeduhetrezervuar = new Integer(JOptionPane.showInputDialog("Sa Vende i deshironi")).intValue();
        
        int klasiIVendeve = new Integer(JOptionPane.showInputDialog("Per standardin ekonomik shtypni 2 \n ndersa per klasin e pare 1:")).intValue();
    	
    	
    	
        
        
        int	vendet=vendetqeduhetrezervuar;
        
        
        for(int i=0;i<vendetqeduhetrezervuar;i++){
        
        Seat caktimiIVendeve = aeroplani.assignSeats(klasiIVendeve, vendet);
        if (caktimiIVendeve == null) {
            JOptionPane.showMessageDialog(null, "Kerkojme falje por nuk kemi mundesi te ju ulim me nje rresht.");
        if(JOptionPane.showConfirmDialog(null, "Deshironi te ju ulim ne vende te lira?")==0)
        	this.reserveSeatsNP(klasiIVendeve,vendetqeduhetrezervuar);
            return;
        
        
        } else {
            String emri=JOptionPane.showInputDialog("Emri:");
            String mbiemri=JOptionPane.showInputDialog("Mbiemri:");
            Passenger pasagjeri = new Passenger(emri, mbiemri);
            
            caktimiIVendeve.reserve(pasagjeri);
            vendet--;
        }}
        aeroplani.resetSeatsCounter();
    }

    public void reserveSeat() {
    	
    	
       
        int preferencaEVendeve = new Integer(JOptionPane.showInputDialog("1. Afer dritares \n2. Afer koridorit:")).intValue();
        int klasiIVendeve = new Integer(JOptionPane.showInputDialog("Per standardin ekonomik shtypni 2 \n ndersa per klasin e pare 1:")).intValue();
        
        
         
        
        
        
        Seat caktimiIVendeve = aeroplani.assignSeat(klasiIVendeve, preferencaEVendeve);
        if (caktimiIVendeve == null) {
            JOptionPane.showMessageDialog(null, "Kerkojme falje por nuk kemi vende te lira qe i pershtaten kerkesave te juaja.");
        } else {
            String emri=JOptionPane.showInputDialog("Emri:");
            String mbiemri=JOptionPane.showInputDialog("Mbiemri:");
            Passenger pasagjeri = new Passenger(emri,mbiemri);
           
            caktimiIVendeve.reserve(pasagjeri);
            
        }
    }

    public void printManifest() {
        aeroplani.printManifest();
    }

    public static void main(String[] args) {
        TicketAgent agjenti = new TicketAgent();
        agjenti.interact();
    }
}