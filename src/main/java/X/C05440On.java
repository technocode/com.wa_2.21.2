package X;

import android.graphics.BitmapFactory;
import android.util.Base64;
import java.util.Arrays;

/* renamed from: X.0On  reason: invalid class name and case insensitive filesystem */
public class C05440On {
    public Float A00;
    public boolean A01;
    public boolean A02;
    public byte[] A03;
    public final AbstractC007503q A04;

    public static boolean A01(byte b) {
        return b == 1 || b == 3 || b == 13 || b == 9 || b == 5 || b == 16 || b == 23 || b == 37 || b == 24 || b == 44 || b == 20 || b == 25 || b == 26 || b == 28 || b == 29 || b == 30 || b == 42 || b == 43;
    }

    public C05440On(AbstractC007503q r3) {
        if (A01(r3.A0m)) {
            this.A04 = r3;
            return;
        }
        throw new IllegalStateException("this message should not have a thumbnail");
    }

    public static float A00(byte[] bArr) {
        int i;
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
        int i2 = options.outWidth;
        if (i2 <= 0 || (i = options.outHeight) <= 0) {
            return -1.0f;
        }
        return ((float) i) / ((float) i2);
    }

    public synchronized void A02(byte[] bArr) {
        if (!this.A01) {
            this.A03 = bArr;
            this.A01 = true;
        }
    }

    public synchronized void A03(byte[] bArr) {
        A04(bArr, false);
    }

    public synchronized void A04(byte[] bArr, boolean z) {
        AnonymousClass0M4 r1;
        AbstractC007503q r3 = this.A04;
        if ((r3 instanceof AnonymousClass0M3) && (r1 = ((AnonymousClass0M3) r3).A02) != null) {
            if (bArr != null) {
                r1.A00 = A00(bArr);
            } else {
                r1.A00 = -1.0f;
            }
        }
        if (z) {
            r3.A0o(bArr);
            this.A02 = false;
        } else {
            r3.A0o(null);
            this.A02 = true;
        }
        this.A00 = null;
        this.A01 = true;
        this.A03 = bArr;
    }

    public synchronized boolean A05() {
        boolean z = true;
        if (this.A01 && this.A03 != null) {
            return true;
        }
        AbstractC007503q r2 = this.A04;
        if (r2.A01() == 0 && r2.A0D() != null && r2.A0D().length() > 0) {
            return true;
        }
        if (r2.A0t() != null && r2.A0t().length > 0) {
            return true;
        }
        if (r2 instanceof AbstractC02860Dt) {
            if (((AbstractC02860Dt) r2).A02 != 2) {
                z = false;
            }
            return z;
        } else if (!(r2 instanceof AnonymousClass0M3)) {
            return false;
        } else {
            AnonymousClass0M4 r0 = ((AnonymousClass0M3) r2).A02;
            if (r0 == null || r0.A00 <= 0.0f) {
                z = false;
            }
            return z;
        }
    }

    public synchronized boolean A06() {
        return this.A01;
    }

    public byte[] A07() {
        byte[] A0t;
        String A0D;
        AbstractC007503q r3 = this.A04;
        if (r3.A01() == 0 && (A0D = r3.A0D()) != null && A0D.length() > 0) {
            try {
                return Base64.decode(r3.A0D(), 0);
            } catch (IllegalArgumentException unused) {
                return null;
            }
        } else if (r3.A01() != 1 || (A0t = r3.A0t()) == null || A0t.length <= 0) {
            return null;
        } else {
            return A0t;
        }
    }

    public synchronized byte[] A08() {
        if (this.A01) {
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("thumbnail not loaded, key=");
            sb.append(this.A04.A0n);
            throw new IllegalStateException(sb.toString());
        }
        return this.A03;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C05440On.class != obj.getClass()) {
            return false;
        }
        C05440On r5 = (C05440On) obj;
        if (!this.A04.A0n.equals(r5.A04.A0n)) {
            return false;
        }
        byte[] bArr = this.A03;
        if (bArr == null) {
            if (r5.A03 != null) {
                return false;
            }
        } else if (!Arrays.equals(bArr, r5.A03)) {
            return false;
        }
        Float f = this.A00;
        Float f2 = r5.A00;
        if (f == null) {
            if (f2 != null) {
                return false;
            }
        } else if (!f.equals(f2)) {
            return false;
        }
        return true;
    }
}
