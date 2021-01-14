package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.2FM  reason: invalid class name */
public class AnonymousClass2FM {
    public static final List A04 = new ArrayList();
    public final List A00 = new ArrayList();
    public final List A01 = new ArrayList();
    public final List A02 = new ArrayList();
    public final List A03 = new ArrayList();

    public AnonymousClass2FM(AnonymousClass0M5 r10) {
        AnonymousClass0M5[] r0;
        AnonymousClass2FK r3;
        AnonymousClass0M5 A0D;
        AnonymousClass0M5[] r02;
        AnonymousClass0M5 A0D2 = r10.A0D("sync");
        if (A0D2 != null) {
            for (AnonymousClass0M5 r6 : A0D2.A0H("collection")) {
                if ("error".equals(r6.A0G("type", null))) {
                    AnonymousClass0M5 A0D3 = r6.A0D("error");
                    if (A0D3 != null) {
                        try {
                            int A05 = A0D3.A05("code", -1);
                            String A0G = A0D3.A0G("text", null);
                            if (A05 != 409 || (A0D = r6.A0D("patches")) == null || (r02 = A0D.A03) == null || r02.length <= 0) {
                                r3 = new AnonymousClass2FK("true".equals(r6.A0G("has_more_patches", null)), A00(r6), A04);
                            } else {
                                r3 = A01(r6);
                            }
                            List list = this.A01;
                            A00(r6);
                            list.add(new AnonymousClass2FJ(A05, A0G, r3));
                        } catch (AnonymousClass1XC e) {
                            StringBuilder sb = new StringBuilder("Expected attribute code in ");
                            sb.append(A0D3);
                            sb.append(" exception");
                            sb.append(e.getMessage());
                            throw new C52832bp(true, sb.toString());
                        }
                    } else {
                        throw null;
                    }
                } else if (r6.A0G("version", null) != null) {
                    try {
                        long A07 = r6.A07("version", -1);
                        if (A07 != -1) {
                            this.A03.add(new AnonymousClass2FL(A07, A00(r6)));
                        } else {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("Expected attribute version in ");
                            sb2.append(r6);
                            throw new C52832bp(true, sb2.toString());
                        }
                    } catch (AnonymousClass1XC e2) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append("Expected attribute version in ");
                        sb3.append(r6);
                        sb3.append(" exception");
                        sb3.append(e2.getMessage());
                        throw new C52832bp(true, sb3.toString());
                    }
                } else {
                    AnonymousClass0M5 A0D4 = r6.A0D("patches");
                    if (A0D4 == null || (r0 = A0D4.A03) == null || r0.length <= 0) {
                        this.A00.add(A00(r6));
                    } else {
                        this.A02.add(A01(r6));
                    }
                }
            }
            return;
        }
        throw new C52832bp(true, "Expected node sync in response, but not found");
    }

    public static final String A00(AnonymousClass0M5 r3) {
        String str;
        AnonymousClass0OS A0A = r3.A0A("name");
        if (A0A != null && (str = A0A.A03) != null) {
            return str;
        }
        StringBuilder sb = new StringBuilder("Expected attribute name in ");
        sb.append(r3);
        throw new C52832bp(true, sb.toString());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0092, code lost:
        if (r3 != 101) goto L_0x0094;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.AnonymousClass2FK A01(X.AnonymousClass0M5 r9) {
        /*
        // Method dump skipped, instructions count: 258
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass2FM.A01(X.0M5):X.2FK");
    }
}
