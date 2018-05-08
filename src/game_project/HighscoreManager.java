package game_project;

import java.util.*;
import java.io.*;

public class HighscoreManager {
    
    private ArrayList<Score> scores;

    private static final String HIGHSCORE_FILE = "scores.dat";// tao note luu du lieu

    //Initialising an in and outputStream for working with the file
    ObjectOutputStream outputStream = null;
    ObjectInputStream inputStream = null;
    ObjectOutputStream  removeStream= null;

    public HighscoreManager() {
        
        scores = new ArrayList<Score>();
    }
    public ArrayList<Score> getScores() {
        loadScoreFile();
        sort();
        return scores;
    }
    private void sort() {
        ScoreComparator comparator = new ScoreComparator();// so sanh
        Collections.sort(scores, comparator);
}
    public void addScore(String name, int score) {// add new score
        loadScoreFile();
        scores.add(new Score(name, score));
        updateScoreFile();
    }
    public void loadScoreFile(){ // read diem
        try {
            inputStream = new ObjectInputStream(new FileInputStream(HIGHSCORE_FILE));//Tạo đối tượng luồng và liên kết nguồn dữ liệu
            scores = (ArrayList<Score>) inputStream.readObject();// doc (read) diem ngươi cho.doc tung kieu cua diem 
        } catch (FileNotFoundException e) {//Hiển thị nội dung đọc từ file
            
            System.out.println("[Load] FNF Error: " + e.getMessage());// kiem tra loi
        } catch (IOException e) {
            System.out.println("[Load] IO Error: " + e.getMessage());
        } catch (ClassNotFoundException e) {
            System.out.println("[Load] CNF Error: " + e.getMessage());// kiem tra ko thay class
        } finally {
            try {
                if (outputStream != null) {//dong du lieu
                    outputStream.flush();
                    outputStream.close();
                }
            } catch (IOException e) {
                System.out.println("[Load] IO Error: " + e.getMessage());
            }
        }
}
    public void updateScoreFile() {// write diem
        try {
            outputStream = new ObjectOutputStream(new FileOutputStream(HIGHSCORE_FILE));//Tạo đối tượng luồng và liên kết nguồn dữ liệu
            outputStream.writeObject(scores);// write diem ngươi choi ra note
        } catch (FileNotFoundException e) {//Hiển thị nội dung đọc từ file
            System.out.println("[Update] FNF Error: " + e.getMessage() + ",the program will try and make a new file");
        } catch (IOException e) {
            System.out.println("[Update] IO Error: " + e.getMessage());
        } finally {
            try {
                if (outputStream != null) {// dong du lieu
                    outputStream.flush();
                    outputStream.close();
                }
            } catch (IOException e) {
                System.out.println("[Update] Error: " + e.getMessage());
            }
        }
}

public String getHighscoreString() {
        String highscoreString = "";
	final int max = 10;// thang diem hien ra la 10 nguoi cho ico diem cao nhat

        ArrayList<Score> scores;
        scores = getScores();

        int i = 0;// thu tu sap xep diem tu thap den cao + name
        int x = scores.size();
        if (x > max) {
            x = max;
        }
        while (i < x) {
            highscoreString += (i + 1) + ".\t" + scores.get(i).getNaam() + "       " + scores.get(i).getScore() + "\n";
            i++;
        }
        return highscoreString;
}
public int getHighScore()
{
 //       ArrayList<Score> scores;
        scores = getScores();
        return scores.get(0).getScore();
}
}