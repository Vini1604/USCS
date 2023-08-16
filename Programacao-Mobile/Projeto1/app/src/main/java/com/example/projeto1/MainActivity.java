package com.example.projeto1;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void calcularCircunferencia(View view){
        Log.i("Tipo de Forma",
                getString(R.string.circunferencia));
    }
    public void calcularRetangulo(View view){
        Log.i("Tipo de Forma",
                getString(R.string.retangulo));
    }
}