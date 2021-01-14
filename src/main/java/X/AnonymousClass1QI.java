package X;

import android.text.Editable;
import android.text.TextWatcher;
import com.whatsapp.backup.encryptedbackup.ConfirmPasswordActivity;
import com.whatsapp.components.Button;

/* renamed from: X.1QI  reason: invalid class name */
public class AnonymousClass1QI implements TextWatcher {
    public final /* synthetic */ ConfirmPasswordActivity A00;

    public void afterTextChanged(Editable editable) {
    }

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public AnonymousClass1QI(ConfirmPasswordActivity confirmPasswordActivity) {
        this.A00 = confirmPasswordActivity;
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        ConfirmPasswordActivity confirmPasswordActivity = this.A00;
        Button button = confirmPasswordActivity.A02;
        int length = confirmPasswordActivity.A00.length();
        boolean z = false;
        if (length >= 8) {
            z = true;
        }
        button.setEnabled(z);
    }
}
