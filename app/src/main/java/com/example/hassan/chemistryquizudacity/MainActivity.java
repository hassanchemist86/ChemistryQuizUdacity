package com.example.hassan.chemistryquizudacity;

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
    public Button results;
    RadioGroup rg_1, rg2, rg3, rg4;
    RadioButton Q1_radiobutton1, Q1_Radiobutton2, Q1_Radiobutton3, Q1_Radiobutton4;
    RadioButton Q2_radiobutton1, Q2_Radiobutton2;
    RadioButton Q3_radiobutton1, Q3_radiobutton2, Q3_radiobutton3, Q3_radiobutton4;
    RadioButton Q4_radiobutton1, Q4_radiobutton2, Q4_radiobutton3;
    CheckBox Q5_ch1, Q5_ch2, Q5_ch3, Q5_ch4;
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
        Q5_ch4 = (CheckBox) findViewById(R.id.Q5_checkbox4);

    }


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
        boolean answerQ5 = AnswerQ5ch1.isChecked();
        CheckBox AnswerQ5ch2 = findViewById(R.id.Q5_checkbox3);
        boolean answerQ5ch2 = AnswerQ5ch2.isChecked();


        int score = 0;
        if (answerQ1) {
            score = score + 2;
        }
        if (answerQ2) {
            score = score + 2;
        }
        if (answerQ3) {
            score = score + 2;
        }
        if (answerQ4) {
            score = score + 2;
        }
        if (answerQ5) {
            score = score + 1;
        }
        if (answerQ5ch2) {
            score = score + 1;
        }


        message = " Hi " + name + " your score is: " + score;



        Toast.makeText(this, message, Toast.LENGTH_LONG).show();


        return score;


    }


}







