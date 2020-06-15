package com.example.yliasitopo;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
public class MainActivity extends AppCompatActivity {
    private Button button;
    private int x = 0;
    private int b = 1255;
    private int a = 200;
    private int c = 12;
    private int discriminant = ((b*b) - (4*a*c));
    private int resultat_zero = (-b /(2 * a));
    private int x1 = (int) ((-b-(Math.sqrt(discriminant)))/(2*a));


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = (Button) findViewById(R.id.button2);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openDialog();
            }
        });
    }

    public void openDialog() {
        if (discriminant < 0)
        {
        Example_Dialog exampleDialog = new Example_Dialog();
        exampleDialog.show(getSupportFragmentManager(), "example dialog");
        }
        if (discriminant > 0){
            Example_Superieur exampleDialog = new Example_Superieur();
            exampleDialog.show(getSupportFragmentManager(), "example dialog");
        }
        if (discriminant == 0){
            Example_Egale exampleDialog = new Example_Egale();
            exampleDialog.show(getSupportFragmentManager(), "example dialog");
        }
}   }
