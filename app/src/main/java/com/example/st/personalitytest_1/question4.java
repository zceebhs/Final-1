package com.example.st.personalitytest_1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Button;




public class question4 extends ActionBarActivity {
    private Button btn4_t;
    private Button btn4_f;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question4);
        

        btn4_t = (Button) findViewById(R.id.btn4_true);
        btn4_f = (Button) findViewById(R.id.btn4_false);

        btn4_t.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle intent1 = getIntent().getExtras();
                int[] numberOfAnswer = intent1.getIntArray("answer3");

                Intent intent = new Intent(question4.this,question5.class);

                intent.putExtra("answer4", numberOfAnswer);
                startActivity(intent);
            }

        });
        btn4_f.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle intent1 = getIntent().getExtras();
                int[] numberOfAnswer = intent1.getIntArray("answer3");

                Intent intent = new Intent(question4.this, question5.class);
                numberOfAnswer[1] = numberOfAnswer[1] + 1;
                intent.putExtra("answer4", numberOfAnswer);
                startActivity(intent);
            }
        });


    }

}
