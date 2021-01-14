package X;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.Signature;
import android.util.Log;

/* renamed from: X.0Lf  reason: invalid class name */
public class AnonymousClass0Lf {
    public static AnonymousClass0Lf A01;
    public final Context A00;

    public AnonymousClass0Lf(Context context) {
        this.A00 = context.getApplicationContext();
    }

    public static AnonymousClass0Lf A00(Context context) {
        C001801b.A1Q(context);
        synchronized (AnonymousClass0Lf.class) {
            if (A01 == null) {
                synchronized (C04720Lm.class) {
                    if (C04720Lm.A00 == null) {
                        C04720Lm.A00 = context.getApplicationContext();
                    } else {
                        Log.w("GoogleCertificates", "GoogleCertificates has been initialized already");
                    }
                }
                A01 = new AnonymousClass0Lf(context);
            }
        }
        return A01;
    }

    public static AnonymousClass0Lo A01(PackageInfo packageInfo, AnonymousClass0Lo... r5) {
        Signature[] signatureArr = packageInfo.signatures;
        if (signatureArr == null) {
            return null;
        }
        if (signatureArr.length != 1) {
            Log.w("GoogleSignatureVerifier", "Package has more than one signature.");
            return null;
        }
        BinderC04790Lu r1 = new BinderC04790Lu(signatureArr[0].toByteArray());
        for (int i = 0; i < r5.length; i++) {
            if (r5[i].equals(r1)) {
                return r5[i];
            }
        }
        return null;
    }

    public static boolean A02(PackageInfo packageInfo, boolean z) {
        AnonymousClass0Lo A012;
        if (!(packageInfo == null || packageInfo.signatures == null)) {
            if (z) {
                A012 = A01(packageInfo, C04730Ln.A00);
            } else {
                A012 = A01(packageInfo, C04730Ln.A00[0]);
            }
            if (A012 != null) {
                return true;
            }
        }
        return false;
    }
}
