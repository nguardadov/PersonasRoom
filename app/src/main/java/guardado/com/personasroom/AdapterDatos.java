package guardado.com.personasroom;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import guardado.com.personasroom.datos.Persona;

public class AdapterDatos extends RecyclerView.Adapter<AdapterDatos.ViewHolderDatos>{

    List<Persona> listaDatos;

    //generamos el constructor
    public AdapterDatos(List<Persona> persona) {
        this.listaDatos = persona;
    }

    @NonNull
    @Override
    public AdapterDatos.ViewHolderDatos onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.itemlist,null,false);
        return new ViewHolderDatos(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterDatos.ViewHolderDatos holder, int position) {
        holder.asignarDatos(listaDatos.get(position));
    }

    @Override
    public int getItemCount() {
        return listaDatos.size();
    }

    public class ViewHolderDatos extends RecyclerView.ViewHolder {
        //referenciaa nuestro itemlist
        TextView datos,nombre,carnet;
        public ViewHolderDatos(View itemView) {
            super(itemView);
            datos = itemView.findViewById(R.id.idDato);
            nombre = itemView.findViewById(R.id.rm_nombre);
            carnet=itemView.findViewById(R.id.rm_carnet);
        }


        public void asignarDatos(Persona s) {

            datos.setText(Integer.toString(s.getId()));
            nombre.setText(s.getNombre());
            carnet.setText(s.getCarnet());

        }
    }
}
