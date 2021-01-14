package X;

import android.text.TextUtils;

/* renamed from: X.1y2  reason: invalid class name and case insensitive filesystem */
public class C43251y2 implements AnonymousClass1Gq {
    public static final C43251y2 A00 = new C43251y2();

    @Override // X.AnonymousClass1Gq
    public boolean AOv(Object obj, Object obj2, Object obj3) {
        C46472Ap r4 = (C46472Ap) obj;
        String str = (String) obj2;
        AbstractC011306t r6 = (AbstractC011306t) obj3;
        int hashCode = str.hashCode();
        if (hashCode != -1785710198) {
            if (hashCode != -474351183) {
                if (hashCode != 726809770 || !str.equals("video_file_name")) {
                    return false;
                }
                r4.A06 = (String) C008805h.A0a(r6);
            } else if (!str.equals("video_capture_duration")) {
                return false;
            } else {
                r4.A05 = (String) C008805h.A0a(r6);
            }
        } else if (!str.equals("image_file_name")) {
            return false;
        } else {
            r4.A02 = (String) C008805h.A0a(r6);
        }
        return true;
    }

    @Override // X.AnonymousClass1Gq
    public boolean APc(Object obj, Object obj2, Object obj3) {
        boolean equals;
        C46472Ap r4 = (C46472Ap) obj;
        String str = (String) obj2;
        AbstractC011306t r6 = (AbstractC011306t) obj3;
        int hashCode = str.hashCode();
        if (hashCode != -1785710198) {
            if (hashCode != -474351183) {
                if (hashCode != 726809770 || !str.equals("video_file_name")) {
                    return false;
                }
                equals = TextUtils.equals(r4.A06, (CharSequence) C008805h.A0a(r6));
            } else if (!str.equals("video_capture_duration")) {
                return false;
            } else {
                equals = TextUtils.equals(r4.A05, (CharSequence) C008805h.A0a(r6));
            }
        } else if (!str.equals("image_file_name")) {
            return false;
        } else {
            equals = TextUtils.equals(r4.A02, (CharSequence) C008805h.A0a(r6));
        }
        return !equals;
    }
}
