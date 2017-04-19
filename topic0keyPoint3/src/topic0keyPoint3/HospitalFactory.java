package topic0keyPoint3;

public class HospitalFactory {

	public Hospital getAhospital(String hospitalType) {
		
		if ("psychiatricHospital".equalsIgnoreCase(hospitalType)) {

			return new PsychiatricHospital();

		} else if ("rehabilitationHospital".equalsIgnoreCase(hospitalType)) {
			return new RehabilitationHospital();

		} else
			return null;
	}
}
