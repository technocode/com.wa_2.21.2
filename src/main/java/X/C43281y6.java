package X;

/* renamed from: X.1y6  reason: invalid class name and case insensitive filesystem */
public class C43281y6 implements AnonymousClass1Gq {
    public static final C43281y6 A00 = new C43281y6();

    @Override // X.AnonymousClass1Gq
    public boolean AOv(Object obj, Object obj2, Object obj3) {
        C46522Au r3 = (C46522Au) obj;
        String str = (String) obj2;
        AbstractC011306t r5 = (AbstractC011306t) obj3;
        switch (str.hashCode()) {
            case -1579392301:
                if (str.equals("numerical_mask")) {
                    r3.A0G = (String) C008805h.A0a(r5);
                    return true;
                }
                break;
            case -1113584459:
                if (str.equals("read_only")) {
                    r3.A0H = (String) C008805h.A0a(r5);
                    return true;
                }
                break;
            case 3202695:
                if (str.equals("hint")) {
                    r3.A0E = (String) C008805h.A0a(r5);
                    return true;
                }
                break;
            case 3344108:
                if (str.equals("mask")) {
                    r3.A0F = (String) C008805h.A0a(r5);
                    return true;
                }
                break;
            case 3556653:
                if (str.equals("text")) {
                    r3.A0I = (String) C008805h.A0a(r5);
                    return true;
                }
                break;
            case 96784904:
                if (str.equals("error")) {
                    r3.A0C = (String) C008805h.A0a(r5);
                    return true;
                }
                break;
            case 1111390753:
                if (str.equals("max_length")) {
                    r3.A08 = Integer.valueOf(((Number) r5).intValue());
                    return true;
                }
                break;
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:2:0x000e A[RETURN] */
    @Override // X.AnonymousClass1Gq
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean APc(java.lang.Object r4, java.lang.Object r5, java.lang.Object r6) {
        /*
        // Method dump skipped, instructions count: 198
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C43281y6.APc(java.lang.Object, java.lang.Object, java.lang.Object):boolean");
    }
}
