package X;

import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Future;

/* renamed from: X.2Yp  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C51412Yp implements AnonymousClass0RN {
    public final /* synthetic */ int A00;
    public final /* synthetic */ AnonymousClass0IL A01;
    public final /* synthetic */ EnumC03840Hy A02;
    public final /* synthetic */ AnonymousClass0RE A03;
    public final /* synthetic */ Collection A04;
    public final /* synthetic */ List A05;

    public /* synthetic */ C51412Yp(AnonymousClass0IL r1, EnumC03840Hy r2, int i, Collection collection, List list, AnonymousClass0RE r6) {
        this.A01 = r1;
        this.A02 = r2;
        this.A00 = i;
        this.A04 = collection;
        this.A05 = list;
        this.A03 = r6;
    }

    @Override // X.AnonymousClass0RN
    public final Object A20(Object obj) {
        long j;
        long j2;
        AnonymousClass0IL r6 = this.A01;
        EnumC03840Hy r0 = this.A02;
        int i = this.A00;
        Collection<C007003k> collection = this.A04;
        List list = this.A05;
        AnonymousClass0RE r4 = this.A03;
        String str = (String) obj;
        AnonymousClass0QK r18 = AnonymousClass0QK.UP_TO_DATE_CHANGED_PHONEBOOK;
        AnonymousClass0QK r17 = AnonymousClass0QK.FAILED;
        C47152Gr A012 = r6.A08.A01("sync/sync_delta/", list, Collections.emptyList());
        if (A012 != null) {
            ArrayList arrayList = new ArrayList();
            HashSet hashSet = new HashSet();
            HashSet hashSet2 = new HashSet();
            List list2 = A012.A00;
            Iterator it = list2.iterator();
            while (true) {
                String str2 = null;
                if (it.hasNext()) {
                    C007003k r15 = (C007003k) it.next();
                    if (!C002001d.A3U(r15, true)) {
                        C47172Gt r14 = new C47172Gt(r15);
                        r14.A07 = true;
                        r14.A0E = true;
                        r14.A0C = false;
                        r14.A06 = true;
                        Map map = r6.A0I;
                        UserJid userJid = r14.A0G;
                        r14.A02 = (String) map.get(userJid);
                        r14.A05 = (String) r6.A0L.get(userJid);
                        AnonymousClass01L r1 = r6.A0E;
                        boolean A032 = r1.A05.A03();
                        r14.A09 = A032;
                        if (A032) {
                            str2 = r1.A04(userJid);
                        }
                        r14.A03 = str2;
                        if (r14.A09) {
                            j2 = r1.A01(userJid);
                        } else {
                            j2 = 0;
                        }
                        r14.A00 = j2;
                        boolean A033 = r6.A0G.A03();
                        r14.A0B = A033;
                        if (A033) {
                            r14.A04 = (String) r6.A0J.get(userJid);
                        }
                        arrayList.add(r14);
                        AnonymousClass0QW r02 = r15.A08;
                        if (r02 != null) {
                            hashSet.add(r02.A01);
                        } else {
                            throw null;
                        }
                    }
                } else {
                    Set A0C = r6.A0B.A0C();
                    for (C007003k r12 : A012.A03) {
                        if (!C002001d.A3U(r12, true)) {
                            AnonymousClass0QW r03 = r12.A08;
                            if (r03 == null) {
                                throw null;
                            } else if (!hashSet.contains(r03.A01)) {
                                C47172Gt r04 = new C47172Gt(r12);
                                r04.A07 = true;
                                r04.A08 = true;
                                arrayList.add(r04);
                                if (!r12.A08()) {
                                    if (!((AbstractCollection) A0C).contains(r12.A02(UserJid.class))) {
                                    }
                                }
                                C47172Gt r142 = new C47172Gt(r12);
                                r142.A0E = true;
                                r142.A0C = false;
                                r142.A06 = true;
                                Map map2 = r6.A0I;
                                UserJid userJid2 = r142.A0G;
                                r142.A02 = (String) map2.get(userJid2);
                                r142.A05 = (String) r6.A0L.get(userJid2);
                                r142.A0A = true;
                                r142.A0D = true;
                                hashSet2.add(userJid2);
                                arrayList.add(r142);
                            }
                        }
                    }
                    if (collection != null) {
                        for (C007003k r13 : collection) {
                            if (!hashSet2.contains(r13.A02(UserJid.class)) && !C002001d.A3V(r13.A09)) {
                                C47172Gt r8 = new C47172Gt(r13);
                                r8.A0E = true;
                                r8.A0C = false;
                                r8.A06 = true;
                                r8.A0A = true;
                                r8.A0D = true;
                                Map map3 = r6.A0I;
                                UserJid userJid3 = r8.A0G;
                                r8.A02 = (String) map3.get(userJid3);
                                r8.A05 = (String) r6.A0L.get(userJid3);
                                AnonymousClass01L r16 = r6.A0E;
                                boolean A034 = r16.A05.A03();
                                r8.A09 = A034;
                                r8.A03 = A034 ? r16.A04(userJid3) : null;
                                if (r8.A09) {
                                    j = r16.A01(userJid3);
                                } else {
                                    j = 0;
                                }
                                r8.A00 = j;
                                boolean A035 = r6.A0G.A03();
                                r8.A0B = A035;
                                if (A035) {
                                    r8.A04 = (String) r6.A0J.get(userJid3);
                                }
                                arrayList.add(r8);
                            }
                        }
                    }
                    StringBuilder A0S = AnonymousClass008.A0S("sync/sync_delta/request/count ");
                    A0S.append(arrayList.size());
                    Log.d(A0S.toString());
                    r4.A09 = Long.valueOf((long) arrayList.size());
                    if (arrayList.isEmpty()) {
                        return !r6.A03(Collections.EMPTY_LIST, A012.A02, A012.A05) ? AnonymousClass0QK.UP_TO_DATE_UNCHANGED : r18;
                    }
                    Future A013 = r6.A02().A01(C002001d.A1p("sync_sid_delta"), new AnonymousClass2LA(r0, arrayList, false, i), 64000);
                    Log.d("contactsynchelper/syncDelta/resultData send iq");
                    if (r6.A04(A013, str)) {
                        AnonymousClass008.A1K(AnonymousClass008.A0S("contactsynchelper/syncDelta/resultData userSize="), r6.A01.A01.length);
                        AnonymousClass0IL.A00(r6.A0M, list2, null);
                        Log.d("contactsynchelper/syncDelta/update phone book");
                        boolean A036 = r6.A03(list2, A012.A02, A012.A05);
                        AnonymousClass008.A1G("contactsynchelper/syncDelta/isPhonebookUpdated=", A036);
                        r6.A05.A02(r6.A01.A00, r6.A0K, r6.A0L, arrayList);
                        return !A036 ? AnonymousClass0QK.UP_TO_DATE_CHANGED_NO_PHONEBOOK : r18;
                    }
                }
            }
        }
        return r17;
    }
}
