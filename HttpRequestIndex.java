public class HttpRequestIndex extends HttpRequest {
    public Boolean parseIndex(){
        for (final String line : urlContent){
            parseLine(line);
        }
        return true;
    }

    private void parseLine(final String line) {
        System.out.println("\nParsing: " + line);

        final String[] subString = line.split("\"");

        if(subString.length > 0) {
            int n = 0;
            for (final String s : subString) {
                System.out.println("Substring: " +n+ " = " +s);
                n++;
            }
        }

        //substring 7 is equals to email address
        if (subString.length > 7) {
            if (subString[5].equals("Email")) {
                String emailAddress = subString[7];

                System.out.println("\nSending email to: " + emailAddress);

            }
        }
    }
}