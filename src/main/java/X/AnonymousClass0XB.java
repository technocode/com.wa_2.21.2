package X;

import android.text.TextUtils;
import java.util.List;

/* renamed from: X.0XB  reason: invalid class name */
public class AnonymousClass0XB {
    public long A00;
    public String A01;
    public List A02;
    public List A03;

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0029, code lost:
        if (r1 != false) goto L_0x002b;
     */
    /* renamed from: A00 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.AnonymousClass0XB clone() {
        /*
            r3 = this;
            X.0XB r2 = new X.0XB
            r2.<init>()
            java.lang.String r0 = r3.A01
            r2.A01 = r0
            long r0 = r3.A00
            r2.A00 = r0
            java.util.List r0 = r3.A03
            if (r0 == 0) goto L_0x0020
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0020
            java.util.List r1 = r3.A03
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r1)
            r2.A03 = r0
        L_0x0020:
            java.util.List r0 = r3.A02
            if (r0 == 0) goto L_0x002b
            boolean r1 = r0.isEmpty()
            r0 = 1
            if (r1 == 0) goto L_0x002c
        L_0x002b:
            r0 = 0
        L_0x002c:
            if (r0 == 0) goto L_0x0037
            java.util.List r1 = r3.A02
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r1)
            r2.A02 = r0
        L_0x0037:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0XB.clone():X.0XB");
    }

    public boolean A01() {
        return A02() || !TextUtils.isEmpty(this.A01);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0015, code lost:
        if (r1 != false) goto L_0x0017;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A02() {
        /*
            r2 = this;
            java.util.List r0 = r2.A03
            if (r0 == 0) goto L_0x000c
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x000c
        L_0x000a:
            r1 = 1
        L_0x000b:
            return r1
        L_0x000c:
            java.util.List r0 = r2.A02
            if (r0 == 0) goto L_0x0017
            boolean r1 = r0.isEmpty()
            r0 = 1
            if (r1 == 0) goto L_0x0018
        L_0x0017:
            r0 = 0
        L_0x0018:
            r1 = 0
            if (r0 == 0) goto L_0x000b
            goto L_0x000a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0XB.A02():boolean");
    }
}
