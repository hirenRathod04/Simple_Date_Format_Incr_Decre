package com.royalsoftsolutions.simple_date_format_incr_decre;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.sql.Array;
import java.util.ArrayList;


public class MyListAdapter extends RecyclerView.Adapter<MyListAdapter.ViewHolder> {

    private Context context;
    private ArrayList<String> listdata;

    MyListAdapter(Context context,
                  ArrayList<String> listdata) {
        this.context = context;
        this.listdata = listdata;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from ( parent.getContext ( ) ).inflate ( R.layout.show_date_xmlfile,
                parent, false );
        return new ViewHolder ( view );
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        String text = listdata.get ( position );
        String ar[] = text.split ( "-" );

        String day = ar[0];
        String date = ar[1];
        holder.tvDay.setText ( day );
        holder.tvDate.setText ( date );
    }

    @Override
    public int getItemCount() {
        return listdata.size ( );
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public TextView tvDay;
        public TextView tvDate;

        public ViewHolder(View itemView) {
            super ( itemView );
            tvDay = (TextView) itemView.findViewById ( R.id.tvDay );
            tvDate = (TextView) itemView.findViewById ( R.id.tvDate );
        }
    }
}
