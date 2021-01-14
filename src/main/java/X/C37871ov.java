package X;

/* renamed from: X.1ov  reason: invalid class name and case insensitive filesystem */
public class C37871ov implements AnonymousClass1Gq {
    public static final C37871ov A00 = new C37871ov();

    @Override // X.AnonymousClass1Gq
    public boolean AOv(Object obj, Object obj2, Object obj3) {
        C46422Aa r4 = (C46422Aa) obj;
        String str = (String) obj2;
        AbstractC011306t r6 = (AbstractC011306t) obj3;
        int hashCode = str.hashCode();
        if (hashCode != -2115337775) {
            if (hashCode != 3202695) {
                if (hashCode != 1317770161 || !str.equals("text_themed_color")) {
                    return false;
                }
                r4.A02 = (C009405x) C008805h.A0a(r6);
            } else if (!str.equals("hint")) {
                return false;
            } else {
                r4.A0F = (String) C008805h.A0b(r6);
            }
        } else if (!str.equals("text_color")) {
            return false;
        } else {
            r4.A0B = Integer.valueOf(AnonymousClass05i.A03((String) C008805h.A0b(r6)));
        }
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0031 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    @Override // X.AnonymousClass1Gq
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean APc(java.lang.Object r4, java.lang.Object r5, java.lang.Object r6) {
        /*
        // Method dump skipped, instructions count: 104
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C37871ov.APc(java.lang.Object, java.lang.Object, java.lang.Object):boolean");
    }
}
