package X;

/* renamed from: X.1db  reason: invalid class name and case insensitive filesystem */
public class C31661db implements AnonymousClass1Gq {
    @Override // X.AnonymousClass1Gq
    public boolean AOv(Object obj, Object obj2, Object obj3) {
        AnonymousClass2AC r4 = (AnonymousClass2AC) obj;
        String str = (String) obj2;
        AbstractC011306t r6 = (AbstractC011306t) obj3;
        if (str.hashCode() != -1001078227 || !str.equals("progress")) {
            return false;
        }
        r4.A01 = Float.valueOf(((Number) r6).floatValue());
        return true;
    }

    @Override // X.AnonymousClass1Gq
    public boolean APc(Object obj, Object obj2, Object obj3) {
        AnonymousClass2AC r4 = (AnonymousClass2AC) obj;
        String str = (String) obj2;
        AbstractC011306t r6 = (AbstractC011306t) obj3;
        if (str.hashCode() != -1001078227 || !str.equals("progress") || r4.A01.floatValue() == ((Number) r6).floatValue()) {
            return false;
        }
        return true;
    }
}
