package X;

import android.text.TextUtils;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.0Af  reason: invalid class name and case insensitive filesystem */
public abstract class AbstractC01990Af {
    public static final C02000Ag A04 = new C02000Ag("unset", null, false);
    public C02010Ah A00;
    public C02020Ai A01;
    public boolean A02;
    public final C018809u A03 = C018809u.A00("BasePaymentAccountSetup", "onboarding", "COMMON");

    public synchronized C02000Ag A00() {
        ArrayList arrayList;
        arrayList = (ArrayList) A03(A02());
        return arrayList.isEmpty() ? null : (C02000Ag) arrayList.get(0);
    }

    public C02000Ag A01(String str) {
        C02000Ag[] r4;
        C05870Qv A022 = this.A01.A02();
        if (A022 == null) {
            return null;
        }
        if (this.A02) {
            r4 = A022.A08;
        } else {
            r4 = A022.A07;
        }
        for (C02000Ag r1 : r4) {
            if (r1.A03.equals(str)) {
                return r1;
            }
        }
        return null;
    }

    public synchronized List A02() {
        ArrayList arrayList;
        String A042 = this.A00.A04(this.A02);
        arrayList = new ArrayList();
        if (!TextUtils.isEmpty(A042)) {
            try {
                JSONObject jSONObject = new JSONObject(A042);
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    String string = jSONObject.getString(next);
                    boolean equals = string.equals("skipped");
                    if (equals) {
                        string = "-1";
                    }
                    C02000Ag r0 = new C02000Ag(next, string, false);
                    r0.A02 = equals;
                    arrayList.add(r0);
                }
            } catch (JSONException e) {
                this.A03.A08("getCompletedStep threw: ", e);
            }
        }
        return arrayList;
    }

    public synchronized List A03(List list) {
        ArrayList arrayList;
        C02000Ag[] r6;
        arrayList = new ArrayList();
        C05870Qv A022 = this.A01.A02();
        if (A022 != null) {
            if (this.A02) {
                r6 = A022.A08;
            } else {
                r6 = A022.A07;
            }
            for (C02000Ag r8 : r6) {
                int i = 0;
                while (true) {
                    if (i >= list.size()) {
                        i = -1;
                        break;
                    }
                    if (((C02000Ag) list.get(i)).A03.equals(r8.A03)) {
                        break;
                    }
                    i++;
                }
                if (i < 0 || !((C02000Ag) list.get(i)).A00.equals(r8.A00) || (((C02000Ag) list.get(i)).A02 && !r8.A01)) {
                    arrayList.add(new C02000Ag(r8.A03, r8.A00, r8.A01));
                }
            }
        }
        return arrayList;
    }

    public synchronized void A04(C02000Ag r7) {
        if (r7 != null) {
            List A022 = A02();
            ArrayList arrayList = (ArrayList) A022;
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                C02000Ag r2 = (C02000Ag) it.next();
                if (r2.A03.equals(r7.A03)) {
                    arrayList.remove(r2);
                    A06(A022);
                    return;
                }
            }
        } else {
            C018809u r22 = this.A03;
            StringBuilder sb = new StringBuilder();
            sb.append("/removeCompletedStep step to remove cannot be null: ");
            sb.append(r7);
            r22.A07(null, sb.toString(), null);
        }
    }

    public synchronized void A05(C02000Ag r8) {
        if (r8 != null) {
            if (!r8.A03.equals("unset")) {
                List A022 = A02();
                List A032 = A03(A022);
                ArrayList arrayList = (ArrayList) A022;
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    if (((C02000Ag) it.next()).A03.equals(r8.A03)) {
                        return;
                    }
                }
                arrayList.add(r8);
                ArrayList arrayList2 = (ArrayList) A032;
                Iterator it2 = arrayList2.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    C02000Ag r2 = (C02000Ag) it2.next();
                    if (r2.A03.equals(r8.A03)) {
                        arrayList2.remove(r2);
                        break;
                    }
                }
                C018809u r22 = this.A03;
                StringBuilder sb = new StringBuilder();
                sb.append("setCompletedStep setting step: ");
                sb.append(r8);
                sb.append(" as complete making completed steps: ");
                sb.append(A022);
                sb.append(" incomplete steps: ");
                sb.append(A032);
                r22.A07(null, sb.toString(), null);
                A06(A022);
            }
        }
    }

    public final synchronized void A06(List list) {
        String str;
        JSONObject jSONObject = new JSONObject();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C02000Ag r2 = (C02000Ag) it.next();
            if (!TextUtils.isEmpty(r2.A00)) {
                try {
                    String str2 = r2.A03;
                    if (r2.A02) {
                        str = "skipped";
                    } else {
                        str = r2.A00;
                    }
                    jSONObject.put(str2, str);
                } catch (JSONException e) {
                    this.A03.A08("setCompletedStep threw: ", e);
                }
            }
        }
        C018809u r22 = this.A03;
        StringBuilder sb = new StringBuilder();
        sb.append("storing steps: ");
        sb.append(jSONObject);
        r22.A07(null, sb.toString(), null);
        C02010Ah r23 = this.A00;
        boolean z = this.A02;
        String obj = jSONObject.toString();
        if (z) {
            AnonymousClass008.A0q(r23, "payments_setup_completed_steps", obj);
        } else {
            AnonymousClass008.A0q(r23, "payments_merchant_setup_completed_steps", obj);
        }
    }

    public synchronized boolean A07() {
        C05870Qv A022 = this.A01.A02();
        boolean z = false;
        if (A022 == null || A022.A04) {
            return false;
        }
        if (A0B("tos_no_wallet") || A0B("tos_with_wallet")) {
            z = true;
        }
        return z;
    }

    public synchronized boolean A08() {
        return A0A(1);
    }

    public synchronized boolean A09() {
        return A0A(2);
    }

    public final synchronized boolean A0A(int i) {
        C02000Ag[] r4;
        C05870Qv A022 = this.A01.A02();
        if (A022 != null) {
            if ((this.A02 ? A022.A08 : A022.A07) != null) {
                List A023 = A02();
                if (this.A02) {
                    r4 = A022.A08;
                } else {
                    r4 = A022.A07;
                }
                for (C02000Ag r6 : r4) {
                    int i2 = 0;
                    while (true) {
                        if (i2 >= A023.size()) {
                            i2 = -1;
                            break;
                        }
                        if (((C02000Ag) A023.get(i2)).A03.equals(r6.A03)) {
                            break;
                        }
                        i2++;
                    }
                    if ((i == 1 || (i == 2 && !r6.A03.equals("2fa"))) && (i2 < 0 || !((C02000Ag) ((ArrayList) A023).get(i2)).A00.equals(r6.A00))) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    public boolean A0B(String str) {
        Iterator it = ((AbstractCollection) A02()).iterator();
        while (it.hasNext()) {
            if (((C02000Ag) it.next()).A03.equals(str)) {
                return true;
            }
        }
        return false;
    }
}
