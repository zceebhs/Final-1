package com.example.st.personalitytest_1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Button;

public class question2 extends ActionBarActivity {
    private Button btn2_t;
    private Button btn2_f;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question2);
        

        btn2_t = (Button) findViewById(R.id.btn2_true);
        btn2_f = (Button) findViewById(R.id.btn2_false);

        btn2_t.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle intent1 = getIntent().getExtras();
                int[] numberOfAnswer = intent1.getIntArray("answer");

                Intent intent = new Intent (question2.this, question3.class);

                intent.putExtra("answer2", numberOfAnswer);
                startActivity(intent);
            }

        });
        btn2_f.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle intent1 = getIntent().getExtras();
                int[] numberOfAnswer = intent1.getIntArray("answer");

                Intent intent = new Intent (question2.this, question3.class);
                numberOfAnswer[1]=numberOfAnswer[1] + 1;
                intent.putExtra("answer2", numberOfAnswer);
                startActivity(intent);
            }
        });




    }

}
