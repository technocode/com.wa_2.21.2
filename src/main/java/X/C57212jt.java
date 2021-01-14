package X;

import android.util.Base64;
import com.whatsapp.util.Log;
import java.security.MessageDigest;
import java.util.Arrays;

/* renamed from: X.2jt  reason: invalid class name and case insensitive filesystem */
public class C57212jt implements AbstractC50012Tb {
    public final CallableC57232jv A00;
    public final C57242jw A01;

    public C57212jt(AnonymousClass0CL r9, C000300f r10, AnonymousClass0CT r11, AnonymousClass0CW r12, C50022Tc r13, AnonymousClass1WD r14, C50002Ta r15) {
        C57242jw r1 = new C57242jw(r13.A00, r13.A03, r13.A04, r13.A01);
        this.A01 = r1;
        this.A00 = new CallableC57232jv(r9, r10, r11, r12, new C50042Te(r13.A02, r1), r14, r15);
    }

    @Override // X.AbstractC50012Tb
    public AnonymousClass2TY A3u() {
        AnonymousClass2TY A3u = this.A00.A3u();
        AnonymousClass1W8 r4 = A3u.A00;
        if (r4.A02()) {
            C57242jw r0 = this.A01;
            String str = r0.A03;
            MessageDigest messageDigest = r0.A04;
            if (messageDigest == null) {
                AnonymousClass008.A19("MMS download failed in verifyFileSha256 with Exception; plainFileHash=", str);
            } else if (!Arrays.equals(messageDigest.digest(), Base64.decode(str, 0))) {
                StringBuilder A0Z = AnonymousClass008.A0Z("MMS download failed during media decryption due to plaintext hash mismatch; mediaHash=", str, "; calculatedHash=");
                A0Z.append(Base64.encodeToString(messageDigest.digest(), 2));
                Log.w(A0Z.toString());
            }
            Log.e("encrypteddownloadtransfer/download/hash verification fail");
            return new AnonymousClass2TY(new AnonymousClass1W8(7, r4.A03, r4.A04));
        }
        return A3u;
    }

    @Override // X.AbstractC50012Tb
    public void cancel() {
        this.A00.A07.cancel(true);
    }
}
