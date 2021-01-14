package X;

import android.os.Message;
import com.whatsapp.jobqueue.job.SendWebForwardJob;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.0Dm  reason: invalid class name and case insensitive filesystem */
public class C02800Dm {
    public static volatile C02800Dm A03;
    public final AnonymousClass01J A00;
    public final C02400Bv A01;
    public final AnonymousClass0C4 A02;

    public C02800Dm(C02400Bv r1, AnonymousClass0C4 r2, AnonymousClass01J r3) {
        this.A01 = r1;
        this.A02 = r2;
        this.A00 = r3;
    }

    public static C02800Dm A00() {
        if (A03 == null) {
            synchronized (C02800Dm.class) {
                if (A03 == null) {
                    A03 = new C02800Dm(C02400Bv.A00(), AnonymousClass0C4.A00(), AnonymousClass01J.A00());
                }
            }
        }
        return A03;
    }

    public void A01(String str, C64392y7 r4, int i) {
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(r4);
        A02(str, arrayList, i);
    }

    public void A02(String str, List list, int i) {
        A03(str, list, i, false, null);
    }

    public void A03(String str, List list, int i, boolean z, String str2) {
        HashMap hashMap = new HashMap();
        hashMap.put("web", str2);
        A04(str, list, i, z, hashMap, null);
    }

    public void A04(String str, List list, int i, boolean z, Map map, Map map2) {
        String str2;
        String str3 = str;
        C02400Bv r2 = this.A01;
        if (r2.A03() || z) {
            AnonymousClass3WW r4 = new AnonymousClass3WW(this, str3, list, i, z, (String) map.get("web"));
            ((AbstractC67843As) r4).A00 = r2.A01().A03;
            AnonymousClass0C4 r0 = this.A02;
            AnonymousClass237 r1 = new AnonymousClass237(r0, r4);
            if (str == null) {
                str3 = r0.A03();
            }
            if (7 == i || 8 == i) {
                str2 = "preempt-";
            } else {
                str2 = "";
            }
            AnonymousClass01J r5 = this.A00;
            r5.A00.A01(new SendWebForwardJob(AnonymousClass008.A0K(str2, str3), r2.A01().A03, Message.obtain(null, 0, 45, 0, new AnonymousClass22J(str3, list, i, map, r1, map2))));
        }
    }
}
