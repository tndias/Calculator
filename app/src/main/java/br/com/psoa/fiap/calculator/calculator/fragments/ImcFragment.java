package br.com.psoa.fiap.calculator.calculator.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import br.com.psoa.fiap.calculator.calculator.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class ImcFragment extends Fragment {


    public ImcFragment() {
        // Required empty public constructor
    }

    private EditText eAltura;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_imc, container, false);
        eAltura = (EditText) v.findViewById(R.id.tvAlturaValor);
        return v;
    }

}
