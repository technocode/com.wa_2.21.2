package X;

import android.os.Bundle;
import android.os.Message;

/* renamed from: X.0Yz  reason: invalid class name */
public class AnonymousClass0Yz {
    public final Bundle A00;
    public final Message A01;
    public final String A02;

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0006, code lost:
        if (r4 == null) goto L_0x0008;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass0Yz(java.lang.String r2, android.os.Bundle r3, android.os.Message r4) {
        /*
            r1 = this;
            r1.<init>()
            if (r3 == 0) goto L_0x0008
            r0 = 0
            if (r4 != 0) goto L_0x0009
        L_0x0008:
            r0 = 1
        L_0x0009:
            X.AnonymousClass00E.A06(r0)
            r1.A02 = r2
            r1.A00 = r3
            r1.A01 = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0Yz.<init>(java.lang.String, android.os.Bundle, android.os.Message):void");
    }

    public String toString() {
        StringBuilder A0S = AnonymousClass008.A0S("action=");
        A0S.append(this.A02);
        A0S.append(", args=");
        A0S.append(this.A00);
        A0S.append(", message=");
        A0S.append(this.A01);
        return A0S.toString();
    }
}
