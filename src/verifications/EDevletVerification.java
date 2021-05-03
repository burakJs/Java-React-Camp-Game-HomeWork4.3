package verifications;

import interfaces.BaseVerification;
import models.Gamer;

public class EDevletVerification implements BaseVerification{

	@Override
	public boolean verify(Gamer gamer) {
		if(gamer.getNationalityIdentity().length() == 11) {
			return true;
		}
		return false;
	}

}
