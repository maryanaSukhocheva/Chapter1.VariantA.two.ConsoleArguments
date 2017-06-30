/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SLAVA
 */
public class ConsoleArguments {
       /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int i = args.length-1;
        while(i>=0) {
            System.out.println("Aргумент-> " + args[i]);
            i--;
          }
       }
}
