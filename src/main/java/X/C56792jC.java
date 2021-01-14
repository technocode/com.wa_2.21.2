package X;

/* renamed from: X.2jC  reason: invalid class name and case insensitive filesystem */
public class C56792jC extends C49972Sx {
    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C56792jC(java.lang.Exception r3, java.lang.String r4) {
        /*
            r2 = this;
            boolean r0 = r3 instanceof java.net.UnknownHostException
            if (r0 == 0) goto L_0x0009
            r1 = 2
        L_0x0005:
            r2.<init>(r4, r3, r1)
            return
        L_0x0009:
            boolean r0 = r3 instanceof java.net.SocketTimeoutException
            r1 = 19
            if (r0 == 0) goto L_0x0005
            r1 = 3
            goto L_0x0005
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C56792jC.<init>(java.lang.Exception, java.lang.String):void");
    }

    public String toString() {
        StringBuilder A0S = AnonymousClass008.A0S("ConnectionFailureException: ");
        A0S.append(getMessage());
        return A0S.toString();
    }
}
