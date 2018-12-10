package cl.telematica.basicconnectionexample.main;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import cl.telematica.basicconnectionexample.R;
import cl.telematica.basicconnectionexample.models.Libro;

import com.bumptech.glide.Glide;

public class UIAdapter extends RecyclerView.Adapter<UIAdapter.ViewHolder> {

    private List<Libro> mDataset;

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public ImageView mPhotoView;
        public TextView mTextView;
        public TextView mGeneroView;
        public ViewHolder(View v) {
            super(v);
            mPhotoView = (ImageView) v.findViewById(R.id.imgPhoto);
            mTextView = (TextView) v.findViewById(R.id.textName);
            mGeneroView = (TextView) v.findViewById(R.id.textGenero);
        }
    }

    public UIAdapter(List<Libro> myDataset) {
        mDataset = myDataset;
    }

    @Override
    public UIAdapter.ViewHolder onCreateViewHolder(ViewGroup parent,
                                                   int viewType) {
        // create a new view
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.vista_libro, parent, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Libro libro = mDataset.get(position);

        holder.mTextView.setText(libro.getNombre());
        holder.mGeneroView.setText(libro.getGenero());

        Glide.with(holder.mPhotoView.getContext()).load(libro.getPhoto()).into(holder.mPhotoView);

    }

    @Override
    public int getItemCount() {
        return mDataset.size();
    }


}
