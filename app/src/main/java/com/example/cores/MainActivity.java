package com.example.cores;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private RelativeLayout layout;
    private static final int REQUEST_CODE = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        layout = findViewById(R.id.layout);

        // Desabilitar o botão de retroceder na Tela1
        findViewById(R.id.btnBackward).setEnabled(false);
    }

    public void changeToRed(View view) {
        layout.setBackgroundColor(Color.RED);
    }

    public void changeToGreen(View view) {
        layout.setBackgroundColor(Color.GREEN);
    }

    public void changeToBlue(View view) {
        layout.setBackgroundColor(Color.BLUE);
    }

    public void changeToRandomColor(View view) {
        int[] colors = {Color.RED, Color.GREEN, Color.BLUE};
        int randomColor = colors[(int) (Math.random() * colors.length)];
        layout.setBackgroundColor(randomColor);
    }

    public void goToNextActivity(View view) {
        Intent intent = new Intent(this, MainActivity2.class);
        startActivityForResult(intent, REQUEST_CODE);
    }
}
