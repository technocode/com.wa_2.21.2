package X;

/* renamed from: X.1da  reason: invalid class name and case insensitive filesystem */
public class C31651da implements AnonymousClass1Gq {
    public static final C31651da A00 = new C31651da();

    @Override // X.AnonymousClass1Gq
    public boolean AOv(Object obj, Object obj2, Object obj3) {
        AnonymousClass2AB r3 = (AnonymousClass2AB) obj;
        String str = (String) obj2;
        AbstractC011306t r5 = (AbstractC011306t) obj3;
        switch (str.hashCode()) {
            case -1609594047:
                if (str.equals("enabled")) {
                    r3.A04 = Boolean.valueOf(C008805h.A1Q((Number) r5));
                    return true;
                }
                break;
            case 742313895:
                if (str.equals("checked")) {
                    r3.A03 = Boolean.valueOf(C008805h.A1Q((Number) r5));
                    return true;
                }
                break;
            case 1759719571:
                if (str.equals("off_color")) {
                    r3.A01 = (C009405x) C008805h.A0a(r5);
                    return true;
                }
                break;
            case 1834188035:
                if (str.equals("on_color")) {
                    r3.A00 = (C009405x) C008805h.A0a(r5);
                    return true;
                }
                break;
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x006f A[ORIG_RETURN, RETURN, SYNTHETIC] */
    @Override // X.AnonymousClass1Gq
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean APc(java.lang.Object r4, java.lang.Object r5, java.lang.Object r6) {
        /*
        // Method dump skipped, instructions count: 132
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C31651da.APc(java.lang.Object, java.lang.Object, java.lang.Object):boolean");
    }
}
