package X;

import android.text.Editable;
import android.text.TextWatcher;
import com.whatsapp.backup.encryptedbackup.PasswordInputActivity;
import com.whatsapp.components.Button;

/* renamed from: X.1QK  reason: invalid class name */
public class AnonymousClass1QK implements TextWatcher {
    public final /* synthetic */ PasswordInputActivity A00;

    public void afterTextChanged(Editable editable) {
    }

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public AnonymousClass1QK(PasswordInputActivity passwordInputActivity) {
        this.A00 = passwordInputActivity;
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        PasswordInputActivity passwordInputActivity = this.A00;
        Button button = passwordInputActivity.A01;
        int length = passwordInputActivity.A00.length();
        boolean z = false;
        if (length >= 8) {
            z = true;
        }
        button.setEnabled(z);
    }
}
