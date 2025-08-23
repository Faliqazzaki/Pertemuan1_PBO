import java.util.Scanner;

public class StringsCode {
    public static void main(String[] args) {
        // Declaration variabel
        Scanner input = new Scanner(System.in);
        int Count = 0;
        int position = 0;
        System.out.println("Input : ");
        String[] MyString = new String[2];
        
        // Input String and Count the char of string
        for(int i = 0; i < 2; i++){
           MyString[i] = input.next();
           Count = Count + MyString[i].length();
        }

        // check the lexicograph and output
        System.out.println("\nOutput : ");
            if(MyString[position].compareTo(MyString[position + 1]) > 0){
                System.out.println("Yes");
            }else if((MyString[position].compareTo(MyString[position + 1]) < 0)){
                System.out.println("No");
            }

        // Print Count output
        System.out.println("Char total : " + Count) ;

        // String upCase = MyString.toUpperCase();
        // System.out.println(upCase);
        input.close();
    }
}