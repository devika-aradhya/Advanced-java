package program3c;
import java.util.Random;
public class RandomString {
	

	
	    public static String generateRandomString(int length) {
	        String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
	        StringBuilder sb = new StringBuilder();
	        Random rand = new Random();
	        for (int i = 0; i < length; i++) {
	            sb.append(chars.charAt(rand.nextInt(chars.length())));
	        }
	        return sb.toString();
	    }

	    public static void main(String[] args) {
	        System.out.println(generateRandomString(10));
	    }
	}


