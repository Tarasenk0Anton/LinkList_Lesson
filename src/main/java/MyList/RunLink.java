package MyList;

import java.util.LinkedList;

public class RunLink {
    public static void main(String[] args) {
        Linked<Integer> myLink = new Linked();
        myLink.add(1);
        myLink.add(2);
        myLink.add(3);
        myLink.add(5, 1);

        System.out.println(myLink.get(0));
        System.out.println(myLink.indexOf(3));

    }
}
