package X;

import android.text.TextUtils;

/* renamed from: X.1y8  reason: invalid class name and case insensitive filesystem */
public class C43301y8 implements AnonymousClass1Gq {
    public static final C43301y8 A00 = new C43301y8();

    @Override // X.AnonymousClass1Gq
    public boolean AOv(Object obj, Object obj2, Object obj3) {
        AnonymousClass2Aw r4 = (AnonymousClass2Aw) obj;
        String str = (String) obj2;
        AbstractC011306t r6 = (AbstractC011306t) obj3;
        int hashCode = str.hashCode();
        if (hashCode != -1602936141) {
            if (hashCode != -1160212103 || !str.equals("json_data_source")) {
                return false;
            }
            r4.A05 = (String) C008805h.A0a(r6);
        } else if (!str.equals("right_decoration")) {
            return false;
        } else {
            r4.A07 = (String) C008805h.A0a(r6);
        }
        return true;
    }

    @Override // X.AnonymousClass1Gq
    public boolean APc(Object obj, Object obj2, Object obj3) {
        boolean equals;
        AnonymousClass2Aw r4 = (AnonymousClass2Aw) obj;
        String str = (String) obj2;
        AbstractC011306t r6 = (AbstractC011306t) obj3;
        int hashCode = str.hashCode();
        if (hashCode != -1602936141) {
            if (hashCode != -1160212103 || !str.equals("json_data_source")) {
                return true;
            }
            equals = TextUtils.equals((String) C008805h.A0a(r6), r4.A05);
        } else if (!str.equals("right_decoration")) {
            return true;
        } else {
            equals = TextUtils.equals((String) C008805h.A0a(r6), r4.A07);
        }
        return true ^ equals;
    }
}
