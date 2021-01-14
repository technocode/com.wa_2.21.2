package X;

import android.telephony.PhoneNumberUtils;
import android.text.Editable;
import android.text.Selection;
import android.text.TextWatcher;

/* renamed from: X.34Y  reason: invalid class name */
public class AnonymousClass34Y implements TextWatcher {
    public int A00;
    public AnonymousClass1F3 A01;
    public boolean A02 = false;
    public boolean A03;

    public AnonymousClass34Y(String str) {
        boolean z = false;
        AnonymousClass00E.A06(str != null ? true : z);
        if (C12440i6.A00() != null) {
            this.A01 = new AnonymousClass1F3(str);
            return;
        }
        throw null;
    }

    public static final boolean A00(CharSequence charSequence, int i, int i2) {
        for (int i3 = i; i3 < i + i2; i3++) {
            if (!PhoneNumberUtils.isNonSeparator(charSequence.charAt(i3))) {
                return true;
            }
        }
        return false;
    }

    public synchronized void afterTextChanged(Editable editable) {
        int i;
        boolean z = true;
        if (this.A03) {
            if (editable.length() == 0) {
                z = false;
            }
            this.A03 = z;
        } else if (!this.A02) {
            int selectionEnd = Selection.getSelectionEnd(editable) - 1;
            this.A01.A07();
            int length = editable.length();
            String str = null;
            char c = 0;
            boolean z2 = false;
            for (int i2 = 0; i2 < length; i2++) {
                char charAt = editable.charAt(i2);
                if (PhoneNumberUtils.isNonSeparator(charAt)) {
                    if (c != 0) {
                        if (z2) {
                            AnonymousClass1F3 r0 = this.A01;
                            str = r0.A05(c, true);
                            r0.A07 = str;
                        } else {
                            AnonymousClass1F3 r02 = this.A01;
                            str = r02.A05(c, false);
                            r02.A07 = str;
                        }
                        z2 = false;
                    }
                    c = charAt;
                }
                if (i2 == selectionEnd) {
                    z2 = true;
                }
            }
            if (c != 0) {
                if (z2) {
                    AnonymousClass1F3 r03 = this.A01;
                    str = r03.A05(c, true);
                    r03.A07 = str;
                } else {
                    AnonymousClass1F3 r04 = this.A01;
                    str = r04.A05(c, false);
                    r04.A07 = str;
                }
            }
            if (str != null) {
                AnonymousClass1F3 r4 = this.A01;
                if (!r4.A0G) {
                    i = r4.A01;
                } else {
                    i = 0;
                    int i3 = 0;
                    while (i3 < r4.A02 && i < r4.A07.length()) {
                        if (r4.A0B.charAt(i3) == r4.A07.charAt(i)) {
                            i3++;
                        }
                        i++;
                    }
                }
                this.A02 = true;
                editable.replace(0, editable.length(), str, 0, str.length());
                if (str.equals(editable.toString())) {
                    Selection.setSelection(editable, i);
                }
                this.A02 = false;
            }
        }
    }

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        if (!this.A02 && !this.A03) {
            if (i2 == 0 && charSequence.length() == i) {
                this.A00 = 1;
                return;
            }
            if (i3 == 0 && i + i2 == charSequence.length()) {
                if (i2 > 0) {
                    this.A00 = 0;
                    return;
                }
            } else if (i2 > 0 && !A00(charSequence, i, i2)) {
                this.A00 = 2;
                return;
            }
            this.A00 = 3;
        }
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        if (!this.A02 && !this.A03) {
            if (this.A00 == 3 && i3 > 0 && !A00(charSequence, i, i3)) {
                this.A00 = 2;
            }
            if (this.A00 == 1 && i3 > 0 && A00(charSequence, i, i3)) {
                this.A03 = true;
                this.A01.A07();
            } else if (this.A00 == 3) {
                this.A03 = true;
                this.A01.A07();
            }
        }
    }
}
