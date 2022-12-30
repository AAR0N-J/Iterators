import java.util.Iterator;
import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Vector;
import java.util.Scanner;


/**
 * Write a description of class FunWithIterators here.
 *
 * @author Aaron Johnson
 * @version 1
 */
public class Lab9Driver
{
    public static void main(String [] args)
    {
        System.out.println("\f");

        /*****************  1 Iterator Demo ********************************

        Vector<String> v = new Vector<String>();

        v.add("mon"); v.add("tue"); v.add("wed"); v.add("thur"); v.add("fri"); v.add("sat"); v.add("sun");

        // create an Iterator for v

        // print all items in v converted to upper case

        // notice, however, that you can't go backwards (previous not defined for Iterator)

        // Now create a ListIterator for v and try forward/reverse iteration

        // remove "wed" from v using the remove method for the iterator

        // backup over tue using previous

        // print the next two items

        System.out.println("v = " + v);

        /********************  end *****************************************/
        /********  2 Add Iterator to our own AList class, test here *********

        AList<String> list = new AList<String>();

        list.add("jan"); list.add("feb"); list.add("mar"); list.add("apr"); list.add("may"); list.add("jun");

        Iterator<String> it = list.iterator();

        while (it.hasNext())
            System.out.println( it.next());

        // This is a "for each" loop or "enchanced for loop."
        // It only works on containers (Array, List, Stack, etc) that implement Iterator
        for ( String s : list)
            System.out.println(s.toUpperCase());

        /********************  end *****************************************/
        /********  3 Complete the CharIterator clsss, test here ***********
        StringBuilder test = new StringBuilder("hellooooo wooorld");

        // a) Create a CharIterator and use it in a loop to display all letters
        //       in StringBuilder test

        CharIterator ci = new CharIterator(test);

        // b) make a while loop that displays all characters one at a time using ci.


        //  c) Create a new CharIterator and use it to remove all letter 'o's in the
        //      String test.




        // d) Print test after your operation completes.



        /********************  end *****************************************/
        /********  4 Do the Solitaire Game Program here *******************
        // define the ArrayList to hold the numbers

        ArrayList<Integer> list = new ArrayList<Integer>();

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter a list of 2-digit integers to start with, ending with -1");
        int num = keyboard.nextInt();
        while (num > 0){
            list.add(num);
            num = keyboard.nextInt();
        }

        // print your ArrayList after it is intialized with values
        System.out.println("List = " + list);

        // define the ListIterator to iterate over the ArrayList
        ListIterator<Integer> it;
        it = list.listIterator();
        int val1, val2;       // use these variables to hold the numbers returned by it.next()

        // TO DO: process the list using your ListIterator, according to the instructions
        if (it.hasNext())    // make sure list has at least 1 item
        {
            it.next();  // fix

            // System.out.println("Removing <"+val1+", "+val2+">");  // use to print removals

            // System.out.println("List = " + list);    // use to print list after removals
        }

        System.out.println("Done. Remaining list = " + list);
        System.out.println();

        //********************  end *****************************************/
        /********  5 Extend a SortedAList from the AList class, test here *************
        System.out.println("Testing add() ");
        SortedAList<String> myList = new SortedAList<String>();

        myList.add("45");
        myList.add("15");
        myList.add("25");
        myList.add("35");
        myList.add("55");
        myList.add("95");
        myList.add("85");
        myList.add("65");
        myList.add("75");

        System.out.println("List should contain 15, 25, 35, 45, 55, 65, 75, 85, 95\n");
        System.out.println("myList = " + myList);

        System.out.println("Testing getPosition() ");
        System.out.println("15 is at position " + myList.getPosition("15"));
        System.out.println("55 is at position " + myList.getPosition("55"));
        System.out.println("95 is at position " + myList.getPosition("95"));
        System.out.println("0 s/b at position " + myList.getPosition("0"));
        System.out.println("50 s/b at position " + myList.getPosition("50"));
        System.out.println("90 s/b at position " + myList.getPosition("90"));
        System.out.println("99 s/b at position " + myList.getPosition("996"));

        System.out.println("\nTesting remove() ");
        System.out.println("Removing 15: returns " + myList.remove("15"));
        System.out.println("Removing 55: returns " + myList.remove("55"));
        System.out.println("Removing 95: returns " + myList.remove("95"));
        System.out.println("Removing 0: returns " + myList.remove("0"));
        System.out.println("List should contain 25, 35, 45, 65, 75, 85\n");
        System.out.println("myList = " + myList);

        /********************  end *****************************************/
        //********  Then Solve the PacketReader problem in the PacketReader class *************
        //

        /********************  end *****************************************/
        //********  6 Solve the SearchRange problem. Write a method
        //  that meets the description in the lab9 handout.

        int [] data = {5,8,10,13,15,20,22,26};
        int [] targets = {8, 2, 9, 17};

        int [] data2 = {5,8,10,13,15,20,22,26};
        int [] targets2 = {8, 2, 9, 20};

        int [] data3 = {5,8,10,13,15,20,22,26};
        int [] targets3 = {8, 5, 9, 10, 30};

        int [] data4 = {5,8,10,13,15,20,22,26};
        int [] targets4 = {8, 5, 9, 21};

        //  use  Arrays.binarySearch  to find and print the min and max cell numbers that
        //   contain the range of values stored in target
        SearchRange(data, targets);             // define this method
        SearchRange(data2, targets2);
        SearchRange(data3, targets3);
        SearchRange(data4, targets4);
        /********************  end *****************************************/
        /******** 7 Add an iterator class to the LList class. Test
                               it using the code in step 1 */

    }
}
