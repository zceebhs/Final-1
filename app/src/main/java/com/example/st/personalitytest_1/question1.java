package com.example.st.personalitytest_1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Button;


public class question1 extends ActionBarActivity {


    private Button btn1_t; //assign button
    private Button btn1_f;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question1);


        btn1_t = (Button) findViewById(R.id.btn1_ture); // assign button names
        btn1_f = (Button) findViewById(R.id.btn1_false);
        btn1_t.setOnClickListener(new View.OnClickListener() { //implement OnClickListener method
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (question1.this, question2.class); // move to question2 activities
                int[] numberOfAnswer= {0,0}; // initialise array to 0 true and 0 false
                numberOfAnswer[1]=numberOfAnswer[1] + 1; // save the array and pass it to the next activity
                intent.putExtra("answer", numberOfAnswer); // save the array and pass it to next activity
                startActivity(intent); // start next activity
            }

        });
        btn1_f.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { // false button
                Intent intent = new Intent (question1.this, question2.class);//move to question 2
                int[] numberOfAnswer= {0,0}; // initialise array to 0 true and 0 false

                intent.putExtra("answer", numberOfAnswer);
                startActivity(intent);// start next activity
            }
        });


    }
}
