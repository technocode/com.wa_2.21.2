package X;

import android.net.Uri;
import java.util.Arrays;

/* renamed from: X.15G  reason: invalid class name */
public final class AnonymousClass15G {
    public final int A00;
    public final int A01;
    public final long A02;
    public final long A03;
    public final long A04;
    public final Uri A05;
    public final String A06;
    public final byte[] A07;
    public final byte[] A08;

    public AnonymousClass15G(Uri uri, long j, long j2) {
        this(uri, null, j, j, j2, null, 0);
    }

    public AnonymousClass15G(Uri uri, byte[] bArr, long j, long j2, long j3, String str, int i) {
        boolean z = true;
        int i2 = bArr != null ? 2 : 1;
        C002001d.A39(j >= 0);
        C002001d.A39(j2 >= 0);
        if (j3 <= 0 && j3 != -1) {
            z = false;
        }
        C002001d.A39(z);
        this.A05 = uri;
        this.A01 = i2;
        bArr = (bArr == null || bArr.length == 0) ? null : bArr;
        this.A07 = bArr;
        this.A08 = bArr;
        this.A02 = j;
        this.A04 = j2;
        this.A03 = j3;
        this.A06 = str;
        this.A00 = i;
    }

    public String toString() {
        String str;
        StringBuilder A0S = AnonymousClass008.A0S("DataSpec[");
        int i = this.A01;
        if (i == 1) {
            str = "GET";
        } else if (i == 2) {
            str = "POST";
        } else if (i == 3) {
            str = "HEAD";
        } else {
            throw new AssertionError(i);
        }
        A0S.append(str);
        A0S.append(" ");
        A0S.append(this.A05);
        A0S.append(", ");
        A0S.append(Arrays.toString(this.A07));
        A0S.append(", ");
        A0S.append(this.A02);
        A0S.append(", ");
        A0S.append(this.A04);
        A0S.append(", ");
        A0S.append(this.A03);
        A0S.append(", ");
        A0S.append(this.A06);
        A0S.append(", ");
        return AnonymousClass008.A0N(A0S, this.A00, "]");
    }
}
