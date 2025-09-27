
import java.io.*;

class Result {

    public static boolean validate(String ip) {
        // Split the IP by dot
        String[] parts = ip.split("\\.");
        
        // Must have exactly 4 parts
        if (parts.length != 4) return false;

        for (String part : parts) {
            // Each part must be numeric
            if (!part.matches("\\d+")) return false;

            int num = Integer.parseInt(part);

            // Each number must be between 0 and 255
            if (num < 0 || num > 255) return false;
        }

        return true;
    }
}

public class Source {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String ip = bufferedReader.readLine();

        boolean result = Result.validate(ip);

        // Print 1 for true, 0 for false
        System.out.print(result ? 1 : 0);

        bufferedReader.close();
    }
}
