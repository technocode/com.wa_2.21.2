package X;

import android.text.TextUtils;

/* renamed from: X.2xm  reason: invalid class name and case insensitive filesystem */
public class C64192xm {
    public int A00;
    public String A01 = null;
    public String A02;
    public boolean A03 = false;

    public C64192xm(String str, String str2, String str3, String str4, boolean z, int i) {
        int i2;
        if (!TextUtils.isEmpty(str) || !TextUtils.isEmpty(str2)) {
            String A012 = AnonymousClass1Y8.A01(str3);
            if (A012 != null) {
                this.A02 = A012;
                this.A01 = str4;
                if (TextUtils.isEmpty(str4)) {
                    this.A01 = A012;
                }
            } else {
                this.A02 = null;
            }
        } else {
            this.A02 = null;
        }
        if (!TextUtils.isEmpty(this.A02)) {
            String str5 = this.A02;
            String str6 = this.A01;
            if (TextUtils.isEmpty(str5) || TextUtils.isEmpty(str6)) {
                i2 = 0;
            } else {
                i2 = C670236x.A01(str6);
            }
            this.A00 = i2;
            this.A03 = AnonymousClass0FI.A0w(z, i, i2);
        }
    }

    public C64192xm(String str, String str2, boolean z, int i) {
        this.A02 = str;
        this.A01 = str2;
        this.A03 = z;
        this.A00 = i;
    }

    public static C64192xm A00(AbstractC007503q r6) {
        C05420Ol r5 = r6.A0H;
        if (r5 != null) {
            if (r5.A01 != 2) {
                return new C64192xm(r5.A06, r5.A07, false, 0);
            }
            String str = r5.A03;
            int A012 = C670236x.A01(str);
            return new C64192xm(r5.A06, str, AnonymousClass0FI.A0w(true, 1, A012), A012);
        } else if (!(r6 instanceof C05490Ot)) {
            return new C64192xm(null, null, false, 0);
        } else {
            C05490Ot r62 = (C05490Ot) r6;
            String str2 = r62.A04;
            String str3 = r62.A02;
            String A0D = r62.A0D();
            String str4 = r62.A05;
            boolean z = false;
            if (r62.A0y() != null) {
                z = true;
            }
            return new C64192xm(str2, str3, A0D, str4, z, r62.A00);
        }
    }
}
