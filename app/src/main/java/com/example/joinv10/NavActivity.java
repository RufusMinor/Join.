package com.example.joinv10;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

import com.example.joinv10.databinding.ActivityNavBinding;

public class NavActivity extends AppCompatActivity {
        ActivityNavBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding= ActivityNavBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        replaceFragment(new ListFragment());
        binding.bottomNavigationView.setOnItemSelectedListener(item -> {

            switch (item.getItemId()){

                case R.id.List:
                    replaceFragment(new ListFragment());
                    break;
                case R.id.Favorites:
                    replaceFragment(new FavoritesFragment());
                    break;
                case R.id.My_party:
                    replaceFragment(new MyPartyFragment());
                    break;
                case R.id.Setting:
                    replaceFragment(new SettingsFragment());
                    break;

            }
            return true;
        });
    }

private void replaceFragment(Fragment fragment){

    FragmentManager fragmentManager=getSupportFragmentManager();
    FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
    fragmentTransaction.replace(R.id.frameLayout,fragment);
    fragmentTransaction.commit();

}
}