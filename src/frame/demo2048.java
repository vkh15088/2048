/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game_project;

import java.util.Random;
import java.util.Stack;

public class demo2048 {

    private int MAXCELL;
    private int hightscore;
    public int currentscore;
    private int x;
    private int y;
    public String str = "";
    private int numOfTurn;
    public Stack stack_arr = new Stack();
    public Stack stack_board = new Stack();
    public Stack stack_score = new Stack();
    public int[][] board = new int[16][16];
    public int numberEleOfStack = -1;

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
    Random random = new Random();

    public void setboard(int[][] bo) {//sét giá trị board
        this.board = bo;
    }

    public int[][] getboard() {// lấy trị giá trong board
        return board;
    }

    public int getHightscore() {
        return hightscore;
    }

    public void setHightscore(int hightscore) {
        this.hightscore = hightscore;
    }

    public int getCurrentscore() {// lấy điểm hiện tại
        return currentscore;
    }

    public void setCurrentscore(int currentscore) {
        this.currentscore = currentscore;
    }//end method


    public void addnewcell() {

        int value = (random.nextInt(10) < 9 ? 2 : 4);
        boolean findcell = false;
        int k = 1;
        while (!findcell && k < 1000) {

            {
                int x = random.nextInt(MAXCELL);
                int y = random.nextInt(MAXCELL);
                if (board[x][y] == 0) {
                    board[x][y] = value;

                    findcell = true;
                    //display();
                }
                k++;

            }

            //else  System.err.println("cant add");
        }

    } //end method
    private boolean key = true;

    void swap(int i1, int j1, int i2, int j2, boolean key) {
        if (key) {
            int temp = board[i1][j1];
            board[i1][j1] = board[i2][j2];
            board[i2][j2] = temp;
        } else {

            board[i1][j1] *= 2;
            currentscore += board[i1][j1];

            board[i2][j2] = 0;
        }
       // key = true;
    } // end

    public void moveleft() {

        for (int i = 0; i < MAXCELL; i++) {

            boolean case1 = false;
            int jj = 0;
            boolean zero = false;
            for (int j = 0; j < MAXCELL - 1; j++) {
                if (board[i][jj] == 0) // 0 
                {
                    if (board[i][jj] != board[i][j + 1]) // 0 x
                    {
                        {
                            key = true;
                            swap(i, jj, i, j + 1, key);
                            zero = true;
                        }
                    } else // 0 0 
                    {
                        zero = true;
                    }
                } else {
                    if (board[i][jj] == board[i][j + 1]) {
                        {
                            board[i][jj] *= 2;
                            currentscore += board[i][jj];

                            board[i][j + 1] = 0;
                            jj++;
                            zero = true;
                        }
                    } else {
                        if (zero && board[i][j + 1] != 0) {
                            key = true;
                            swap(i, jj + 1, i, j + 1, key);
                            jj++;
                        }
                        if (board[i][j + 1] != 0) {
                            jj++;
                        } else {
                            zero = true;
                        }
                    }
                }
            }

        }
    }

    public void moveright() {
        for (int i = 0; i < MAXCELL; i++) {

            boolean case1 = false;
            int jj = MAXCELL - 1;
            boolean zero = false;
            for (int j = MAXCELL - 1; j > 0; j--) { // 
                if (board[i][jj] == 0) // 0 
                {
                    if (board[i][jj] != board[i][j - 1]) //phan tu dau tien qua phai
                    {
                        {
                            key = true;
                            swap(i, jj, i, j - 1, key); //
                            zero = true;
                        }
                    } else // 0 0 
                    {
                        zero = true;
                    }
                } else {
                    if (board[i][jj] == board[i][j - 1]) //nang cap
                    {
                        {
                            board[i][jj] *= 2;
                            currentscore += board[i][jj];

                            board[i][j - 1] = 0; //
                            jj--; //
                            zero = true;
                        }
                    } else {
                        if (zero && board[i][j - 1] != 0) {  //dich chuyen cac so con lai qua phai
                            key = true;
                            swap(i, jj - 1, i, j - 1, key); //
                            jj--; //
                        }
                        if (board[i][j - 1] != 0) // 2 so giong nhau o giua
                        {
                            jj--; //
                        } else {
                            zero = true;
                        }
                    }
                }
            }

        }
    }

    public void moveup() {
        for (int j = 0; j < MAXCELL; j++) {

            boolean case1 = false;
            int ii = 0;
            boolean zero = false;
            for (int i = 0; i < MAXCELL - 1; i++) {
                if (board[ii][j] == 0) // O do la 0 
                {
                    if (board[ii][j] != board[i + 1][j]) // 0 x
                    {
                        {
                            key = true;
                            swap(ii, j, i + 1, j, key);
                            zero = true;
                        }
                    } else // 0 0 
                    {
                        zero = true;
                    }
                } else {
                    if (board[ii][j] == board[i + 1][j]) {//Gop lai neu 2 o do giong nhau
                        {
                            board[ii][j] *= 2;
                            currentscore += board[ii][j];

                            board[i + 1][j] = 0;
                            ii++;
                            zero = true;
                        }
                        swap(ii + 1, j, i + 1, j, key);
                    } else {
                        if (zero && board[i + 1][j] != 0) {

                            key = true;
                            swap(ii + 1, j, i + 1, j, key);
                            ii++;

                        }
                        if (board[i + 1][j] != 0) {
                            ii++;
                        } else {
                            zero = true;
                        }
                    }
                }
            }

        }
    }

    public void movedown() {

        for (int j = 0; j < MAXCELL; j++) {

            boolean case1 = false;
            int ii = MAXCELL - 1;
            boolean zero = false;
            for (int i = MAXCELL - 1; i > 0; i--) {
                if (board[ii][j] == 0) // 0 
                {
                    if (board[ii][j] != board[i - 1][j]) // 0 x
                    {
                        {
                            key = true;
                            swap(ii, j, i - 1, j, key); //
                            zero = true;
                        }
                    } else // 0 0 
                    {
                        zero = true;
                    }
                } else {
                    if (board[ii][j] == board[i - 1][j]) //
                    {
                        {
                            board[ii][j] *= 2;
                            currentscore += board[ii][j];

                            board[i - 1][j] = 0; //
                            ii--;//
                            zero = true;
                        }
                    } else {
                        if (zero && board[i - 1][j] != 0) //
                        {
                            key = true;
                            swap(ii - 1, j, i - 1, j, key); //
                            ii--; //
                        }
                        if (board[i - 1][j] != 0) //
                        {
                            ii--; //
                        } else {
                            zero = true;
                        }
                    }
                }
            }

        }

    }
  
  

    public boolean canmove() {	//boolean check = true ;
        for (int x = 0; x < MAXCELL; x++) {
            for (int y = 0; y < MAXCELL; y++) {

                if (x + 1 < MAXCELL && board[x][y] == board[x + 1][y]) {
                    return true;
                } else if (x - 1 >= 0 && board[x][y] == board[x - 1][y]) {
                    return true;
                } else if (y + 1 < MAXCELL && board[x][y] == board[x][y + 1]) {
                    return true;
                } else if (y - 1 >= 0 && board[x][y] == board[x][y - 1]) {
                    return true;
                }
                //check = false ;
            }
        }
        return false;
    }

    public boolean full() // check full board 
    {
        //boolean check = true ;
        for (int x = 0; x < MAXCELL; x++) {
            for (int y = 0; y < MAXCELL; y++) {
                if (board[x][y] == 0) {
                    return false;
                }
                //else check = false;
            }
        }
        //return check;
        return true;
    }

    public boolean gameover() // check game over 
    {
        if (!canmove() && full()) {
            return true;
        }
        return false;
    }

    public int getValue(int x, int y) {
        return board[x][y];
    }

  

    public void push_score(int score) {
        stack_score.push(score);
    }

    public int pop_score() {
        return (int) stack_score.pop();
        //System.out.println(a);
    }

  

    public boolean notEqualArray(int[][] a, int[][] b) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if (a[i][j] != b[i][j]) {
                    return true;
                }
            }
        }
        return false;
    }

    public void showArr(int[][] a) {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(a[i][j] + "  ");
            }
            System.out.println("");
        }
        System.out.println("");
    }

    int[][] copy2DIntArray(int[][] source) {
        final int n = source.length;
        final int[][] copy = new int[n][];
        for (int i = 0; i < n; i++) {
            copy[i] = source[i].clone();
        }
        return copy;
    }

    public void pushBoardToStack(int[][] a) {
        // stack_score.push(currentscore);
        stack_board.push(copy2DIntArray(a));
        numberEleOfStack++;
        System.out.println(stack_board.size());

    }

    public void undo() {
        if (numberEleOfStack > 0) {// so stack 
            stack_board.pop();//remove so cuoi cung trong stack 
            // stack_score.pop();

            setboard((int[][]) stack_board.peek());//copy giá trị của class(chỉ xem)
            System.out.println(stack_board.size());// các bước undo của game
            numberEleOfStack--;
            //  setCurrentscore((int) stack_score.peek());
        }
    }

    public boolean notchaged() {

        if (numberEleOfStack > 0) {
            int[][] a = copy2DIntArray((int[][]) stack_board.pop());

            int[][] b = copy2DIntArray((int[][]) stack_board.peek());
            if (!notEqualArray(a, b)) {
                numberEleOfStack--;
                return true;

            } else {
                stack_board.push(copy2DIntArray(a));
            }
        }

        return false;
    }

    
}
