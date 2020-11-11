package adapter;

import java.util.Scanner;

/**
 *
 * @author Muzaffar
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Song with Extension : ");
        String sring = scan.nextLine();
        MediaPlayer ap = new AudioPlayer();
        ap.play(sring);

    }

}
