package com.example.recyclerview;

import android.view.View;
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




}
