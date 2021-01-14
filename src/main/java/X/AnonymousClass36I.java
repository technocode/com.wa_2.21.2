package X;

import android.os.Build;
import com.whatsapp.util.Log;
import java.io.File;

/* renamed from: X.36I  reason: invalid class name */
public class AnonymousClass36I {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public long A04;
    public boolean A05;
    public final C000300f A06;
    public final File A07;
    public final boolean A08;
    public final boolean A09;

    /* JADX WARNING: Can't wrap try/catch for region: R(10:22|23|33|34|35|36|37|(1:39)|40|42) */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x01f2, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:?, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x01f6, code lost:
        throw r0;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:36:0x00d3 */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00d9 A[Catch:{ Exception -> 0x00e5 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass36I(X.C000300f r13, java.io.File r14) {
        /*
        // Method dump skipped, instructions count: 503
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass36I.<init>(X.00f, java.io.File):void");
    }

    public int A00() {
        int i = this.A00;
        if (i != 0) {
            return i;
        }
        if (this.A04 != 0) {
            return (int) ((this.A07.length() * 8000) / this.A04);
        }
        return 0;
    }

    public int A01(AnonymousClass009 r9) {
        if (Build.VERSION.SDK_INT < 17 && !this.A05) {
            try {
                long currentTimeMillis = System.currentTimeMillis();
                int i = C02510Ch.A06(r9, this.A07, true).A05;
                this.A02 = i;
                StringBuilder sb = new StringBuilder();
                sb.append("mediafileutils/VideoMeta/getRotation rotation=");
                sb.append(i);
                sb.append(" rotationExtractionTime=");
                sb.append(System.currentTimeMillis() - currentTimeMillis);
                Log.w(sb.toString());
                this.A05 = true;
            } catch (Exception unused) {
            }
        }
        return this.A02;
    }

    public boolean A02(byte b) {
        int i;
        if (this.A09) {
            return true;
        }
        if (b != 13) {
            int i2 = this.A03;
            if (i2 > 640 || (i = this.A01) > 640) {
                int i3 = this.A01;
                if (i2 < i3) {
                    i2 = (i2 * 640) / i3;
                    i = 640;
                } else {
                    i = (i3 * 640) / i2;
                    i2 = 640;
                }
            }
            long j = this.A04 / 1000;
            if (((long) ((((((float) (i2 * i)) * C02550Cn.A00(this.A06, i2, i, this.A04, 9)) * ((float) j)) / 8.0f) + ((float) ((j * 96000) / 8)))) >= this.A07.length()) {
                return false;
            }
            return true;
        } else if (this.A08 || this.A07.length() <= 262144) {
            return false;
        } else {
            int i4 = this.A03;
            int i5 = this.A01;
            if (((double) (((float) A00()) / ((float) (i4 * i5)))) <= ((double) AnonymousClass0JG.A00(i4, i5)) * 1.1d) {
                return false;
            }
            return true;
        }
    }

    public boolean A03(AnonymousClass009 r4) {
        return Math.abs(A01(r4) % 180) == 90;
    }
}
