public class User_Account { 
	 public static void main(String[] args) 
	   {
		 String username = "";
		 String password = "";

	     public UserLogin(String username, String password) {
	    	 this.username = username;
	    	 this.password = password;
	     }


	     System.out.println("Enter your username and password to login to your account.");    
	     System.out.println("Username: ");

	     System.out.println("Password: ");

	       UserLogin login = new UserLogin(username, password);
	       if(login.checkPassword())
	           System.out.println("Login successful");
	       else
	           System.out.println("The username or password you entered is incorrect.");
	   }


	}
