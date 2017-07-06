package keyPoint2;

public class House {

	private String doors;
	private String windows;
	private String doorBell;

	public String getDoors() {
		return doors;
	}

	public void setDoors(String doors) {
		this.doors = doors;
	}

	public String getWindows() {
		return windows;
	}

	public void setWindows(String windows) {
		this.windows = windows;
	}

	public String getDoorBell() {
		return doorBell;
	}

	public void setDoorBell(String doorBell) {
		this.doorBell = doorBell;
	}

	public String toString() {

		StringBuilder stringBuilder = new StringBuilder();

		stringBuilder.append("Doors : ");
		stringBuilder.append(this.getDoors());
		stringBuilder.append("Windows :");
		stringBuilder.append(this.getWindows());
		stringBuilder.append("DoorBell: ");
		stringBuilder.append(this.getDoorBell());

		return stringBuilder.toString();
	}
}
