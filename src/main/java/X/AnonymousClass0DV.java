package X;

import com.whatsapp.util.Log;
import java.util.Arrays;
import org.json.JSONException;

/* renamed from: X.0DV  reason: invalid class name */
public class AnonymousClass0DV {
    public static volatile AnonymousClass0DV A01;
    public final C000300f A00;

    public AnonymousClass0DV(C000300f r1) {
        this.A00 = r1;
    }

    public final AbstractC48162Ld A00(boolean z, String str, AnonymousClass0DM r10, String str2, byte[] bArr, int i, byte[] bArr2) {
        C48192Lg r5 = C48192Lg.A03;
        if (!Arrays.equals(r5.A01, bArr2)) {
            r5 = C48192Lg.A02;
            if (!Arrays.equals(r5.A01, bArr2)) {
                StringBuilder A0S = AnonymousClass008.A0S("Incorrect operation bytes: ");
                A0S.append(new String(bArr2));
                throw new IllegalStateException(A0S.toString());
            }
        }
        try {
            C48172Le r1 = new C48172Le(str2, i, r10, r5, bArr);
            C52792bl A012 = C52792bl.A01(z, str, r1);
            if (A012 != null) {
                return A012;
            }
            C52742bg A013 = C52742bg.A01(z, str, r1);
            if (A013 != null) {
                return A013;
            }
            C52752bh A014 = C52752bh.A01(z, str, r1);
            if (A014 != null) {
                return A014;
            }
            AnonymousClass2bZ A015 = AnonymousClass2bZ.A01(z, str, r1);
            if (A015 != null) {
                return A015;
            }
            C52692bb A016 = C52692bb.A01(z, str, r1);
            if (A016 != null) {
                return A016;
            }
            C52782bk A017 = C52782bk.A01(str, r1);
            if (A017 != null) {
                return A017;
            }
            C52712bd A018 = C52712bd.A01(z, str, r1);
            if (A018 != null) {
                return A018;
            }
            C52762bi A019 = C52762bi.A01(str, r1, this.A00);
            if (A019 != null) {
                return A019;
            }
            C52722be A0110 = C52722be.A01(str, r1);
            if (A0110 != null) {
                return A0110;
            }
            C52732bf A0111 = C52732bf.A01(z, str, r1);
            if (A0111 != null) {
                return A0111;
            }
            C52682ba A0112 = C52682ba.A01(z, str, r1);
            if (A0112 == null) {
                return C52702bc.A01(z, str, r1);
            }
            return A0112;
        } catch (C04190Jk | IllegalArgumentException | JSONException e) {
            Log.e("sync-mutation/from-key-value couldn't create sync action data", e);
            return null;
        }
    }
}
