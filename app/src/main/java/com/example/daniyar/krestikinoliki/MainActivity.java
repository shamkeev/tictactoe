package com.example.daniyar.krestikinoliki;

import android.os.TestLooperManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button button00;
    Button button10;
    Button button20;
    Button button01;
    Button button11;
    Button button21;
    Button button02;
    Button button12;
    Button button22;
    Button buttonRestart;
    TextView infoTextView;
    XoController xoController;
    XoModel xoModel;
    //private static final int PLAYER_X = 1;
    //private static final int PLAYER_O = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button00 = findViewById(R.id.button00);
        button10 = findViewById(R.id.button10);
        button20 = findViewById(R.id.button20);
        button01 = findViewById(R.id.button01);
        button11 = findViewById(R.id.button11);
        button21 = findViewById(R.id.button21);
        button02 = findViewById(R.id.button02);
        button12 = findViewById(R.id.button12);
        button22 = findViewById(R.id.button22);
        buttonRestart = findViewById(R.id.button_restart);
        infoTextView = findViewById(R.id.info_text_view);

        xoModel = new XoModel();
        xoController = new XoController(xoModel);
        infoTextView.setText("Player 1, please make your move");

        button00.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                /*if(!xoModel.hasWinner()){
                    if(xoModel.getPlayer() == XoModel.PLAYER_X){
                        button00.setText("X");
                        infoTextView.setText("It's now PLayer 2 turn");
                    }else{
                        button00.setText("O");
                        infoTextView.setText("It's now Player 1 turn");
                    }
                    xoController.playerMove(0, 0);
                }else{
                    infoTextView.setText(xoModel.getWinner() + " is a winner!");
                }*/
                xoModel.playerMove(0, 0);
                if(xoModel.getPlayer() == XoModel.PLAYER_X){
                    button00.setText("X");
                    if(xoModel.hasWinner()) {
                        infoTextView.setText("Player 1 is a winner");
                        disableAllButtons();
                    }
                    else {
                        infoTextView.setText("It's now PLayer 2 turn");
                        xoModel.changePlayer();
                    }
                }else{
                    button00.setText("O");
                    if(xoModel.hasWinner()) {
                        infoTextView.setText("Player 2 is a winner");
                        disableAllButtons();
                    }
                    else {
                        infoTextView.setText("It's now Player 1 turn");
                        xoModel.changePlayer();
                    }
                }

                if(xoModel.isDraw()){
                    infoTextView.setText("It's a draw! Please restart");
                }
                button00.setClickable(false);
            }
        });

        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                /*if(!xoModel.hasWinner()){
                    if(xoModel.getPlayer() == XoModel.PLAYER_X){
                        button10.setText("X");
                        infoTextView.setText("It's now PLayer 2 turn");
                    }else{
                        button10.setText("O");
                        infoTextView.setText("It's now Player 1 turn");
                    }
                    xoController.playerMove(1, 0);
                }else{
                    infoTextView.setText(xoModel.getWinner() + " is a winner!");
                }*/
                xoModel.playerMove(1, 0);
                if(xoModel.getPlayer() == XoModel.PLAYER_X){
                    button10.setText("X");
                    if(xoModel.hasWinner()) {
                        infoTextView.setText("Player 1 is a winner");
                        disableAllButtons();
                    }
                    else {
                        infoTextView.setText("It's now PLayer 2 turn");
                        xoModel.changePlayer();
                    }
                }else{
                    button10.setText("O");
                    if(xoModel.hasWinner()) {
                        infoTextView.setText("Player 2 is a winner");
                        disableAllButtons();
                    }
                    else {
                        infoTextView.setText("It's now Player 1 turn");
                        xoModel.changePlayer();
                    }
                }
                if(xoModel.isDraw()){
                    infoTextView.setText("It's a draw! Please restart");
                }
                button10.setClickable(false);
            }
        });

        button20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                /*if(!xoModel.hasWinner()){
                    if(xoModel.getPlayer() == XoModel.PLAYER_X){
                        button20.setText("X");
                        infoTextView.setText("It's now PLayer 2 turn");
                    }else{
                        button20.setText("O");
                        infoTextView.setText("It's now Player 1 turn");
                    }
                    xoController.playerMove(2, 0);
                }else{
                    infoTextView.setText(xoModel.getWinner() + " is a winner!");
                }*/
                xoModel.playerMove(2, 0);
                if(xoModel.getPlayer() == XoModel.PLAYER_X){
                    button20.setText("X");
                    if(xoModel.hasWinner()) {
                        infoTextView.setText("Player 1 is a winner");
                        disableAllButtons();
                    }
                    else {
                        infoTextView.setText("It's now PLayer 2 turn");
                        xoModel.changePlayer();
                    }
                }else{
                    button20.setText("O");
                    if(xoModel.hasWinner()) {
                        infoTextView.setText("Player 2 is a winner");
                        disableAllButtons();
                    }
                    else {
                        infoTextView.setText("It's now Player 1 turn");
                        xoModel.changePlayer();
                    }
                }
                if(xoModel.isDraw()){
                    infoTextView.setText("It's a draw! Please restart");
                }
                button20.setClickable(false);
            }
        });

        button01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                /*if(!xoModel.hasWinner()){
                    if(xoModel.getPlayer() == XoModel.PLAYER_X){
                        button01.setText("X");
                        infoTextView.setText("It's now PLayer 2 turn");
                    }else{
                        button01.setText("O");
                        infoTextView.setText("It's now Player 1 turn");
                    }
                    xoController.playerMove(0, 1);
                }else{
                    infoTextView.setText(xoModel.getWinner() + " is a winner!");
                }*/
                xoModel.playerMove(0, 1);
                if(xoModel.getPlayer() == XoModel.PLAYER_X){
                    button01.setText("X");
                    if(xoModel.hasWinner()) {
                        infoTextView.setText("Player 1 is a winner");
                        disableAllButtons();
                    }
                    else {
                        infoTextView.setText("It's now PLayer 2 turn");
                        xoModel.changePlayer();
                    }
                }else{
                    button01.setText("O");
                    if(xoModel.hasWinner()) {
                        infoTextView.setText("Player 2 is a winner");
                        disableAllButtons();
                    }
                    else {
                        infoTextView.setText("It's now Player 1 turn");
                        xoModel.changePlayer();
                    }
                }
                if(xoModel.isDraw()){
                    infoTextView.setText("It's a draw! Please restart");
                }
                button01.setClickable(false);
            }
        });

        button11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                /*if(!xoModel.hasWinner()){
                    if(xoModel.getPlayer() == XoModel.PLAYER_X){
                        button11.setText("X");
                        infoTextView.setText("It's now PLayer 2 turn");
                    }else{
                        button11.setText("O");
                        infoTextView.setText("It's now Player 1 turn");
                    }
                    xoController.playerMove(1, 1);
                }else{
                    infoTextView.setText(xoModel.getWinner() + " is a winner!");
                }*/
                xoModel.playerMove(1, 1);
                if(xoModel.getPlayer() == XoModel.PLAYER_X){
                    button11.setText("X");
                    if(xoModel.hasWinner()) {
                        infoTextView.setText("Player 1 is a winner");
                        disableAllButtons();
                    }
                    else {
                        infoTextView.setText("It's now PLayer 2 turn");
                        xoModel.changePlayer();
                    }
                }else{
                    button11.setText("O");
                    if(xoModel.hasWinner()) {
                        infoTextView.setText("Player 2 is a winner");
                        disableAllButtons();
                    }
                    else {
                        infoTextView.setText("It's now Player 1 turn");
                        xoModel.changePlayer();
                    }
                }
                if(xoModel.isDraw()){
                    infoTextView.setText("It's a draw! Please restart");
                }
                button11.setClickable(false);
            }
        });

        button21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                /*if(!xoModel.hasWinner()){
                    if(xoModel.getPlayer() == XoModel.PLAYER_X){
                        button21.setText("X");
                        infoTextView.setText("It's now PLayer 2 turn");
                    }else{
                        button21.setText("O");
                        infoTextView.setText("It's now Player 1 turn");
                    }
                    xoController.playerMove(2, 1);
                }else{
                    infoTextView.setText(xoModel.getWinner() + " is a winner!");
                }*/
                xoModel.playerMove(2, 1);
                if(xoModel.getPlayer() == XoModel.PLAYER_X){
                    button21.setText("X");
                    if(xoModel.hasWinner()) {
                        infoTextView.setText("Player 1 is a winner");
                        disableAllButtons();
                    }
                    else {
                        infoTextView.setText("It's now PLayer 2 turn");
                        xoModel.changePlayer();
                    }
                }else{
                    button21.setText("O");
                    if(xoModel.hasWinner()) {
                        infoTextView.setText("Player 2 is a winner");
                        disableAllButtons();
                    }
                    else {
                        infoTextView.setText("It's now Player 1 turn");
                        xoModel.changePlayer();
                    }
                }
                if(xoModel.isDraw()){
                    infoTextView.setText("It's a draw! Please restart");
                }
                button21.setClickable(false);
            }
        });

        button02.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                /*if(!xoModel.hasWinner()){
                    if(xoModel.getPlayer() == XoModel.PLAYER_X){
                        button02.setText("X");
                        infoTextView.setText("It's now PLayer 2 turn");
                    }else{
                        button02.setText("O");
                        infoTextView.setText("It's now Player 1 turn");
                    }
                    xoController.playerMove(0, 2);
                }else{
                    infoTextView.setText(xoModel.getWinner() + " is a winner!");
                }*/
                xoModel.playerMove(0, 2);
                if(xoModel.getPlayer() == XoModel.PLAYER_X){
                    button02.setText("X");
                    if(xoModel.hasWinner()) {
                        infoTextView.setText("Player 1 is a winner");
                        disableAllButtons();
                    }
                    else {
                        infoTextView.setText("It's now PLayer 2 turn");
                        xoModel.changePlayer();
                    }
                }else{
                    button02.setText("O");
                    if(xoModel.hasWinner()) {
                        infoTextView.setText("Player 2 is a winner");
                        disableAllButtons();
                    }
                    else {
                        infoTextView.setText("It's now Player 1 turn");
                        xoModel.changePlayer();
                    }
                }
                if(xoModel.isDraw()){
                    infoTextView.setText("It's a draw! Please restart");
                }
                button02.setClickable(false);
            }
        });

        button12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                /*if(!xoModel.hasWinner()){
                    if(xoModel.getPlayer() == XoModel.PLAYER_X){
                        button12.setText("X");
                        infoTextView.setText("It's now PLayer 2 turn");
                    }else{
                        button12.setText("O");
                        infoTextView.setText("It's now Player 1 turn");
                    }
                    xoController.playerMove(1, 2);
                }else{
                    infoTextView.setText(xoModel.getWinner() + " is a winner!");
                }*/
                xoModel.playerMove(1, 2);
                if(xoModel.getPlayer() == XoModel.PLAYER_X){
                    button12.setText("X");
                    if(xoModel.hasWinner()) {
                        infoTextView.setText("Player 1 is a winner");
                        disableAllButtons();
                    }
                    else {
                        infoTextView.setText("It's now PLayer 2 turn");
                        xoModel.changePlayer();
                    }
                }else{
                    button12.setText("O");
                    if(xoModel.hasWinner()) {
                        infoTextView.setText("Player 2 is a winner");
                        disableAllButtons();
                    }
                    else {
                        infoTextView.setText("It's now Player 1 turn");
                        xoModel.changePlayer();
                    }
                }
                if(xoModel.isDraw()){
                    infoTextView.setText("It's a draw! Please restart");
                }
                button12.setClickable(false);
            }
        });

        button22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                /*if(!xoModel.hasWinner()){
                    if(xoModel.getPlayer() == XoModel.PLAYER_X){
                        button22.setText("X");
                        infoTextView.setText("It's now PLayer 2 turn");
                    }else{
                        button22.setText("O");
                        infoTextView.setText("It's now Player 1 turn");
                    }
                    xoController.playerMove(2, 2);
                }else{
                    infoTextView.setText(xoModel.getWinner() + " is a winner!");
                }*/
                xoModel.playerMove(2, 2);
                if(xoModel.getPlayer() == XoModel.PLAYER_X){
                    button22.setText("X");
                    if(xoModel.hasWinner()) {
                        infoTextView.setText("Player 1 is a winner");
                        disableAllButtons();
                    }
                    else {
                        infoTextView.setText("It's now PLayer 2 turn");
                        xoModel.changePlayer();
                    }
                }else{
                    button22.setText("O");
                    if(xoModel.hasWinner()) {
                        infoTextView.setText("Player 2 is a winner");
                        disableAllButtons();
                    }
                    else {
                        infoTextView.setText("It's now Player 1 turn");
                        xoModel.changePlayer();
                    }
                }
                if(xoModel.isDraw()){
                    infoTextView.setText("It's a draw! Please restart");
                }
                button22.setClickable(false);
            }
        });

        buttonRestart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                xoModel = new XoModel();
                xoController = new XoController(xoModel);
                enableAllButtons();
                eraseAllButtonsText();
                infoTextView.setText("Player 1, please make your move");
            }
        });

    }
    private void disableAllButtons(){
        button00.setClickable(false);
        button10.setClickable(false);
        button20.setClickable(false);
        button01.setClickable(false);
        button11.setClickable(false);
        button21.setClickable(false);
        button02.setClickable(false);
        button12.setClickable(false);
        button22.setClickable(false);
    }

    private void enableAllButtons(){
        button00.setClickable(true);
        button10.setClickable(true);
        button20.setClickable(true);
        button01.setClickable(true);
        button11.setClickable(true);
        button21.setClickable(true);
        button02.setClickable(true);
        button12.setClickable(true);
        button22.setClickable(true);
    }

    private void eraseAllButtonsText(){
        button00.setText("");
        button10.setText("");
        button20.setText("");
        button01.setText("");
        button11.setText("");
        button21.setText("");
        button02.setText("");
        button12.setText("");
        button22.setText("");
    }
}
