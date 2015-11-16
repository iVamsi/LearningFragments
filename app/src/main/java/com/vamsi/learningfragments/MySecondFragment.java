package com.vamsi.learningfragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by m1033421 on 15/11/15.
 */
public class MySecondFragment extends Fragment {

    TextView textView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_second, container, false);
        textView = (TextView) v.findViewById(R.id.textView2);
        return v;
    }

    public void updateDescription(int i) {
        String[] str = getResources().getStringArray(R.array.list_description);
        textView.setText(str[i]);
    }
}
