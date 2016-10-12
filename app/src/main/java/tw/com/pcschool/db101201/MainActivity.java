package tw.com.pcschool.db101201;


import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        FragmentTransaction ft = getFragmentManager().beginTransaction();
//        ft.add(R.id.layout_frag, new FragmentA());
//        ft.commit();
    }
    public void click1(View v)
    {
        FragmentTransaction ft = getFragmentManager().beginTransaction();
        ft.replace(R.id.layout_frag, new FragmentA());
        ft.commit();
    }
    public void click2(View v)
    {
        FragmentTransaction ft = getFragmentManager().beginTransaction();
        ft.replace(R.id.layout_frag, new FragmentB());
        ft.commit();
    }
    public void clickC(View v)
    {
        FragmentTransaction ft = getFragmentManager().beginTransaction();
        ft.replace(R.id.layout_frag, new FragmentC());
        ft.commit();
    }
}
