// Generated by view binder compiler. Do not edit!
package com.ct07.ttn.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.ct07.ttn.R;
import com.google.android.material.textfield.TextInputEditText;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentRegisterDialogBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final TextView btnLogin;

  @NonNull
  public final TextView btnRegister;

  @NonNull
  public final TextInputEditText registerUserName;

  @NonNull
  public final TextInputEditText registerUserPassword;

  @NonNull
  public final TextInputEditText registerUserPhone;

  @NonNull
  public final TextInputEditText registerUserRePassword;

  private FragmentRegisterDialogBinding(@NonNull LinearLayout rootView, @NonNull TextView btnLogin,
      @NonNull TextView btnRegister, @NonNull TextInputEditText registerUserName,
      @NonNull TextInputEditText registerUserPassword, @NonNull TextInputEditText registerUserPhone,
      @NonNull TextInputEditText registerUserRePassword) {
    this.rootView = rootView;
    this.btnLogin = btnLogin;
    this.btnRegister = btnRegister;
    this.registerUserName = registerUserName;
    this.registerUserPassword = registerUserPassword;
    this.registerUserPhone = registerUserPhone;
    this.registerUserRePassword = registerUserRePassword;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentRegisterDialogBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentRegisterDialogBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_register_dialog, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentRegisterDialogBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btnLogin;
      TextView btnLogin = ViewBindings.findChildViewById(rootView, id);
      if (btnLogin == null) {
        break missingId;
      }

      id = R.id.btnRegister;
      TextView btnRegister = ViewBindings.findChildViewById(rootView, id);
      if (btnRegister == null) {
        break missingId;
      }

      id = R.id.registerUserName;
      TextInputEditText registerUserName = ViewBindings.findChildViewById(rootView, id);
      if (registerUserName == null) {
        break missingId;
      }

      id = R.id.registerUserPassword;
      TextInputEditText registerUserPassword = ViewBindings.findChildViewById(rootView, id);
      if (registerUserPassword == null) {
        break missingId;
      }

      id = R.id.registerUserPhone;
      TextInputEditText registerUserPhone = ViewBindings.findChildViewById(rootView, id);
      if (registerUserPhone == null) {
        break missingId;
      }

      id = R.id.registerUserRePassword;
      TextInputEditText registerUserRePassword = ViewBindings.findChildViewById(rootView, id);
      if (registerUserRePassword == null) {
        break missingId;
      }

      return new FragmentRegisterDialogBinding((LinearLayout) rootView, btnLogin, btnRegister,
          registerUserName, registerUserPassword, registerUserPhone, registerUserRePassword);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
