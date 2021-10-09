package com.example.luck;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import com.example.luck.databinding.ActivityMainBinding;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;
    private final Random random = new Random();
    private boolean checked = false;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding= ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.button.setOnClickListener(v-> {
            if (checked){
                Toast.makeText(this, "한번만 할 수 있지롱", Toast.LENGTH_SHORT).show();
                return;
            }
            checked=true;
            int score= random.nextInt( 101);
            binding.score.setText(String.format("%d", score));
            
        });

    }
}