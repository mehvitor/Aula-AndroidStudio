package vitortellesescame.com.exemploaulacomplementar;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.snackbar.Snackbar;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.View;
import android.widget.TextView;

import androidx.core.view.WindowCompat;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import vitortellesescame.com.exemploaulacomplementar.databinding.ActivityMain3Binding;

public class Main3Activity extends AppCompatActivity {

    private AppBarConfiguration appBarConfiguration;
    private ActivityMain3Binding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMain3Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());



        TextView texto = findViewById(R.id.texto1);
        texto.setText(getIntent().getStringExtra( "Extra"));
        Message msg = new Message();
        handler.sendEmptyMessageDelayed(0 , 3000);




        setSupportActionBar(binding.toolbar);


        binding.fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAnchorView(R.id.fab)
                        .setAction("Action", null).show();
            }
        });
    }

    Handler handler = new Handler(Looper.getMainLooper()) {
        @Override
        public void handleMessage(@NonNull Message msg) {
            super.handleMessage(msg);
            switch (msg.what){
                case 0: {
                    Intent intent = new Intent();
                    intent.putExtra("resultado", "resultado de execução");
                    setResult(RESULT_OK, intent);
                    finish();
                    break;
                }
            }
        }
    };

}