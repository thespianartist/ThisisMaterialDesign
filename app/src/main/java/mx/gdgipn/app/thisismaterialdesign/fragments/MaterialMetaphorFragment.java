package mx.gdgipn.app.thisismaterialdesign.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import mx.gdgipn.app.thisismaterialdesign.R;

/**
 * Created by thespianartist on 7/7/14.
 */
public class MaterialMetaphorFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View materialMetaphorView = inflater.inflate(R.layout.fragment_material_metaphor,container,false);
        return materialMetaphorView;

    }
}
