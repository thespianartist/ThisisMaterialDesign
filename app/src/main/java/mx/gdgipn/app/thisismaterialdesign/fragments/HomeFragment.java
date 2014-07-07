package mx.gdgipn.app.thisismaterialdesign.fragments;

import android.graphics.Outline;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import mx.gdgipn.app.thisismaterialdesign.R;

/**
 * Created by thespianartist on 7/7/14.
 */
public class HomeFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View homeFragmentView = inflater.inflate(R.layout.fragment_home,container,false);
        return homeFragmentView;

    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        int size = getResources().getDimensionPixelSize(R.dimen.float_button_size);
        Outline outline = new Outline();
        outline.setOval(0, 0, size, size);
        getActivity().findViewById(R.id.fb_home).setOutline(outline);
    }

}
