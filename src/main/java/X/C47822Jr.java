package X;

import android.icu.text.UnicodeSet;
import android.os.Build;

/* renamed from: X.2Jr  reason: invalid class name and case insensitive filesystem */
public class C47822Jr {
    public static final C47822Jr A02 = new C47822Jr("");
    public static final boolean A03;
    public final UnicodeSet A00;
    public final String A01;

    static {
        boolean z = false;
        if (Build.VERSION.SDK_INT >= 24) {
            z = true;
        }
        A03 = z;
    }

    public C47822Jr(String str) {
        UnicodeSet unicodeSet;
        this.A01 = str;
        if (A03) {
            if (str.isEmpty()) {
                unicodeSet = UnicodeSet.EMPTY;
            } else {
                unicodeSet = new UnicodeSet(str);
            }
            this.A00 = unicodeSet;
        }
    }

    public boolean A00(int i) {
        int type;
        UnicodeSet unicodeSet;
        if (A03 && (unicodeSet = this.A00) != null) {
            return unicodeSet.contains(i);
        }
        String str = this.A01;
        int hashCode = str.hashCode();
        if (hashCode != -1633268329) {
            if (hashCode == -1605334735 && str.equals("[:digit:]")) {
                return Character.isDigit(i);
            }
        } else if (!str.equals("[:^S:]") || (type = Character.getType(i)) == 26 || type == 25 || type == 27 || type == 28) {
            return false;
        } else {
            return true;
        }
        return false;
    }
}
