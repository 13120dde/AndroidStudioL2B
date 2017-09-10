package a13solutions.howtol2b;


import android.content.DialogInterface;
import android.os.Bundle;
import android.app.Fragment;
import android.support.v7.app.AlertDialog;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.view.View.OnClickListener;



/**
 * A simple {@link Fragment} subclass.
 */
public class ButtonFragment extends Fragment {

    private Button btnPrevious, btnNext;
    private Controller controller;

    public ButtonFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_button, container, false);
        instantiateButtons(view);
        registerListeners();

        return view;
    }

    private void instantiateButtons(View view) {
        btnPrevious = (Button)view.findViewById(R.id.btnPrevious);
        btnNext = (Button)view.findViewById(R.id.btnNext);
    }

    public void setController(Controller controller) {
        this.controller = controller;
    }

    private void registerListeners() {

        btnPrevious.setOnClickListener(new ButtonListener());
        btnNext.setOnClickListener(new ButtonListener());
    }

    private class ButtonListener implements OnClickListener {
        @Override
        public void onClick(View view) {
            if(view.getId()==btnNext.getId()){
                controller.nextClick();
            }
            if(view.getId()==btnPrevious.getId()){
                controller.previousClick();
            }

        }
    }
}
