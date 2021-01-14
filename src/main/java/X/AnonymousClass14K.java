package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.14K  reason: invalid class name */
public class AnonymousClass14K {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public final StringBuilder A05 = new StringBuilder();
    public final List A06 = new ArrayList();
    public final List A07 = new ArrayList();

    public AnonymousClass14K(int i, int i2) {
        A02(i);
        this.A01 = i2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0079, code lost:
        if (r6 == -1) goto L_0x007e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x007c, code lost:
        if (r16 != false) goto L_0x007e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x007e, code lost:
        r6 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0080, code lost:
        if (r10 == -1) goto L_0x0085;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0083, code lost:
        if (r1 != false) goto L_0x0085;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0085, code lost:
        r10 = r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.text.SpannableString A00() {
        /*
        // Method dump skipped, instructions count: 180
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass14K.A00():android.text.SpannableString");
    }

    public void A01() {
        StringBuilder sb = this.A05;
        int length = sb.length();
        if (length > 0) {
            sb.delete(length - 1, length);
            List list = this.A06;
            for (int size = list.size() - 1; size >= 0; size--) {
                AnonymousClass14J r1 = (AnonymousClass14J) list.get(size);
                int i = r1.A00;
                if (i == length) {
                    r1.A00 = i - 1;
                } else {
                    return;
                }
            }
        }
    }

    public void A02(int i) {
        this.A00 = i;
        this.A06.clear();
        this.A07.clear();
        this.A05.setLength(0);
        this.A03 = 15;
        this.A02 = 0;
        this.A04 = 0;
    }

    public String toString() {
        return this.A05.toString();
    }
}
