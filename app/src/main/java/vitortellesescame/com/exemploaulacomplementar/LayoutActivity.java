package vitortellesescame.com.exemploaulacomplementar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

public class LayoutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layout);

        final EditText texto = findViewById(R.id.editText);
        ImageButton imageBtn = findViewById(R.id.imageButton);

        imageBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), ""+texto.getText(), Toast.LENGTH_LONG).show();
            }
        });

        //AQUI VOLTEI DE UMA ACTIVITY PARA A ACTIVITY INICIAL (TELA INICIAL)
        Button btn6 = findViewById(R.id.button6);
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), MainActivity.class));
            }
        });


    }
}

