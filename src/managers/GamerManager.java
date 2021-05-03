package managers;

import interfaces.BaseGamerManager;
import models.Gamer;
import verifications.EDevletVerification;

public class GamerManager implements BaseGamerManager{

	final EDevletVerification eDevletVerification;
	
	public GamerManager(EDevletVerification eDevletVerification) {
		this.eDevletVerification = eDevletVerification;
	}



	@Override
	public void addGamer(Gamer gamer) {
		if(eDevletVerification.verify(gamer)) {
			System.out.println(gamer.getFirstName() + " adlı oyuncu eklendi");
		}
		else {
			System.out.println(gamer.getFirstName() + " adlı oyuncu eklenemedi");
			System.out.println(gamer.getFirstName() + " doğrulama yapılamadı");
		}
		
	}

	

	@Override
	public void updateGamer(Gamer gamer, int id, String firstName, String lastName, String nationalityIdentity,
			String birthDay) {
		gamer.setId(id);
		gamer.setFirstName(firstName);
		gamer.setSurName(birthDay);
		gamer.setNationalityIdentity(nationalityIdentity);
		gamer.setBirthDay(birthDay);
		System.out.println(gamer.getFirstName() + " adlı oyuncu güncellendi");
	}



	@Override
	public void deleteGamer(Gamer gamer) {
		System.out.println(gamer.getFirstName() + " adlı oyuncu silindi");
	}

}
