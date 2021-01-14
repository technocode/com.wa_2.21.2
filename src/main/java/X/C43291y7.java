package X;

import android.text.TextUtils;

/* renamed from: X.1y7  reason: invalid class name and case insensitive filesystem */
public class C43291y7 implements AnonymousClass1Gq {
    public static final C43291y7 A00 = new C43291y7();

    @Override // X.AnonymousClass1Gq
    public boolean AOv(Object obj, Object obj2, Object obj3) {
        AnonymousClass2Av r3 = (AnonymousClass2Av) obj;
        String str = (String) obj2;
        AbstractC011306t r5 = (AbstractC011306t) obj3;
        switch (str.hashCode()) {
            case -1316467858:
                if (str.equals("file_name")) {
                    r3.A05 = (String) C008805h.A0a(r5);
                    return true;
                }
                break;
            case -735196116:
                if (str.equals("file_url")) {
                    r3.A06 = (String) C008805h.A0a(r5);
                    return true;
                }
                break;
            case 979421212:
                if (str.equals("resource_name")) {
                    r3.A07 = (String) C008805h.A0a(r5);
                    return true;
                }
                break;
            case 1722958611:
                if (str.equals("dark_resource_name")) {
                    r3.A04 = (String) C008805h.A0a(r5);
                    return true;
                }
                break;
        }
        return false;
    }

    @Override // X.AnonymousClass1Gq
    public boolean APc(Object obj, Object obj2, Object obj3) {
        boolean z;
        AnonymousClass2Av r4 = (AnonymousClass2Av) obj;
        String str = (String) obj2;
        AbstractC011306t r6 = (AbstractC011306t) obj3;
        switch (str.hashCode()) {
            case -1316467858:
                if (str.equals("file_name")) {
                    z = TextUtils.equals(r4.A05, (CharSequence) C008805h.A0a(r6));
                    return true ^ z;
                }
                return true;
            case -735196116:
                if (str.equals("file_url")) {
                    z = TextUtils.equals(r4.A06, (CharSequence) C008805h.A0a(r6));
                    return true ^ z;
                }
                return true;
            case 979421212:
                if (str.equals("resource_name")) {
                    z = TextUtils.equals(r4.A07, (CharSequence) C008805h.A0a(r6));
                    return true ^ z;
                }
                return true;
            case 1722958611:
                if (str.equals("dark_resource_name")) {
                    z = TextUtils.equals(r4.A04, (CharSequence) C008805h.A0a(r6));
                    return true ^ z;
                }
                return true;
            default:
                return true;
        }
    }
}
