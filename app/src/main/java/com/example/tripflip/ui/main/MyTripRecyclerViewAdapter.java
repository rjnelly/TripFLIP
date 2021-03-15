package com.example.tripflip.ui.main;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.example.tripflip.R;
import com.example.tripflip.ui.main.dummy.DummyContent.DummyItem;

import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

/**
 * {@link RecyclerView.Adapter} that can display a {@link DummyItem}.
 * TODO: Replace the implementation with code for your data type.
 */
public class MyTripRecyclerViewAdapter extends RecyclerView.Adapter<MyTripRecyclerViewAdapter.ViewHolder> {

    private final List<Trip> tripList;

    public MyTripRecyclerViewAdapter(List<Trip> trips) {
        tripList = trips;
    }

    @NonNull
    private List<Trip> getTrips() {
        ArrayList<Trip> trips = new ArrayList<>();
        GregorianCalendar calendar = new GregorianCalendar();
        for(int i = 0; i < 25; i++) {
            calendar.set(2021, 2, 27);
            Date sd = calendar.getTime();
            calendar.set(2021, 3, 4);
            Date ed = calendar.getTime();
            trips.add(new Trip("New Orleans", sd, ed));
        }
        return trips;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.fragment_trip_list_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, int position) {
        holder.mItem = tripList.get(position);
        holder.mNameView.setText(tripList.get(position).getName());
        holder.mDateView.setText(tripList.get(position).getDateString());
        holder.mView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(v.getContext(), "Open New Orleans", Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return tripList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public final View mView;
        public final TextView mNameView;
        public final TextView mDateView;
        public Trip mItem;

        public ViewHolder(View view) {
            super(view);
            mView = view;
            mNameView = (TextView) view.findViewById(R.id.trip_name);
            mDateView = (TextView) view.findViewById(R.id.dates);
        }

        @Override
        public String toString() {
            return super.toString() + " '" + mNameView.getText() + "'";
        }
    }
}