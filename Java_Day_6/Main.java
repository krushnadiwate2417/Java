//Strings


public class Main
{
    public static void main(String[] args)
    {
        String name = "Krushna";  //String is by default IMMUTABLE
        System.out.println(name);

        //StringBuffer and StringBuilder - to create MUTABLE string.
        //StrignBuffer is thread safe &&&&& StringBuilder is not thread safe.

        StringBuffer s1 = new StringBuffer("John");
        StringBuilder s2 = new StringBuilder("Mark");
        System.out.println(s1 + "   " + s2);

        //String Methods

        // 1. charAt(index)
        System.out.println(name.charAt(2));

        // 2. compareTo(string) - compares two strings lexicographically, returns 0 if both are safe, returns <0 if string1 is not greater than string2 , returns >0 if string1 is greater than string2
        System.out.println(name.compareTo("Diwate"));
        System.out.println(name.compareToIgnoreCase("Diwate")); //Ignores Case Difference

        // 3. concat()
        System.out.println(name.concat(" Diwate"));

        // 4. contains(seq of chars)- returns true if present else false
        System.out.println(name.contains("ru"));

        // 5. copyValueOf(char[] array) - Returns a String that represents the characters of the character array
        char[] arr = {'D','I','W'};
        System.out.println(name.copyValueOf(arr, 0, 2));

        // 6. equals(String) - Compares two Strings, returns true if equal, else false.
        System.out.println(name.equals("Krushna"));
        System.out.println(name.equalsIgnoreCase("krushna"));

        // 7. format(str, what to add) - Returns a formatted String
        String str1 = "Hello %s, in %d ";
        String formattedStr = String.format(str1, name, 2025);
        System.out.println(formattedStr);

    }
}