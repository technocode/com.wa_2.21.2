package X;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import java.util.ArrayList;

/* renamed from: X.1GY  reason: invalid class name */
public class AnonymousClass1GY implements TextWatcher {
    public ArrayList A00;
    public boolean A01 = false;
    public boolean A02 = false;
    public final EditText A03;
    public final String A04;

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public AnonymousClass1GY(String str, EditText editText) {
        int i = 0;
        this.A04 = str;
        this.A03 = editText;
        this.A00 = new ArrayList();
        while (true) {
            String str2 = this.A04;
            if (i < str2.length()) {
                if (str2.charAt(i) != '#') {
                    this.A00.add(Integer.valueOf(i));
                }
                i++;
            } else {
                return;
            }
        }
    }

    public final void A00(Editable editable, int i) {
        StringBuilder sb = new StringBuilder(editable);
        int i2 = 0;
        while (i2 < sb.length()) {
            String str = this.A04;
            if (i2 >= str.length()) {
                break;
            }
            if (str.charAt(i2) == '#') {
                if (!Character.isDigit(sb.charAt(i2))) {
                    sb.replace(i2, i2 + 1, "");
                    if (i2 < i) {
                        i--;
                    }
                    i2--;
                }
            } else if (str.charAt(i2) != sb.charAt(i2)) {
                sb.insert(i2, str.substring(i2, i2 + 1));
                if (i2 <= i) {
                    i++;
                }
            }
            i2++;
        }
        int length = sb.length();
        String str2 = this.A04;
        int length2 = str2.length();
        if (length > length2) {
            sb.delete(i2, sb.length());
            i = i2;
        }
        while (i2 < length2 && str2.charAt(i2) != '#') {
            sb.append(str2.charAt(i2));
            if (i == i2) {
                i++;
            }
            i2++;
        }
        EditText editText = this.A03;
        editText.setText(sb);
        editText.setSelection(i);
        this.A02 = false;
    }

    public void afterTextChanged(Editable editable) {
        int selectionStart = this.A03.getSelectionStart();
        if (!this.A01 && !this.A02) {
            this.A02 = true;
            A00(editable, selectionStart);
        } else if (!this.A02) {
            this.A02 = true;
            if (this.A00.contains(Integer.valueOf(selectionStart))) {
                while (true) {
                    if (selectionStart <= 0) {
                        break;
                    }
                    int i = selectionStart - 1;
                    if (this.A04.charAt(i) == '#') {
                        editable.delete(i, selectionStart);
                        selectionStart = i;
                        break;
                    }
                    editable.delete(i, selectionStart);
                    selectionStart--;
                }
            }
            A00(editable, selectionStart);
        }
    }

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        boolean z = false;
        if (i3 < i2) {
            z = true;
        }
        this.A01 = z;
    }
}
