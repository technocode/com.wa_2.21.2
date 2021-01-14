package X;

/* renamed from: X.1p9  reason: invalid class name and case insensitive filesystem */
public class C38001p9 implements AnonymousClass1Gq {
    public static final C38001p9 A00 = new C38001p9();

    @Override // X.AnonymousClass1Gq
    public boolean AOv(Object obj, Object obj2, Object obj3) {
        AnonymousClass06c r4 = (AnonymousClass06c) obj;
        String str = (String) obj2;
        AbstractC011306t r6 = (AbstractC011306t) obj3;
        int hashCode = str.hashCode();
        if (hashCode != 3202695) {
            if (hashCode != 3506294) {
                if (hashCode != 102727412 || !str.equals("label")) {
                    return false;
                }
                r4.A01 = (String) C008805h.A0b(r6);
            } else if (!str.equals("role")) {
                return false;
            } else {
                r4.A02 = (String) C008805h.A0b(r6);
            }
        } else if (!str.equals("hint")) {
            return false;
        } else {
            r4.A00 = (String) C008805h.A0b(r6);
        }
        return true;
    }

    @Override // X.AnonymousClass1Gq
    public boolean APc(Object obj, Object obj2, Object obj3) {
        boolean z;
        AnonymousClass06c r4 = (AnonymousClass06c) obj;
        String str = (String) obj2;
        AbstractC011306t r6 = (AbstractC011306t) obj3;
        int hashCode = str.hashCode();
        if (hashCode != 3202695) {
            if (hashCode != 3506294) {
                if (hashCode != 102727412 || !str.equals("label")) {
                    return true;
                }
                Object A0b = C008805h.A0b(r6);
                String str2 = r4.A01;
                z = str2 != null ? str2.equals(A0b) : A0b == null;
            } else if (!str.equals("role")) {
                return true;
            } else {
                Object A0b2 = C008805h.A0b(r6);
                String str3 = r4.A02;
                z = str3 != null ? str3.equals(A0b2) : A0b2 == null;
            }
        } else if (!str.equals("hint")) {
            return true;
        } else {
            Object A0b3 = C008805h.A0b(r6);
            String str4 = r4.A00;
            z = str4 != null ? str4.equals(A0b3) : A0b3 == null;
        }
        return true ^ z;
    }
}
