import javax.swing.plaf.synth.SynthLookAndFeel;
import java.util.*;

public class Assignment1PrepSolution {

    public static void main(String[] args) {
        HashMap<String, String> address1 = new HashMap<>();
        address1.put("Name", "Dr. John Watson");
        address1.put("Address", "221B Baker St., London, England");

        HashMap<String, String> address2 = new HashMap<>();
        address2.put("Name", "Dr. Emmett Brown");
        address2.put("Address", "1640 Riverside Drive, Hill Valley, CA");

        HashMap<String, String> address3 = new HashMap<>();
        address3.put("Name", "The Simpsons");
        address3.put("Address", "129 Evergreen Terrace, Springfield");

        HashMap<String, String> address4 = new HashMap<>();
        address4.put("Name", "Dr. Leonard Hofstadter");
        address4.put("Address", "2311 North Los Robles Ave. Apt. 4A, Pasadena, CA");

        HashMap<String, String> address5 = new HashMap<>();
        address5.put("Name", "Cousin Larry");
        address5.put("Address", "315 Lincoln Ave., Chicago, IL");

        HashMap<String, String> address6 = new HashMap<>();
        address6.put("Name", "Jerry Seinfield");
        address6.put("Address", "129 W 81st St. Apt. 5A, New York, NY");

        HashMap<String, String> address7 = new HashMap<>();
        address7.put("Name", "Halliwell Sisters");
        address7.put("Address", "1329 Carroll Ave., Los Angeles, CA");

        HashMap<String, String> address8 = new HashMap<>();
        address8.put("Name", "The Dursley Family");
        address8.put("Address", "4 Privet Drive, Little Whinging, Surrey, UK");


        ArrayList<HashMap<String, String>> addressBook = new ArrayList<>();
        addressBook.add(address1);
        addressBook.add(address2);
        addressBook.add(address3);
        addressBook.add(address4);
        addressBook.add(address5);
        addressBook.add(address6);
        addressBook.add(address7);
        addressBook.add(address8);


//        // 1.
//        for (HashMap<String, String> address : addressBook) {
//            // 2.
//            for (Map.Entry<String, String> part : address.entrySet()) {
//                System.out.println(part.getKey() + " : " + part.getValue());
//            }
//            System.out.println("****");
//        }

        // 3. - check method works
//        printAddresses(addressBook);

        // 4.
        Scanner input = new Scanner(System.in);
        System.out.println("Who's address do you want to find?");
        String searchName = input.nextLine();

        ArrayList<HashMap<String, String>> neededAddress = new ArrayList<>();

        // 5.
        for (HashMap<String, String> address : addressBook) {
            String name = address.get("Name");
            if (name.contains(searchName)) {
                neededAddress.add(address);
            }
        }
        // 6.
        printAddresses(neededAddress);

    }
    //3.
    public static void printAddresses(ArrayList<HashMap<String, String>> someAddresses){
        for (HashMap<String, String> address : someAddresses) {
            for (Map.Entry<String, String> part : address.entrySet()) {
                System.out.println(part.getKey() + " : " + part.getValue());
            }
            System.out.println("****");
        }
    }
}

