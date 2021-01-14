package X;

import java.util.HashSet;
import java.util.Set;

/* renamed from: X.0B8  reason: invalid class name */
public final class AnonymousClass0B8 implements AbstractC01950Ab {
    public final /* synthetic */ AnonymousClass0B7 A00;

    @Override // X.AbstractC01950Ab
    public String A7a() {
        return "b";
    }

    public AnonymousClass0B8(AnonymousClass0B7 r1) {
        this.A00 = r1;
    }

    @Override // X.AbstractC01950Ab
    public Set A7P(AbstractC007503q r7) {
        HashSet hashSet = new HashSet();
        for (Number number : this.A00.A01(r7.A0p)) {
            long longValue = number.longValue();
            StringBuilder A0S = AnonymousClass008.A0S("l");
            A0S.append(Long.toString(longValue, 36));
            hashSet.add(A0S.toString());
        }
        if (hashSet.isEmpty()) {
            return null;
        }
        return hashSet;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00ea, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00eb, code lost:
        if (r11 != null) goto L_0x00ed;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:?, code lost:
        r11.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00f0, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00f3, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00f7, code lost:
        throw r0;
     */
    @Override // X.AbstractC01950Ab
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.AnonymousClass1V2 A7b(X.C08680bX r23) {
        /*
        // Method dump skipped, instructions count: 261
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0B8.A7b(X.0bX):X.1V2");
    }
}
