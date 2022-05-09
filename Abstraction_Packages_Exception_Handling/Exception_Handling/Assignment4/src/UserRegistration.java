public class UserRegistration {
	
	void registerUser(String username,String userCountry) throws InvalidCountryException {
		if(userCountry != "India") {
			 throw new InvalidCountryException("InvalidCountryException");    
		}else {
			System.out.println("Registration done successfully");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UserRegistration ur = new UserRegistration();
		try {
			ur.registerUser("Tom", "India");
		}catch(InvalidCountryException ie) {
			System.out.println(ie);
		}
	}
}