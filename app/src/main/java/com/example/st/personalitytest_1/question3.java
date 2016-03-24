package com.example.st.personalitytest_1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Button;

public class question3 extends ActionBarActivity {
    private Button btn3_t;
    private Button btn3_f;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question3);


        btn3_t = (Button) findViewById(R.id.btn3_true);
        btn3_f = (Button) findViewById(R.id.btn3_false);

        btn3_t.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle intent1 = getIntent().getExtras();
                int[] numberOfAnswer = intent1.getIntArray("answer2");

                Intent intent = new Intent (question3.this, question4.class);
                numberOfAnswer[0]=numberOfAnswer[0] + 1;
                intent.putExtra("answer3", numberOfAnswer);
                startActivity(intent);
            }

        });
        btn3_f.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle intent1 = getIntent().getExtras();
                int[] numberOfAnswer = intent1.getIntArray("answer2");

                Intent intent = new Intent (question3.this, question4.class);
                numberOfAnswer[1]=numberOfAnswer[1] + 1;
                intent.putExtra("answer3", numberOfAnswer);
                startActivity(intent);
            }
        });




    }

}
