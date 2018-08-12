package com.example.pjh.tensorflow_sleep;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/*
이산화탄소의 농도를 보여주는 Fragment
 */
public class LeftFragment extends Fragment {

    TextView textView;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view =  inflater.inflate(R.layout.left_fragment, container, false);
        Bundle bundle = this.getArguments();
        String data = "";
        if(bundle != null)
            data = bundle.getString("data","0");
        textView = (TextView)view.findViewById(R.id.textView);
        textView.setText(data);

        return view;
    }

    public void setText(){
        Bundle bundle = this.getArguments();
        String data = "";
        if(bundle != null)
            data = bundle.getString("data","0");

        textView.setText(data);
    }
}
