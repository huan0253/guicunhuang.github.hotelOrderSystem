package algonquinCollege;
/**
 * @author guicun
 *this system has some functions such as checking the room status; 
 *check in the room; check out the room ; 
 */
public class Hotel {
	/**
	 * create an room array to load all the rooms
	 * the hotel has thirty rooms with three storey
	 */
	Room[][] rooms= new Room[3][10];
   /**
    * create a Hotel() constructor and transfer rooms array elements to room numbers
    * 
    */
	public Hotel() {
		for(int i=0; i<rooms.length; i++) {
			for(int j=0; j<rooms[i].length;j++) {
				if(i==0) {
					rooms[i][j]= new Room((i+1)*100+j+1,"standard room", false);
				}
				
				if(i==1) {
					rooms[i][j]= new Room((i+1)*100+j+1,"single room", false);
				}

				if(i==2) {
					rooms[i][j]= new Room((i+1)*100+j+1,"luxury room", false);
				}
		    }
	   }	
	}
	/**
	 * this method is to print all the room status including room number, room status
	 */
    public void print() {
    	for(int i=0; i<rooms.length; i++) {
			for(int j=0; j<rooms[i].length;j++) {
				Room room = rooms[i][j];
				System.out.print(room);
			}
			System.out.println("");
    	}
    }
    /**
     * this method is to check in the room 
     * @param roomNum parameter to pass to the method 
     */
	public void checkIn(int roomNum) {
	rooms[roomNum/100-1][roomNum%100-1].setOccupied(true);		

	}
	 /**
     * this method is to check out the room 
     * @param roomNum roomNum parameter to pass to checkOut
     */
	public void checkOut(int roomNum) {
		rooms[roomNum/100-1][roomNum%100-1].setOccupied(false);
	}

	
}
