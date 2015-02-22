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
import android.widget.ImageView;

/**
 * Created by student on 2/13/15.
 */
   public class FragmentTwo extends Fragment{
        public void FragmentTwo(){}

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup parentViewGroup,
                                 Bundle savedInstanceState) {
            ImageView image = new ImageView(getActivity());
            image.setImageResource(R.drawable.myimage2);
            //image.setBackgroundColor(Color.parseColor("#FFFFFF"));
            image.setLayoutParams(new FrameLayout.LayoutParams(400, 400, Gravity.CENTER));
            return image;
            //View rootView = inflater.inflate(R.layout.activity_fragment2, parentViewGroup, false);
            //return rootView;
        }
    }
