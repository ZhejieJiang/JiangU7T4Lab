import java.util.*;
public class FiveLetter {
    public static void main(String[]arg)
    {
        ArrayList<String> names = new ArrayList<String>();
        names.add("Jesse");
        names.add("Bart");
        names.add("David");
        names.add("Abigail");
        names.add("Frank");
        names.add("Steph");
        names.add("Thomas");
        names.add("Jimmy");
        names.add("Joe");
        names.add("Klein");
        names.add("Daisy");

        System.out.println("BEFORE: " + names);

        for(int i = 0; i<names.size();i++)
        {
            if(names.get(i).length() == 5){
                names.remove(i);
                i--;
            }
        }
        System.out.println("AFTER: " + names);
    }
}
