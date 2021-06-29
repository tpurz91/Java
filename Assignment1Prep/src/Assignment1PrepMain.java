import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Assignment1PrepMain {
    public static void main (String[] args) {
        /*  We've decided to make a console app to hold our addresses.
            Each address will be a HashMap to allow us to have key value pairs to old all of our data which will make
            retrieval easier later on.

            Below all of your address HashMaps are already created.
        */

        HashMap<String, String> address1 = new HashMap<>();
        address1.put("Name", "Dr. John Watson");
        address1.put("Address", "221B Baker St., London, England");
        address1.put("Phone Number", "Don't call me");

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
        address8.put("Mailbox", "No post on Sundays!");

        /* HashMaps are great! They allow us to hold the information we need for each address..... but we have lots of
           addresses. It would be great to put all of those addresses together like in an address book so it's all in
           one place.

           Lucky you! That's been done below by making an ArrayList to hold all our HashMaps.
         */

        ArrayList<HashMap<String, String>> addressBook = new ArrayList<>();
        addressBook.add(address1);
        addressBook.add(address2);
        addressBook.add(address3);
        addressBook.add(address4);
        addressBook.add(address5);
        addressBook.add(address6);
        addressBook.add(address7);
        addressBook.add(address8);

        /*  The first thing we want to do is to be able to print out all of our addresses from our address book at one time.

            1. Create a for-each loop that iterates across the address book and prints each address to the console.
    Hint 1:
            That achieves the goal of printing them out, but it's not very pretty.

            2. Let's make them look nicer by putting each Key Value pair on a separate line, and separate each address with
            some ****

            so it would look like this:

            Address : 221B Baker St., London, England
            Name : Dr. John Watson
            ****
    Hint 2:
            Why is the Address first?
            Because HashMap has no guarantees for the order in the map. If we wanted to maintain the order we added things in
            we could use a LinkedHashMap -  but don't worry, we don't learn about those.
         */

        /* 3. Lets turn this printing ability into a method so we can call it later - This will need to be outside of out main method.
    Hint 3:
        */

    // test part 3 by calling the method here and passing the addressBook as the argument

        /* Let's create a Scanner to accept a search for someone by name in our address book
           4. Create a Scanner instance which accepts user input.
           ask the question to find out who you want to search for.
           capture the users input to use later.
    Hint 4:
        */

    // Write you code here

        /* 5. Next we're going to create an empty ArrayList that can hold HashMaps to hold our found addresses that match our search.
        this is included below.

        Next you're going to have to iterate across the addresses in our addressBook
    Hint 5:
        to see if any of the Values assigned to the "Name" property contain the name that we're looking for
    Hint 6:
        and then add that address to our neededAddress
        */
        ArrayList<HashMap<String, String>> neededAddress = new ArrayList<>();

        /* 6. Call the print addresses method you've created to print out the neededAddress */

        /* If you've created your search correctly, your search for "Dr." will return 3 different addresses. */

    }

    // Put part 3 here.
}
