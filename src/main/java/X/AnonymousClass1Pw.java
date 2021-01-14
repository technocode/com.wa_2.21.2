package X;

import android.app.Activity;
import android.app.Application;
import android.content.SharedPreferences;
import android.os.Build;
import com.whatsapp.util.Log;
import java.lang.reflect.Method;

/* renamed from: X.1Pw  reason: invalid class name */
public class AnonymousClass1Pw {
    public static volatile AnonymousClass1Pw A05;
    public Boolean A00;
    public final AnonymousClass0It A01;
    public final AnonymousClass00S A02;
    public final AnonymousClass00D A03;
    public final C002701k A04;

    public AnonymousClass1Pw(AnonymousClass00G r3, AnonymousClass00S r4, C002701k r5, AnonymousClass00D r6) {
        AnonymousClass0It r0;
        this.A02 = r4;
        this.A04 = r5;
        this.A03 = r6;
        boolean A0E = r5.A0E(266);
        Application application = r3.A00;
        if (A0E) {
            r0 = new C04030Is(application);
        } else {
            r0 = new C40041sX(application);
        }
        this.A01 = r0;
    }

    public static AnonymousClass1Pw A00() {
        if (A05 == null) {
            synchronized (AnonymousClass1Pw.class) {
                if (A05 == null) {
                    A05 = new AnonymousClass1Pw(AnonymousClass00G.A01, AnonymousClass00S.A00(), C002701k.A00(), AnonymousClass00D.A00());
                }
            }
        }
        return A05;
    }

    public void A01(Activity activity) {
        if (Build.VERSION.SDK_INT >= 26) {
            try {
                Method method = Activity.class.getMethod("setDisablePreviewScreenshots", Boolean.TYPE);
                method.setAccessible(true);
                method.invoke(activity, Boolean.valueOf(A04()));
            } catch (Exception e) {
                Log.e("Could not invoke setDisablePreviewScreenshots()", e);
            }
        }
    }

    public void A02(boolean z) {
        Boolean bool = this.A00;
        if (bool == null || bool.booleanValue() != z) {
            this.A00 = Boolean.valueOf(z);
            AnonymousClass008.A1H("AppAuthManager/setIsAuthenticationNeeded: ", z);
            AnonymousClass008.A0n(this.A03, "fingerprint_authentication_needed", z);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000d, code lost:
        if (r2.A01.AAH() == false) goto L_0x000f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A03() {
        /*
            r2 = this;
            boolean r0 = r2.A05()
            if (r0 == 0) goto L_0x000f
            X.0It r0 = r2.A01
            boolean r0 = r0.AAH()
            r1 = 1
            if (r0 != 0) goto L_0x0010
        L_0x000f:
            r1 = 0
        L_0x0010:
            java.lang.String r0 = "AppAuthManager/hasEnrolledBiometrics: enrolled: "
            X.AnonymousClass008.A1H(r0, r1)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1Pw.A03():boolean");
    }

    public boolean A04() {
        return Build.VERSION.SDK_INT >= 23 && this.A03.A00.getBoolean("privacy_fingerprint_enabled", false) && this.A01.A2R();
    }

    public boolean A05() {
        return Build.VERSION.SDK_INT >= 23 && this.A01.AB6();
    }

    public boolean A06() {
        SharedPreferences sharedPreferences = this.A03.A00;
        boolean z = sharedPreferences.getBoolean("privacy_fingerprint_enabled", false);
        boolean z2 = sharedPreferences.getBoolean("fingerprint_authentication_needed", false);
        boolean A032 = A03();
        if (!A032 || !z || !z2) {
            StringBuilder A0S = AnonymousClass008.A0S("AppAuthManager/shouldShowAuthPrompt: No prompt: ");
            A0S.append(!A032);
            A0S.append(" || ");
            A0S.append(!z);
            A0S.append(" || ");
            AnonymousClass008.A1a(A0S, !z2);
            return false;
        }
        long A033 = this.A02.A03();
        long j = sharedPreferences.getLong("app_background_time", 0);
        long j2 = sharedPreferences.getLong("privacy_fingerprint_timeout", 60000);
        StringBuilder A0S2 = AnonymousClass008.A0S("AppAuthManager/shouldShowAuthPrompt: show prompt if necessary: ");
        long j3 = j + j2;
        boolean z3 = false;
        if (j3 < A033) {
            z3 = true;
        }
        AnonymousClass008.A1a(A0S2, z3);
        if (j3 < A033) {
            return true;
        }
        return false;
    }

    public boolean A07() {
        if (!A04() || this.A03.A00.getBoolean("privacy_fingerprint_show_notification_content", true)) {
            return true;
        }
        return false;
    }
}
