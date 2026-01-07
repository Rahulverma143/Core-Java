package Association;

import java.util.ArrayList;
import java.util.List;

class Room {
	private String name;

	// Constructor to initialize room
	public Room(String name) {
		this.name = name;
	}

	// Display room info
	@Override
	public String toString() {
		return "Room [name=" + name + "]";
	}
}

// House class
class House {
	private List<Room> rooms; // Composition: House owns Rooms

	// Constructor initializes house with rooms
	public House() {
		this.rooms = new ArrayList<>();
		rooms.add(new Room("Living Room")); // Add rooms to the house
		rooms.add(new Room("Bedroom"));
		rooms.add(new Room("Kitchen"));
		rooms.add(new Room("Guest Room"));
	}

	public List<Room> getRooms() {
		return rooms;
	}
}

// Main class
public class CompositionExample {
	public static void main(String[] args) {
		House h1 = new House();
		System.out.println(h1.getRooms());
	}
}
