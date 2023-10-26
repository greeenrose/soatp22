package service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BanqueService {
	@SuppressWarnings("deprecation")
	Date d = new Date(1,12,19);
	Compte cm =new Compte(0,d,12.4);
	
	public double conversion (double montant) {
		return montant*3.36;
	}
	
	public Compte getCompte(int code) {
		return new Compte(code, new Date(), 0);
	}
	
	public List <Compte> getcomptes(){
		List<Compte> list= new ArrayList<>();
		Date d = new Date(1,12,19);
		Compte cm =new Compte(0,d,12.4);
		list.add(cm);
		return list;
	}
	
}
