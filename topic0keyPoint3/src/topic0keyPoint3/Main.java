package topic0keyPoint3;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		HospitalFactory hospitalFactory = new HospitalFactory();
		List<Hospital> listOfHospitals = new ArrayList<Hospital>();

		Hospital hospital0 = hospitalFactory.getAhospital("psychiatricHospital");
		listOfHospitals.add(hospital0);

		Hospital hospital1 = hospitalFactory.getAhospital("rehabilitationHospital");
		listOfHospitals.add(hospital1);

		Hospital hospital2 = hospitalFactory.getAhospital("");
		listOfHospitals.add(hospital2);

		for(Hospital hospital:listOfHospitals){
			
			if(hospital != null){
				
				hospital.getHospitalType();
			}
			else{
				System.out.println("this is not ok...");
			}
				
		}
		
	}

}
