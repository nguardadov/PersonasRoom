package guardado.com.personasroom;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import guardado.com.personasroom.datos.Persona;

public class AgregarActivity extends AppCompatActivity {
    private Button buscar,insertar,agregar,modificar,limpiar;
    private EditText id,nombre,carnet;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_agregar);
        inicializarComponentes();

        insertar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Persona p = new Persona(Integer.parseInt(id.getText().toString()),
                                        carnet.getText().toString(),
                                        nombre.getText().toString());

                MainActivity.myAppDatabase.myDao().addPersona(p);
                Toast.makeText(getApplicationContext(),"Ingresado con exito",Toast.LENGTH_SHORT).show();
                limpiar();
            }
        });
    }

    public void inicializarComponentes()
    {
        id = findViewById(R.id.a_id);
        nombre = findViewById(R.id.a_nombre);
        carnet = findViewById(R.id.a_carnet);
        buscar = findViewById(R.id.a_buscar);
        insertar = findViewById(R.id.a_agregar);
        modificar = findViewById(R.id.a_modificar);
        limpiar = findViewById(R.id.a_limpiar);

    }

    public void limpiar()
    {
        id.setText("");
        carnet.setText("");
        nombre.setText("");
    }
}
