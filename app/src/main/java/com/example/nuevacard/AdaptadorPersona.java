package com.example.nuevacard;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class AdaptadorPersona extends RecyclerView.Adapter<AdaptadorPersona.ViewHolder> {
    private List<Persona> listaPersonas;
    public AdaptadorPersona(List<Persona>listaPersonas) {
        this.listaPersonas = listaPersonas;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View vista = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.card,viewGroup,false);
        return new ViewHolder(vista);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
        Persona persona = listaPersonas.get(i);
        viewHolder.id.setText(persona.getId().toString());
        viewHolder.nombre.setText(persona.getNombre());

    }

    @Override
    public int getItemCount() {
        return listaPersonas.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView id,nombre;
         public ViewHolder(@NonNull View itemView) {
            super(itemView);
            id = itemView.findViewById(R.id.subid);
            nombre=itemView.findViewById(R.id.subnombre);

        }
    }
}
