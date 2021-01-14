package X;

/* renamed from: X.0CK  reason: invalid class name */
public class AnonymousClass0CK {
    public static volatile AnonymousClass0CK A01;
    public final AnonymousClass009 A00;

    public AnonymousClass0CK(AnonymousClass009 r1) {
        this.A00 = r1;
    }

    public static AnonymousClass0CK A00() {
        if (A01 == null) {
            synchronized (AnonymousClass0CK.class) {
                if (A01 == null) {
                    A01 = new AnonymousClass0CK(AnonymousClass009.A00());
                }
            }
        }
        return A01;
    }

    public static boolean A01(AnonymousClass1XO r2) {
        return r2 == AnonymousClass1XO.A0A || r2 == AnonymousClass1XO.A0P || r2 == AnonymousClass1XO.A0L || r2 == AnonymousClass1XO.A0H || r2 == AnonymousClass1XO.A06 || r2 == AnonymousClass1XO.A0C;
    }

    public static boolean A02(AnonymousClass1XO r2) {
        return r2 == AnonymousClass1XO.A04 || r2 == AnonymousClass1XO.A0N || r2 == AnonymousClass1XO.A0Q || r2 == AnonymousClass1XO.A0M || r2 == AnonymousClass1XO.A0K;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0007, code lost:
        if (r2 == X.AnonymousClass1XO.A0J) goto L_0x0009;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A03(X.AnonymousClass1XO r2) {
        /*
            X.1XO r0 = X.AnonymousClass1XO.A07
            if (r2 == r0) goto L_0x0009
            X.1XO r1 = X.AnonymousClass1XO.A0J
            r0 = 0
            if (r2 != r1) goto L_0x000a
        L_0x0009:
            r0 = 1
        L_0x000a:
            if (r0 != 0) goto L_0x0011
            X.1XO r1 = X.AnonymousClass1XO.A0I
            r0 = 0
            if (r2 != r1) goto L_0x0012
        L_0x0011:
            r0 = 1
        L_0x0012:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0CK.A03(X.1XO):boolean");
    }

    public boolean A04(Throwable th) {
        Throwable th2;
        String str;
        if (th.getMessage() == null || !th.getMessage().contains("WATLS Exception")) {
            return false;
        }
        if (th.getCause() != null) {
            th2 = th.getCause();
        } else {
            th2 = th;
        }
        StringBuilder sb = new StringBuilder();
        if (th.getMessage() != null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(th.getMessage());
            sb2.append("\n");
            str = sb2.toString();
        } else {
            str = "";
        }
        sb.append(str);
        sb.append(th2.getMessage());
        sb.append("\n");
        sb.append(C003701u.A09(th2));
        this.A00.A04("WATLS Exception", sb.toString(), true);
        return true;
    }
}
