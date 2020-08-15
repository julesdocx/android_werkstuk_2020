package com.example.jules_docx_werkstuk_versie2;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.TextView;

import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class thridFragment extends Fragment {

    public thridFragment() {
        // Required empty public constructor
    }

    TextView txtTitle;
    CheckBox checkBox;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_thrid, container, false);
        txtTitle = view.findViewById(R.id.titleName);
        checkBox = view.findViewById(R.id.theCheckBox);
        List<User> users = MainActivity.dbRoom.myDao().getUsers();

        String fullName = "";
        for(User usr: users) {
            String firstName = usr.getFirstName();
            String lastName = usr.getLastName();

            fullName = fullName + firstName + lastName;
        }
        txtTitle.setText(fullName);

        checkBox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (checkBox.isChecked()) {
                    checkBox.setText(R.string.checked);
                    checkBox.setTextColor(getResources().getColor(R.color.checked));
                } else {
                    checkBox.setText(R.string.unchecked);
                    checkBox.setTextColor(getResources().getColor(R.color.unchecked));
                }
            }
        });

        return view;
    }
}
