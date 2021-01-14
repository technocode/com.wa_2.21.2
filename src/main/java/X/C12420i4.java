package X;

import android.telephony.PhoneNumberUtils;
import android.text.TextUtils;
import com.whatsapp.util.Log;

/* renamed from: X.0i4  reason: invalid class name and case insensitive filesystem */
public class C12420i4 {
    public static C12420i4 A00 = new C12420i4();

    public static String A00(C007003k r1) {
        return A02((AnonymousClass02N) r1.A02(AnonymousClass02N.class));
    }

    public static String A01(AnonymousClass02N r1) {
        String A13 = C001801b.A13(A02(r1));
        if (A13 != null) {
            return AnonymousClass008.A0K("+", A13);
        }
        return null;
    }

    public static String A02(AnonymousClass02N r4) {
        String str;
        int indexOf;
        if (r4 == null) {
            Log.w("contact/phonenumber/jid/null");
            return null;
        } else if (AnonymousClass1VY.A0T(r4) || TextUtils.isEmpty(r4.user)) {
            return null;
        } else {
            boolean A0Y = AnonymousClass1VY.A0Y(r4);
            if (A0Y) {
                String str2 = r4.user;
                if (str2 == null || (indexOf = str2.indexOf("-")) == -1) {
                    str = null;
                } else {
                    str = str2.substring(0, indexOf);
                }
            } else {
                str = r4.user;
            }
            if (!PhoneNumberUtils.isGlobalPhoneNumber(str)) {
                return str;
            }
            if (!A0Y && !AnonymousClass1VY.A0a(r4)) {
                return A03(str);
            }
            StringBuilder sb = new StringBuilder("+");
            sb.append(str);
            return sb.toString();
        }
    }

    public static String A03(String str) {
        StringBuilder sb = new StringBuilder("+");
        sb.append(str);
        String obj = sb.toString();
        try {
            C12440i6 A002 = C12440i6.A00();
            C12490iB A0E = A002.A0E(obj, "ZZ");
            if (52 == A0E.countryCode_) {
                String valueOf = String.valueOf(A0E.nationalNumber_);
                if (valueOf.length() == 11 && valueOf.charAt(0) == '1') {
                    StringBuilder A0S = AnonymousClass008.A0S("+");
                    A0S.append(A0E.countryCode_);
                    A0S.append(valueOf.substring(1));
                    obj = A0S.toString();
                }
            }
            return A002.A0G(A002.A0E(obj, "ZZ"), EnumC12560iI.INTERNATIONAL);
        } catch (Exception e) {
            StringBuilder A0Z = AnonymousClass008.A0Z("contact/formatter-exception num:", obj, " ");
            A0Z.append(e.getMessage());
            Log.e(A0Z.toString(), e);
            return obj;
        } catch (ExceptionInInitializerError e2) {
            StringBuilder A0Z2 = AnonymousClass008.A0Z("contact/formatter-init-exception num:", obj, " ");
            A0Z2.append(e2.getMessage());
            Log.e(A0Z2.toString(), e2);
            return obj;
        }
    }
}
