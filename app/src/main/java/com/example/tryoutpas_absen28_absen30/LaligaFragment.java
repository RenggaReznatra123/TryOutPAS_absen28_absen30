package com.example.tryoutpas_absen28_absen30;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

public class LaligaFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Gantilah fragment_home jika perlu
        return inflater.inflate(R.layout.fragment_home, container, false);
    }
}
