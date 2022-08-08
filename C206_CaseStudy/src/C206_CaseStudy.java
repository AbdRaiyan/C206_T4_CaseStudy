
public class C206_CaseStudy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//career info
		ArrayList<User> accountList = new ArrayList <User>();

		accountList.add(new User("May","Student");
		accountList.add(new User("Mary","Teacher");
		accountList.add(new User("Ben","admin");
		accountList.add(new User("Benny","career advisor");

		ArrayList<career> careerList = new ArrayList <career>();
		careerList .add(new career("1","Teacher");
		(can add more)


		int option =-1;
		while (option !=2){
			mainMenu();
			option = Helper.readInt("Enter choice >");
			if (option == 1){
				name= Helper.readString("Enter Name>");
					if (name == "May" || name == "Mary"){
							//Student and Teacher
						System.out.println("Welcome"+accountList.get(i).getName());
						int stChoices =-1;
						while (stChoice !=2){
						stMenu();
						stChoice=Helper.readInt ("Enter Choice > ");
						if (stChoice ==1){
						viewCareerInfo(careerList);
						}
						else if (stChoice == 2){
						System.out.println("Thank you for using ....");
						}
						else
						{
						System.out.println("Invalid option!");
						}
						}
					}
					else if (name == "Ben" || name == "Benny"){
						System.out.println("Welcome"+accountList.get(i).getName());
						int stChoices =-1;
						while (stChoice !=3){
						stMenu();
						stChoice=Helper.readInt ("Enter Choice > ");
							if (stChoice ==1){
								career c =inputCareer();
								C206_CaseStudy.ddCareerInfo(careerList,c);
								System.out.println("Package added");
							}
							else if (stChoice == 2){
								viewCareerInfo(careerList);
							}
							else if (stChoice == 3){
								deleteCareerInfo(careerList);
							}
							else if (stChoice == 4){
								System.out.println("Thank you for using ....");
							}
							else
							{
								System.out.println("Invalid option!");
							}
						
						}
					}
			
			
				}
				else if (option == 2){
					System.out.println("Thank you for using ....");
				}
				else {
					System.out.println("Invalid option!");
				}
				
				
		public static void addCareerInfo(ArrayList<career> careerList){
			careerList.add(c);
			System.out.println("Added successfully");
		}
		public static Package inputPackage() {
					
					Package p = null;
					
					int addcareerCode = Helper.readInt("Enter Career Code > ");
					String addcareeName = Helper.readString("Enter Career Name > ");

					
					c = new Package(addcareerCode , addcareeName);
					return c;
					
		}
				
		public static void deleteCareerInfo(ArrayList<career> careerList){
			viewCareerInfo(careerList);
					int deleteCareerCode = Helper.readInt("Enter career Code > ");
					boolean checker = false;
					try {
						for (int i = 0; i <= careerList.size()+1; i++) 
						{
							if (careerList.get(i).getCode() == deleteCareerCode)
							{
							careerList.remove(i);
							checker = true;
							break;
							}
						}
					}
					catch (Exception e) {
						checker = false;
			        }
					if (checker == true) 
					{
						System.out.println("Deleted");
					}
					else
					{
						System.out.println("career Code not found!");
					}
			
		}
		public static void viewCareerInfo(ArrayList<career> careerList){
			String output = String.format("%-15s %-15s  \n", "Code","Name" );
					for(int i = 0; i < packageList.size(); i++)
					{	
						output += String.format("%-15d %-15s\n", packageList.get(i).getCode(),packageList.get(i).getName();
					}
					System.out.println(output);
		}
		
	}

}
