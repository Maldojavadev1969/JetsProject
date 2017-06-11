package JetsProject;
 

public class Hanger{
	Jet[] jets; //declare an array of jets

	/* static initializer
	 * initializer
	 * constructor
	 */
	
	
	//initializer
	{
	jets = new Jet[5];
	
	jets[0] = new Jet("Beechcraft T34A",173,737,225000);
    jets[1] = new Jet("Lockheed Martin F-35 Lighting",1225,1379,93000000);
	jets[2] = new Jet("Lear Jet 45",533,1918,21000000);
	jets[3] = new Jet("C-130", 250, 2000, 30000000);
	jets[4] = new Jet("Lockheed SR-71 Blackbird", 2200, 3355, 34000000);
	
	}
	
	
	//attempt to copy old array to new array and add one!
	public void addPlane(String model, double speed, int range, double price){
		//String model = "";
		//double speed = 
		
		Jet[] addJets; //declare a temp array to copy into
		int sizeOfArray = jets.length;
		//lets make this a bigger array by one! 
		sizeOfArray++;
		addJets = new Jet[sizeOfArray];
		//copy old array into new array
		for(int i = 0; i < jets.length; i++){
		//add the original array to new array
				addJets[i] = jets[i];
			}
		
		//now simply assign new array index object values.. right now there hard coded!
		//you have to go to a new array of larger size
		addJets[addJets.length - 1] = new Jet(model, speed, range, price);
		jets = addJets;	
		
	}	
	
	public String getAllJets(){

	
	String testList = "";
		for (int i = 0; i < jets.length; i++)
		{
			//testList += jets[i].toString() + "\n";
			 testList += ("Model: " + jets[i].getModel() + "\t" + "Mach Speed: " + jets[i].getSpeedMach() + "\t" +
			"Range: " + jets[i].getRange() + "\t" + "Price: " + jets[i].getPrice() + "\n");
		}
		return testList.toString();
	}
	
	public String fastestJet()
	{
		String isFastestJet = "looking for fastest jet!";

		double fastest = 0.0;
		for(int i = 0; i < jets.length; i++)
		{
			if( fastest < jets[i].getSpeedMach())
			{
				fastest = jets[i].getSpeedMach();
				
				 isFastestJet = ("Model: " + jets[i].getModel() + "\t" + "Mach Speed: " + jets[i].getSpeedMach() + "\t" +
						         "Range: " + jets[i].getRange() + "\t" + "Price: " + jets[i].getPrice() + "\n");
			}

		}
		return isFastestJet.toString();
	}
	public String longestRange()
	{
		String isLongestRange = "looking for longest range";

		double longestRange = 0.0;
		for(int i = 0; i < jets.length; i++)
		{
			if( longestRange < jets[i].getRange())
			{
				longestRange = jets[i].getRange();
				
				isLongestRange = ("Model: " + jets[i].getModel() + "\t" + "Mach Speed: " + jets[i].getSpeedMach() + "\t" +
						         "Range: " + jets[i].getRange() + "\t" + "Price: " + jets[i].getPrice() + "\n");
			}

		}
		return isLongestRange.toString();
	}
				
}

