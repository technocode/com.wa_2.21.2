package X;

import com.whatsapp.registration.VerifyTwoFactorAuth;
import com.whatsapp.util.Log;
import java.lang.ref.WeakReference;

/* renamed from: X.0di  reason: invalid class name and case insensitive filesystem */
public class C09900di extends AnonymousClass0JW {
    public final AnonymousClass00G A00;
    public final AnonymousClass00D A01;
    public final AnonymousClass0KP A02;
    public final String A03;
    public final String A04;
    public final WeakReference A05;
    public final byte[] A06;
    public final byte[] A07;

    public C09900di(AnonymousClass00D r2, AnonymousClass0KP r3, String str, String str2, byte[] bArr, byte[] bArr2, VerifyTwoFactorAuth verifyTwoFactorAuth, AnonymousClass00G r9) {
        this.A01 = r2;
        this.A02 = r3;
        this.A03 = str;
        this.A04 = str2;
        this.A07 = bArr;
        this.A06 = bArr2;
        this.A05 = new WeakReference(verifyTwoFactorAuth);
        this.A00 = r9;
    }

    @Override // X.AnonymousClass0JW
    public void A03(Object obj) {
        C48842Nz r14 = (C48842Nz) obj;
        VerifyTwoFactorAuth verifyTwoFactorAuth = (VerifyTwoFactorAuth) this.A05.get();
        if (verifyTwoFactorAuth != null) {
            verifyTwoFactorAuth.A0A = null;
            if (r14 != null) {
                StringBuilder sb = new StringBuilder("verifytwofactorauth/checkifexists result=");
                sb.append(r14);
                Log.d(sb.toString());
                if (r14.A0D == AnonymousClass2O0.OK) {
                    Log.i("verifytwofactorauth/checkifexists ok");
                    verifyTwoFactorAuth.A0a(true);
                    AnonymousClass008.A0n(((ActivityC004702f) verifyTwoFactorAuth).A0J, "new_jid", r14.A0F);
                    verifyTwoFactorAuth.A0Z(null, r14.A0E);
                    return;
                }
                long j = r14.A03;
                long j2 = r14.A02;
                if (j + j2 < verifyTwoFactorAuth.A00) {
                    verifyTwoFactorAuth.A0V(Math.max(j2 * 1000, 5000L));
                } else {
                    verifyTwoFactorAuth.A0a(true);
                }
            } else {
                Log.d("verifytwofactorauth/checkifexists could not connect to server");
                if ((verifyTwoFactorAuth.A01 - (verifyTwoFactorAuth.A02 * 1000)) + (verifyTwoFactorAuth.A00 * 1000) >= verifyTwoFactorAuth.A0N.A05()) {
                    verifyTwoFactorAuth.A0V(5000);
                } else {
                    verifyTwoFactorAuth.A0a(true);
                }
            }
        }
    }
}
