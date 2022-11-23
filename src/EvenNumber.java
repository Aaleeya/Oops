public class EvenNumber {
    //Create a method called isEvenNumber that takes a parameter of type int
    //Its purpose is to determine if the argument passed to the method is
    //Even number or not
    //return true if an even number , otherwise return false

    //Modify the while code
    //Make it record the total number of even numbers it has found
    //and break once 5 are found
    //and at the end, display the total number of even numbers found

    public static void main(String[] args){
        int number = 4;
        int finishNumber = 20;
        int count =0;

        while(number <= finishNumber){
            number++;
            if(!isEvenNumber(number)){
                continue;
            }
            System.out.println("Even number "+ number);
            count++;
            if(count ==5){
                break;
            }
        }
        System.out.println("the total number of even numbers are :"+count);
    }
    /**
     * Method Name: isEvenNumber
     * To do: Checks if a number is a even number or not
     * Parameter : int
     * Returns: boolean
     */
    public static boolean isEvenNumber(int num){
        if(num % 2 == 0) {
            return true;
        }
        return false;
    }
}
