package keyPoint2;

public class ItalianHouseBuilder implements HouseBuilder {

	private House house;

	@Override
	public void builDoors() {

		this.house.setDoors("porta italiana ");

	}

	@Override
	public void buildWindows() {

		this.house.setWindows("bella finestra ");

	}

	@Override
	public void builDoorBell() {

		this.house.setDoorBell("campanello di casa ");

	}

	@Override
	public House getHouse() {
		return this.house;
	}

	public void setHouse(House house) {
		this.house = house;
	}
}
