public class PrintStars {
    public static void main(String[] args){

        //pyramid
        /*for(int i=0 ; i<5; i++){ //for row
            for(int j=0; j<i;j++) { //for column
                System.out.print("*");
            }
            System.out.println(" ");
        }*/

        //inverted pyramid
        for(int i=0 ; i<5; i++){ //for row
            for(int j=5; j>i;j--) { //for column
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
