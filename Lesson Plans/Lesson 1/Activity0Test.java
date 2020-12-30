import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;


public class Activity0Test {

	public static int fibonacci(int n) {
		
		// write your code here

	}
	
	
	// do not worry about code below this line.
	
	public static String hash(byte result) throws NoSuchAlgorithmException {
		MessageDigest md5 = MessageDigest.getInstance("MD5");
		md5.update(result);
		
	    StringBuilder sb = new StringBuilder();
	    for (byte b : md5.digest()) {
	        sb.append(String.format("%02X", b));
	    }
	    return sb.toString();
	}

	public static boolean check(int n, int answer)  {
		if(fibonacci(n) == answer) {
			return true;
		} else {
			System.out.println("Check your work, the answer for n = " + n + " should be " + answer + ".");
			return false;
		}
	}
	public static boolean check(int n, String digest) throws NoSuchAlgorithmException {
		if(hash((byte) fibonacci(n)).equals(digest)) {
			return true;
		} else {
			System.out.println("Check your work, the answer for n = " + n + " is not correct.");
			return false;
		}
	}

	public static void main(String[] args) throws NoSuchAlgorithmException {
		// TODO Auto-generated method stub
		
		if(check(1,1) && check(3, 2) && check(5, 5) && check(10, "8F14E45FCEEA167A5A36DEDD4BEA2543")) {
			System.out.println("You passed the test!");
		}
	    
	}

}
