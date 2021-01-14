package X;

import android.text.Editable;
import android.text.TextWatcher;
import com.google.android.material.textfield.TextInputLayout;

/* renamed from: X.1EA  reason: invalid class name */
public class AnonymousClass1EA implements TextWatcher {
    public final /* synthetic */ TextInputLayout A00;

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public AnonymousClass1EA(TextInputLayout textInputLayout) {
        this.A00 = textInputLayout;
    }

    public void afterTextChanged(Editable editable) {
        TextInputLayout textInputLayout = this.A00;
        textInputLayout.A0F(!textInputLayout.A0d, false);
        if (textInputLayout.A0R) {
            textInputLayout.A0C(editable.length());
        }
    }
}
