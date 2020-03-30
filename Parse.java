public class Parse {
    public static void main (final String[] args) {
        System.out.println("Starting Parse");

        HttpRequestIndex requestIndex = new HttpRequestIndex();
        if (requestIndex.readURL("my website link")) {
            System.out.println(requestIndex);
            requestIndex.parseIndex();
        }
    }
}