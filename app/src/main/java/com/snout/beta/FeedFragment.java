package com.snout.beta;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.PagerSnapHelper;
import androidx.recyclerview.widget.RecyclerView;
import com.snout.beta.V.VideoAdap;
import com.snout.beta.O.ObjetoFeed;
import java.util.ArrayList;
import java.util.List;

public class FeedFragment extends Fragment {
    private RecyclerView recyclerView;

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_feed, container, false);
        this.recyclerView = view.findViewById(R.id.recyclerView);
        Context context = requireContext();
        if (context != null) {
            LinearLayoutManager linearLayoutManager = new LinearLayoutManager(context);
            linearLayoutManager.setOrientation(RecyclerView.VERTICAL);
            this.recyclerView.setLayoutManager(linearLayoutManager);
            new PagerSnapHelper().attachToRecyclerView(this.recyclerView);
        }
        List<ObjetoFeed> modelObjects = new ArrayList<>();
        modelObjects.add(new ObjetoFeed("android.resource://" + context.getPackageName() + "/" + R.raw.a, "@cachorrochupetinha", "cachorro chupetao", "", "oii"));
        modelObjects.add(new ObjetoFeed("android.resource://" + context.getPackageName() + "/" +  R.raw.b, "@shitzuminusculo", "cuidados para ter com um shitzu", "", ""));
        modelObjects.add(new ObjetoFeed("android.resource://" + context.getPackageName() + "/" +  R.raw.c, "@gatomaquinado", "gato trabalhando", "", ""));
        modelObjects.add(new ObjetoFeed("android.resource://" + context.getPackageName() + "/" +  R.raw.d, "@dogpreto", "cachorro", "", ""));
        modelObjects.add(new ObjetoFeed("android.resource://" + context.getPackageName() + "/" +  R.raw.e, "@cachorrocheirinho", "vose e flamenguista", "", ""));
        modelObjects.add(new ObjetoFeed("android.resource://" + context.getPackageName() + "/" +  R.raw.f, "@cachorrosemmundo", "mundiauu", "", ""));
        modelObjects.add(new ObjetoFeed("", "", "", "", ""));
        modelObjects.add(new ObjetoFeed("", "", "", "", ""));
        modelObjects.add(new ObjetoFeed("", "", "", "", ""));
        VideoAdap adapter = new VideoAdap(modelObjects, requireContext());
        this.recyclerView.setAdapter(adapter);
        return view;
    }
}
