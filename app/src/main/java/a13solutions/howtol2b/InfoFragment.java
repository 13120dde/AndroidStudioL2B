package a13solutions.howtol2b;


import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class InfoFragment extends Fragment {

    private TextView tvWhatToDo, tvContent;
    private ImageView image;


    public InfoFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_info, container, false);
        instantiateComponents(view);
        return view;
    }

    private void instantiateComponents(View view) {
        tvWhatToDo = view.findViewById(R.id.tvWhatToDo);
        tvContent = view.findViewById(R.id.tvContent);
        image = view.findViewById(R.id.imageView);
    }

    public void setWhatToDo(String whatToDo) {
        tvWhatToDo.setText(whatToDo);
    }

    public void setContent(String content) {
        tvContent.setText(content);
    }

    public void setImage(int image) {
        this.image.setImageResource(image);
    }
}
