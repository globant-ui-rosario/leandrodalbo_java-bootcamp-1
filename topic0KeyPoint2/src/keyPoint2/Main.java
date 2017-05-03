package keyPoint2;

public class Main {

	public static void main(String[] args) {

		HouseBuilder houseBuilder = new ItalianHouseBuilder();
		HouseDirector houseDirector = new HouseDirector(houseBuilder);
		houseDirector.constructAhouse();
		System.out.println(houseDirector.getHouse().toString());

		houseBuilder = new GermanHouseBuilder();
		houseDirector = new HouseDirector(houseBuilder);
		houseDirector.constructAhouse();
		System.out.println(houseDirector.getHouse().toString());
	}

}
