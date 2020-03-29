package cl.ubb.sandwiches;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


    }

    public void irItaliano (View v){
        Intent intent = new Intent(this,MainItalianoActivity.class);
        startActivity(intent);
    }
    public void irChacarero (View v){
        Intent intent = new Intent(this,Main_chacarero_Activity.class);
        startActivity(intent);
    }
    public void irBarrosLuco (View v){
        Intent intent = new Intent(this,Main_barrosluco_Activity.class);
        startActivity(intent);
    }

    public void irChemilico (View v){
        Intent intent = new Intent(this,Main_chemilico_Activity.class);
        startActivity(intent);
    }
    public void irBarrosJarpa (View v){
        Intent intent = new Intent(this,Main_barrosjarpa_Activity.class);
        startActivity(intent);
    }

}