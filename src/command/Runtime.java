/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package command;

import java.util.Scanner;

/**
 *
 * @author Muzaffar
 */
public class Runtime {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Select a command\n1:New\n2:Cut\n3:Copy\n4:Paste\n5:Undo\n6:Exit\n");

        int selectedOption = -1;
        while (selectedOption != 6) {
            if (sc.hasNextInt()) {
                selectedOption = sc.nextInt();
                switch (selectedOption) {
                    case 1:
                        New n = new New();
                        n.actionPerformed();
                        break;

                    case 2:
                        Cut c = new Cut();
                        c.actionPerformed();
                        break;

                    case 3:
                        Copy cp = new Copy();
                        cp.actionPerformed();
                        break;

                    case 4:
                        Paste ps = new Paste();
                        ps.actionPerformed();
                        break;

                    case 5:
                        Undo un = new Undo();
                        un.actionPerformed();
                        break;

                    case 6:
                        Exit ex = new Exit();
                        ex.actionPerformed();
                        break;
                }
            } else {
                sc.next();
            }
        }
    }
}