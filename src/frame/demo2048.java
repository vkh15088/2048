/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frame;


import java.util.Random;


public class demo2048 {

    private int MAXCELL;
    private int hightscore;
    public int currentscore;
    private int x;
    private int y;
    public String str = "";
    private int numOfTurn;
    
    public int[][] board = new int[16][16];
    
    Random random = new Random();

    public demo2048() // default contrutor. size 4x4
    {
        numOfTurn = 0;
        MAXCELL = 4;
        this.x = x;
        this.y = y;
        this.hightscore = hightscore;
        this.currentscore = currentscore;

        this.board = board;
    }

    public void setdefaultvalue() {
        for (x = 0; x < MAXCELL; x++) {
            for (y = 0; y < MAXCELL; y++) {
                board[x][y] = 0;
            }
        }
    }

    public demo2048(int Max) // contructor size Max*Max
    {
        MAXCELL = Max;
        this.x = x;
        this.y = y;
        this.hightscore = hightscore;
        this.currentscore = currentscore;
        for (x = 0; x < MAXCELL; x++) {
            for (y = 0; y < MAXCELL; y++) {
                board[x][y] = 0;
            }
        }

    }
    

    public void setboard(int[][] bo) {
        this.board = bo;
    }

    public int[][] getboard() {
        return board;
    }

    public int getHightscore() {
        return hightscore;
    }

    public void setHightscore(int hightscore) {
        this.hightscore = hightscore;
    }

    public int getCurrentscore() {
        return currentscore;
    }

    public void setCurrentscore(int currentscore) {
        this.currentscore = currentscore;
    }

   

    public void addnewcell() {
    }
    

    void swap(int i1, int j1, int i2, int j2) {
    } 

    public void moveleft() {
    }

    public void moveright() {
    }

    public void moveup() {
    }

    public void movedown() {
    }
    
    boolean vertical = true;
    boolean left = true;
    boolean up = true;

    public boolean checkmove(boolean vertical, boolean left, boolean up) {
        return true;
    } 

    public boolean canmove() {	//boolean check = true ;
        return false;
    }

    public boolean full() // check full board 
    {
        return true;
    }

    public boolean gameover() // check game over 
    {
        return false;
    }

    public boolean checkwin() {
        return false;

    } // end of method checkwin

    public void push_score(int score) {
        
    }

    public int pop_score() {
        return 1;
        
    }

    public boolean checkscore() {
        return false;
    }

    public boolean notEqualArray(int[][] a, int[][] b) {
        return false;
    }

    public void showArr(int[][] a) {
        
    }

    public void undo() {
    }

    public boolean notchaged() {
        return false;
    }

    public boolean checkleft() {
        return false;
    }
    public boolean checkright() {
        return false;
    }

    public boolean checkup() {
        return false;
    }

    public boolean checkdown() {
        return false;
    }
}

