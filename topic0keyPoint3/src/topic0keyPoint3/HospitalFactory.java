package topic0keyPoint3;

public class HospitalFactory {

	public Hospital getAhospital(String hospitalType) {

		if (hospitalType.equals("psychiatricHospital")) {

			return new PsychiatricHospital();

		} else if (hospitalType.equals("rehabilitationHospital")) {
			return new RehabilitationHospital();

		} else
			return null;
	}
}
