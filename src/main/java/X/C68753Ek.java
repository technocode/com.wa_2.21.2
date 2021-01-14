package X;

import android.text.TextUtils;
import android.util.Pair;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.3Ek  reason: invalid class name and case insensitive filesystem */
public class C68753Ek {
    public String A00;
    public String A01;
    public String A02;
    public String A03;
    public ArrayList A04;

    public List A00() {
        if (!(this instanceof AnonymousClass3Y9)) {
            ArrayList arrayList = new ArrayList();
            if (!TextUtils.isEmpty(this.A02)) {
                arrayList.add(new Pair("Payments fb txn id", this.A02));
            }
            if (!TextUtils.isEmpty(this.A00)) {
                arrayList.add(new Pair("Payments bank txn id", this.A00));
            }
            if (!TextUtils.isEmpty(this.A01)) {
                arrayList.add(new Pair("Payments return value", this.A01));
            }
            if (!TextUtils.isEmpty(this.A03)) {
                arrayList.add(new Pair("Payments status", this.A03));
            }
            A01(arrayList);
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        if (!TextUtils.isEmpty(this.A02)) {
            arrayList2.add(new Pair("Payments fb txn id", this.A02));
        }
        if (!TextUtils.isEmpty(this.A01)) {
            arrayList2.add(new Pair("Payments return value", this.A01));
        }
        if (!TextUtils.isEmpty(this.A03)) {
            arrayList2.add(new Pair("Payments status", this.A03));
        }
        A01(arrayList2);
        return arrayList2;
    }

    public void A01(List list) {
        ArrayList arrayList = this.A04;
        if (!(arrayList == null || arrayList.isEmpty())) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < arrayList.size(); i++) {
                sb.append((String) arrayList.get(i));
                if (i < arrayList.size() - 1) {
                    sb.append(", ");
                }
            }
            list.add(new Pair("Topic IDs", sb.toString()));
        }
    }
}
