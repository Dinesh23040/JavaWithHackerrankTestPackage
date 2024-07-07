package interviewprograms;

import java.util.Arrays;
import java.util.Comparator;

public class IPAddressSorter {
    public static void main(String[] args) {
        String[] ipAddresses = {"192.168.0.1", "10.0.0.1", "172.16.0.1", "10.0.0.2"};

        // Sort IP addresses
        Arrays.sort(ipAddresses, new IPAddressComparator());

        // Print sorted IP addresses
        System.out.println("Sorted IP addresses:");
        for (String ipAddress : ipAddresses) {
            System.out.println(ipAddress);
        }
    }

    // Custom comparator for IP addresses
    static class IPAddressComparator implements Comparator<String> {
        @Override
        public int compare(String ip1, String ip2) {
            String[] octets1 = ip1.split("\\.");
            String[] octets2 = ip2.split("\\.");

            for (int i = 0; i < 4; i++) {
                int octetComparison = Integer.compare(Integer.parseInt(octets1[i]), Integer.parseInt(octets2[i]));
                if (octetComparison != 0) {
                    return octetComparison;
                }
            }

            return 0; // Both IP addresses are equal
        }
    }
}
