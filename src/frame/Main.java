/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frame;

/**
 *
 * @author Dean Winchester
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Menu menu1 = new Menu();
       menu1.setVisible(true);
       menu1.requestFocus();
       menu1.toFront();
    }
    
}
