
import week2.CountThread;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @NUR FARHANA FARISHAMUDIN
 * 240912
 * 
 */
public class CountThread123 extends Thread {

    public static void main(String args[]) {
        new Thread(new CountThread123()).start();
    }

    @Override
    public void run() {
        //To change body of generated methods, choose Tools | Templates.
        int x;
        try {
            for (x = 1; x < 11; x++) {
                System.out.print(x);
                System.out.print(" ");
                sleep(1000);
                
                if ((x % 5 == 0) && (x < 10)) {
                    for (int y = 1; y <= 10; y++) {
                        System.out.print("A");
                        System.out.print(" ");
                    }
                }
            }

            System.out.println();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
