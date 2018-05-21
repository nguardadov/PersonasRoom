package guardado.com.personasroom;

import android.arch.persistence.room.Room;
import android.arch.persistence.room.RoomDatabase;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import guardado.com.personasroom.datos.MyAppDatabase;

public class MainActivity extends AppCompatActivity {
    private Button mostrar,modificar,ingresar;

    public static MyAppDatabase myAppDatabase;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //inicando nuestros componentes
        inicializarComponentes();
        myAppDatabase= Room.databaseBuilder(getApplicationContext(),MyAppDatabase.class,"personas_db").allowMainThreadQueries().build();

        mostrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),MostrarActivity.class);
                startActivity(intent);

            }
        });

        ingresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),AgregarActivity.class);
                startActivity(intent);
            }
        });

    }

    public void inicializarComponentes(){
        mostrar = findViewById(R.id.btn_mostrar);
        modificar = findViewById(R.id.btn_modificar);
        ingresar = findViewById(R.id.btn_ingresar);
    }
}
