package X;

import android.text.Editable;
import android.text.TextWatcher;
import com.whatsapp.backup.encryptedbackup.RestorePasswordInputActivity;
import com.whatsapp.components.Button;

/* renamed from: X.1QL  reason: invalid class name */
public class AnonymousClass1QL implements TextWatcher {
    public final /* synthetic */ RestorePasswordInputActivity A00;

    public void afterTextChanged(Editable editable) {
    }

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public AnonymousClass1QL(RestorePasswordInputActivity restorePasswordInputActivity) {
        this.A00 = restorePasswordInputActivity;
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        RestorePasswordInputActivity restorePasswordInputActivity = this.A00;
        Button button = restorePasswordInputActivity.A01;
        int length = restorePasswordInputActivity.A00.length();
        boolean z = false;
        if (length >= 8) {
            z = true;
        }
        button.setEnabled(z);
    }
}
