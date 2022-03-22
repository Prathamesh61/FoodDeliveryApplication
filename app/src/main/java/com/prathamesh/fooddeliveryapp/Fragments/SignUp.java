package com.prathamesh.fooddeliveryapp.Fragments;

import static android.content.ContentValues.TAG;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.prathamesh.fooddeliveryapp.LoginActivity;
import com.prathamesh.fooddeliveryapp.MainActivity;
import com.prathamesh.fooddeliveryapp.R;
import com.prathamesh.fooddeliveryapp.databinding.FragmentSignUpBinding;


public class SignUp extends Fragment {
  /**  public SignUp() {
        // Required empty public constructor
    }
    FirebaseAuth auth;
    EditText EDSignUpEmail,EDSignUpPassword,EDSignUpReEnterPassword;
    TextView TVNameSignUp;
    Button btnSignUp;
   public ProgressBar progressBar;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        auth = FirebaseAuth.getInstance();
         View view=inflater.inflate(R.layout.fragment_sign_up, container, false);
         EDSignUpEmail=view.findViewById(R.id.emailidSignUpED);
         TVNameSignUp=view.findViewById(R.id.NameSignUpED);
         EDSignUpPassword   =view.findViewById(R.id.passwordSignUpED);
         EDSignUpReEnterPassword   =view.findViewById(R.id.REpasswordSignUpED);
         btnSignUp   =view.findViewById(R.id.BtnSignUp);
         btnSignUp.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 registerNewUser();
             }
         });
        return view;
    }
    private void registerNewUser()
    {
        // show the visibility of progress bar to show loading
        progressBar.setVisibility(View.VISIBLE);

        // Take the value of two edit texts in Strings
        String email, password;
        email = emailTextView.getText().toString();
        password = passwordTextView.getText().toString();

        // Validations for input email and password
        if (TextUtils.isEmpty(email)) {
            Toast.makeText(getApplicationContext(),
                    "Please enter email!!",
                    Toast.LENGTH_LONG)
                    .show();
            return;
        }
        if (TextUtils.isEmpty(password)) {
            Toast.makeText(getApplicationContext(),
                    "Please enter password!!",
                    Toast.LENGTH_LONG)
                    .show();
            return;
        }

        // create new user or register new user
                auth.createUserWithEmailAndPassword(email, password)
                .addOnCompleteListener(new OnCompleteListener<AuthResult>() {

                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task)
                    {
                        if (task.isSuccessful()) {
                            Toast.makeText(LoginActivity.class,
                                    "Registration successful!",
                                    Toast.LENGTH_LONG)
                                    .show();

                            // hide the progress bar
                            progressBar.setVisibility(View.GONE);

                            // if the user created intent to login activity
                            Intent intent
                                    = new Intent(RegistrationActivity.this,
                                    MainActivity.class);
                            startActivity(intent);
                        }
                        else {

                            // Registration failed
                            Toast.makeText(
                                    getApplicationContext(),
                                    "Registration failed!!"
                                            + " Please try again later",
                                    Toast.LENGTH_LONG)
                                    .show();

                            // hide the progress bar
                            progressBar.setVisibility(View.GONE);
                        }
                    }
                });
    }
}**/
}