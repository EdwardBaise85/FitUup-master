package com.example.dsuappacademy.fituup;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by dsuappacademy on 8/10/16.
 */
public class EmailFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        setHasOptionsMenu(true);
        View view =inflater.inflate(R.layout.email_layout,container,false);
        return view;

    }

    public void sendEmail(View button){
//        final EditText formName=(EditText)setHasOptionsMenu(R.id.formName);
//        String clientName=formName.getText().toString();
//        final EditText formEmail=(EditText)sendEmail(R.id.formEmail);
//        String clientEmail=formEmail.getText().toString();
//        final EditText formDetails=(EditText)getActivity(R.id.formDetails);
//        String clientDetails=formDetails.getText().toString();
//
//        Intent i = new Intent(Intent.ACTION_SEND);
//        i.setType("message/rfc822");
//        i.putExtra(Intent.EXTRA_EMAIL,new String[]{"example@email.com"});
//        i.putExtra(Intent.EXTRA_SUBJECT, "New Private Service Request");
//        i.putExtra(Intent.EXTRA_TEXT, "TODO: compose message body");
//        try {
//            startActivity(Intent.createChooser(i, "Send email with...?"));
//        } catch (android.content.ActivityNotFoundException exception) {
//            Toast.makeText(EmailFragment.this.getActivity(), "No email clients installed on device!", Toast.LENGTH_LONG).show();
//        }
    }

}

