package X;

import android.net.Uri;
import android.util.Base64;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* renamed from: X.3ZL  reason: invalid class name */
public class AnonymousClass3ZL extends AbstractC450522r {
    public String A00;
    public String A01;
    public final C02530Cl A02;
    public final boolean A03;
    public final boolean A04;

    public AnonymousClass3ZL(C02530Cl r2, String str, String str2, String str3, boolean z, boolean z2) {
        super(str, str2, str3);
        if (!z) {
            this.A00 = super.A03;
        }
        this.A02 = r2;
        this.A03 = z;
        this.A04 = z2;
    }

    public final Uri.Builder A02(AnonymousClass0J5 r4) {
        A03();
        boolean z = false;
        if (this.A01 != null) {
            z = true;
        }
        AnonymousClass00E.A08(z, "Upload token has not been set");
        Uri.Builder A012 = A01(r4);
        A012.appendQueryParameter("token", this.A01);
        if (this.A04) {
            A012.appendQueryParameter("_nc_rmr", "1");
        }
        return A012;
    }

    public final void A03() {
        byte[] bArr;
        if (this.A01 == null) {
            C02530Cl r1 = this.A02;
            if (r1 != null) {
                String str = super.A02;
                if (r1 != null) {
                    byte[] decode = Base64.decode(str, 2);
                    byte[] bArr2 = r1.A00;
                    if (bArr2 != null) {
                        if (decode != null) {
                            int length = bArr2.length;
                            int length2 = decode.length;
                            bArr = new byte[(length + length2)];
                            System.arraycopy(bArr2, 0, bArr, 0, length);
                            System.arraycopy(decode, 0, bArr, length, length2);
                            this.A01 = C003701u.A05(Base64.encodeToString(MessageDigest.getInstance("SHA-256").digest(bArr), 2));
                        }
                    } else if (decode != null) {
                        bArr = C002001d.A3m(decode);
                        this.A01 = C003701u.A05(Base64.encodeToString(MessageDigest.getInstance("SHA-256").digest(bArr), 2));
                    }
                    bArr = C002001d.A3m(bArr2);
                    try {
                        this.A01 = C003701u.A05(Base64.encodeToString(MessageDigest.getInstance("SHA-256").digest(bArr), 2));
                    } catch (NoSuchAlgorithmException e) {
                        throw new AssertionError(e);
                    }
                } else {
                    throw null;
                }
            } else {
                throw null;
            }
        }
    }

    @Override // X.AbstractC29161Xi
    public String A4Z(AnonymousClass0J5 r4, C000300f r5) {
        Uri.Builder A022 = A02(r4);
        if (this.A03) {
            A022.appendQueryParameter("stream", "1");
        }
        return A022.build().toString();
    }
}
