/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nbcompetition12.pkg3;
import java.util.*;
/**
 *
 * @author derekyang
 */
public class NBCompetition123 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] conesSold = new int[8];
        for (int i = 0; i < conesSold.length; i++) {
            conesSold[i] = sc.nextInt();
        }

        int vanilla = conesSold[0] + (2 * conesSold[1]) + conesSold[6] + conesSold[7];
        int chocolate = conesSold[2] + (2 * conesSold[3]) + conesSold[6];
        int cookieDough = conesSold[4] + (2 * conesSold[5]) + conesSold[7];
        double vanillaSafe = vanilla * 1.05;
        double chocolateSafe = chocolate * 1.05;
        double cookieDoughSafe = cookieDough * 1.05;
        double vanillaMonthly = vanillaSafe * 31;
        double chocolateMonthly = chocolateSafe * 31;
        double cookieDoughMonthly = cookieDoughSafe * 31;
        int vanillaTubs = (int) Math.ceil(vanillaMonthly / 96);
        int chocolateTubs = (int) Math.ceil(chocolateMonthly / 96);
        int cookieDoughTubs = (int) Math.ceil(cookieDoughMonthly / 96);
        System.out.println(vanillaTubs);
        System.out.println(chocolateTubs);
        System.out.println(cookieDoughTubs);

        sc.close();
    }
    
}
