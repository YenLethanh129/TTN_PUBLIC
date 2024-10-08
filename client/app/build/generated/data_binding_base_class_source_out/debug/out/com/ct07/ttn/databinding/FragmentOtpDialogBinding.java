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

public final class FragmentOtpDialogBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final TextView btnResendOTP;

  @NonNull
  public final TextView btnVerifyOTP;

  @NonNull
  public final TextInputEditText otp;

  private FragmentOtpDialogBinding(@NonNull LinearLayout rootView, @NonNull TextView btnResendOTP,
      @NonNull TextView btnVerifyOTP, @NonNull TextInputEditText otp) {
    this.rootView = rootView;
    this.btnResendOTP = btnResendOTP;
    this.btnVerifyOTP = btnVerifyOTP;
    this.otp = otp;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentOtpDialogBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentOtpDialogBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_otp_dialog, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentOtpDialogBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btnResendOTP;
      TextView btnResendOTP = ViewBindings.findChildViewById(rootView, id);
      if (btnResendOTP == null) {
        break missingId;
      }

      id = R.id.btnVerifyOTP;
      TextView btnVerifyOTP = ViewBindings.findChildViewById(rootView, id);
      if (btnVerifyOTP == null) {
        break missingId;
      }

      id = R.id.otp;
      TextInputEditText otp = ViewBindings.findChildViewById(rootView, id);
      if (otp == null) {
        break missingId;
      }

      return new FragmentOtpDialogBinding((LinearLayout) rootView, btnResendOTP, btnVerifyOTP, otp);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
