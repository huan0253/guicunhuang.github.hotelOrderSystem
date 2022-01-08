package algonquinCollege;
import java.util.Objects;
/**
 *  create room class
 * @author guicu
 *
 */
public class Room {
	private int roomNum;
	private String type;
	private boolean occupied;
	
	/**
	 * create the constructors with parameter or without parameter
	 */
	Room() {}
	Room(int roomNum, String type, boolean occupied) {
		this.roomNum= roomNum;
		this.type= type;
		this.occupied= occupied;
	}
	/**
	 * create getRoomNum() method to get room number
	 * @return
	 */
	public int getRoomNum() {
		return roomNum;
	}
	/**
	 * create setRoomNum(int roomNum) method to set the roomNum to room object
	 * @param roomNum
	 */
	public void setRoomNum(int roomNum) {
		this.roomNum = roomNum;
	}
	
	/**
	 * create getType() method to get room type
	 * @return
	 */
	public String getType() {
		return type;
	}
	
	/**
	 * set room type to type
	 * @param type
	 */
	public void setType(String type) {
		this.type = type;
	}
	/**
	 * this method is to get room status
	 * @return
	 */
	public boolean isOccupied() {
		return occupied;
	}
	/**
	 * this method is to set the room status
	 * @param occupied
	 */
	public void setOccupied(boolean occupied) {
		this.occupied = occupied;
	}
	/**
	 * override toString() method
	 */
	@Override
	public String toString() {
		return "Room [roomNum=" + getRoomNum() + ", type=" +getType() + ", occupied=" + isOccupied()
				+ "]";
	}
    /**
     * override equals() method
     */
	@Override
	public boolean equals(Object obj) {
		Room room = (Room) obj;
		if(this.roomNum==room.getRoomNum())
			return true;
		else 
			return false;
	}
	

}
