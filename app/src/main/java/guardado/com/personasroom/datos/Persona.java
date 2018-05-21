package guardado.com.personasroom.datos;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

@Entity(tableName = "personas") // Nombre de la base de datos
public class Persona {

    @PrimaryKey //indicamos que id sera nuestra llave primaria
    private int id;

    @ColumnInfo(name = "persona_carnet") // nombre de la columna
    private String carnet;

    @ColumnInfo(name = "persona_nombre")
    private String nombre;

    public Persona() {
    }

    public Persona(int id, String carnet, String nombre) {
        this.id = id;
        this.carnet = carnet;
        this.nombre = nombre;
    }

    public Persona(String carnet, String nombre) {
        this.carnet = carnet;
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCarnet() {
        return carnet;
    }

    public void setCarnet(String carnet) {
        this.carnet = carnet;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
