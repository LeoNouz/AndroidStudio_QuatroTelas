package com.example.cores;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity4 extends AppCompatActivity {

    private RelativeLayout layout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        layout = findViewById(R.id.layout);

        // Desabilitar o botão de avançar na Tela4
        findViewById(R.id.btnForward).setEnabled(false);
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

    public void goBack(View view) {
        finish();
    }
}
