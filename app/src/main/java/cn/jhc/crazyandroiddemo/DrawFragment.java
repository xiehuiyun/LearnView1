package cn.jhc.crazyandroiddemo;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;

public class DrawFragment extends Fragment {

    private int layoutId;
    public DrawFragment() {

    }

    public static DrawFragment newInstance(int layoutId) {
        DrawFragment fragment = new DrawFragment();
        Bundle args = new Bundle();
        args.putInt("layoutId",layoutId);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
           layoutId = getArguments().getInt("layoutId");
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_draw, container, false);
        ViewStub viewStub = (ViewStub) root.findViewById(R.id.view_stub);
        viewStub.setLayoutResource(layoutId);
        viewStub.inflate();
        return root;
    }
}
