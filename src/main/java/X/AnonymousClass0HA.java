package X;

/* renamed from: X.0HA  reason: invalid class name */
public class AnonymousClass0HA {
    public static volatile AnonymousClass0HA A07;
    public final AnonymousClass009 A00;
    public final AnonymousClass01I A01;
    public final AnonymousClass00G A02;
    public final AnonymousClass00D A03;
    public final AnonymousClass01X A04;
    public final AnonymousClass03U A05;
    public final AnonymousClass03A A06;

    public AnonymousClass0HA(AnonymousClass00G r1, AnonymousClass009 r2, AnonymousClass01I r3, AnonymousClass03A r4, AnonymousClass01X r5, AnonymousClass03U r6, AnonymousClass00D r7) {
        this.A02 = r1;
        this.A00 = r2;
        this.A01 = r3;
        this.A06 = r4;
        this.A04 = r5;
        this.A05 = r6;
        this.A03 = r7;
    }

    public static AnonymousClass0HA A00() {
        if (A07 == null) {
            synchronized (AnonymousClass0HA.class) {
                if (A07 == null) {
                    AnonymousClass00G r3 = AnonymousClass00G.A01;
                    AnonymousClass009 A002 = AnonymousClass009.A00();
                    AnonymousClass01I A003 = AnonymousClass01I.A00();
                    AnonymousClass03A A004 = AnonymousClass03A.A00();
                    C000300f.A00();
                    A07 = new AnonymousClass0HA(r3, A002, A003, A004, AnonymousClass01X.A00(), AnonymousClass03U.A00(), AnonymousClass00D.A00());
                }
            }
        }
        return A07;
    }

    public AnonymousClass33N A01(String str) {
        StringBuilder A0Z = AnonymousClass008.A0Z("https://static.whatsapp.net/sticker?id=", str, "&lg=");
        A0Z.append(AbstractC002201f.A05(this.A04.A0I()));
        AnonymousClass33Q A022 = A02(A0Z.toString(), null);
        if (A022 != null) {
            return (AnonymousClass33N) A022.A01.get(0);
        }
        throw null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:47:0x01ec, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x01ed, code lost:
        if (r16 != null) goto L_0x01ef;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:?, code lost:
        r16.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x01f2, code lost:
        throw r0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x022e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.AnonymousClass33Q A02(java.lang.String r20, java.lang.String r21) {
        /*
        // Method dump skipped, instructions count: 565
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0HA.A02(java.lang.String, java.lang.String):X.33Q");
    }
}
