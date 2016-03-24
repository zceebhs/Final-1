package com.example.st.personalitytest_1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Button;

public class question6 extends ActionBarActivity {
    private Button btn6_t;
    private Button btn6_f;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question6);
        int[] numberOfAnswer = {0, 0};

        btn6_t = (Button) findViewById(R.id.btn6_true);
        btn6_f = (Button) findViewById(R.id.btn6_false);

        btn6_t.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle intent1 = getIntent().getExtras();
                int[] numberOfAnswer = intent1.getIntArray("answer5");

                Intent intent = new Intent(question6.this, finalpage.class);
                numberOfAnswer[1] = numberOfAnswer[1] + 1;
                intent.putExtra("answer6", numberOfAnswer);
                startActivity(intent);
            }

        });
        btn6_f.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle intent1 = getIntent().getExtras();
                int[] numberOfAnswer = intent1.getIntArray("answer5");

                Intent intent = new Intent(question6.this, finalpage.class);
                intent.putExtra("answer6", numberOfAnswer);
                startActivity(intent);
            }
        });


    }

}

