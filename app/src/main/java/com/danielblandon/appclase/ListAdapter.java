package com.danielblandon.appclase;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class ListAdapter extends BaseAdapter {
    // Context es para saber el contexto donde estoy
    Context contexto ;

    String[] nombres,mensajes,horaUltMen,numTel,pais;
    int idImagen;
    LayoutInflater inflater;
    public ListAdapter(Context contexto, String[] nombres, String[] mensajes, String[] horaUltMen, String[] numTel, String[] pais, int idImagen) {
        this.contexto = contexto;
        this.nombres = nombres;
        this.mensajes = mensajes;
        this.horaUltMen = horaUltMen;
        this.numTel = numTel;
        this.pais = pais;
        this.idImagen = idImagen;
        inflater = LayoutInflater.from(contexto);

    }
    //recorremos el arreglo para saber cuantos datos tenemos
    @Override
    public int getCount(){return nombres.length;}

    @Override
    public Object getItem(int i){return null;}

    @Override
    public long getItemId(int i){return 0;}

    @Override
    //obtener la vista(parte grafica)
    public View getView(int i, View vista, ViewGroup viewGroup){
        vista = inflater.inflate(R.layout.list_item,null);

        ImageView  fotoPerfil = vista.findViewById(R.id.imagen);
        TextView   nombreAnimal= vista.findViewById(R.id.nombreAnimal);
        TextView   descripcion= vista.findViewById(R.id.descripcion);
        TextView   hora = vista.findViewById(R.id.hora);

        fotoPerfil.setImageResource(idImagen);
        nombreAnimal.setText(nombres[i]);
        descripcion.setText(mensajes[i]);
        hora.setText(horaUltMen[i]);
        return vista;}

}
