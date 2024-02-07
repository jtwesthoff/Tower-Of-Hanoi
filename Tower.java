import java.util.*;
import java.math.*;
class Tower {
    static void towerOfHanoi(int n, char from_rod,
                             char to_rod, char aux_rod)
    {
        if (n == 0) {
            return;
        }
        towerOfHanoi(n - 1, from_rod, aux_rod, to_rod);
        towerOfHanoi(n - 1, aux_rod, to_rod, from_rod);
    }

    // Driver code
    public static void main(String args[])
    {
        System.out.println("How many rings would you like to test?");
        Scanner scanner=new Scanner(System.in);
        int num = 0;
        boolean valid = false;
        while (!valid){
            String in = scanner.nextLine();
            try{
                num = Integer.parseInt(in);
                if(num>=0) {
                    valid = true;
                }else{
                    throw new NumberFormatException();
                }
            }catch(NumberFormatException e){
                System.out.println("Please enter a positive integer");
            }
        }
        int N = num;
        scanner.close();

        // A, B and C are names of rods
        long startNano = System.nanoTime();
        towerOfHanoi(N, 'A', 'C', 'B');
        long endNano = System.nanoTime();
        System.out.println("Time in nano seconds: " + (endNano-startNano));
        System.out.println("Number of moves: " + Math.pow(2,num));
    }
}