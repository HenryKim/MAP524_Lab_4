package hkim142.map524lab4;

import android.app.Fragment;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.MenuItem;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.Gallery;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioGroup;

/**
 * Created by student on 2/13/15.
 */
public class FragmentOne extends Fragment{
    public void FragmentOne(){}

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup parentViewGroup,
                             Bundle savedInstanceState) {
        ImageView image = new ImageView(getActivity());
        image.setImageResource(R.drawable.myimage);
        image.setBackgroundColor(Color.parseColor("#00FF55"));
        image.setLayoutParams(new FrameLayout.LayoutParams(400, 300, Gravity.CENTER));
        return image;


        //View rootView = inflater.inflate(R.layout.activity_fragment1, parentViewGroup, false);
        //return rootView;
    }
}

