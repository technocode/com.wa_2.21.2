package X;

import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;

/* renamed from: X.2Ys  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C51442Ys implements AnonymousClass0RN {
    public final /* synthetic */ int A00;
    public final /* synthetic */ AnonymousClass0IL A01;
    public final /* synthetic */ EnumC03840Hy A02;
    public final /* synthetic */ AnonymousClass0RE A03;
    public final /* synthetic */ Collection A04;

    public /* synthetic */ C51442Ys(AnonymousClass0IL r1, EnumC03840Hy r2, int i, Collection collection, AnonymousClass0RE r5) {
        this.A01 = r1;
        this.A02 = r2;
        this.A00 = i;
        this.A04 = collection;
        this.A03 = r5;
    }

    @Override // X.AnonymousClass0RN
    public final Object A20(Object obj) {
        String str;
        long j;
        AnonymousClass0IL r6 = this.A01;
        EnumC03840Hy r8 = this.A02;
        int i = this.A00;
        Collection<C007003k> collection = this.A04;
        AnonymousClass0RE r2 = this.A03;
        String str2 = (String) obj;
        ArrayList arrayList = new ArrayList();
        if (collection != null) {
            for (C007003k r1 : collection) {
                if (!C002001d.A3V(r1.A09)) {
                    C47172Gt r3 = new C47172Gt(r1);
                    r3.A0E = true;
                    r3.A0C = false;
                    r3.A06 = true;
                    r3.A0A = true;
                    r3.A0D = true;
                    AnonymousClass01L r12 = r6.A0E;
                    boolean A032 = r12.A05.A03();
                    r3.A09 = A032;
                    if (A032) {
                        str = r12.A04(r3.A0G);
                    } else {
                        str = null;
                    }
                    r3.A03 = str;
                    if (r3.A09) {
                        j = r12.A01(r3.A0G);
                    } else {
                        j = 0;
                    }
                    r3.A00 = j;
                    boolean A033 = r6.A0G.A03();
                    r3.A0B = A033;
                    if (A033) {
                        r3.A04 = (String) r6.A0J.get(r3.A0G);
                    }
                    Map map = r6.A0I;
                    UserJid userJid = r3.A0G;
                    r3.A02 = (String) map.get(userJid);
                    r3.A05 = (String) r6.A0L.get(userJid);
                    arrayList.add(r3);
                }
            }
        }
        StringBuilder A0S = AnonymousClass008.A0S("sync/syncSidelist/request/count ");
        A0S.append(arrayList.size());
        Log.d(A0S.toString());
        r2.A09 = Long.valueOf((long) arrayList.size());
        if (arrayList.isEmpty()) {
            return AnonymousClass0QK.UP_TO_DATE_UNCHANGED;
        }
        if (!r6.A04(r6.A02().A01(C002001d.A1p("sync_sid_sidelist"), new AnonymousClass2LA(r8, arrayList, false, i), 64000), str2)) {
            return AnonymousClass0QK.FAILED;
        }
        r6.A05.A02(r6.A01.A00, r6.A0K, r6.A0L, arrayList);
        return AnonymousClass0QK.UP_TO_DATE_CHANGED_NO_PHONEBOOK;
    }
}
