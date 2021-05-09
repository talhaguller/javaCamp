package Adapters;

import Abstracts.CheckUserService;
import Enitities.Gamer;
import Mernis.PersonValidation;

public class FakeMernisService implements CheckUserService {

	@Override
	public boolean CheckIfRealPerson(Gamer gamer) {
		
		PersonValidation personValidation = new PersonValidation();
		
		
		boolean kullaniciKontrolu = true;
		
		try {
			kullaniciKontrolu =personValidation.ValidateByPersonalInfo(Long. parseLong(gamer.getNationalId()), gamer.getGamerFirstName().toUpperCase(), gamer.getGamerLastName().toUpperCase(), gamer.getDateOfBirthday().getYear());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return kullaniciKontrolu;
	}

}

	
	
	
