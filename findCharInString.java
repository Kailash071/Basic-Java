import java.util.Scanner;

class findCharInString {

    public void charOccurs(String str, char ch) {

        int count = 0, flag = 0;
        int position[] = new int[10];

        for (int i = 0; i<str.length() ; i++) {
            if (str.charAt(i) == ch) {
            
                position[count] = i;
                count++;
                flag = 1;
            
            }
            else{
                System.out.println("Not Found at " +i);
            }
        }

        if (flag == 1) {
            System.out.println("found " + count + " times");
            for (int i = 0; i < position.length; i++) {

                System.out.println("found at " + position[i]);
            }
        } else {
            System.out.println("Not Found");
        }
    }

    public static void main(String[] args) {

        findCharInString main = new findCharInString();
        Scanner scn = new Scanner(System.in);

        String str;
        char ch;

        System.out.println("Enter String: ");
        str = scn.nextLine();
        System.out.println("Enter Character to Find: ");
        ch = scn.nextLine().charAt(0);

        main.charOccurs(str, ch);
    }
}