/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nbcompetition12;
import java.util.*;
/**
 *
 * @author derekyang
 */
public class NBCompetition12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] weight = new double[3];
            for(int i = 0; i < 3; i++) {
                System.out.println("What is the weight of the boxer?");
                weight[i] = sc.nextDouble();
            }
            for(int i = 0; i < 3; i++) {
                weight[i] = weight[i]/2.2;
                if (weight[i] <= 52) {
                    System.out.println("FLY WEIGHT");
                } else if (52 < weight[i] && weight[i] <= 60) {
                    System.out.println("LIGHT WEIGHT");
                } else if (60 < weight[i] && weight[i] <= 75) {
                    System.out.println("MIDDLE WEIGHT");
                } else if (75 < weight[i] && weight[i] <= 91) {
                    System.out.println("HEAVY WEIGHT");
                } else {
                    System.out.println("SUPER HEAVYWEIGHT");
                }
            }
            sc.close();
    }
    
}
