package com.example.st.personalitytest_1;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.TextView;



public class finalpage extends ActionBarActivity {
    private TextView results; // print out the results


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_finalpage);

        Bundle intent = getIntent().getExtras(); // get the saved arrays from previous exercise
        int[] numberOfAnswer = intent.getIntArray("answer6"); //  get from answer 6
        results = (TextView) findViewById(R.id.tv_results); // assign the text view as a results

        if (numberOfAnswer[1] == 0 ) { //by the number of true pressed it present different messages
            results.setText("You are a sociable being - You are 100% extroverted!");
        }
        else if (numberOfAnswer[1] >= 1 && numberOfAnswer[1] <2) {
            results.setText("You are 85% extroverted ");
        }
        else if(numberOfAnswer[1] >= 2 && numberOfAnswer[1] <3) {
            results.setText("You are 70 % extroverted");
        }
        else if(numberOfAnswer[1] >=3 && numberOfAnswer[1] <4) {
            results.setText("You are uniquely ambiverted! - 50:50 introvert-Extrovert");
        }
        else if(numberOfAnswer[1] >= 4 && numberOfAnswer[1] <5) {
            results.setText("You are quite introverted - infact 70% introverted");
        }
        else if(numberOfAnswer[1] >= 5 && numberOfAnswer[1] <6) {
            results.setText("You are mosty introverted - infact 85% introverted.");
        }
        else if(numberOfAnswer[1] >= 6 && numberOfAnswer[1] <7) {
            results.setText("You are a book worm - 100% introverted!");
        }



    }
    public void onClick(View view)
    {
        finish();
    } // back to previous exercise
}
