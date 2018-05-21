package guardado.com.personasroom;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import guardado.com.personasroom.datos.Persona;

public class MostrarActivity extends AppCompatActivity {

    List<Persona> listaDatos;
    RecyclerView recycler;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mostrar);

        recycler=findViewById(R.id.recyclerId);
        recycler.setLayoutManager(new LinearLayoutManager(this));
        listaDatos = new ArrayList<Persona>();

        llenarPersona();
        AdapterDatos adapter = new AdapterDatos(listaDatos);
        recycler.setAdapter(adapter);


    }

    public void llenarPersona() {
       listaDatos = MainActivity.myAppDatabase.myDao().getPersonas();
    }
}
