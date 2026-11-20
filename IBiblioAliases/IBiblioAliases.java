import java.net.*;

public class IBiblioAliases {
    public static void main(String[] args) {
        try {
            InetAddress ibiblio =
                InetAddress.getByName("www.ibiblio.org");

            InetAddress helios =
                InetAddress.getByName("www.ibiblio.org");

            if (ibiblio.equals(helios)) {
                System.out.println("Both addresses are the same");
            } else {
                System.out.println("Addresses are different");
            }

        } catch (UnknownHostException ex) {
            System.out.println("Host lookup failed.");
        }
    }
}