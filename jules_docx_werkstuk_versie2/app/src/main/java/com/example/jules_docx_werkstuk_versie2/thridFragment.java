package com.example.jules_docx_werkstuk_versie2;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class thridFragment extends Fragment {

    public thridFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_thrid, container, false);
        TextView txtTitle = view.findViewById(R.id.titleName);
        List<User> users = MainActivity.dbRoom.myDao().getUsers();

        String fullName = "";
        for(User usr: users) {
            String firstName = usr.getFirstName();
            String lastName = usr.getLastName();

            fullName = fullName + firstName + lastName;
        }
        txtTitle.setText(fullName);

        return view;
    }
}
