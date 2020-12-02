package dev.andk.login;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.os.Debug;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    TextView res;
    Button btn;
    EditText log, pas;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        res = findViewById(R.id.res);
        btn = findViewById(R.id.inputButton);
        log = findViewById(R.id.login);
        pas = findViewById(R.id.password);
        btn.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (log.getText().toString().equals("a") && pas.getText().toString().equals("1"))
        {
            res.setText("Верно");
            res.setTextColor(Color.GREEN);
        }
        else
        {
            res.setText("Вы ошиблись в логине или пароле");
            res.setTextColor(Color.RED);
        }
        log.setText("");
        pas.setText("");
    }
}