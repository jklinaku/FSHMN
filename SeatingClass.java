




public class SeatingClass {
    public static final int KLASIIPARE = 1;
    public static final int KLASIEKONOMIK = 2;
    public  int l=0, o=0;
    private Seat[][] vendet;

    public SeatingClass(int rreshtat, int vendetPerRresht) {
        // Teknikisht, duhet te kerkojme qe vendet per rresht te jene cift.
        // Supozojme qe vlen per kete caktim
        vendet = new Seat[rreshtat][vendetPerRresht];
        for (int i = 0; i < rreshtat; ++i) {
            vendet[i][0] = new Seat(Seat.DRITARJA);
            for (int j = 1; j < vendetPerRresht - 1; ++j) {
                
                vendet[i][j] = new Seat(Seat.KORRIDORI);
            }
            vendet[i][vendetPerRresht - 1] = new Seat(Seat.DRITARJA);
        }
    }
    public int vendetELira_Rr(int i){
    	int k = 0;
    	for(int c=0; c<vendet[0].length; c++)
    	{Seat vendi = vendet[i][c];
    		if( ! vendi.isReserved() )
    			k++;
    			
    		
    	}return k;
    }
    public int vendetELira(){
    	int k = 0;
    	for(int i=0;i<vendet.length;i++){
    		for(int j=0;j<vendet[0].length;j++){
    			Seat vendi = vendet[i][j];
    			if( ! vendi.isReserved() )
        			k++;
    		}
    	}
    			
    		
    	return k;
    }
    
 public Seat lastResort(int vende) {
	 if(vendetELira()>=vende){
	 for (int i = 0; i < vendet.length; ++i) {
    	   		   		    			 
    		for (int j = 0; j < vendet[0].length; ++j) {
            Seat vendi = vendet[i][j];
            if ( !vendi.isReserved()) {
               
                return vendet[i][j];
            }}
        }
    }
   
    return null;
}

    public Seat assignSeat(int preferencaEVendeve) {
        for (int i = 0; i < vendet.length; ++i) {
            for (int j = 0; j < vendet[0].length; ++j) {
                Seat vendi = vendet[i][j];
                if (vendi.isPosition(preferencaEVendeve) && vendi.isReserved() == false) {
                    
                    return vendet[i][j];
                }
            }
        }
      
        return null;
    } public Seat assignSeats(int vende) {
        for (int i = l; i < vendet.length; ++i) {
        	if(vendetELira_Rr(i)>=vende){
        		 l=i;
        		 if(vende==2){
        			 if(!vendet[l][0].isReserved()&&!vendet[l][1].isReserved())
        				 o=0;
        			 else{
        				 if(!vendet[l][2].isReserved()&&!vendet[l][3].isReserved())
        					 o=2;
        				 }
        			 
        		 }
        			 
        		
            for (int j = o; j < vendet[0].length; ++j) {
                Seat vendi = vendet[l][j];
                if ( !vendi.isReserved()) {
                   
                    return vendet[l][j];
                }}
            }
        }
       
        return null;
    }

    public void printManifest() {
        for (int i = 0; i < vendet.length; ++i) {
            for (int j = 0; j < vendet[0].length; ++j) {
                Seat vendi = vendet[i][j];
                System.out.print(i + "-" + j + ": " + vendi.toString()+"  ");
                
                
            }System.out.println();
        }
    }

}