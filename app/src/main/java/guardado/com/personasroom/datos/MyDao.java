package guardado.com.personasroom.datos;

//los pisbles metodos que tendra a nuestra base de datos

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;

import java.util.ArrayList;
import java.util.List;

@Dao
public interface MyDao {

    @Insert //para agregar datos
    public void addPersona(Persona persona);

    @Query("select * from personas")
    public List<Persona> getPersonas();
}
