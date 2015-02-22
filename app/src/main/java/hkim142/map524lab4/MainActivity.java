package hkim142.map524lab4;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.MenuItem;
import android.widget.Button;


public class MainActivity extends ActionBarActivity {
    FragmentManager manager = getFragmentManager();
    FragmentTransaction transaction = manager.beginTransaction();
    FragmentOne fragOne = new FragmentOne();
    FragmentTwo fragTwo = new FragmentTwo();
    int i = 1;
    int i2 = 2;
    int i3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        transaction.add(R.id.fragView1, fragOne, "Fragment1");
        transaction.add(R.id.fragView2, fragTwo, "Fragment2");
        transaction.commit();

        Button button = (Button) findViewById(R.id.button1);
        button.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                Fragment fragment = new FragmentOne();
                Fragment fragment2 = new FragmentTwo();
                FragmentManager fragmentManager = getFragmentManager();
                fragmentManager.beginTransaction()
                        .replace(R.id.fragView+i2, fragment)
                        .replace(R.id.fragView+i, fragment2)
                        .addToBackStack(null)
                        .commit();
                swap();
            }

        });

    }

    public void swap() {
    {
        i3 = i2;
        i2 = i;
        i = i3;
    }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the  Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }


}