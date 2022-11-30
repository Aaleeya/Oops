public class PrintStars {
    public static void main(String[] args){
        for(int i=0 ; i<6; i++){ //for row
            for(int j=0; j<i;j++) { //for column
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
