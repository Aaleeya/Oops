public class Main {
    //Create a for statement using any range of numbers
    //Determine if the number is a prime number using isPrime method
    //if it is a prime number, print it out and increment a count of the
    //number of prime numbers found
    //if that count is 3 exit the for loop
    //hint: Use the break; statement to exit
    public static void main(String[] args) {
        int count =0;
        for(int i=1; i <= 50; i++){
            if(isPrime(i)){
                System.out.println("the prime number is:" +i);
                count++;
                if(count == 3){
                    break;
                }
            }
        }
    }
    /**
     * Method Name: isPrime
     * To do: Checks if a number is a prime number or not
     * Parameter : int
     * Returns: boolean
     */
    public static boolean isPrime(int n){
        if(n==1){
            return false;
        }
        for(int i=2; i <= (long) Math.sqrt(n); i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }
}