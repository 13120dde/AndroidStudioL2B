package a13solutions.howtol2b;

import android.app.Activity;
import android.app.FragmentManager;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends Activity {

    private Controller controller;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        instantiateController();
    }

    private void instantiateController() {
        FragmentManager fm = getFragmentManager();
        ButtonFragment btnFragment = (ButtonFragment) fm.findFragmentById(R.id.fragmentButton);
        InfoFragment infoFragment= (InfoFragment) fm.findFragmentById(R.id.fragmentInfo);
        controller = new Controller(infoFragment,btnFragment);

    }


}
