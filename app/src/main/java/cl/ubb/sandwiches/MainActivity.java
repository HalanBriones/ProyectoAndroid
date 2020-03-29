package cl.ubb.sandwiches;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void irSegundoActivity(View v){
        Intent intent = new Intent(this, Main2Activity.class);
        startActivity(intent);

    }

    public void irTercerActivity(View v){
        Intent intent = new Intent(this,Main_sobre_nosotros_Activity.class);
        startActivity(intent);
    }
}
