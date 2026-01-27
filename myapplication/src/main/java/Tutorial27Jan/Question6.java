package Tutorial27Jan;

public class Question6 {

    public static int main(int month; bool isLeapYear){
        int febPlus = 0;
        if (isLeapYear){
            febPlus = 1;
        };

        var result = switch (month){
            case 1, 3, 5, 7, 8, 10, 12 -> 31;
            case 4, 6, 9, 11 -> 30;
            case 2 -> 28 + febPlus;
            default -> -1;
        };

        return result;
    }
