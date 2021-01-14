package X;

/* renamed from: X.1ol  reason: invalid class name and case insensitive filesystem */
public final class C37771ol implements AnonymousClass1Gq {
    public static final C37771ol A00;
    public static final AnonymousClass1Gq A01;

    static {
        C37771ol r0 = new C37771ol();
        A00 = r0;
        A01 = r0;
    }

    @Override // X.AnonymousClass1Gq
    public boolean AOv(Object obj, Object obj2, Object obj3) {
        AnonymousClass2AY r4 = (AnonymousClass2AY) obj;
        String str = (String) obj2;
        AbstractC011306t r6 = (AbstractC011306t) obj3;
        int hashCode = str.hashCode();
        boolean z = false;
        if (hashCode != -1609594047) {
            if (hashCode != 1941332754 || !str.equals("visibility")) {
                return false;
            }
            try {
                r4.A00 = C008805h.A0W((String) C008805h.A0a(r6)).intValue();
            } catch (AnonymousClass060 e) {
                throw new IllegalStateException(e);
            }
        } else if (!str.equals("enabled")) {
            return false;
        } else {
            if (((Number) r6).intValue() != 0) {
                z = true;
            }
            r4.A08 = Boolean.valueOf(z);
        }
        return true;
    }

    @Override // X.AnonymousClass1Gq
    public boolean APc(Object obj, Object obj2, Object obj3) {
        boolean z;
        AnonymousClass2AY r5 = (AnonymousClass2AY) obj;
        String str = (String) obj2;
        AbstractC011306t r7 = (AbstractC011306t) obj3;
        int hashCode = str.hashCode();
        boolean z2 = false;
        if (hashCode != -1609594047) {
            if (hashCode == 1941332754 && str.equals("visibility")) {
                try {
                    if (r5.A00 != C008805h.A0W((String) C008805h.A0a(r7)).intValue()) {
                        return true;
                    }
                    return false;
                } catch (AnonymousClass060 e) {
                    throw new IllegalStateException(e);
                }
            }
        } else if (str.equals("enabled")) {
            if (((Number) r7).intValue() != 0) {
                z2 = true;
            }
            Boolean valueOf = Boolean.valueOf(z2);
            Boolean bool = r5.A08;
            if (valueOf != null ? !valueOf.equals(bool) : bool != null) {
                z = false;
            } else {
                z = true;
            }
            return true ^ z;
        }
        return true;
    }
}
