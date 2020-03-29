package cl.ubb.sandwiches;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Main_chacarero_Activity extends AppCompatActivity {

    private String nombre;
    private String id_img;
    private String descripcion;
    private int precio;

    ListView listachacarero;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_chacarero_);

        listachacarero = (ListView) findViewById(R.id.listViewId2);

        ArrayAdapter<CharSequence> adaptador = ArrayAdapter.createFromResource(this,R.array.Chacarero,
                android.R.layout.simple_list_item_1);

        listachacarero.setAdapter(adaptador);
    }
}
