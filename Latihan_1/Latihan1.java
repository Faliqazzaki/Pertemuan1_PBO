import java.util.Scanner; // Declaration Library of scanner for input user
import java.util.InputMismatchException;

public class Latihan1 {
    public static void main(String[] args) {
        // INFORMATION ABOUT DATA TYPE 
        // System.out.println("Besar MIN Byte : " + Byte.MIN_VALUE);
        // System.out.println("Besar MIN Short : " + Short.MIN_VALUE);
        // System.out.println("Besar MIN Integer : " + Integer.MIN_VALUE);
        // System.out.println("Besar MIN Long : " + Long.MIN_VALUE);

        // System.out.println("Besar MAX Byte : " + Byte.MAX_VALUE);
        // System.out.println("Besar MAX Short : " + Short.MAX_VALUE);
        // System.out.println("Besar MAX Integer : " + Integer.MAX_VALUE);
        // System.out.println("Besar MAX Long : " + Long.MAX_VALUE);


        // variable declaration and initialitation
        Scanner input = new Scanner(System.in); 
        // ArrayList<Long> numberArray = new ArrayList<>();

        // begin
        Long[] n = new Long[6];
        for(int i = 0; i < 6; i++){
            try{
                n[i] = input.nextLong();
                    if(n[i] >= Byte.MIN_VALUE && n[i] <= Byte.MAX_VALUE){
                        System.out.println("* Byte");
                    }

                    if(n[i] >= Short.MIN_VALUE && n[i] <= Short.MAX_VALUE){
                        System.out.println("* Short");
                    }

                    if(n[i] >= Integer.MIN_VALUE && n[i] <= Integer.MAX_VALUE){
                        System.out.println("* Integer");
                    }

                    if(n[i] >= Long.MIN_VALUE && n[i] <= Long.MAX_VALUE){
                        System.out.println("* Long");
                    }
            }catch (InputMismatchException e){
                System.out.println("N cant be fitted anywhere");
                input.next();
            }
            } 
            input.close();
        }   
    }
