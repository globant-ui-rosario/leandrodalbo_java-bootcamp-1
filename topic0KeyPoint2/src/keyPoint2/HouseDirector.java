package keyPoint2;

public class HouseDirector {

	private HouseBuilder houseBuilder;

	public HouseDirector(HouseBuilder houseBuilder) {

		this.houseBuilder = houseBuilder;
		this.houseBuilder.setHouse(new House());

	}

	public void constructAhouse() {
		houseBuilder.builDoors();
		houseBuilder.buildWindows();
		houseBuilder.builDoorBell();
	}

	public House getHouse() {
		return this.houseBuilder.getHouse();
	}
}
