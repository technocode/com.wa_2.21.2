package X;

import com.google.android.search.verification.client.R;

/* renamed from: X.0kc  reason: invalid class name and case insensitive filesystem */
public abstract class AbstractC13660kc {
    public void A00(int i, CharSequence charSequence) {
        C41711vV r7 = (C41711vV) this;
        AnonymousClass008.A0v("BiometricAuthPlugin/AuthenticationCallback/errorCode: ", i);
        if (i == 7) {
            r7.A01.A0C(r7.A00.getString(R.string.app_auth_lockout_error, 30), 1);
        }
        r7.A02.AD9(false);
    }

    public void A01(C13670kd r3) {
        ((C41711vV) this).A02.AD9(true);
    }
}
