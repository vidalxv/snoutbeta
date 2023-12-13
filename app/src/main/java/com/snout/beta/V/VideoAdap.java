package com.snout.beta.V;

import android.content.Context;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.VideoView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.snout.beta.O.ObjetoFeed;
import com.snout.beta.R;

import java.util.List;

public class VideoAdap extends RecyclerView.Adapter<VideoAdap.ViewHolder> {

    private List<ObjetoFeed> modelObjectList;
    private Context context;

    public VideoAdap(List<ObjetoFeed> modelObjectList, Context context) {
        this.modelObjectList = modelObjectList;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.fragment_feed, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        ObjetoFeed modelObject = modelObjectList.get(position);
        holder.bind(modelObject);
    }

    @Override
    public int getItemCount() {
        return modelObjectList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private TextView titulo;
        private TextView desc;
        private VideoView videoView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            titulo = itemView.findViewById(R.id.textView9);
            desc = itemView.findViewById(R.id.textView2);
            videoView = itemView.findViewById(R.id.videoView);
        }

        public void bind(ObjetoFeed modelObject) {
            titulo.setText(modelObject.getTitulo());
            desc.setText(modelObject.getDescricao());
            String videoUrl = modelObject.getVideoUrl();
            if (videoUrl != null && !videoUrl.isEmpty()) {
                Uri uri = Uri.parse(videoUrl);
                videoView.setVideoURI(uri);
                videoView.setOnPreparedListener(mp -> {
                    mp.setLooping(true);
                    videoView.start();
                });
            }
        }
    }
}
