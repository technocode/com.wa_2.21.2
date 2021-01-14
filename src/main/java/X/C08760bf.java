package X;

import android.util.Pair;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.0bf  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C08760bf implements AnonymousClass0RN {
    public final /* synthetic */ C08740bd A00;

    public /* synthetic */ C08760bf(C08740bd r1) {
        this.A00 = r1;
    }

    @Override // X.AnonymousClass0RN
    public final Object A20(Object obj) {
        boolean z;
        C08740bd r4 = this.A00;
        C666535g r1 = (C666535g) obj;
        C02270Bi r5 = r4.A0B;
        r5.A08(Boolean.TRUE);
        boolean z2 = true;
        r4.A01.set(true);
        C08680bX r6 = (C08680bX) r1.A01;
        int i = r6.A00;
        C08590bO r3 = (C08590bO) r4.A05.A01();
        StringBuilder A0S = AnonymousClass008.A0S("MessageSearchManager/getMessagesForQuery/");
        A0S.append(r6.A02().length());
        C04600Kz r9 = new C04600Kz(A0S.toString());
        if (r6.A08 == null || r6.A01().booleanValue()) {
            z = false;
        } else {
            r6.A08 = null;
            z = true;
        }
        AnonymousClass0AM r7 = r4.A0F;
        C04080Iy r11 = r1.A00;
        Pair A08 = r7.A08(r6, r11);
        if (((Number) A08.first).intValue() == -2) {
            Log.d("MessageSearchManager/non-ambiguous fallback");
            r6.A0F = false;
            A08 = r7.A08(r6, r11);
        }
        int intValue = ((Number) A08.first).intValue();
        if (!(intValue == 0 || intValue == -1)) {
            z2 = false;
        }
        Iterator it = ((List) A08.second).iterator();
        while (it.hasNext()) {
            AbstractC007503q r0 = (AbstractC007503q) it.next();
            if (z && r0.A0j) {
                it.remove();
            }
        }
        ArrayList arrayList = new ArrayList((Collection) A08.second);
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            AbstractC007503q r15 = (AbstractC007503q) it2.next();
            if (r15 == null || r15.A0r) {
                it2.remove();
            } else {
                if (r15.A0j) {
                    arrayList2.add(r15);
                } else {
                    arrayList3.add(r15);
                }
                if ((r15 instanceof AnonymousClass0MI) || (r15 instanceof AnonymousClass0MO) || (r15 instanceof AnonymousClass0MP)) {
                    AnonymousClass0M3 r152 = (AnonymousClass0M3) r15;
                    if (r152.A10()) {
                        arrayList4.add(r152);
                    }
                }
            }
        }
        if (r3 != null) {
            r3.A01.addAll(arrayList);
            r3.A02.addAll(arrayList2);
            r3.A03.addAll(arrayList3);
            r3.A00.addAll(arrayList4);
        } else {
            r3 = new C08590bO(arrayList, arrayList2, arrayList3, arrayList4);
        }
        if (!r11.A03()) {
            StringBuilder A0S2 = AnonymousClass008.A0S("found: ");
            A0S2.append(A08.first);
            A0S2.append("|:");
            A0S2.append(((List) A08.second).size());
            r9.A02(A0S2.toString());
            r9.A01();
            if (z2) {
                r4.A09.A08(-1);
                if (!r6.A01().booleanValue()) {
                    r5.A08(Boolean.FALSE);
                }
            } else {
                r4.A09.A08(Integer.valueOf(i));
            }
            r4.A01.set(false);
        }
        return r3;
    }
}
