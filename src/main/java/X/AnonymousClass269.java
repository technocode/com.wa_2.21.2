package X;

import java.util.Set;

/* renamed from: X.269  reason: invalid class name */
public abstract class AnonymousClass269 extends AbstractC238217s implements AbstractC34701j2, AbstractC238517v {
    public final C238417u A00;
    public final Set A01;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass269(android.content.Context r13, android.os.Looper r14, int r15, X.C238417u r16, X.AnonymousClass176 r17, X.AnonymousClass177 r18) {
        /*
            r12 = this;
            r4 = r13
            X.17y r6 = X.AbstractC238817y.A00(r13)
            X.0LP r7 = X.AnonymousClass0LP.A00
            r1 = r17
            X.C001801b.A1Q(r1)
            r0 = r18
            X.C001801b.A1Q(r0)
            X.1k4 r9 = new X.1k4
            r9.<init>(r1)
            X.1k5 r10 = new X.1k5
            r10.<init>(r0)
            r0 = r16
            java.lang.String r11 = r0.A03
            r3 = r12
            r5 = r14
            r8 = r15
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11)
            r12.A00 = r0
            java.util.Set r2 = r0.A06
            java.util.Iterator r1 = r2.iterator()
        L_0x002d:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0045
            java.lang.Object r0 = r1.next()
            boolean r0 = r2.contains(r0)
            if (r0 != 0) goto L_0x002d
            java.lang.String r1 = "Expanding scopes is not permitted, use implied scopes instead"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x0045:
            r12.A01 = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass269.<init>(android.content.Context, android.os.Looper, int, X.17u, X.176, X.177):void");
    }

    @Override // X.AbstractC34701j2
    public int A7V() {
        if (this instanceof AnonymousClass29M) {
            return 8600000;
        }
        if (this instanceof AnonymousClass29I) {
            return 12200000;
        }
        if (!(this instanceof AnonymousClass29F)) {
            return !(this instanceof AnonymousClass29C) ? 12451000 : 12800000;
        }
        return 11925000;
    }
}
