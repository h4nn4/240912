/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week2;

/**
 *
 * @NUR FARHANA FARISHAMUDIN 240912
 *
 */
public class CountThread extends Thread {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        new Thread(new CountThread()).start();
    }

    @Override
    public void run() {
        //To change body of generated methods, choose Tools | Templates.
        try {
            for (int x = 1; x <= 10500; x++) {
                System.out.println(x);
                sleep(5000);
                if (x % 50 == 0) {
                    System.out.println("counting");
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
