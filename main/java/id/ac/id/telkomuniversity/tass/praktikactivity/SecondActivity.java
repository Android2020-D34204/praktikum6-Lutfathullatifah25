package id.ac.id.telkomuniversity.tass.praktikactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    TextView ViewTeks;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        ViewTeks = findViewById(R.id.textView2);

        Bundle bundle = getIntent().getExtras();
        String hasil = bundle.getString("isiteks");

        ViewTeks.setText(String.valueOf(hasil));

    }
}