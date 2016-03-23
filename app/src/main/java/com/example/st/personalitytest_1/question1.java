package com.example.st.personalitytest_1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Button;

public class question1 extends ActionBarActivity {

    int numberOfTrue=0;
    int numberOfFalse=0;
    private Button btn1_t;
    private Button btn1_f;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question1);

        btn1_t = (Button) findViewById(R.id.btn1_ture);
        btn1_f = (Button) findViewById(R.id.btn1_false);

        btn1_t.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (question1.this, question2.class);
                numberOfTrue=numberOfTrue + 1;
                intent.putExtra("answer", numberOfTrue);
                startActivity(intent);
    }

                                  });
                btn1_f.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent (question1.this, question2.class);
                        numberOfTrue = numberOfFalse;
                        intent.putExtra("answer", numberOfFalse);
                        startActivity(intent);
                    }
                });


    }
}
