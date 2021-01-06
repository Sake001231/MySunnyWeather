package com.mysunnyweather.android.ui.place;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import com.mysunnyweather.android.MainActivity;
import com.mysunnyweather.android.R;
import com.mysunnyweather.android.logic.model.Place;
import com.mysunnyweather.android.ui.weather.WeatherActivity;

import java.util.List;

public class PlaceAdapter extends RecyclerView.Adapter<PlaceAdapter.ViewHolder> {

    Fragment fragment;
    List<Place> placeList;

    public PlaceAdapter(Fragment fragment, List<Place> placeList) {
        this.fragment = fragment;
        this.placeList = placeList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.place_item,parent,false);
        ViewHolder holder = new ViewHolder(view);
        holder.itemView.setOnClickListener(v -> {
            int position = holder.getAdapterPosition();
            Place place = placeList.get(position);
            Intent intent = new Intent(parent.getContext(), WeatherActivity.class);
            intent.putExtra("location_lng",place.getLocation().getLng());
            intent.putExtra("location_lat",place.getLocation().getLat());
            intent.putExtra("place_name",place.getName());
            fragment.startActivity(intent);
        });
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Place place = placeList.get(position);
        holder.placeName.setText(place.getName());
        holder.placeAddress.setText(place.getAddress());
    }

    @Override
    public int getItemCount() {
        return placeList.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        TextView placeName = itemView.findViewById(R.id.placeName);
        TextView placeAddress = itemView.findViewById(R.id.placeAddress);
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
