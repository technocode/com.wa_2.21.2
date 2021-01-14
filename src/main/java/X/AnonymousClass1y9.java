package X;

import android.text.TextUtils;
import java.util.ArrayList;

/* renamed from: X.1y9  reason: invalid class name */
public class AnonymousClass1y9 implements AnonymousClass1Gq {
    public static AnonymousClass1y9 A00 = new AnonymousClass1y9();

    @Override // X.AnonymousClass1Gq
    public boolean AOv(Object obj, Object obj2, Object obj3) {
        C46552Az r4 = (C46552Az) obj;
        String str = (String) obj2;
        AbstractC011306t r6 = (AbstractC011306t) obj3;
        int hashCode = str.hashCode();
        if (hashCode != -1274708295) {
            if (hashCode != 3556653 || !str.equals("text")) {
                return false;
            }
            r4.A06 = (String) C008805h.A0b(r6);
        } else if (!str.equals("fields")) {
            return false;
        } else {
            r4.A08 = C008805h.A0l(r6);
        }
        return true;
    }

    @Override // X.AnonymousClass1Gq
    public boolean APc(Object obj, Object obj2, Object obj3) {
        C46552Az r6 = (C46552Az) obj;
        String str = (String) obj2;
        AbstractC011306t r8 = (AbstractC011306t) obj3;
        int hashCode = str.hashCode();
        if (hashCode != -1274708295) {
            if (hashCode != 3556653 || !str.equals("text")) {
                return false;
            }
            return !TextUtils.equals(r6.A06, (CharSequence) C008805h.A0a(r8));
        } else if (!str.equals("fields")) {
            return false;
        } else {
            if (r6.A08 == null) {
                return true;
            }
            ArrayList A0l = C008805h.A0l(r8);
            if (r6.A08.size() != A0l.size()) {
                return true;
            }
            for (int i = 0; i < A0l.size(); i++) {
                if (!TextUtils.equals((CharSequence) r6.A08.get(i), (CharSequence) A0l.get(i))) {
                    return true;
                }
            }
            return false;
        }
    }
}
