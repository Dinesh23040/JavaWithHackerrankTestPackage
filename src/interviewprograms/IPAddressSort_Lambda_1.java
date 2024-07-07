package interviewprograms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class IPAddressSort_Lambda_1 {
	
	 public static void main(String[] args) {
	        List<String> ipAddresses = new ArrayList<>();
	        ipAddresses.add("192.168.1.1");
	        ipAddresses.add("10.0.0.1");
	        ipAddresses.add("172.16.0.1");

	        // Define a custom comparator using lambda expression
	        Comparator<String> ipComparator = (ip1, ip2) -> {
	            // Split IP addresses into arrays of integers
	            int[] ip1Parts = convertToIntArray(ip1.split("\\."));
	            int[] ip2Parts = convertToIntArray(ip2.split("\\."));

	            // Compare each octet
	            for (int i = 0; i < 4; i++) {
	                if (ip1Parts[i] != ip2Parts[i]) {
	                    return ip1Parts[i] - ip2Parts[i];
	                }
	            }
	            return 0; // IP addresses are equal
	        };

	        // Sort the IP addresses using the comparator
	        Collections.sort(ipAddresses, ipComparator);

	        // Print sorted IP addresses
	        for (String ip : ipAddresses) {
	            System.out.println(ip);
	        }
	    }

	    // Helper method to convert String array to int array
	    private static int[] convertToIntArray(String[] parts) {
	        int[] intParts = new int[4];
	        for (int i = 0; i < 4; i++) {
	            intParts[i] = Integer.parseInt(parts[i]);
	        }
	        return intParts;
	    }
}
