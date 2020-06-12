package com.example.yliasitopo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class CookieActivity extends AppCompatActivity {
    private TextView Point;
    private ImageView cible;
    private int x = 0;
    private int b = 12;
    private int a = 3;
    private int c = 12;
    private int discriminant = ((b*b) - (4*a*c));
    private int resultat_zero = (-b /(2 * a));
    private int x1 = (int) ((-b-(Math.sqrt(discriminant)))/(2*a));



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cookie);

        this.Point = (TextView) findViewById(R.id.Point);
        this.cible = (ImageView) findViewById(R.id.cible);


        cible.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (discriminant < 0){
                    Point.setText("Le discriminant est inferieur a 0");
                }
                else if(discriminant > 0) {
                    Point.setText("B est = " + b + "\n" + "A est = " + a + "\n"+ "Le discriminant est :" + discriminant + "x1 = " + x1);
                }
                else{
                    Point.setText("Resultat l'orsque le nombre est = a 0    " +   resultat_zero);
                }

            }
        });
    }
}