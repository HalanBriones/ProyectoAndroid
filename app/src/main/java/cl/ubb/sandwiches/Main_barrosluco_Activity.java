package cl.ubb.sandwiches;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Main_barrosluco_Activity extends AppCompatActivity {

    private String nombre;
    private String id_img;
    private String descripcion;
    private int precio;

    ListView listaBarrosLuco;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_barrosluco_);

        listaBarrosLuco = (ListView) findViewById(R.id.listViewId3);

        ArrayAdapter<CharSequence> adaptador = ArrayAdapter.createFromResource(this,R.array.BarrosLuco,
                android.R.layout.simple_list_item_1);

        listaBarrosLuco.setAdapter(adaptador);

    }
}
