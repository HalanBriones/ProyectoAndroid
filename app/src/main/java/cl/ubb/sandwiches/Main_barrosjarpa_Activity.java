package cl.ubb.sandwiches;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Main_barrosjarpa_Activity extends AppCompatActivity {

    private String nombre;
    private String id_img;
    private String descripcion;
    private int precio;

    ListView listaBarrosJarpa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_barrosjarpa_);

        listaBarrosJarpa = (ListView) findViewById(R.id.listViewId5);

        ArrayAdapter<CharSequence> adaptador = ArrayAdapter.createFromResource(this,R.array.BarrosJarpa,
                android.R.layout.simple_list_item_1);

        listaBarrosJarpa.setAdapter(adaptador);
    }
}
