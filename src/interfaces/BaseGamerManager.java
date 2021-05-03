package interfaces;

import models.Gamer;

public interface BaseGamerManager {
	void addGamer(Gamer gamer);
	void updateGamer(Gamer gamer,int id, String firstName,String lastName,String nationalityIdentity,String birthDay);
	void deleteGamer(Gamer gamer);
}
