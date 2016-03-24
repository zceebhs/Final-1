package com.example.st.personalitytest_1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Button;



public class question5 extends ActionBarActivity {
    private Button btn5_t;
    private Button btn5_f;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question5);


        btn5_t = (Button) findViewById(R.id.btn5_true);
        btn5_f = (Button) findViewById(R.id.btn5_false);

        btn5_t.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle intent1 = getIntent().getExtras();
                int[] numberOfAnswer = intent1.getIntArray("answer4");

                Intent intent = new Intent(question5.this, question6.class);
                numberOfAnswer[1] = numberOfAnswer[1] + 1;
                intent.putExtra("answer5", numberOfAnswer);
                startActivity(intent);
            }

        });
        btn5_f.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle intent1 = getIntent().getExtras();
                int[] numberOfAnswer = intent1.getIntArray("answer4");

                Intent intent = new Intent(question5.this, question6.class);
                numberOfAnswer[0] = numberOfAnswer[0] + 1;
                intent.putExtra("answer5", numberOfAnswer);
                startActivity(intent);
            }
        });


    }

}


