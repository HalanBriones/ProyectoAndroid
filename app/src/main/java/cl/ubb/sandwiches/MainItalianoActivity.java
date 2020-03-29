package cl.ubb.sandwiches;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainItalianoActivity extends AppCompatActivity {

    private String nombre;
    private String id_img;
    private String descripcion;
    private int precio;

    ListView listaItaliano;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_italiano);

        listaItaliano = (ListView) findViewById(R.id.listViewId);

        ArrayAdapter<CharSequence> adaptador = ArrayAdapter.createFromResource(this,R.array.italiano,
                android.R.layout.simple_list_item_1);

        listaItaliano.setAdapter(adaptador);

    }

}
