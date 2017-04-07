package presentation;

import service.ClientService;
import service.IClientService;
import service.IClientVIPService;

public class Lanceur {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		
		
		// d�claration de l'interface 1
		IClientService s = new ClientService();
		
		//D�claration de l'interface 2
		IClientVIPService vip = new ClientService();
		
		//d�claration de la classe
		ClientService cs = new ClientService();
		
		
		System.out.println("----------CLIENT NORMAL------------");
		// Utilisation de l'interface 1
		s.direBonjour();
		// ne peut pas �tre utilis� par tous les clients s.jeSuisVIP();
		s.direAurevoir();
		System.out.println("---------CLIENT CLASSE CLIENT-------------");
		
		//Utilisation de la classe
		cs.direBonjour();
		cs.jeSuisVIP();
		cs.direAurevoir();
		System.out.println("---------CLIENT VIP-------------");
		
		
		//Utilisation de l'interface 2
		vip.direBonjour();
		vip.jeSuisVIP();
		vip.direAurevoir();
		
		
		
		
	}

}
