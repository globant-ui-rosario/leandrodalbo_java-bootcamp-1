package keyPoint2;

public class GermanHouseBuilder implements HouseBuilder {

	private House house;

	@Override
	public void builDoors() {

		this.house.setDoors("Deutsche Tür ");

	}

	@Override
	public void buildWindows() {

		this.house.setWindows("Deutsches Fenster ");

	}

	@Override
	public void builDoorBell() {

		this.house.setDoorBell("Deutsche Türklingel ");

	}

	@Override
	public House getHouse() {

		return this.house;
	}

	public void setHouse(House house) {
		this.house = house;
	}

}
