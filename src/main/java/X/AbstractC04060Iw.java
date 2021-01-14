package X;

import androidx.biometric.FingerprintHelperFragment;
import com.google.android.search.verification.client.R;
import com.whatsapp.util.Log;
import java.security.Signature;
import javax.crypto.Cipher;
import javax.crypto.Mac;

/* renamed from: X.0Iw  reason: invalid class name and case insensitive filesystem */
public abstract class AbstractC04060Iw {
    public void A00() {
        if (!(this instanceof C40031sW)) {
            C29691a1 r5 = (C29691a1) this;
            FingerprintHelperFragment fingerprintHelperFragment = r5.A00;
            C13750kl r3 = fingerprintHelperFragment.A04;
            r3.A00.obtainMessage(1, fingerprintHelperFragment.A01.getResources().getString(R.string.fingerprint_not_recognized)).sendToTarget();
            fingerprintHelperFragment.A06.execute(new RunnableEBaseShape5S0100000_I1_0(r5, 11));
            return;
        }
        Log.i("AppAuthManager/authenticate: authentication failed");
        AbstractC27431Py r0 = (AbstractC27431Py) ((C40031sW) this).A00.get();
        if (r0 != null) {
            r0.ADB();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x006a, code lost:
        if (X.AnonymousClass0N2.A1f(r1, android.os.Build.MODEL) == false) goto L_0x006c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A01(int r7, java.lang.CharSequence r8) {
        /*
        // Method dump skipped, instructions count: 198
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC04060Iw.A01(int, java.lang.CharSequence):void");
    }

    public void A02(int i, CharSequence charSequence) {
        if (!(this instanceof C40031sW)) {
            ((C29691a1) this).A00.A04.A00.obtainMessage(1, charSequence).sendToTarget();
            return;
        }
        StringBuilder sb = new StringBuilder("AppAuthManager/authenticate: authentication help=");
        sb.append(i);
        sb.append(" errString=");
        sb.append((Object) charSequence);
        Log.i(sb.toString());
        AbstractC27431Py r0 = (AbstractC27431Py) ((C40031sW) this).A00.get();
        if (r0 != null) {
            r0.ADC(i, charSequence);
        }
    }

    public void A03(C14730mn r7) {
        if (!(this instanceof C40031sW)) {
            C29691a1 r5 = (C29691a1) this;
            FingerprintHelperFragment fingerprintHelperFragment = r5.A00;
            fingerprintHelperFragment.A04.A00.obtainMessage(5).sendToTarget();
            C04070Ix r0 = r7.A00;
            if (r0 != null) {
                Cipher cipher = r0.A01;
                if (cipher != null) {
                    new C13680ke(cipher);
                } else {
                    Signature signature = r0.A00;
                    if (signature != null) {
                        new C13680ke(signature);
                    } else {
                        Mac mac = r0.A02;
                        if (mac != null) {
                            new C13680ke(mac);
                        }
                    }
                }
            }
            fingerprintHelperFragment.A06.execute(new RunnableEBaseShape5S0200000_I1_0(r5, new C13670kd(), 2));
            fingerprintHelperFragment.A0n();
            return;
        }
        Log.i("AppAuthManager/authenticate: authentication succeeded");
        AbstractC27431Py r1 = (AbstractC27431Py) ((C40031sW) this).A00.get();
        if (r1 != null) {
            r1.ADD(null);
        }
    }
}
