/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nbcompetition12.pkg2;
import java.util.*;
/**
 *
 * @author derekyang
 */
public class NBCompetition122 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] fuel = new double[11];
        int min = 100;
        double min2 = 100;
        for (int i = 0; i < 11; i++) {
            fuel[i] = sc.nextDouble();
            if (fuel[i] < min2) {
                min2 = fuel[i];
                min = 10 * (i + 2);
            }
        }
        System.out.println(min); 
        sc.close();   
    }
    
}
