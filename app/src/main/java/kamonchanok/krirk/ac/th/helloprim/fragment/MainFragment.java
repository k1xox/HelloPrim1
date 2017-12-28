package kamonchanok.krirk.ac.th.helloprim.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import kamonchanok.krirk.ac.th.helloprim.R;

/**
 * Created by User on 28/12/2560.
 */

public class MainFragment  extends Fragment{

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {

    View view = inflater.inflate(R.layout.fragment_main, container,false);

        return view;
    }


} //Main Class
