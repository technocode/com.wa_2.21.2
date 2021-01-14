package X;

import android.text.TextUtils;
import java.util.List;

/* renamed from: X.1yB  reason: invalid class name and case insensitive filesystem */
public class C43321yB implements AnonymousClass1Gq {
    public static final C43321yB A00 = new C43321yB();

    public static boolean A00(List list, List list2) {
        if (list == list2) {
            return true;
        }
        if (list == null || list2 == null || list.size() != list2.size()) {
            return false;
        }
        for (int i = 0; i < list.size(); i++) {
            if (!TextUtils.equals((CharSequence) list.get(i), (CharSequence) list2.get(i))) {
                return false;
            }
        }
        return true;
    }

    @Override // X.AnonymousClass1Gq
    public boolean AOv(Object obj, Object obj2, Object obj3) {
        AnonymousClass2B0 r3 = (AnonymousClass2B0) obj;
        String str = (String) obj2;
        AbstractC011306t r5 = (AbstractC011306t) obj3;
        switch (str.hashCode()) {
            case -1354842768:
                if (str.equals("colors")) {
                    r3.A06 = (List) C008805h.A0c(r5);
                    return true;
                }
                break;
            case -908189591:
                if (str.equals("scales")) {
                    r3.A08 = (List) C008805h.A0c(r5);
                    return true;
                }
                break;
            case -891774750:
                if (str.equals("styles")) {
                    r3.A09 = (List) C008805h.A0c(r5);
                    return true;
                }
                break;
            case 3556653:
                if (str.equals("text")) {
                    r3.A04 = (String) C008805h.A0b(r5);
                    return true;
                }
                break;
            case 102977465:
                if (str.equals("links")) {
                    r3.A07 = (List) C008805h.A0c(r5);
                    return true;
                }
                break;
        }
        return false;
    }

    @Override // X.AnonymousClass1Gq
    public boolean APc(Object obj, Object obj2, Object obj3) {
        boolean z;
        AnonymousClass2B0 r3 = (AnonymousClass2B0) obj;
        String str = (String) obj2;
        AbstractC011306t r5 = (AbstractC011306t) obj3;
        switch (str.hashCode()) {
            case -1354842768:
                if (str.equals("colors")) {
                    z = A00(r3.A06, (List) C008805h.A0c(r5));
                    return !z;
                }
                return false;
            case -908189591:
                if (str.equals("scales")) {
                    z = A00(r3.A08, (List) C008805h.A0c(r5));
                    return !z;
                }
                return false;
            case -891774750:
                if (str.equals("styles")) {
                    z = A00(r3.A09, (List) C008805h.A0c(r5));
                    return !z;
                }
                return false;
            case 3556653:
                if (str.equals("text")) {
                    z = TextUtils.equals(r3.A04, (CharSequence) C008805h.A0a(r5));
                    return !z;
                }
                return false;
            case 102977465:
                if (str.equals("links")) {
                    z = A00(r3.A07, (List) C008805h.A0c(r5));
                    return !z;
                }
                return false;
            default:
                return false;
        }
    }
}
