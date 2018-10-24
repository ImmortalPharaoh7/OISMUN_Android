package com.itoismun.oismun;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class ScheduleFragment extends Fragment {
    
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.schedule_fragment, container, false);

//        ImageView scheduleImage = view.findViewById(R.id.code_schedule);
//        scheduleImage.setImageResource(R.drawable.schedule);
        
        TextView textView = view.findViewById(R.id.linksTextView);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        return view;
    }
}
