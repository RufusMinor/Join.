package com.example.joinv10;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import com.example.joinv10.databinding.FragmentListBinding;
import com.google.android.material.floatingactionbutton.FloatingActionButton;


public class ListFragment extends Fragment {
FragmentListBinding binding;
private FloatingActionButton add;
LinearLayout containerList;






    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding=FragmentListBinding.inflate(inflater,container,false);
        View root=binding.getRoot();

        add=(FloatingActionButton)root.findViewById(R.id.floating_action_button);
        containerList=(LinearLayout) root.findViewById(R.id.containerList);


//Test!
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                addCard();
            }
        });
return root;
    }

    private void addCard() {
        View view=getLayoutInflater().inflate(R.layout.card,null);
        containerList.addView(view);
    }
}