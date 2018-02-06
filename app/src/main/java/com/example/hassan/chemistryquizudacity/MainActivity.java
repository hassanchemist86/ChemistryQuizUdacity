package com.example.hassan.chemistryquizudacity;

import android.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //Declaration of variables
    public Button results;
    RadioGroup rg_1, rg2, rg3, rg4;
    RadioButton Q1_radiobutton1, Q1_Radiobutton2, Q1_Radiobutton3, Q1_Radiobutton4;
    RadioButton Q2_radiobutton1, Q2_Radiobutton2;
    RadioButton Q3_radiobutton1, Q3_radiobutton2, Q3_radiobutton3, Q3_radiobutton4;
    RadioButton Q4_radiobutton1, Q4_radiobutton2, Q4_radiobutton3;
    CheckBox Q5_ch1, Q5_ch2, Q5_ch3;
    String message;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rg_1 = (RadioGroup) findViewById(R.id.rg_1);
        Q1_radiobutton1 = (RadioButton) findViewById(R.id.Q1_radio_button1);
        Q1_Radiobutton2 = (RadioButton) findViewById(R.id.Q1_radio_button2);
        Q1_Radiobutton3 = (RadioButton) findViewById(R.id.Q1_radio_button3);
        Q1_Radiobutton4 = (RadioButton) findViewById(R.id.Q1_radio_button4);

        rg2 = (RadioGroup) findViewById(R.id.rg2);
        Q2_radiobutton1 = (RadioButton) findViewById(R.id.Q2_radio_button1);
        Q2_Radiobutton2 = (RadioButton) findViewById(R.id.Q2_radio_button2);

        rg3 = (RadioGroup) findViewById(R.id.rg3);
        Q3_radiobutton1 = (RadioButton) findViewById(R.id.Q3_radio_button1);
        Q3_radiobutton2 = (RadioButton) findViewById(R.id.Q3_radio_button2);
        Q3_radiobutton3 = (RadioButton) findViewById(R.id.Q3_radio_button3);
        Q3_radiobutton4 = (RadioButton) findViewById(R.id.Q3_radio_button4);

        rg4 = (RadioGroup) findViewById(R.id.rg4);
        Q4_radiobutton1 = (RadioButton) findViewById(R.id.Q4_radio_button1);
        Q4_radiobutton2 = (RadioButton) findViewById(R.id.Q4_radio_button2);
        Q4_radiobutton3 = (RadioButton) findViewById(R.id.Q4_radio_button3);

        Q5_ch1 = (CheckBox) findViewById(R.id.Q5_checkbox1);
        Q5_ch2 = (CheckBox) findViewById(R.id.Q5_checkbox2);
        Q5_ch3 = (CheckBox) findViewById(R.id.Q5_checkbox3);
    }


    // calculation of results
    public int getScore(View view) {

        EditText username = findViewById(R.id.user_name);
        String name = username.getText().toString();
        RadioButton AnswerQ1 = findViewById(R.id.Q1_radio_button2);
        Boolean answerQ1 = AnswerQ1.isChecked();
        RadioButton AnswerQ2 = findViewById(R.id.Q2_radio_button2);
        Boolean answerQ2 = AnswerQ2.isChecked();
        RadioButton AnswerQ3 = findViewById(R.id.Q3_radio_button2);
        Boolean answerQ3 = AnswerQ3.isChecked();
        RadioButton AnswerQ4 = findViewById(R.id.Q4_radio_button2);
        Boolean answerQ4 = AnswerQ4.isChecked();
        CheckBox AnswerQ5ch1 = findViewById(R.id.Q5_checkbox1);
        boolean answerQ5ch1 = AnswerQ5ch1.isChecked();
        CheckBox AnswerQ5ch2 = findViewById(R.id.Q5_checkbox2);
        boolean answerQ5ch2 = AnswerQ5ch2.isChecked();
        CheckBox AnswerQ5ch3 = findViewById(R.id.Q5_checkbox3);
        boolean answerQ5ch3 = AnswerQ5ch3.isChecked();

        EditText Answer6 = findViewById(R.id.sixth) ;
        String answer6 = Answer6.getText().toString () ;


        //initializing the variable score and summation the right answers
        int score = 0;
        if (answerQ1) {
            score = score + 3;
        }
        if (answerQ2) {
            score = score + 3;
        }
        if (answerQ3) {
            score = score + 3;
        }
        if (answerQ4) {
            score = score + 3;
        }
        if (answerQ5ch1) {
            score = score + 1;
        }
        if (answerQ5ch2) {
            score = score + 1;
        }
        if (answerQ5ch3) {
            score = score + 1;
        }

        if (answer6.equals("neutral") || answer6.equals("Neutral")) {
            score = score + 3;
        }

// Toast messages related to the answer
        message = " Hi " + name + " your score is: " + score + " out of 18";
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();

        if (score >15) {
            Toast.makeText(this, R.string.M1, Toast.LENGTH_SHORT).show();
        } else if (score >13)
            Toast.makeText(this, R.string.M2, Toast.LENGTH_SHORT).show();
        else if (score > 10) {
            Toast.makeText(this, R.string.M3, Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, R.string.M4, Toast.LENGTH_SHORT).show();
        }
        return score;
    }

// resetting method
    public void RESET(View view) {

        rg_1.clearCheck();
        rg2.clearCheck();
        rg3.clearCheck();
        rg4.clearCheck();

        if (Q5_ch1.isChecked()) {
            Q5_ch1.setChecked(false);
        }
        if (Q5_ch2.isChecked()) {
            Q5_ch2.setChecked(false);
        }

        if (Q5_ch3.isChecked()) {
            Q5_ch3.setChecked(false);
        }

        //clear the user name field
        EditText username = findViewById(R.id.user_name);
        username.setText("");

        // Clear the second EditText
        EditText Answer6 = findViewById(R.id.sixth) ;
        Answer6.setText("");


    }
}








