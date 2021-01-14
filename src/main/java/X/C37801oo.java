package X;

/* renamed from: X.1oo  reason: invalid class name and case insensitive filesystem */
public class C37801oo implements AnonymousClass1Gq {
    public static C37801oo A00 = new C37801oo();

    @Override // X.AnonymousClass1Gq
    public boolean AOv(Object obj, Object obj2, Object obj3) {
        AnonymousClass29T r4 = (AnonymousClass29T) obj;
        String str = (String) obj2;
        AbstractC011306t r6 = (AbstractC011306t) obj3;
        if (str.hashCode() != 989162994 || !str.equals("max_number_of_lines")) {
            return false;
        }
        r4.A02 = Integer.valueOf(((Number) r6).intValue());
        return true;
    }

    @Override // X.AnonymousClass1Gq
    public boolean APc(Object obj, Object obj2, Object obj3) {
        AnonymousClass29T r4 = (AnonymousClass29T) obj;
        String str = (String) obj2;
        AbstractC011306t r6 = (AbstractC011306t) obj3;
        if (str.hashCode() != 989162994 || !str.equals("max_number_of_lines")) {
            return true;
        }
        int intValue = ((Number) r6).intValue();
        Integer num = r4.A02;
        if (num == null || !num.equals(Integer.valueOf(intValue))) {
            return true;
        }
        return false;
    }
}
