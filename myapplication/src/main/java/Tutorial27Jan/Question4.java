package Tutorial27Jan;

public class Question4 {

    public static void main(String[] args) {

        System.out.println( binaryToDecimal("1011")); // 1011
        //execute your function with your own test cases
        String s = "10";
        char c = s.charAt(0);
        System.out.println("character: "+c);
        int d = c -'0'; // as good as 49 - 48
        System.out.println("int value "+d);
    }

    static int binaryToDecimal( String s){
        // initialise total
        for(int i = 0; i < s.length(); i++){
            int powerofTwo = s.length()-1 -i;
            char c = s.charAt(i);
            int d = c - '0'; // 1 or 0
            // calculate d*2^(powerofTwo)
            //add to total
        }
        return 0;
    }
}
