package X;

import android.text.TextUtils;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.3NG  reason: invalid class name */
public final /* synthetic */ class AnonymousClass3NG implements AnonymousClass0SG {
    public final /* synthetic */ C08740bd A00;

    public /* synthetic */ AnonymousClass3NG(C08740bd r1) {
        this.A00 = r1;
    }

    @Override // X.AnonymousClass0SG
    public final void ADy(Object obj) {
        List list;
        C08740bd r6 = this.A00;
        AnonymousClass02N r15 = (AnonymousClass02N) obj;
        C08680bX r5 = r6.A0G;
        r5.A05 = r15;
        boolean z = false;
        r5.A0G = false;
        C08680bX r0 = r6.A0H;
        r0.A05 = r15;
        r0.A0G = false;
        C02270Bi r7 = r6.A0C;
        String A02 = r5.A02();
        UserJid of = UserJid.of(r5.A05);
        if (of != null) {
            C007003k A0A = r6.A0D.A0A(of);
            C014308b r10 = r6.A0E;
            List A03 = r5.A03();
            AnonymousClass02R r02 = r5.A03;
            if (r02 == null || (list = (List) r02.A00) == null || list.isEmpty()) {
                Object obj2 = r5.A00().A00;
                if (obj2 != null) {
                    list = (List) obj2;
                } else {
                    throw null;
                }
            }
            if (r10 != null) {
                boolean z2 = false;
                if (list.size() % 2 == 0) {
                    z2 = true;
                }
                AnonymousClass00E.A09(z2, "tokenPositions.size must be even");
                Iterator it = list.iterator();
                ArrayList arrayList = new ArrayList();
                arrayList.add(0);
                for (Object obj3 : A03) {
                    Object next = it.next();
                    Object next2 = it.next();
                    if (r10.A0G(A0A, Collections.singletonList(obj3), true)) {
                        arrayList.add(next);
                        arrayList.add(next2);
                    }
                }
                arrayList.add(Integer.valueOf(A02.length()));
                Iterator it2 = arrayList.iterator();
                ArrayList arrayList2 = new ArrayList();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    Number number = (Number) it2.next();
                    Number number2 = (Number) it2.next();
                    if (number == null || number2 == null) {
                        Log.e("messageSearchModel/invalid index in token mapping");
                    } else if (!number.equals(number2)) {
                        String trim = A02.subSequence(number.intValue(), number2.intValue()).toString().trim();
                        if (trim.length() > 0) {
                            arrayList2.add(trim);
                        }
                    }
                }
                Log.e("messageSearchModel/invalid index in token mapping");
                A02 = TextUtils.join(" ", arrayList2);
            } else {
                throw null;
            }
        }
        r7.A07(A02);
        if (r5.A02 == 0) {
            z = true;
        }
        r6.A00(z);
    }
}
