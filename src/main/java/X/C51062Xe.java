package X;

import com.whatsapp.jid.UserJid;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/* renamed from: X.2Xe  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C51062Xe implements AbstractC03150Ez {
    public final /* synthetic */ int A00;
    public final /* synthetic */ AnonymousClass0FD A01;
    public final /* synthetic */ UserJid A02;

    public /* synthetic */ C51062Xe(AnonymousClass0FD r1, UserJid userJid, int i) {
        this.A01 = r1;
        this.A02 = userJid;
        this.A00 = i;
    }

    @Override // X.AbstractC03150Ez
    public final void A1e(Object obj) {
        AnonymousClass0M5 r0;
        AnonymousClass0M5[] r1;
        AnonymousClass0FD r2 = this.A01;
        UserJid userJid = this.A02;
        int i = this.A00;
        AnonymousClass09H r02 = r2.A05;
        String A022 = r02.A02();
        HashSet hashSet = new HashSet();
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        C64272xu r6 = new C64272xu("sync");
        for (AnonymousClass2FU r12 : (List) obj) {
            if (r12 != null) {
                String str = r12.A01;
                Long A012 = r2.A04.A01(str);
                List list = r12.A02;
                AnonymousClass0NE r15 = r12.A00;
                byte[] bArr = r12.A03;
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                int i2 = !"critical_unblock_low".equals(str) ? 1 : 0;
                arrayList2.add(new AnonymousClass0OS("name", str, null, (byte) 0));
                arrayList2.add(new AnonymousClass0OS("order", i2));
                if (A012 != null) {
                    arrayList2.add(new AnonymousClass0OS("version", A012.longValue()));
                }
                if (r15 != null) {
                    arrayList.add(new AnonymousClass0M5("patch", null, null, r15.A09()));
                    hashMap.put(str, list);
                    hashMap2.put(str, bArr);
                }
                hashSet.add(str);
                AnonymousClass0OS[] r3 = !arrayList2.isEmpty() ? (AnonymousClass0OS[]) arrayList2.toArray(new AnonymousClass0OS[0]) : null;
                if (arrayList.isEmpty() || (r1 = (AnonymousClass0M5[]) arrayList.toArray(new AnonymousClass0M5[0])) == null) {
                    r0 = new AnonymousClass0M5("collection", r3, null, null);
                } else {
                    r0 = new AnonymousClass0M5("collection", r3, r1, null);
                }
                r6.A02.add(r0);
            }
        }
        C64272xu r4 = new C64272xu("iq");
        AnonymousClass0OS r13 = new AnonymousClass0OS("to", userJid);
        List list2 = r4.A01;
        list2.add(r13);
        list2.add(new AnonymousClass0OS("xmlns", "w:sync:app:state", null, (byte) 0));
        list2.add(new AnonymousClass0OS("type", "set", null, (byte) 0));
        list2.add(new AnonymousClass0OS("id", A022, null, (byte) 0));
        List list3 = r6.A01;
        list3.clear();
        list3.add(new AnonymousClass0OS("data_namespace", i));
        r4.A02.add(r6.A00());
        AnonymousClass2FI r03 = new AnonymousClass2FI(A022, hashSet, r4.A00(), hashMap, hashMap2);
        r2.A00 = r03;
        r02.A07(238, r03.A02, r03.A01, r2, 32000);
    }
}
