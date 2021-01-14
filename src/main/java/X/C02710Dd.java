package X;

import com.whatsapp.jid.GroupJid;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.0Dd  reason: invalid class name and case insensitive filesystem */
public class C02710Dd extends AnonymousClass0DZ {
    public final AnonymousClass01I A00;
    public final AnonymousClass01A A01;
    public final C014308b A02;
    public final AnonymousClass00S A03;
    public final AnonymousClass01T A04;

    public C02710Dd(AnonymousClass00S r1, AnonymousClass01I r2, AnonymousClass01A r3, C014308b r4, AnonymousClass0DU r5, AnonymousClass01T r6) {
        super(r5);
        this.A03 = r1;
        this.A00 = r2;
        this.A01 = r3;
        this.A02 = r4;
        this.A04 = r6;
    }

    public static final void A00(Jid jid, UserJid userJid, List list, Map map) {
        UserJid of = UserJid.of(jid);
        if (of != null && !userJid.equals(jid) && map.containsKey(of)) {
            StringBuilder sb = new StringBuilder("contact-mutation-handler/populateJidList adding jid: ");
            sb.append(of);
            Log.i(sb.toString());
            list.add(of);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x003d, code lost:
        if (r5 == null) goto L_0x003f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.List A06(java.util.Collection r19, X.C48192Lg r20) {
        /*
        // Method dump skipped, instructions count: 126
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C02710Dd.A06(java.util.Collection, X.2Lg):java.util.List");
    }

    public List A07(List list) {
        AnonymousClass02X r0;
        AnonymousClass01I r02 = this.A00;
        r02.A04();
        UserJid userJid = r02.A03;
        if (userJid == null) {
            Log.e("contact-mutation-handler/createBootstrapMutations me is null");
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        this.A01.A04.A0S(arrayList, 1, false, false);
        HashMap hashMap = new HashMap();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C007003k r1 = (C007003k) it.next();
            UserJid of = UserJid.of(r1.A09);
            if (of != null) {
                hashMap.put(of, r1);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            AnonymousClass2FS r12 = (AnonymousClass2FS) it2.next();
            AnonymousClass02N r10 = r12.A01.A0A;
            if (AnonymousClass1VY.A0e(r10)) {
                Log.i("contact-mutation-handler/createBootstrapMutations attempting to add jid from 1:1 chat");
                A00(r10, userJid, arrayList2, hashMap);
            } else if (AnonymousClass1VY.A0Y(r10)) {
                AnonymousClass008.A12("contact-mutation-handler/createBootstrapMutations attempting to add jids that messaged in group or were mentioned: ", r10);
                for (AbstractC007503q r13 : r12.A02) {
                    A00(r13.A07(), userJid, arrayList3, hashMap);
                    List<Jid> list2 = r13.A0c;
                    if (list2 != null) {
                        for (Jid jid : list2) {
                            A00(jid, userJid, arrayList3, hashMap);
                        }
                    }
                }
                AnonymousClass01T r14 = this.A04;
                if (r10 instanceof GroupJid) {
                    r0 = (AnonymousClass02X) r10;
                } else {
                    r0 = null;
                }
                if (r0 != null) {
                    C05350Oe A032 = r14.A01(r0).A03();
                    StringBuilder sb = new StringBuilder("contact-mutation-handler/createBootstrapMutations attempting to add all participant jids for group: ");
                    sb.append(r10);
                    Log.i(sb.toString());
                    Iterator it3 = A032.iterator();
                    while (true) {
                        C28351Tz r15 = (C28351Tz) it3;
                        if (!r15.hasNext()) {
                            break;
                        }
                        A00((Jid) r15.next(), userJid, arrayList4, hashMap);
                    }
                } else {
                    throw null;
                }
            } else {
                continue;
            }
        }
        List<Collection> asList = Arrays.asList(arrayList2, arrayList3, arrayList4, hashMap.keySet());
        ArrayList arrayList5 = new ArrayList();
        for (Collection collection : asList) {
            arrayList5.addAll(collection);
        }
        return A06(arrayList5, C48192Lg.A03);
    }
}
