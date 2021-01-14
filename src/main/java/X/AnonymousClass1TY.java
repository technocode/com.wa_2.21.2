package X;

/* renamed from: X.1TY  reason: invalid class name */
public abstract class AnonymousClass1TY {
    public final AnonymousClass08V A00;

    public AnonymousClass1TY() {
        C43371yG r1 = new C43371yG(10);
        this.A00 = r1;
        r1.A00 = C43361yF.A00;
    }

    public final AnonymousClass1TX A00(String str) {
        AnonymousClass1TX r0;
        int i;
        AnonymousClass08V r3 = this.A00;
        AnonymousClass1TX r02 = (AnonymousClass1TX) r3.A03(str);
        if (r02 != null) {
            return r02;
        }
        synchronized (r3) {
            r0 = (AnonymousClass1TX) r3.A03(str);
            if (r0 == null) {
                AnonymousClass3VJ r2 = (AnonymousClass3VJ) this;
                int A0B = C002001d.A0B((AnonymousClass022) r2.A00.get(), (AnonymousClass03P) r2.A01.get());
                if (A0B >= 2016) {
                    i = 50;
                } else {
                    i = 10;
                    if (A0B >= 2014) {
                        i = 30;
                    }
                }
                r0 = new AnonymousClass1TX(str, i);
                r3.A07(str, r0);
            }
        }
        return r0;
    }

    public Object A01(String str, String str2) {
        AnonymousClass1TW r8 = (AnonymousClass1TW) A00(str).A00.A03(str2);
        if (r8 != null) {
            long j = r8.A01;
            if (j == -1 || System.currentTimeMillis() < r8.A00 + j) {
                Object obj = r8.A02;
                if (obj != null) {
                    return obj;
                }
            } else {
                AnonymousClass1TX r0 = (AnonymousClass1TX) this.A00.A03(str);
                if (r0 != null) {
                    r0.A00.A04(str2);
                }
            }
        }
        return null;
    }
}
