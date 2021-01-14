package X;

import android.view.inputmethod.InputMethodInfo;
import android.view.inputmethod.InputMethodManager;
import android.view.inputmethod.InputMethodSubtype;
import java.util.HashSet;
import java.util.Set;

/* renamed from: X.2Ni  reason: invalid class name and case insensitive filesystem */
public class C48692Ni {
    public InputMethodSubtype A00;
    public Set A01;
    public final AnonymousClass03P A02;

    public C48692Ni(AnonymousClass03P r1) {
        this.A02 = r1;
    }

    public final void A00() {
        this.A01 = new HashSet();
        InputMethodManager A0H = this.A02.A0H();
        if (A0H != null) {
            for (InputMethodInfo inputMethodInfo : A0H.getEnabledInputMethodList()) {
                if (inputMethodInfo.getId().startsWith("com.google.android.inputmethod")) {
                    this.A01.addAll(A0H.getEnabledInputMethodSubtypeList(inputMethodInfo, true));
                }
            }
            return;
        }
        throw null;
    }
}
