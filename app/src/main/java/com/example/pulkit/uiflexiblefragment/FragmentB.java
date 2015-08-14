package com.example.pulkit.uiflexiblefragment;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by pulkit on 8/14/15.
 */
public class FragmentB extends Fragment {
    TextView textView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_b,container,false);
        textView = (TextView) view.findViewById(R.id.showText);

        return view;

    }

    public void changeText(int data) {
        String[] descriptions = getResources().getStringArray(R.array.descriptions);
        textView.setText(descriptions[data]);
    }
}
