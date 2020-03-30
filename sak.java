import java.util.concurrent.TimeUnit;

public class sak {
	public static void main(String[] args) {
        System.out.println("");
       long start = System.nanoTime();

		if (args.length < 1) {
			// Process no arguments.
            System.out.println("An additional argument is required. " +
            "Execute \"java sak -Help\" for more information.");	
            Help.printHelp(); 
            long end = System.nanoTime();
            long elapsed = end - start;
            System.out.println("\nExucution time = " + elapsed/1000000 + " milliseconds.");
		} 
		else if (args[0].equalsIgnoreCase("-Help")) {
			System.out.println("Running -Help");
            Help.printHelp();	
            
            long end = System.nanoTime();
            long elapsed = end - start;
            System.out.println("\nExucution time = " + elapsed/1000000 + " milliseconds.");
		} 
		else if (args[0].equalsIgnoreCase("-HttpRequest")) {
			System.out.println("Running -HttpRequest");
			if (args.length <2) {
				System.out.println("A valid URL is required to run the -HttpRequest command.");
			} else {
				String URL = args[1];
				HttpRequest urlRequest = new HttpRequest();
				if (urlRequest.readURL(URL)) {
					System.out.println(urlRequest);
				}
            }
            
            long end = System.nanoTime();
            long elapsed = end - start;
            System.out.println("Exucution time = " + elapsed/1000000 + " milliseconds.");
		}
		else if (args[0].equalsIgnoreCase("-HttpRequestIndex")) {
			 System.out.println("Running -HttpRequestIndex");	
			if (args.length < 2) {
				System.out.println("A valid URL is required to run the -HttpRequestIndex command");
			} else {
				String URLindex = args[1];
				HttpRequestIndex urlRequestIndex = new HttpRequestIndex();
				if (urlRequestIndex.readURL(URLindex)) {
                    System.out.println(urlRequestIndex);
					System.out.println(urlRequestIndex.parseIndex());
				}
            }
            
            long end = System.nanoTime();
            long elapsed = end - start;
            System.out.println("Exucution time = " + elapsed/1000000 + " milliseconds.");
		}

		System.out.println("");
	}
} 