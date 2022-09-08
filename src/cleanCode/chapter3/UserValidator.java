package cleanCode.chapter3;

public class UserValidator {
	private Cryptographer cryptographer;
	
	public boolean checkPassword(String userName, String password) {
		User user = UserGateway.findByName(userName);
		
		if(user != User.NULL) {
			String codedPhase = user.getPhraseEncodeByPassword();
			String phrase = cryptographer.decrypt(codedPhase, password);
			if("Valid Password".equals(phrase)) {
				Session.initialize();
				return true
			}
		}
		return false;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
