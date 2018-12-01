package burger.burgerized;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.Toast;

public class bk_combos extends Fragment {
    private static final String TAG = "WC_Fragment";
    ImageButton item1, item2, item3, item4;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState){
        View view = inflater.inflate(R.layout.bk_combos, container, false);
        item1 = view.findViewById(R.id.combo1);
        item2 = view.findViewById(R.id.combo2);
        item3 = view.findViewById(R.id.combo3);
        item4 = view.findViewById(R.id.combo4);

        item1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                ComboBuilder selectedCombo = new RegularBurgerCombo();
                ComboAssembler comboAssembler = new ComboAssembler(selectedCombo);
                comboAssembler.makeCombo();
                Combos builtCombo = comboAssembler.getCombo();
                Toast.makeText(getActivity(), builtCombo.getSelectedBurger(),Toast.LENGTH_SHORT).show();
            }
        });
        item2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                ComboBuilder selectedCombo = new BCBCombo();
                ComboAssembler comboAssembler = new ComboAssembler(selectedCombo);
                comboAssembler.makeCombo();
                Combos builtCombo = comboAssembler.getCombo();
                Toast.makeText(getActivity(), builtCombo.getSelectedBurger(),Toast.LENGTH_SHORT).show();
            }
        });
        item3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                ComboBuilder selectedCombo = new DeluxeCBCombo();
                ComboAssembler comboAssembler = new ComboAssembler(selectedCombo);
                comboAssembler.makeCombo();
                Combos builtCombo = comboAssembler.getCombo();
                Toast.makeText(getActivity(), builtCombo.getSelectedBurger(),Toast.LENGTH_SHORT).show();
            }
        });
        item4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                ComboBuilder selectedCombo = new ChickSand();
                ComboAssembler comboAssembler = new ComboAssembler(selectedCombo);
                comboAssembler.makeCombo();
                Combos builtCombo = comboAssembler.getCombo();
                Toast.makeText(getActivity(), builtCombo.getSelectedBurger(),Toast.LENGTH_SHORT).show();
            }
        });
        return view;
    }
}
