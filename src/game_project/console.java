/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game_project;


public class console {
    public static void main(String[] agrs)
    {   
      
     demo2048 de = new demo2048();
     
     de.addnewcell();
     de.pushBoardToStack(de.board);
     int[][] a  = (int[][]) de.stack_board.peek();
     de.showArr(a);
 
     de.pushBoardToStack(de.board);
     int[][] b = (int[][]) de.stack_board.peek();
     de.showArr(b);
        System.out.println(de.notEqualArray(a, b));
     
    }
}
