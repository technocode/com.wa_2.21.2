package X;

/* renamed from: X.1p0  reason: invalid class name and case insensitive filesystem */
public final class C37921p0 implements AnonymousClass1Gq {
    public static final C37921p0 A00 = new C37921p0();

    @Override // X.AnonymousClass1Gq
    public boolean AOv(Object obj, Object obj2, Object obj3) {
        AbstractC008905s r3 = (AbstractC008905s) obj;
        String str = (String) obj2;
        AbstractC011306t r5 = (AbstractC011306t) obj3;
        switch (str.hashCode()) {
            case -1225497657:
                if (str.equals("translationX")) {
                    r3.A00.A04 = ((Number) r5).floatValue();
                    return true;
                }
                break;
            case -1225497656:
                if (str.equals("translationY")) {
                    r3.A00.A05 = ((Number) r5).floatValue();
                    return true;
                }
                break;
            case -1225497655:
                if (str.equals("translationZ")) {
                    r3.A00.A06 = ((Number) r5).floatValue();
                    return true;
                }
                break;
            case -908189618:
                if (str.equals("scaleX")) {
                    r3.A00.A02 = ((Number) r5).floatValue();
                    return true;
                }
                break;
            case -908189617:
                if (str.equals("scaleY")) {
                    r3.A00.A03 = ((Number) r5).floatValue();
                    return true;
                }
                break;
            case -40300674:
                if (str.equals("rotation")) {
                    r3.A00.A01 = ((Number) r5).floatValue();
                    return true;
                }
                break;
            case 92909918:
                if (str.equals("alpha")) {
                    r3.A00.A00 = ((Number) r5).floatValue();
                    return true;
                }
                break;
        }
        AnonymousClass1Gq A03 = r3.A03();
        if (A03 != null) {
            return A03.AOv(r3, str, r5);
        }
        return false;
    }

    @Override // X.AnonymousClass1Gq
    public boolean APc(Object obj, Object obj2, Object obj3) {
        AbstractC008905s r2 = (AbstractC008905s) obj;
        AnonymousClass1Gq A03 = r2.A03();
        if (A03 != null) {
            return A03.APc(r2, obj2, obj3);
        }
        return true;
    }
}
