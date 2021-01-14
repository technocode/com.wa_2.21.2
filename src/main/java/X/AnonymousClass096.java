package X;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.096  reason: invalid class name */
public class AnonymousClass096 {
    public static volatile AnonymousClass096 A01;
    public final C014408c A00;

    public AnonymousClass096(C014408c r1) {
        this.A00 = r1;
    }

    public static AnonymousClass096 A00() {
        if (A01 == null) {
            synchronized (AnonymousClass096.class) {
                if (A01 == null) {
                    A01 = new AnonymousClass096(C014408c.A00());
                }
            }
        }
        return A01;
    }

    public static String A01(int i) {
        StringBuilder A0S = AnonymousClass008.A0S("(");
        A0S.append(TextUtils.join(",", Collections.nCopies(i, "?")));
        A0S.append(")");
        return A0S.toString();
    }

    public static final void A02(StringBuilder sb, boolean z) {
        if (z) {
            sb.append(" AND message_type != '");
            sb.append(8);
            sb.append("' ");
            return;
        }
        sb.append(" ");
    }

    public static final void A03(boolean z, StringBuilder sb) {
        if (z) {
            sb.append(" AND _id < ? ");
            sb.append(" ORDER BY _id DESC");
            return;
        }
        sb.append("AND _id > ? ");
        sb.append(" ORDER BY _id ASC");
    }

    public AnonymousClass02R A04(AbstractC007503q r11) {
        String str;
        ArrayList arrayList = new ArrayList();
        List<AnonymousClass02N> A0M = r11.A0M();
        if (A0M == null || A0M.size() < r11.A06) {
            arrayList.add(String.valueOf(r11.A0E));
            arrayList.add(r11.A0n.A01);
            arrayList.add(String.valueOf(r11.A0p));
            str = " WHERE timestamp=? AND from_me=1 AND key_id=? AND _id!=?";
        } else {
            arrayList.add(r11.A0n.A01);
            C014408c r9 = this.A00;
            if (r9 != null) {
                HashMap hashMap = new HashMap();
                for (AnonymousClass02N r1 : A0M) {
                    long A05 = r9.A05(r1);
                    if (A05 != -1) {
                        hashMap.put(r1, Long.valueOf(A05));
                    }
                }
                StringBuilder A0S = AnonymousClass008.A0S(" WHERE from_me=1 AND key_id=? AND chat_row_id IN ");
                A0S.append(A01(hashMap.size()));
                str = A0S.toString();
                for (Object obj : hashMap.values()) {
                    arrayList.add(obj.toString());
                }
            } else {
                throw null;
            }
        }
        return new AnonymousClass02R(str, arrayList);
    }

    public final void A05(String str, boolean z, StringBuilder sb, boolean z2) {
        if ("document".equals(str)) {
            sb.append(AbstractC05370Og.A0A);
        } else if ("url".equals(str)) {
            if (z2) {
                sb.append(AbstractC05370Og.A0M);
            } else {
                sb.append(AbstractC05370Og.A0N);
            }
        } else if ("all_media".equals(str)) {
            sb.append(AbstractC05370Og.A0b);
        } else {
            sb.append(AbstractC05370Og.A1B);
            A02(sb, z);
            if (str != null) {
                AnonymousClass008.A19("sqlStatementsBuilder/getStartSqlForType/unexpected type string=", str);
            }
        }
    }
}
