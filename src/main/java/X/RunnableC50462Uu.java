package X;

import android.os.ConditionVariable;
import android.util.Pair;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.2Uu  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class RunnableC50462Uu extends RunnableEmptyBase implements Runnable {
    public final /* synthetic */ ConditionVariable A00;
    public final /* synthetic */ ConditionVariable A01;
    public final /* synthetic */ AnonymousClass0K0 A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ HashMap A04;
    public final /* synthetic */ boolean A05;

    public /* synthetic */ RunnableC50462Uu(AnonymousClass0K0 r1, HashMap hashMap, String str, boolean z, ConditionVariable conditionVariable, ConditionVariable conditionVariable2) {
        this.A02 = r1;
        this.A04 = hashMap;
        this.A03 = str;
        this.A05 = z;
        this.A00 = conditionVariable;
        this.A01 = conditionVariable2;
    }

    /* JADX INFO: finally extract failed */
    public final void run() {
        int i;
        List list;
        C007303n r0;
        AnonymousClass0K0 r4 = this.A02;
        HashMap hashMap = this.A04;
        String str = this.A03;
        boolean z = this.A05;
        ConditionVariable conditionVariable = this.A00;
        ConditionVariable conditionVariable2 = this.A01;
        ArrayList arrayList = new ArrayList();
        long currentTimeMillis = System.currentTimeMillis();
        ArrayList arrayList2 = new ArrayList();
        int i2 = 0;
        try {
            for (Map.Entry entry : hashMap.entrySet()) {
                AnonymousClass02N r11 = (AnonymousClass02N) entry.getKey();
                AbstractC007503q r12 = (AbstractC007503q) entry.getValue();
                C64392y7 A032 = r4.A0C.A03(r11);
                arrayList.add(A032);
                if (r12 != null && AnonymousClass1VY.A0T(r11) && r12.A08 == 6) {
                    r4.A0E.A04((AnonymousClass0OP) r11, true);
                }
                if ((currentTimeMillis - 86400000 < A032.A08 || A032.A07 > 0) && r12 != null) {
                    arrayList2.add(Pair.create(r12.A0n, Integer.valueOf(A032.A01)));
                    A032.A0O = true;
                }
            }
            C02800Dm r15 = r4.A0D;
            if (z) {
                i2 = 7;
            }
            r15.A03(str, arrayList, i2, z, null);
            conditionVariable.open();
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                Pair pair = (Pair) it.next();
                if (((Number) pair.second).intValue() < r4.A02.A06(C000300f.A00)) {
                    list = r4.A08.A04((C007303n) pair.first, ((Number) pair.second).intValue() + 20, null);
                    r0 = null;
                    i = 1;
                } else {
                    i = 5;
                    C02760Di r1 = r4.A0C;
                    AnonymousClass02N r02 = ((C007303n) pair.first).A00;
                    if (r02 != null) {
                        Pair A022 = r1.A02(r02);
                        list = (List) A022.second;
                        r0 = (C007303n) A022.first;
                    } else {
                        throw null;
                    }
                }
                if (list != null) {
                    r4.A01(i, list, false, z, null, conditionVariable2, r0);
                }
            }
        } catch (Throwable th) {
            C02800Dm r152 = r4.A0D;
            if (z) {
                i2 = 7;
            }
            r152.A03(str, arrayList, i2, z, null);
            conditionVariable.open();
            throw th;
        }
    }
}
