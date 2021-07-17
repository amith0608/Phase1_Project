package phase1_A;
import java.util.Scanner;

public class Proj_1a {
	
	
	
		public static void main(String[] args) {

			UserRepo userRepo = new UserRepo();
			String fileName = null;
			boolean result = false;
			int userId;

				System.out.println("******  Welcome To LockedMe.com Application ******");
				System.out.println("Application created by - AMITH B N");
				System.out.println("Email - amith.sharma3@gmail.com");
				System.out.println("*** Kinldy choose an option from the below List ***");
				System.out.println("1. Add the files with your User ID & file name... ");
				System.out.println("2. Search files by your User ID... ");
				System.out.println("3. Retrive All files By Admin - Ascending Order... ");
				System.out.println("4. Delete a file by User ID & File Name... ");
				System.out.print("\n To Quit Kindly press y or Y");

				short ch = 0,innch = 0;

			while(ch!='y' || ch !=  'Y')
				{
					Scanner sc = new Scanner(System.in);
					ch = sc.nextShort();
					switch(ch)
					{

					case 1: System.out.println("\n---------------------------------------");
					        Scanner scu = new Scanner(System.in);
					        System.out.println("Please provide your user ID");
							userId = scu.nextInt();
							Scanner scuf = new Scanner(System.in);
							System.out.println("Please mention the file name");
							fileName = scuf.nextLine();
							result = userRepo.addFile(userId, fileName);
							if(result == true) {
								System.out.println("user id along with file successfully added..");
							}else {
								System.out.println("Please check your input parameter!!!");
							}
							System.out.println("---------------------------------------");
							System.out.print("Please choose another option to continue : ");
							while(true)
							{
								Scanner sci = new Scanner(System.in);
								innch = sci.nextShort();
								switch(innch)
								{
								case 1 : System.out.println("\n---------------------------------------");
								Scanner scu1 = new Scanner(System.in);
								System.out.println("Please provide your User ID : ");
								userId = scu1.nextInt();
								System.out.println("Please mention the file name : ");
								Scanner scuf1 = new Scanner(System.in);
								fileName = scuf1.nextLine();
								result = userRepo.addFile(userId, fileName);
								if(result == true) {
									System.out.println("user id along with file successfully added..");
								}else {
									System.out.println("Please check youtr input parameter!!!");
								}					 
										 System.out.println("---------------------------------------");
										 System.out.print("Please choose another option to continue : ");
										 break;
								case 2 : System.out.println("\n---------------------------------------");
										 System.out.println(" Search your files by your User ID...");
										 Scanner sf = new Scanner(System.in);
										 userId =  sf.nextInt();
										 fileName = userRepo.getAllFileByUserID(userId);
										 System.out.println("User : " + userId + " || Oewned list of files -> " + fileName);
										 System.out.println("---------------------------------------");
										 System.out.print("Please choose another option to continue : ");
										 break;
								case 3 : System.out.println("\n---------------------------------------");
										 System.out.println("Get All files By Admin - Ascending Order... ");
										 System.out.println("All the files By ASC oder :: " +  userRepo.getAllFileByUserID(userId));
										 System.out.println("---------------------------------------");
										 System.out.print("Please choose another option to continue : ");
										 break;
								case 4 : System.out.println("\n---------------------------------------");
										 System.out.println("Delete a file by Your User ID & File Name...");
										 Scanner sfs = new Scanner(System.in);
										 System.out.println("Please provide your User ID");
										 userId = sfs.nextInt();
										 System.out.println("Please mention the file name");
										 Scanner scufs = new Scanner(System.in);
										 fileName = scufs.next();
										 System.out.println(userRepo.deleteFile(userId, fileName));
										 System.out.println("---------------------------------------");
										 break;
								default : System.out.print("Please select a number from above list : ");
								}

							}
					case 3: System.out.println("\n---------------------------------------");
							System.out.println("Program Closed by User");
							System.out.println("---------------------------------------");
							break;
					default : System.out.print("Please select a number from above list : ");
					}

				}

			}

	}
	