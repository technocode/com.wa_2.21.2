package X;

import android.text.TextUtils;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Map;

/* renamed from: X.3Ad  reason: invalid class name and case insensitive filesystem */
public class C67763Ad {
    public static final AbstractC02170Ax A03 = AnonymousClass3VY.A00;
    public final AbstractC02170Ax A00;
    public final AbstractC02170Ax A01;
    public final AbstractC02170Ax A02;

    public C67763Ad(AbstractC02170Ax r1, AbstractC02170Ax r2, AbstractC02170Ax r3) {
        this.A01 = r1;
        this.A02 = r2;
        this.A00 = r3;
    }

    public void A00(String str, Map map, AbstractC67753Ac r20) {
        String str2;
        AnonymousClass0OS[] r14;
        AnonymousClass0M5 r0;
        AnonymousClass0OS[] r142;
        AnonymousClass0M5 r02;
        byte[] bytes;
        AnonymousClass0OS[] r13;
        AnonymousClass0M5 r03;
        AnonymousClass0OS[] r9;
        AnonymousClass0M5 r6;
        AnonymousClass0M5[] r1;
        AnonymousClass0M5[] r12;
        AnonymousClass0M5[] r132;
        AnonymousClass0M5[] r133;
        boolean A0D = ((AbstractC000400g) ((AnonymousClass3Ah) this.A01.get()).A00.get()).A0D(AbstractC000400g.A0W);
        C73123Vo r3 = new C73123Vo(this, r20, str);
        AbstractC02170Ax r04 = this.A00;
        String A022 = ((AnonymousClass09H) r04.get()).A02();
        if (map != null) {
            str2 = (String) map.get("params");
        } else {
            str2 = "";
        }
        if (TextUtils.isEmpty(str2)) {
            str2 = "{}";
        }
        int i = 1;
        if ("com.bloks.www.minishops.whatsapp.privacy_notice".equals(str)) {
            i = 2;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(new AnonymousClass0OS("smax_id", i));
        byte[] bArr = null;
        arrayList2.add(new AnonymousClass0OS("id", A022, null, (byte) 0));
        arrayList2.add(new AnonymousClass0OS("xmlns", "fb:shops", null, (byte) 0));
        arrayList2.add(new AnonymousClass0OS("type", "get", null, (byte) 0));
        arrayList2.add(new AnonymousClass0OS("to", AnonymousClass0QU.A00));
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        if (str != null) {
            bArr = str.getBytes();
        }
        if (!arrayList4.isEmpty()) {
            r14 = (AnonymousClass0OS[]) arrayList4.toArray(new AnonymousClass0OS[0]);
        } else {
            r14 = null;
        }
        if (arrayList3.isEmpty() || (r133 = (AnonymousClass0M5[]) arrayList3.toArray(new AnonymousClass0M5[0])) == null) {
            r0 = new AnonymousClass0M5("app_id", r14, null, bArr);
        } else {
            r0 = new AnonymousClass0M5("app_id", r14, r133, null);
        }
        arrayList.add(r0);
        ArrayList arrayList5 = new ArrayList();
        ArrayList arrayList6 = new ArrayList();
        byte[] bytes2 = "2784b137d993b8d509777e31c214ddf6e6e806373542d0336026b1ba345fcae7".getBytes();
        if (!arrayList6.isEmpty()) {
            r142 = (AnonymousClass0OS[]) arrayList6.toArray(new AnonymousClass0OS[0]);
        } else {
            r142 = null;
        }
        if (arrayList5.isEmpty() || (r132 = (AnonymousClass0M5[]) arrayList5.toArray(new AnonymousClass0M5[0])) == null) {
            r02 = new AnonymousClass0M5("version", r142, null, bytes2);
        } else {
            r02 = new AnonymousClass0M5("version", r142, r132, null);
        }
        arrayList.add(r02);
        ArrayList arrayList7 = new ArrayList();
        ArrayList arrayList8 = new ArrayList();
        if (str2 == null) {
            bytes = null;
        } else {
            bytes = str2.getBytes();
        }
        if (!arrayList8.isEmpty()) {
            r13 = (AnonymousClass0OS[]) arrayList8.toArray(new AnonymousClass0OS[0]);
        } else {
            r13 = null;
        }
        if (arrayList7.isEmpty() || (r12 = (AnonymousClass0M5[]) arrayList7.toArray(new AnonymousClass0M5[0])) == null) {
            r03 = new AnonymousClass0M5("params", r13, null, bytes);
        } else {
            r03 = new AnonymousClass0M5("params", r13, r12, null);
        }
        arrayList.add(r03);
        if (!arrayList2.isEmpty()) {
            r9 = (AnonymousClass0OS[]) arrayList2.toArray(new AnonymousClass0OS[0]);
        } else {
            r9 = null;
        }
        if (arrayList.isEmpty() || (r1 = (AnonymousClass0M5[]) arrayList.toArray(new AnonymousClass0M5[0])) == null) {
            r6 = new AnonymousClass0M5("iq", r9, null, null);
        } else {
            r6 = new AnonymousClass0M5("iq", r9, r1, null);
        }
        StringBuilder A0S = AnonymousClass008.A0S("wabloks.");
        String obj = r6.toString();
        StringBuilder sb = new StringBuilder(" id='");
        sb.append(A022);
        sb.append("'");
        A0S.append(obj.replace(sb.toString(), ""));
        String obj2 = A0S.toString();
        if (A0D) {
            AnonymousClass0M5 r05 = (AnonymousClass0M5) ((AnonymousClass1TY) this.A02.get()).A01("wabloks.245", obj2);
            if (r05 != null) {
                try {
                    r3.AKk(A022, r05);
                    return;
                } catch (AnonymousClass1XC e) {
                    Log.e(e);
                    return;
                }
            } else {
                StringBuilder sb2 = new StringBuilder("BLOKS: CACHE-MISS ");
                sb2.append("wabloks.245");
                sb2.append(" :: ");
                sb2.append(obj2);
                Log.d(sb2.toString());
            }
        }
        ((AnonymousClass09H) r04.get()).A07(245, A022, r6, new C73133Vp(this, A0D, obj2, r3), 32000);
    }
}
