package com.example.recyclerview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Adaptador_titulares extends RecyclerView.Adapter<Adaptador_titulares.TitularesViewHolder> {

    private ArrayList<Titular> datos;

    public Adaptador_titulares(ArrayList<Titular> datos) {
        this.datos = datos;
    }



    public static class TitularesViewHolder extends RecyclerView.ViewHolder{

        private TextView txtTitulo;
        private TextView txtSubtitulo;

        public TitularesViewHolder(@NonNull View itemView) {
            super(itemView);
            this.txtTitulo = itemView.findViewById(R.id.titulo);
            this.txtSubtitulo = itemView.findViewById(R.id.subtitulo);;
        }
        public void bindTitular(Titular titular){
            txtTitulo.setText(titular.getTitulo());
            txtSubtitulo.setText(titular.getSubtitulo());

        }

        public TextView getTxtTitulo() {
            return txtTitulo;
        }

        public void setTxtTitulo(TextView txtTitulo) {
            this.txtTitulo = txtTitulo;
        }

        public TextView getTxtSubtitulo() {
            return txtSubtitulo;
        }

        public void setTxtSubtitulo(TextView txtSubtitulo) {
            this.txtSubtitulo = txtSubtitulo;
        }




    }
    //CONSTRUYE LA VISTA
    public TitularesViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType){
        View itemView = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_component, viewGroup, false);
        TitularesViewHolder tvh = new TitularesViewHolder(itemView);
        return tvh;


    }
    //ASIGNA CADA COMPONENTE
    public void onBindViewHolder(TitularesViewHolder holder, int position){
        Titular titular = datos.get(position);
        holder.bindTitular(titular);

    }
    //DEVUELVE EL TAMAÑO DEL ARRAY
    public int getItemCount(){
        return datos.size();


    }
}
