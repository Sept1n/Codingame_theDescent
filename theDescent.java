import java.util.*;
import java.io.*;
import java.math.*;

/**
 * The while loop represents the game.
 * Each iteration represents a turn of the game
 * where you are given inputs (the heights of the mountains)
 * and where you have to print an output (the index of the mountain to fire on)
 * The inputs you are given are automatically updated according to your last actions.
 **/
class Player {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);



        // game loop
        while (true) {
            int max = 0, imax = 0;
            for (int i = 0; i < 8; i++) {
                int mountainH = in.nextInt();
                if(max < mountainH){
                    max = mountainH;
                    imax = i;
                }
            }
            System.out.println(imax);
        }
    }
}