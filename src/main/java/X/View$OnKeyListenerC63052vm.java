package X;

import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
import com.whatsapp.payments.ui.widget.DebitCardInputText;

/* renamed from: X.2vm  reason: invalid class name and case insensitive filesystem */
public class View$OnKeyListenerC63052vm implements View.OnKeyListener {
    public final EditText A00;
    public final EditText A01;

    public View$OnKeyListenerC63052vm(EditText editText, EditText editText2) {
        this.A01 = editText;
        this.A00 = editText2;
    }

    public boolean onKey(View view, int i, KeyEvent keyEvent) {
        EditText editText;
        DebitCardInputText debitCardInputText = (DebitCardInputText) view;
        if (debitCardInputText != null && keyEvent.getAction() == 0 && debitCardInputText.isFocused()) {
            if (i != 67 || (editText = this.A01) == null || !TextUtils.isEmpty(debitCardInputText.getText())) {
                EditText editText2 = this.A00;
                if (!(editText2 == null || i == 67 || debitCardInputText.getText() == null || debitCardInputText.getText().length() != debitCardInputText.A05)) {
                    debitCardInputText.clearFocus();
                    editText2.requestFocus();
                    return true;
                }
            } else {
                debitCardInputText.clearFocus();
                editText.requestFocus();
                return true;
            }
        }
        return false;
    }
}
