package X;

/* renamed from: X.1ow  reason: invalid class name and case insensitive filesystem */
public class C37881ow implements AnonymousClass1Gq {
    public static C37881ow A00 = new C37881ow();

    @Override // X.AnonymousClass1Gq
    public boolean AOv(Object obj, Object obj2, Object obj3) {
        AnonymousClass29V r3 = (AnonymousClass29V) obj;
        String str = (String) obj2;
        AbstractC011306t r5 = (AbstractC011306t) obj3;
        switch (str.hashCode()) {
            case -2115337775:
                if (str.equals("text_color")) {
                    try {
                        r3.A09 = Integer.valueOf(AnonymousClass05i.A03((String) C008805h.A0a(r5)));
                        return true;
                    } catch (AnonymousClass060 e) {
                        throw new IllegalStateException(e);
                    }
                }
                break;
            case -1003668786:
                if (str.equals("textSize")) {
                    r3.A06 = Float.valueOf(((Number) r5).floatValue());
                    return true;
                }
                break;
            case 3556653:
                if (str.equals("text")) {
                    String str2 = (String) C008805h.A0a(r5);
                    if (str2 != null) {
                        r3.A04 = str2;
                        return true;
                    }
                    r3.A04 = "";
                    return true;
                }
                break;
            case 989162994:
                if (str.equals("max_number_of_lines")) {
                    r3.A07 = Integer.valueOf(((Number) r5).intValue());
                    return true;
                }
                break;
            case 1317770161:
                if (str.equals("text_themed_color")) {
                    r3.A01 = (C009405x) C008805h.A0a(r5);
                    return true;
                }
                break;
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0032 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    @Override // X.AnonymousClass1Gq
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean APc(java.lang.Object r5, java.lang.Object r6, java.lang.Object r7) {
        /*
        // Method dump skipped, instructions count: 119
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C37881ow.APc(java.lang.Object, java.lang.Object, java.lang.Object):boolean");
    }
}
