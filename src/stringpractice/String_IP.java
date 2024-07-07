package stringpractice;

public class String_IP {
	public static void main(String[] args) {
		String ip="192.168.0.1";
		String[] ip_array=ip.split("\\.");
		for(String ip_v:ip_array) {
			System.out.println(ip_v);
		}
	}
}
