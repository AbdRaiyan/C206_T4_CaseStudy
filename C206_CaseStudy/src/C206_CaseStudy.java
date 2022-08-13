import java.util.ArrayList;

public class C206_CaseStudy {
	public static void main(String[] args) {
		ArrayList<User> accountList = new ArrayList <User>();
		accountList.add(new User("May","Student"));
		accountList.add(new User("Mary","Teacher"));
		accountList.add(new User("Ben","Admin"));
		accountList.add(new User("Benny","Career Advisor"));
		
		//-----------Array List for Career( done by Gerald) -------------
		ArrayList<career> careerList = new ArrayList <career>();
		careerList.add(new career(1,"School Teacher"));
		careerList.add(new career(2,"Accountant"));
		careerList.add(new career (3,"IT Programmer"));
		
		//----------Array List for Academic Cluster (Done by Allen)-------
		ArrayList<Academic_cluster> cluster = new ArrayList <Academic_cluster>();
		
		int option =-1;
		while (option !=3){
			mainMenu();
			option = Helper.readInt("Enter choice > ");
			if (option == 1){
				//Ask user for their name
				String name= Helper.readString("Enter Name> ");
					if (name.equalsIgnoreCase("May") || name.equalsIgnoreCase("Mary")){ //Student and Teacher (done by Gerald)
						System.out.println("Welcome"+ name);
						int stChoice =-1;
						while (stChoice !=2){
							stMenu();
							stChoice=Helper.readInt ("Enter Choice > ");
							if (stChoice ==1){
								viewCareerInfo(careerList);
							}
							else if (stChoice == 2){
								System.out.println("Thank you for using Career Planning Application");
								break;
							}
							else
							{
								System.out.println("Invalid option!");
							}
						}
					}
					else if (name.equalsIgnoreCase( "Ben") || name.equalsIgnoreCase("Benny")){//CA and Admin (done by Gerald)
						System.out.println("Welcome"+name);
						int caChoice =-1;
						while (caChoice !=4){
						caMenu();
						caChoice=Helper.readInt ("Enter Choice > ");
							if (caChoice ==1){
								career c =inputPackage();
								C206_CaseStudy.addCareerInfo(careerList,c);
								System.out.println("Career has been successfully added");
							}
							else if (caChoice == 2){
								viewCareerInfo(careerList);
							}
							else if (caChoice == 3){
								deleteCareerInfo(careerList);
							}
							else if (caChoice == 4){
								System.out.println("Thank you for using Career Planning Application");
								break;
							}
							else
							{
								System.out.println("Invalid option!");
							}
						
						}
					}
				}
				else if (option == 2){
					acMenu();
					int choice=Helper.readInt("Enter your choice >");
					if(choice==1) {
						viewClusterInfo(cluster);
					}else if(choice==2) {
						Academic_cluster c =input();
						C206_CaseStudy.addClusterInfo(careerList,c);
					}
					else if(choice==3) {
						
					}
					
				}else if(option==3){
					System.out.println("Thank you for using ....");
				}
					
				}
				
		}
	/**
* 
*/
private static void viewClusterInfo(ArrayList<Academic_cluster> cluster) { //---created By Allen
// TODO Auto-generated method stub

	String output = String.format("%-15s %-15s  \n", "Code","Name" );
			for(int i = 0; i < cluster.size(); i++){	
				output += String.format("%-15d %-15s\n", cluster.get(i).getId(),cluster.get(i).getName());
			}
			System.out.println(output);
}

public static void addClusterInfo(ArrayList<Academic_cluster> cluster, Academic_cluster c){
cluster.add(c);
System.out.println(c +"has added successfully.");
}
public static Academic_cluster input() {
	Academic_cluster c = null;
int addClusterId = Helper.readInt("Enter Cluster ID > ");
String addCareeName = Helper.readString("Enter Cluster Name > ");

c = new Academic_cluster(addClusterId, addCareeName);
return c;
		
}

public static void deleteClusterInfo(ArrayList<Academic_cluster> Academic_cluster){
viewClusterInfo(Academic_cluster);
int deleteClusterCode = Helper.readInt("Enter Cluster ID > ");
boolean checker = false;
	try {
		for (int i = 0; i <= Academic_cluster.size()+1; i++) {
			if (Academic_cluster.get(i).getId() == deleteClusterCode){
				Academic_cluster.remove(i);
				checker = true;
				break;
				}
			}
		}
		catch (Exception e) {
			checker = false;
        }
		if (checker == true) {
			System.out.println(deleteClusterCode  +"has been deleted!");
		}
		else{
			System.out.println("Cluster Code not found!");
		}

}


	
//---------------Academic Cluster menu(done by Allen)-----------------
private static void acMenu() {
Helper.line(30, "-");
System.out.println("WELCOME TO Career Planning Application ");
System.out.println("1. View Academic Cluster");
System.out.println("2. Add academic cluster");
System.out.println("3. Delete an academic cluster");
Helper.line(30, "-");
}
//------------------------MAIN MENU (done by Gerald)----------------		
		private static void mainMenu() {
			Helper.line(30, "-");
			System.out.println("WELCOME TO Career Planning Application (CPA)");
			System.out.println("1. Enter Login credentials");
			System.out.println("2. Academic Cluster");
			Helper.line(30, "-");
		}
//--------------STUDENT & TEACHER MENU (done by Gerald)----------------
		private static void stMenu() {
			Helper.line(30, "-");
			System.out.println("WELCOME TO Career Planning Application ");
			System.out.println("1. View All Career Info");
			System.out.println("2. Quit");
			Helper.line(30, "-");
		}
		
		private static void caMenu() {
			Helper.line(30, "-");
			System.out.println("WELCOME TO Career Planning Application ");
			System.out.println("1. Add Career");
			System.out.println("2. View All Career Info");
			System.out.println("3. Delete Career Info");
			System.out.println("4. Quit");
			Helper.line(30, "-");
		}
//-------------ADD CAREER INFO (done by Gerald) -----------------------
		public static void addCareerInfo(ArrayList<career> careerList, career c){
			careerList.add(c);
			System.out.println(c +"has added successfully.");
		}
		public static career inputPackage() {
			career c = null;
			int addCareerCode = Helper.readInt("Enter Career Code > ");
			String addCareeName = Helper.readString("Enter Career Name > ");

			c = new career(addCareerCode , addCareeName);
			return c;
					
		}
		
//-------------DELETE CAREER INFO (done by Gerald) -----------------------	
		public static void deleteCareerInfo(ArrayList<career> careerList){
			viewCareerInfo(careerList);
			int deleteCareerCode = Helper.readInt("Enter career Code > ");
			boolean checker = false;
				try {
					for (int i = 0; i <= careerList.size()+1; i++) {
						if (careerList.get(i).getId() == deleteCareerCode){
							careerList.remove(i);
							checker = true;
							break;
							}
						}
					}
					catch (Exception e) {
						checker = false;
			        }
					if (checker == true) {
						System.out.println(deleteCareerCode  +"has been deleted!");
					}
					else{
						System.out.println("Career Code not found!");
					}
			
		}
//------------------VIEW CAREER INFO (done by Gerald) ------------------
		public static void viewCareerInfo(ArrayList<career> careerList){
			String output = String.format("%-15s %-15s  \n", "Code","Name" );
					for(int i = 0; i < careerList.size(); i++){	
						output += String.format("%-15d %-15s\n", careerList.get(i).getId(),careerList.get(i).getName());
					}
					System.out.println(output);
		}	}