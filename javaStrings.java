class javaStrings {

    public static void main(String[] args) {

        String str1 = "Hello";
        String str2 = "World";
        String greet = "Good Evening..!";

        System.out.println(str1.toLowerCase());
        System.out.println(str1.toUpperCase());
        System.out.println(str1.concat(str2));
        System.out.println(str1 + " " + str2);
        System.out.println(str1 + " " + str2 + " " + greet);
        System.out.println(str1.concat(" " + str2).concat(" " + greet));

        if (str1 == "Hello World")
            System.out.println(" String Matched..");
        else
            System.out.println("String unMatched..");

        if (str1.equals("Hello"))
            System.out.println(" String Matched..");
        else
            System.out.println("String unMatched..");

        if (str1.equals(str2))
            System.out.println(" String Matched..");
        else
            System.out.println("String unMatched..");
    }
}
/*
 * String Methods: 1)toLowerCase() 
 * 2)toUpperCase()
 *  3)concate() [we can also
 * concatwe 2 or more string and we can also do it without concate() method i.e
 * by using + operator as shown above]
 * 4) equals() [we can use this to compare to strings or to objects and it is better to use equals() instead of == because sometimes == only comapre dataTypes .]
 */