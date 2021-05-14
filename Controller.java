package sample;

import javafx.application.Platform;
import javafx.fxml.Initializable;
import javafx.geometry.Pos;
import javafx.scene.control.TextField;
import java.io.*;
import java.net.URL;
import java.util.ResourceBundle;


public class Controller implements Initializable {

    public TextField one;
    public TextField two;
    public TextField three;
    public TextField four;
    public TextField five;
    public TextField six;
    public TextField seven;
    public TextField eight;
    public TextField nine;
    public TextField o;
    public TextField x;
    public TextField d;
    public int i = 0 ;
    public boolean checkResult ;
    public boolean drawCheckResult ;
    public int xWins=0;
    public int oWins=0;
    public int draw=0;
    public boolean oneBox=false,secondBox=false,thirdBox=false,fourthBox=false,fifthBox=false,sixthBox=false,seventhBox=false,eigthBox=false,ninthBox=false;


    /**
     * Here i created nine method(oneClicked,twoClicked,threeClicked,fourClicked,fiveClicked,sixClicked,sevenClicked,eightClicked
     * nineClicked) which will set TextField value to X or O according to i value.
      */

    public void oneClicked(){

        if(!checkResult && !oneBox){

        one.setAlignment(Pos.CENTER);

        if(i%2 == 0){
        one.setText("X");
        }
        else {
            one.setText("O");
        }

            oneBox = true;
            i++;
            drawCheckResult = gameCheckResult();
            draw();
        }
    }

    public void twoClicked() {
        two.setAlignment(Pos.CENTER);

        if(!checkResult && !secondBox) {
            if (i % 2 == 0) {
                two.setText("X");
            } else {
                two.setText("O");
            }

            secondBox = true;
            i++;
            drawCheckResult = gameCheckResult();
            draw();
        }
    }

    public void threeClicked() {

        three.setAlignment(Pos.CENTER);

        if(!checkResult && !thirdBox) {
            if (i % 2 == 0) {
                three.setText("X");
            } else {
                three.setText("O");
            }

            thirdBox = true;
            i++;
            drawCheckResult = gameCheckResult();
            draw();
        }
    }

    public void fourClicked() {
        four.setAlignment(Pos.CENTER);

        if(!checkResult && !fourthBox) {

            if (i % 2 == 0) {
                four.setText("X");
            } else {
                four.setText("O");
            }

            fourthBox = true;
            i++;
            drawCheckResult = gameCheckResult();
            draw();
        }
    }

    public void fiveClicked() {
        five.setAlignment(Pos.CENTER);

        if(!checkResult && !fifthBox) {

            if (i % 2 == 0) {
                five.setText("X");
            } else {
                five.setText("O");
            }

            fifthBox = true;
            i++;
            drawCheckResult = gameCheckResult();
            draw();
        }
    }

    public void sixClicked() {
        six.setAlignment(Pos.CENTER);

        if(!checkResult && !sixthBox) {

            if (i % 2 == 0) {
                six.setText("X");
            } else {
                six.setText("O");
            }

            sixthBox = true;
            i++;
            drawCheckResult = gameCheckResult();
            draw();
        }
    }

    public void sevenClicked() {
        seven.setAlignment(Pos.CENTER);

        if(!checkResult && !seventhBox) {

            if (i % 2 == 0) {
                seven.setText("X");
            } else {
                seven.setText("O");
            }

            seventhBox = true;
            i++;
            drawCheckResult = gameCheckResult();
            draw();
        }
    }

    public void eightClicked() {
        eight.setAlignment(Pos.CENTER);

        if(!checkResult && !eigthBox) {

            if (i % 2 == 0) {
                eight.setText("X");
            } else {
                eight.setText("O");
            }

            eigthBox = true;
            i++;
            drawCheckResult = gameCheckResult();
            draw();
        }
    }

    public void nineClicked() {
        nine.setAlignment(Pos.CENTER);

        if(!checkResult && !ninthBox) {

            if (i % 2 == 0) {
                nine.setText("X");
            } else {
                nine.setText("O");
            }

            ninthBox = true;
            i++;
            drawCheckResult = gameCheckResult();

            draw();

        }
    }

    /**
     * In gameCheckResult() method it will check whether X won or O won.
     * and it will also increment the wins of X and O.
     * @return
     */

    public boolean gameCheckResult(){


        if(
                (one.getText().equals("X") && two.getText().equals("X") && three.getText().equals("X"))||
                (four.getText().equals("X") && five.getText().equals("X") && six.getText().equals("X"))||
                (seven.getText().equals("X") && eight.getText().equals("X") && nine.getText().equals("X"))||
                (one.getText().equals("X") && seven.getText().equals("X") && four.getText().equals("X"))||
                (two.getText().equals("X") && five.getText().equals("X") && eight.getText().equals("X"))||
                (three.getText().equals("X") && six.getText().equals("X") && nine.getText().equals("X"))||
                (one.getText().equals("X") && five.getText().equals("X") && nine.getText().equals("X"))||
                (three.getText().equals("X") && five.getText().equals("X") && seven.getText().equals("X"))
                ){
            xWins++;
            x.setText("X wins : "+xWins);
            clear();
            return true;
        }
        else if(
                        (one.getText().equals("O") && two.getText().equals("O") && three.getText().equals("O"))||
                        (four.getText().equals("O") && five.getText().equals("O") && six.getText().equals("O"))||
                        (seven.getText().equals("O") && eight.getText().equals("O") && nine.getText().equals("O"))||
                        (one.getText().equals("O") && seven.getText().equals("O") && four.getText().equals("O"))||
                        (two.getText().equals("O") && five.getText().equals("O") && eight.getText().equals("O"))||
                        (three.getText().equals("O") && six.getText().equals("O") && nine.getText().equals("O"))||
                        (one.getText().equals("O") && five.getText().equals("O") && nine.getText().equals("O"))||
                        (three.getText().equals("O") && five.getText().equals("O") && seven.getText().equals("O"))
        ){
            oWins++;
            o.setText("O wins :"+oWins);
            clear();
            return true;
        }
        else {
            return false;
        }
    }

    /**
     * The reset() method is used to reset the xWins, oWins and draw count to 0
     */

    public void reset() {

        xWins = 0;
        oWins = 0;
        draw = 0;
        x.setText("X win : "+xWins);
        o.setText("O wins :"+oWins);
        d.setText("Draws : "+draw);

    }

    /**
     * In draw method it will check whether the game is drawn or not and it will also increment the count of draw.
     */

    public void draw(){
        if(!drawCheckResult && i==9){
            draw++;
            d.setText("Draws : "+draw);
            clear();
        }

    }


    /**
     * In clear method it will clear all the TextFields values .
     */

    public void clear(){
        i=0;
        one.clear();
        two.clear();
        three.clear();
        four.clear();
        five.clear();
        six.clear();
        seven.clear();
        eight.clear();
        nine.clear();
        oneBox=false;
        secondBox=false;
        thirdBox=false;
        fourthBox=false;
        fifthBox=false;
        sixthBox=false;
        seventhBox=false;
        eigthBox=false;
        ninthBox=false;
        checkResult = false;

    }



    public void readData() throws FileNotFoundException {

        String filePath = "records.txt";

        try {
            BufferedReader br = new BufferedReader(new FileReader(filePath ));
            String line = br.readLine();

            xWins = Integer.parseInt(String.valueOf(line.charAt(0)));
            oWins = Integer.parseInt(String.valueOf(line.charAt(2)));
            draw = Integer.parseInt(String.valueOf(line.charAt(4)));

        } catch (Exception e) {
        }

        try {
            x.setText("X win : " + xWins);
            o.setText("O wins :" + oWins);
            d.setText("Draws : " + draw);
        }catch (Exception e){}

    }

    /**
     * In saveData method it will get the count of number of X wins , O wins and draw .
     * Than it will store data in records.txt file .
     */

    private void saveData() {

        String filePath = "records.txt";
        try {
            FileWriter fw = new FileWriter(filePath);

            fw.write(xWins+","+oWins+","+draw+ "\nX,O,Draws");
            fw.close();
        } catch (Exception e) {
        }

    }

    /**
     * In quit method it will close the scene.
     */
    public void quit() {

        Platform.exit();
        saveData();

    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        try {
            readData();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
