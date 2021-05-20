package sg.edu.rp.c346.id20039529.demoriddle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tvQ1;
    Button btnRevealQ1;
    TextView tvQ2;
    Button btnRevealQ2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        btnRevealQ1 = findViewById(R.id.btnRevealQ1);
        tvQ1 = findViewById(R.id.tvQ1);
        tvQ2 = findViewById(R.id.tvQ2);
        btnRevealQ2 = findViewById(R.id.btnRevealQ2);

        btnRevealQ1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent i = new Intent(MainActivity.this, AnswerActivity1.class);
                i.putExtra("Question", "Q1");
                startActivity(i);
            }

        });
        btnRevealQ2.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, AnswerActivity2.class);
                i.putExtra("Question1", "Q2");
                startActivity(i);
            }
        }));
    }
}
