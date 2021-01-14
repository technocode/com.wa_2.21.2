package X;

import android.text.TextUtils;
import com.google.android.search.verification.client.R;
import com.whatsapp.registration.VerifyTwoFactorAuth;
import com.whatsapp.util.Log;
import java.lang.ref.WeakReference;

/* renamed from: X.0dh  reason: invalid class name and case insensitive filesystem */
public class C09890dh extends AnonymousClass0JW {
    public AnonymousClass2O4 A00;
    public final int A01;
    public final int A02;
    public final AnonymousClass00D A03;
    public final AnonymousClass01X A04;
    public final AnonymousClass0KP A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final WeakReference A0A;
    public final boolean A0B;

    public C09890dh(AnonymousClass01X r2, AnonymousClass00D r3, AnonymousClass0KP r4, String str, String str2, String str3, String str4, int i, boolean z, VerifyTwoFactorAuth verifyTwoFactorAuth) {
        this.A04 = r2;
        this.A03 = r3;
        this.A05 = r4;
        this.A08 = str;
        this.A07 = str2;
        this.A06 = str3;
        this.A09 = str4;
        this.A0B = z;
        this.A02 = i;
        this.A0A = new WeakReference(verifyTwoFactorAuth);
        if (i == 1) {
            this.A01 = 33;
        } else if (i != 2) {
            this.A01 = 31;
        } else {
            this.A01 = 34;
        }
    }

    @Override // X.AnonymousClass0JW
    public void A01() {
        VerifyTwoFactorAuth verifyTwoFactorAuth = (VerifyTwoFactorAuth) this.A0A.get();
        if (verifyTwoFactorAuth != null) {
            Log.i("verifytwofactorauth/verifycodetask/pre");
            verifyTwoFactorAuth.A07.setEnabled(false);
            verifyTwoFactorAuth.A05.setProgress(0);
            C002001d.A2O(verifyTwoFactorAuth, this.A01);
        }
    }

    @Override // X.AnonymousClass0JW
    public void A03(Object obj) {
        AnonymousClass2O5 r11 = (AnonymousClass2O5) obj;
        VerifyTwoFactorAuth verifyTwoFactorAuth = (VerifyTwoFactorAuth) this.A0A.get();
        if (verifyTwoFactorAuth != null) {
            String str = null;
            verifyTwoFactorAuth.A0B = null;
            C002001d.A2N(verifyTwoFactorAuth, this.A01);
            verifyTwoFactorAuth.A07.setEnabled(true);
            verifyTwoFactorAuth.A05.setProgress(100);
            verifyTwoFactorAuth.A0H = false;
            C003301q r2 = verifyTwoFactorAuth.A0K;
            AbstractC000900m r1 = verifyTwoFactorAuth.A0J;
            r2.A00(r1);
            switch (r11.ordinal()) {
                case 0:
                    if (this.A02 == 1) {
                        Log.i("verifytwofactorauth/verifycodetask/reset-email-sent");
                        verifyTwoFactorAuth.APo(R.string.two_factor_auth_reset_successful);
                        verifyTwoFactorAuth.A0J("forgotPinDialogTag");
                        verifyTwoFactorAuth.A0X(this.A00);
                        verifyTwoFactorAuth.A0a(false);
                        verifyTwoFactorAuth.A0V(0);
                        return;
                    } else if (!TextUtils.isEmpty(this.A00.A06)) {
                        Log.i("verifytwofactorauth/verifycodetask/verified");
                        verifyTwoFactorAuth.A0a(true);
                        AnonymousClass008.A0n(this.A03, "new_jid", this.A00.A09);
                        AnonymousClass2O4 r12 = this.A00;
                        if (r12.A0A) {
                            str = this.A06;
                        }
                        verifyTwoFactorAuth.A0Z(str, r12.A06);
                        return;
                    } else {
                        return;
                    }
                case 1:
                    Log.w("verifytwofactorauth/verifycodetask/unspecified");
                    if (!super.A00.isCancelled()) {
                        verifyTwoFactorAuth.A0H = true;
                        try {
                            r2.A01(r1);
                        } catch (IllegalStateException unused) {
                            Log.d("verifytwofactorauth/register-connectivity-observer already registered");
                        }
                    }
                    C002001d.A2O(verifyTwoFactorAuth, 109);
                    return;
                case 2:
                case 9:
                    Log.w("verifytwofactorauth/verifycodetask/connectivity");
                    Log.d("verifynumber/notify/dialog 32");
                    if (verifyTwoFactorAuth.A08.A02 || C002001d.A3D(verifyTwoFactorAuth)) {
                        AnonymousClass0JE.A0E(verifyTwoFactorAuth, ((AnonymousClass2C0) verifyTwoFactorAuth).A01, verifyTwoFactorAuth.A0P, 32);
                        return;
                    } else {
                        C002001d.A2O(verifyTwoFactorAuth, 32);
                        return;
                    }
                case 3:
                    Log.w("verifytwofactorauth/verifycodetask/incorrect");
                    verifyTwoFactorAuth.A0a(true);
                    verifyTwoFactorAuth.A08.A02(R.string.register_verify_again);
                    return;
                case 4:
                    boolean equals = this.A06.equals(this.A03.A00.getString("registration_code", null));
                    AnonymousClass008.A1H("verifytwofactorauth/verifycodetask/mismatch ", equals);
                    verifyTwoFactorAuth.A07.setText("");
                    if (equals) {
                        verifyTwoFactorAuth.A08.A02(R.string.two_factor_auth_accidental_sms_error);
                    } else {
                        verifyTwoFactorAuth.A08.A02(R.string.two_factor_auth_wrong_code_message);
                    }
                    try {
                        verifyTwoFactorAuth.A0W(Long.parseLong(this.A00.A05) * 1000);
                        return;
                    } catch (NumberFormatException e) {
                        StringBuilder A0S = AnonymousClass008.A0S("verifytwofactorauth/verifycodetask/mismatch failed to parse: ");
                        A0S.append(this.A00.A05);
                        Log.w(A0S.toString(), e);
                        return;
                    }
                case 5:
                    Log.w("verifytwofactorauth/verifycodetask/too-many-guesses");
                    verifyTwoFactorAuth.A0a(true);
                    verifyTwoFactorAuth.A08.A02(R.string.two_factor_auth_too_many_tries);
                    return;
                case 6:
                    Log.w("verifytwofactorauth/verifycodetask/guessed-too-fast");
                    try {
                        long parseLong = Long.parseLong(this.A00.A05) * 1000;
                        AnonymousClass30C r8 = verifyTwoFactorAuth.A08;
                        AnonymousClass01X r7 = this.A04;
                        r8.A03(r7.A0D(R.string.register_guessed_too_fast_with_time, C002001d.A1a(r7, parseLong)));
                        verifyTwoFactorAuth.A0W(parseLong);
                        return;
                    } catch (NumberFormatException e2) {
                        StringBuilder A0S2 = AnonymousClass008.A0S("verifytwofactorauth/verifycodetask/too_fast failed to parse: ");
                        A0S2.append(this.A00.A05);
                        Log.w(A0S2.toString(), e2);
                        verifyTwoFactorAuth.A08.A02(R.string.two_factor_auth_too_many_tries);
                        return;
                    }
                case 7:
                    Log.w("verifytwofactorauth/verifycodetask/reset-too-soon");
                    verifyTwoFactorAuth.A08.A02(R.string.two_factor_auth_reset_too_soon_message);
                    return;
                case 8:
                    Log.w("verifytwofactorauth/verifycodetask/stale");
                    int A0T = verifyTwoFactorAuth.A0T();
                    verifyTwoFactorAuth.A0X(this.A00);
                    int A0T2 = verifyTwoFactorAuth.A0T();
                    StringBuilder A0U = AnonymousClass008.A0U("verifytwofactorauth/verifycodetask/stale previous=", A0T, " new=", A0T2, " isRetry=");
                    boolean z = this.A0B;
                    AnonymousClass008.A1Z(A0U, z);
                    if (z || A0T != A0T2) {
                        verifyTwoFactorAuth.A0a(true);
                        verifyTwoFactorAuth.A08.A02(R.string.register_stale);
                        return;
                    }
                    verifyTwoFactorAuth.A0Y(this.A06, this.A02, true);
                    return;
                case 10:
                    Log.w("verifytwofactorauth/verifycodetask/blocked");
                    verifyTwoFactorAuth.A0a(true);
                    C002001d.A2O(verifyTwoFactorAuth, 124);
                    return;
                default:
                    return;
            }
        }
    }
}
