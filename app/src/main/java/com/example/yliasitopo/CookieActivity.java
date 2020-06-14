    package com.example.yliasitopo;
    import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
    public class CookieActivity extends AppCompatActivity {
        private Button button;
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
            Example_Dialog exampleDialog = new Example_Dialog();
            exampleDialog.show(getSupportFragmentManager(), "example dialog");
        }
    }
