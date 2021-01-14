package X;

import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.2Yr  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C51432Yr implements AnonymousClass0RN {
    public final /* synthetic */ int A00;
    public final /* synthetic */ AnonymousClass0IL A01;
    public final /* synthetic */ EnumC03840Hy A02;
    public final /* synthetic */ AnonymousClass0RE A03;
    public final /* synthetic */ List A04;
    public final /* synthetic */ List A05;
    public final /* synthetic */ boolean A06;
    public final /* synthetic */ boolean A07;
    public final /* synthetic */ boolean A08;
    public final /* synthetic */ boolean A09;

    public /* synthetic */ C51432Yr(AnonymousClass0IL r1, EnumC03840Hy r2, boolean z, boolean z2, boolean z3, boolean z4, int i, List list, List list2, AnonymousClass0RE r10) {
        this.A01 = r1;
        this.A02 = r2;
        this.A06 = z;
        this.A07 = z2;
        this.A08 = z3;
        this.A09 = z4;
        this.A00 = i;
        this.A04 = list;
        this.A05 = list2;
        this.A03 = r10;
    }

    @Override // X.AnonymousClass0RN
    public final Object A20(Object obj) {
        long j;
        AnonymousClass0IL r5 = this.A01;
        EnumC03840Hy r12 = this.A02;
        boolean z = this.A06;
        boolean z2 = this.A07;
        boolean z3 = this.A08;
        boolean z4 = this.A09;
        int i = this.A00;
        List list = this.A04;
        List list2 = this.A05;
        AnonymousClass0RE r2 = this.A03;
        String str = (String) obj;
        AnonymousClass0QK r17 = AnonymousClass0QK.FAILED;
        AnonymousClass00E.A05(list);
        ArrayList arrayList = new ArrayList();
        C47152Gr A012 = r5.A08.A01("sync/sync_notification/", list2, list);
        if (A012 == null) {
            return r17;
        }
        List list3 = A012.A01;
        Iterator it = list3.iterator();
        while (true) {
            String str2 = null;
            if (!it.hasNext()) {
                break;
            }
            C007003k r1 = (C007003k) it.next();
            if (!C002001d.A3U(r1, false)) {
                C47172Gt r3 = new C47172Gt(r1);
                r3.A07 = true;
                r3.A0E = z;
                r3.A0C = false;
                r3.A06 = z2;
                r3.A09 = z3;
                if (z3) {
                    str2 = r5.A0E.A04(r3.A0G);
                }
                r3.A03 = str2;
                if (z3) {
                    j = r5.A0E.A01(r3.A0G);
                } else {
                    j = 0;
                }
                r3.A00 = j;
                r3.A0B = z4;
                if (z4) {
                    r3.A04 = (String) r5.A0J.get(r3.A0G);
                }
                Map map = r5.A0I;
                UserJid userJid = r3.A0G;
                r3.A02 = (String) map.get(userJid);
                r3.A05 = (String) r5.A0L.get(userJid);
                arrayList.add(r3);
            }
        }
        StringBuilder A0S = AnonymousClass008.A0S("sync/sync_notification_contact/request/count ");
        A0S.append(arrayList.size());
        Log.d(A0S.toString());
        r2.A09 = Long.valueOf((long) arrayList.size());
        if (arrayList.isEmpty()) {
            return AnonymousClass0QK.UP_TO_DATE_UNCHANGED;
        }
        if (!r5.A04(r5.A02().A01(C002001d.A1p("sync_sid_notification_contact"), new AnonymousClass2LA(r12, arrayList, false, i), 64000), str)) {
            return r17;
        }
        AnonymousClass0IL.A00(r5.A0M, list3, null);
        if (!list3.isEmpty()) {
            r5.A03.A0G(list3);
            r5.A04.A01(list3);
        }
        r5.A05.A02(r5.A01.A00, r5.A0K, r5.A0L, arrayList);
        return AnonymousClass0QK.UP_TO_DATE_CHANGED_PHONEBOOK;
    }
}
