
public class sak {
	public static void main(String[] args) {
        System.out.println("");
       long start = System.nanoTime();

		if (args.length < 1) {
			// Processed with no arguments.
            System.out.println("An additional argument is required. " +
            "Execute \"java sak -Help\" for more information.");	
            Help.printHelp(); 

            //Starts timer
            long end = System.nanoTime();
            long elapsed = end - start;
            System.out.println("\nExecution time = " + elapsed/1000000 + " milliseconds.");
		} 
		else if (args[0].equalsIgnoreCase("-Help")) {
            //Processed with -Help command
			System.out.println("Running -Help");
            Help.printHelp();	
            
            //Ends and prints time elapsed
            long end = System.nanoTime();
            long elapsed = end - start;
            System.out.println("\nExecution time = " + elapsed/1000000 + " milliseconds.");
		} 
		else if (args[0].equalsIgnoreCase("-HttpRequest")) {
            //Processed with -HttpRequest command
			System.out.println("Running -HttpRequest");
			if (args.length <2) {
                // Checks if there is actually a URL to run
				System.out.println("A valid URL is required to run the -HttpRequest command.");
			} else {
				String URL = args[1];
				HttpRequest urlRequest = new HttpRequest();
				if (urlRequest.readURL(URL)) {
					System.out.println(urlRequest);
				}
            }
            // Ends and prints time elapsed
            long end = System.nanoTime();
            long elapsed = end - start;
            System.out.println("Execution time = " + elapsed/1000000 + " milliseconds.");
		}
		else if (args[0].equalsIgnoreCase("-HttpRequestIndex")) {
            // Processed with _HttpRequestIndex command
			 System.out.println("Running -HttpRequestIndex");	
			if (args.length < 2) {
                // Checks if there is actually a URL to run
				System.out.println("A valid URL is required to run the -HttpRequestIndex command");
			} else {
				String URLindex = args[1];
				HttpRequestIndex urlRequestIndex = new HttpRequestIndex();
				if (urlRequestIndex.readURL(URLindex)) {
                    System.out.println(urlRequestIndex);
					urlRequestIndex.parseIndex();
				}
            }
            // Ends and prints time elapsed
            long end = System.nanoTime();
            long elapsed = end - start;
            System.out.println("Execution time = " + elapsed/1000000 + " milliseconds.");
		}

		System.out.println("");
	}
} 