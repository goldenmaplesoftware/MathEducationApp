package com.example.lab4.Contact;

import android.Manifest;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.lab4.R;
import com.google.android.material.snackbar.Snackbar;

import java.util.Objects;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link ContactDeveloperFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class ContactDeveloperFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public ContactDeveloperFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment ContactDeveloperFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static ContactDeveloperFragment newInstance(String param1, String param2) {
        ContactDeveloperFragment fragment = new ContactDeveloperFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_contact_developer, container, false);
        FragmentManager fragmentManager= requireActivity().getSupportFragmentManager();
        Button button1=view.findViewById(R.id.mapButton);
        button1.setOnClickListener(new View.OnClickListener()  ///Makes the button active
        {
            @SuppressLint("QueryPermissionsNeeded")
            @Override
            public void onClick(View v) {
                /*
                fragmentManager.beginTransaction() ///Transaction when clicked..
                        ///This is the custom animation when the button is clicked
                        .setCustomAnimations(R.anim.animate_in_down,R.anim.animate_out_down,R.anim.animate_back_in_down,R.anim.animation_back_out_down)
                        .replace(R.id.content,new AndroidDeveloper()).addToBackStack(null).commit();
                */
                Intent intent=new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("geo:42.2465,-83.0191"));
                Intent chooser=Intent.createChooser(intent,"Launch Map");
                startActivity(chooser);

                /* Permissions for the application,  works when prompted
                if(intent.resolveActivity(requireActivity().getPackageManager())!=null)
                {

                    startActivity(chooser);
                }

                else
                    {
                        Snackbar snackbar=Snackbar.make(requireActivity().findViewById(android.R.id.content),"You need to download Google Maps to view this, please download it!",Snackbar.LENGTH_SHORT);
                        snackbar.show();
                    }
            */
            }
        });


        Button button2=view.findViewById(R.id.buttonEmail); ///Android button
        button2.setOnClickListener(new View.OnClickListener()  ///Makes the button active
        {
            @SuppressLint("QueryPermissionsNeeded")
            @Override
            public void onClick(View v)
            {
                String[] emailAddress={"fakeemail@fakedomain.ca"};
                Intent intent=new Intent(Intent.ACTION_SENDTO);
                intent.setData(Uri.parse("mailto:"));
                intent.putExtra(Intent.EXTRA_EMAIL,emailAddress);
                intent.putExtra(Intent.EXTRA_SUBJECT,"Hello, please can you help me with an issue with your education application");
                Intent chooser=Intent.createChooser(intent,"Launch Email");
                startActivity(chooser);

                /* Permissions for the application,  works when prompted
                if(intent.resolveActivity(requireActivity().getPackageManager())!=null)
                {

                    startActivity(chooser);
                }

                else
                    {
                        Snackbar snackbar=Snackbar.make(requireActivity().findViewById(android.R.id.content),"You need to download Google Maps to view this, please download it!",Snackbar.LENGTH_SHORT);
                        snackbar.show();
                    }
            */



            }

        });


        Button button3=view.findViewById(R.id.buttonSMS); ///Android button
        button3.setOnClickListener(new View.OnClickListener()  ///Makes the button active
        {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(Intent.ACTION_SENDTO);
                intent.setData(Uri.parse("smsto:5555555555"));
                intent.putExtra("sms_body","Hello Golden Maple,\n");
                Intent chooser=Intent.createChooser(intent,"Launch SMS");
                startActivity(chooser);

                /* Permissions for the application,  works when prompted
                if(intent.resolveActivity(requireActivity().getPackageManager())!=null)
                {

                    startActivity(chooser);
                }

                else
                    {
                        Snackbar snackbar=Snackbar.make(requireActivity().findViewById(android.R.id.content),"You need to download Google Maps to view this, please download it!",Snackbar.LENGTH_SHORT);
                        snackbar.show();
                    }
            */

            }
        });

        Button button4=view.findViewById(R.id.buttonCall); ///Android button
        button4.setOnClickListener(new View.OnClickListener()  ///Makes the button active
        {
            @SuppressLint("QueryPermissionsNeeded")
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:" + 555555));
                Intent chooser=Intent.createChooser(intent,"Launch Phone");
                startActivity(chooser);

                /* Permissions for the application,  works when prompted
                if(intent.resolveActivity(requireActivity().getPackageManager())!=null)
                {

                    startActivity(chooser);
                }

                else
                    {
                        Snackbar snackbar=Snackbar.make(requireActivity().findViewById(android.R.id.content),"You need to download Google Maps to view this, please download it!",Snackbar.LENGTH_SHORT);
                        snackbar.show();
                    }
            */
            }


        });

        ///Open Developer Website
        Button button5=view.findViewById(R.id.buttonCustomIntent); ///Android button
        button5.setOnClickListener(new View.OnClickListener()  ///Makes the button active
        {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://goldenmaplesoftware.ca"));  ///Must have https:// prefacing web address or the action will not be recognized
                Intent chooser=Intent.createChooser(intent,"Launch Developer Website");
                startActivity(chooser);

                /* Permissions for the application,  works when prompted
                if(intent.resolveActivity(requireActivity().getPackageManager())!=null)
                {

                    startActivity(chooser);
                }

                else
                    {
                        Snackbar snackbar=Snackbar.make(requireActivity().findViewById(android.R.id.content),"You need to download Google Maps to view this, please download it!",Snackbar.LENGTH_SHORT);
                        snackbar.show();
                    }
            */


            }
        });



        return view;
    }
}