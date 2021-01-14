package X;

import java.util.List;

/* renamed from: X.2LA  reason: invalid class name */
public final class AnonymousClass2LA {
    public final int A00;
    public final EnumC03840Hy A01;
    public final List A02;
    public final boolean A03;

    public AnonymousClass2LA(EnumC03840Hy r1, List list, boolean z, int i) {
        this.A01 = r1;
        this.A02 = list;
        this.A03 = z;
        this.A00 = i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0008, code lost:
        if (r3 == X.EnumC03840Hy.ADD_QUERY) goto L_0x000a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.AnonymousClass2LA A00(X.EnumC03840Hy r3, java.lang.String r4, com.whatsapp.jid.UserJid r5, int r6) {
        /*
            X.0Hy r0 = X.EnumC03840Hy.INTERACTIVE_QUERY
            r2 = 1
            if (r3 == r0) goto L_0x000a
            X.0Hy r1 = X.EnumC03840Hy.ADD_QUERY
            r0 = 0
            if (r3 != r1) goto L_0x000b
        L_0x000a:
            r0 = 1
        L_0x000b:
            X.AnonymousClass00E.A07(r0)
            X.2Gt r0 = new X.2Gt
            r0.<init>(r5, r4)
            r0.A07 = r2
            r0.A0E = r2
            r0.A0C = r2
            r0.A06 = r2
            java.util.List r1 = java.util.Collections.singletonList(r0)
            X.2LA r0 = new X.2LA
            r0.<init>(r3, r1, r2, r6)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass2LA.A00(X.0Hy, java.lang.String, com.whatsapp.jid.UserJid, int):X.2LA");
    }

    public String toString() {
        StringBuilder A0S = AnonymousClass008.A0S("[mode=");
        EnumC03840Hy r2 = this.A01;
        A0S.append(r2.mode.modeString);
        StringBuilder sb = new StringBuilder(A0S.toString());
        sb.append(" context=");
        sb.append(r2.context.contextString);
        sb.append(" requests=");
        sb.append(this.A02.size());
        sb.append("]");
        return sb.toString();
    }
}
