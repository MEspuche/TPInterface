package service;

public class ClientService implements IClientService, IClientVIPService {

	@Override
	public void direBonjour() {
		// TODO Auto-generated method stub
		System.out.println("Bonjour");

	}

	@Override
	public void direAurevoir() {
		// TODO Auto-generated method stub
		System.out.println("Au revoir");
	}

	@Override
	public void jeSuisVIP() {
		// TODO Auto-generated method stub
		System.out.println("je suis VIP");

	}

}
