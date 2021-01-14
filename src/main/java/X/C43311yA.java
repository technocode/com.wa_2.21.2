package X;

import android.text.TextUtils;

/* renamed from: X.1yA  reason: invalid class name and case insensitive filesystem */
public class C43311yA implements AnonymousClass1Gq {
    public static final C43311yA A00 = new C43311yA();

    @Override // X.AnonymousClass1Gq
    public boolean AOv(Object obj, Object obj2, Object obj3) {
        C46542Ay r2 = (C46542Ay) obj;
        AbstractC011306t r4 = (AbstractC011306t) obj3;
        if (!"file_name".equals(obj2)) {
            return false;
        }
        r2.A00 = (String) C008805h.A0a(r4);
        return true;
    }

    @Override // X.AnonymousClass1Gq
    public boolean APc(Object obj, Object obj2, Object obj3) {
        C46542Ay r3 = (C46542Ay) obj;
        AbstractC011306t r5 = (AbstractC011306t) obj3;
        if ("file_name".equals(obj2)) {
            return !TextUtils.equals(r3.A00, (CharSequence) C008805h.A0a(r5));
        }
        return false;
    }
}
