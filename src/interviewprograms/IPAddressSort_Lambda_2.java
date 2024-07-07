package interviewprograms;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class IPAddressSort_Lambda_2 {
	
	public static void main(String[] args) {
        List<String> ipAddresses = Arrays.asList("192.168.1.1", "10.0.0.1", "172.16.0.1");

        // Define a custom comparator using lambda expression
        Comparator<String> ipComparator = (ip1, ip2) -> {
            // Split IP addresses into arrays of integers
            int[] ip1Parts = Arrays.stream(ip1.split("\\.")).mapToInt(Integer::parseInt).toArray();
            int[] ip2Parts = Arrays.stream(ip2.split("\\.")).mapToInt(Integer::parseInt).toArray();

            // Compare each octet
            for (int i = 0; i < 4; i++) {
                if (ip1Parts[i] != ip2Parts[i]) {
                    return ip1Parts[i] - ip2Parts[i];
                }
            }
            return 0; // IP addresses are equal
        };

        // Sort the IP addresses using the comparator
        ipAddresses.sort(ipComparator);

        // Print sorted IP addresses
        ipAddresses.forEach(System.out::println);
    }
}
