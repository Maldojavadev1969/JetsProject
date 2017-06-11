package JetsProject;

import java.util.Scanner;

public class Menu {
    Scanner input = new Scanner(System.in);

	public void startMenu(){
		
        int selection = printMenu();

		Hanger listPlanes = new Hanger();

        while(selection != 5)
        {

			if(selection == 1)
			{
				//prints out list of jets in the hanger!
				//Hanger listPlanes = new Hanger();  !!! this would be a problem because each time it would reset back to the five jets 
				 String planes = listPlanes.getAllJets();
				 System.out.println(planes);
				 //do this inside each selection to reset the value of the selection!
				 selection = printMenu();
				 
			}
			if(selection == 2)
			{
				String myfastest = listPlanes.fastestJet();
				System.out.println(myfastest);
				//do this inside each selection to reset the value of the selection!
//				 printMenu();
				 selection = printMenu();
			}
			if(selection == 3)
			{
				String longestRange = listPlanes.longestRange();
				System.out.println(longestRange);
				//do this inside each selection to reset the value of the selection!
//				 printMenu();
				 selection = printMenu();
			}
			if(selection == 4){
				System.out.println("enter model of jet");
				String model = input.next();
				System.out.println("enter speed of jet in mph");
				double speed  = input.nextDouble();
				System.out.println("enter range of jet in miles");
				int range  = input.nextInt();
				System.out.println("enter price of jet");
				double price = input.nextDouble();
				
				listPlanes.addPlane(model, speed, range, price);
//				printMenu();
				selection = printMenu();
			}
			if(selection == 5){
				break;
			}
			
		}
	}
	
	public int printMenu()
	{
		String selection = "";
		int parsedSelection = 0;
		System.out.println("Choose from the following five options: \n");
		System.out.println("1: List Fleet\n");
		System.out.println("2: View Fastest Jet\n");
		System.out.println("3: View Jet with longest Range\n");
		System.out.println("4: Add Jet to Fleet\n");
		System.out.println("5: Quit\n");
		selection = input.next();
		
		try{
			parsedSelection = Integer.parseInt(selection);
		}
		catch(Exception e){
			
			System.out.println("Please enter a number between 1-5");
			System.out.println();
			parsedSelection = printMenu();
		}
		return parsedSelection;
	}

}
