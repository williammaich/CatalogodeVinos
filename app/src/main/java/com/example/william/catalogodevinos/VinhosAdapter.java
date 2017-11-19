package com.example.william.catalogodevinos;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.List;

/**
 * Created by william on 18/11/2017.
 */

public class VinhosAdapter extends BaseAdapter{


    private Context ctx;
    private List<Vinho> vinhos;
    private String pathFoto;
    private RatingBar RatNota;


    public VinhosAdapter(Context ctx, List<Vinho> vinhos, String pathFoto) {
        this.ctx = ctx;
        this.vinhos = vinhos;
        this.pathFoto = pathFoto;
    }

    @Override
    public int getCount() {
        return vinhos.size();
    }

    @Override
    public Object getItem(int i) {
        return vinhos.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        Vinho vinho = vinhos.get(i);

        View linha = LayoutInflater.from(ctx).inflate(R.layout.item_vinho, null);
        ImageView imgFoto = (ImageView)linha.findViewById(R.id.imgFoto);
        TextView txtNome = (TextView)linha.findViewById(R.id.txtNome);
        TextView txtTipo = (TextView)linha.findViewById(R.id.txtTipo);
        TextView txtOrigem = (TextView)linha.findViewById(R.id.txtOrigem);

        RatingBar RatNota = (RatingBar)linha.findViewById(R.id.RatNota);


        Picasso.with(ctx).load(pathFoto+vinho.getId()+".jpg").into(imgFoto);
        txtNome.setText(vinho.getNome()+" - " + vinho.getTipo());
        txtOrigem.setText(vinho.getOrigem());

        return linha;
    }
}
