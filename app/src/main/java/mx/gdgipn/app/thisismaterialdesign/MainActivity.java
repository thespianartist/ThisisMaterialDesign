package mx.gdgipn.app.thisismaterialdesign;


import android.app.ActionBar;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;


import java.util.List;
import java.util.Vector;

import mx.gdgipn.app.thisismaterialdesign.adapters.PagerAdapter;
import mx.gdgipn.app.thisismaterialdesign.fragments.HomeFragment;
import mx.gdgipn.app.thisismaterialdesign.fragments.MaterialMetaphorFragment;


public class MainActivity extends FragmentActivity {

    private ActionBar actionBar;
    private PagerAdapter pagerAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Ocultamos el ActionBar para que parezca mas al PDF
        actionBar = getActionBar();
        actionBar.hide();

        //Agregamos las vistas de Fragmento como ViewPager
        setupViewPager();


    }

    public void  setupViewPager(){

        //Lista de Fragmentos disponibles hasta el momento
        List<Fragment> fragments = new Vector<Fragment>();
        fragments.add(Fragment.instantiate(this, HomeFragment.class.getName()));
        fragments.add(Fragment.instantiate(this, MaterialMetaphorFragment.class.getName()));

        //Seteamos el Adapter con el List de Fragmentos y con el FragmentManager
        pagerAdapter  = new PagerAdapter(getSupportFragmentManager(), fragments);
        ViewPager pager = (ViewPager)super.findViewById(R.id.view_pager);
        pager.setAdapter(this.pagerAdapter);



    }



}
