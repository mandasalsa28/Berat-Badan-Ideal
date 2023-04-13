package com.example.beratbadanidealid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText edbb, edtinggi, edIMT, edket;
    Button bthitung;
    Double vbb, vtinggi, vimt ;
    String vket;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edbb = (EditText)findViewById(R.id.edbb);
        edtinggi = (EditText)findViewById(R.id.edtinggi);
        edIMT = (EditText)findViewById(R.id.edIMT);
        edket = (EditText)findViewById(R.id.edket);
        bthitung = (Button)findViewById(R.id.bthitung);
    }

    public void hitung(View view) {
        vbb = Double.parseDouble(edbb.getText().toString());
        vtinggi = Double.parseDouble(edtinggi.getText().toString());

        vimt = vbb / ((vtinggi/100)*(vtinggi/100));

        if (vimt < 18.5){
            vket = "Berat Badan Kurang";
        }
        else if (vimt >= 18.5 && vimt <25){
            vket = "Berat Badan Ideal";
        }
        else if (vimt >= 25 && vimt <30){
            vket = "Berat Badan Berlebih";
        }
        else {
            vket = "Sangat Gemuk, Anda Harus Diet";
        }
        edIMT.setText(""+vimt);
        edket.setText(""+vket);
    }
}