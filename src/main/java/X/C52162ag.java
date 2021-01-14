package X;

import android.text.TextUtils;

/* renamed from: X.2ag  reason: invalid class name and case insensitive filesystem */
public class C52162ag extends C27241Os {
    public C05420Ol A00;
    public boolean A01;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C52162ag(X.C002701k r2, X.C05420Ol r3) {
        /*
            r1 = this;
            java.lang.String r0 = r3.A06
            r1.<init>(r2, r0)
            r1.A09 = r0
            r1.A0C(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C52162ag.<init>(X.01k, X.0Ol):void");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C52162ag(X.C002701k r2, X.C64462yE r3) {
        /*
            r1 = this;
            java.lang.String r0 = r3.A02
            r1.<init>(r2, r0)
            r1.A09 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C52162ag.<init>(X.01k, X.2yE):void");
    }

    public C05420Ol A0B() {
        C05420Ol r0 = this.A00;
        if (r0 != null) {
            return r0;
        }
        String str = this.A09;
        if (str == null) {
            return null;
        }
        return new C05420Ol(null, null, 0, null, null, null, null, null, null, str);
    }

    public void A0C(C05420Ol r4) {
        this.A00 = r4;
        this.A0C = r4.A08;
        this.A0A = r4.A02;
        this.A09 = r4.A06;
        this.A0E = r4.A09;
        byte[] bArr = r4.A00;
        if (bArr != null && bArr.length > 0) {
            this.A0E = bArr;
        }
        String str = r4.A07;
        if (!TextUtils.isEmpty(str)) {
            this.A0B = str;
        }
        String str2 = r4.A03;
        if (!TextUtils.isEmpty(str2)) {
            this.A08 = new C670236x(str2, -1, -1);
        }
    }
}
