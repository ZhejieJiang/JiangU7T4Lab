import java.util.*;
public class Main
{
    public static void main(String[]arg)
    {
// YOU NEED TO import java.util.Arrays

    ArrayList<String> stringList = new ArrayList<String>(Arrays.asList("this", "list", "contains", "several", "words"));
        boolean contains = ArrayListAlgorithms.containsTarget(stringList, "is");
        System.out.println(contains);
        contains =ArrayListAlgorithms.containsTarget(stringList,"v");
        System.out.println(contains);
        contains =ArrayListAlgorithms.containsTarget(stringList,"words");
        System.out.println(contains);
        contains =ArrayListAlgorithms.containsTarget(stringList,"ia");
        System.out.println(contains);
    }
}
