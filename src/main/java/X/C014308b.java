package X;

import android.text.TextUtils;
import com.google.android.search.verification.client.R;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import java.text.Collator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.08b  reason: invalid class name and case insensitive filesystem */
public class C014308b {
    public static volatile C014308b A06;
    public final AnonymousClass01I A00;
    public final AnonymousClass01A A01;
    public final AnonymousClass01X A02;
    public final C006903j A03;
    public final AnonymousClass01T A04;
    public final ConcurrentHashMap A05 = new ConcurrentHashMap();

    public C014308b(AnonymousClass01I r2, C006903j r3, AnonymousClass01A r4, AnonymousClass01X r5, AnonymousClass01T r6) {
        this.A00 = r2;
        this.A03 = r3;
        this.A01 = r4;
        this.A02 = r5;
        this.A04 = r6;
    }

    public static C014308b A00() {
        if (A06 == null) {
            synchronized (C014308b.class) {
                if (A06 == null) {
                    A06 = new C014308b(AnonymousClass01I.A00(), C006903j.A00(), AnonymousClass01A.A00(), AnonymousClass01X.A00(), AnonymousClass01T.A00());
                }
            }
        }
        return A06;
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x00c1  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.CharSequence A01(X.AnonymousClass01X r3, X.C007003k r4) {
        /*
        // Method dump skipped, instructions count: 248
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C014308b.A01(X.01X, X.03k):java.lang.CharSequence");
    }

    public static String A02(C007003k r2, boolean z) {
        if (AnonymousClass1VY.A0a(r2.A09)) {
            return r2.A04();
        }
        int i = r2.A03;
        if (i == 3) {
            if (z || r2.A08 == null || TextUtils.isEmpty(r2.A0F)) {
                return r2.A04();
            }
            return r2.A0F;
        } else if (i == 2 || i == 1) {
            if (r2.A08 != null || !TextUtils.isEmpty(r2.A0F)) {
                return r2.A0F;
            }
            return null;
        } else if (!r2.A09() || !r2.A0S) {
            return null;
        } else {
            return r2.A0F;
        }
    }

    public final int A03(AnonymousClass0OP r4) {
        C05340Od A012 = this.A04.A01(r4);
        boolean A0A = A012.A0A(this.A00);
        int size = A012.A01.size();
        if (A0A) {
            return size - 1;
        }
        return size;
    }

    public String A04(C007003k r2) {
        if (r2.A08 == null || TextUtils.isEmpty(r2.A0H) || r2.A0A()) {
            return A08(r2, false);
        }
        return r2.A0H;
    }

    public String A05(C007003k r9) {
        if (AnonymousClass1VY.A0b(r9.A09)) {
            return this.A02.A06(R.string.my_status);
        }
        if (r9.A0A()) {
            return A02(r9, false);
        }
        if (!TextUtils.isEmpty(r9.A0F)) {
            return r9.A0F;
        }
        if (!TextUtils.isEmpty(r9.A0D)) {
            return r9.A0D;
        }
        if (r9.A09()) {
            String A08 = this.A03.A08((AnonymousClass02N) r9.A02(AnonymousClass02N.class));
            return TextUtils.isEmpty(A08) ? this.A02.A06(R.string.group_subject_unknown) : A08;
        } else if (AnonymousClass1VY.A0T(r9.A09)) {
            Jid A022 = r9.A02(AnonymousClass0OP.class);
            if (A022 != null) {
                int A032 = A03((AnonymousClass0OP) A022);
                return this.A02.A0A(R.plurals.broadcast_n_recipients, (long) A032, Integer.valueOf(A032));
            }
            throw null;
        } else {
            String A082 = this.A03.A08((AnonymousClass02N) r9.A02(AnonymousClass02N.class));
            return TextUtils.isEmpty(A082) ? this.A02.A0F(C12420i4.A00(r9)) : A082;
        }
    }

    public String A06(C007003k r9) {
        if (AnonymousClass1VY.A0b(r9.A09)) {
            return this.A02.A06(R.string.my_status);
        }
        if (r9.A0A()) {
            return A02(r9, false);
        }
        if (!TextUtils.isEmpty(r9.A0F)) {
            return r9.A0F;
        }
        if (r9.A09()) {
            String A08 = this.A03.A08((AnonymousClass02N) r9.A02(AnonymousClass02N.class));
            return TextUtils.isEmpty(A08) ? this.A02.A06(R.string.group_subject_unknown) : A08;
        } else if (AnonymousClass1VY.A0T(r9.A09)) {
            Jid A022 = r9.A02(AnonymousClass0OP.class);
            if (A022 != null) {
                int A032 = A03((AnonymousClass0OP) A022);
                return this.A02.A0A(R.plurals.broadcast_n_recipients, (long) A032, Integer.valueOf(A032));
            }
            throw null;
        } else {
            String A082 = this.A03.A08((AnonymousClass02N) r9.A02(AnonymousClass02N.class));
            if (!TextUtils.isEmpty(A082)) {
                return A082;
            }
            if (TextUtils.isEmpty(r9.A0O)) {
                return this.A02.A0F(C12420i4.A00(r9));
            }
            StringBuilder A0S = AnonymousClass008.A0S("~");
            A0S.append(r9.A0O);
            return A0S.toString();
        }
    }

    public String A07(C007003k r6) {
        if (!r6.A08() && !TextUtils.isEmpty(r6.A0O)) {
            return this.A02.A0D(R.string.conversation_header_pushname, r6.A0O);
        } else if (!r6.A08() || r6.A06() || TextUtils.isEmpty(r6.A04())) {
            return "";
        } else {
            return this.A02.A0D(R.string.conversation_header_pushname, r6.A04());
        }
    }

    public String A08(C007003k r3, boolean z) {
        String A09 = A09(r3, z);
        return TextUtils.isEmpty(A09) ? this.A02.A0F(C12420i4.A00(r3)) : A09;
    }

    public String A09(C007003k r9, boolean z) {
        String A08;
        if (AnonymousClass1VY.A0b(r9.A09)) {
            return this.A02.A06(R.string.my_status);
        }
        if (r9.A0A()) {
            return A02(r9, z);
        }
        if (!TextUtils.isEmpty(r9.A0F)) {
            return r9.A0F;
        }
        if (r9.A09()) {
            String A082 = this.A03.A08((AnonymousClass02N) r9.A02(AnonymousClass02N.class));
            return TextUtils.isEmpty(A082) ? this.A02.A06(R.string.group_subject_unknown) : A082;
        } else if (AnonymousClass1VY.A0T(r9.A09)) {
            Jid A022 = r9.A02(AnonymousClass0OP.class);
            if (A022 != null) {
                int A032 = A03((AnonymousClass0OP) A022);
                return this.A02.A0A(R.plurals.broadcast_n_recipients, (long) A032, Integer.valueOf(A032));
            }
            throw null;
        } else {
            AnonymousClass02N r1 = (AnonymousClass02N) r9.A02(AnonymousClass02N.class);
            if (r1 == null) {
                A08 = null;
            } else {
                A08 = this.A03.A08(r1);
            }
            if (!TextUtils.isEmpty(A08)) {
                return A08;
            }
            return null;
        }
    }

    public String A0A(AnonymousClass02X r9) {
        ConcurrentHashMap concurrentHashMap = this.A05;
        String str = (String) concurrentHashMap.get(r9);
        if (str != null) {
            return str;
        }
        boolean z = false;
        HashSet hashSet = new HashSet();
        Iterator it = this.A04.A01(r9).A04().iterator();
        while (true) {
            C28351Tz r1 = (C28351Tz) it;
            if (!r1.hasNext()) {
                break;
            }
            AnonymousClass01I r0 = this.A00;
            UserJid userJid = ((AnonymousClass1M5) r1.next()).A03;
            if (r0.A09(userJid)) {
                z = true;
            } else {
                hashSet.add(this.A01.A0A(userJid));
            }
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = hashSet.iterator();
        while (it2.hasNext()) {
            C007003k r02 = (C007003k) it2.next();
            String A042 = A04(r02);
            if (A042 != null) {
                if (r02.A07()) {
                    arrayList2.add(A042);
                } else {
                    arrayList.add(A042);
                }
            }
        }
        Collections.sort(arrayList, A0E());
        Collections.sort(arrayList2);
        arrayList.addAll(arrayList2);
        if (z && !AnonymousClass1VY.A0U(r9)) {
            arrayList.add(this.A02.A06(R.string.you));
        }
        String A1g = C002001d.A1g(this.A02, false, arrayList);
        concurrentHashMap.put(r9, A1g);
        return A1g;
    }

    public String A0B(Iterable iterable) {
        ArrayList arrayList = new ArrayList();
        Iterator it = iterable.iterator();
        boolean z = false;
        while (it.hasNext()) {
            AnonymousClass02N r1 = (AnonymousClass02N) it.next();
            if (this.A00.A09(r1)) {
                z = true;
            } else {
                C007003k A0A = this.A01.A0A(r1);
                if (!arrayList.contains(A0A)) {
                    arrayList.add(A0A);
                }
            }
        }
        return A0D(arrayList, z);
    }

    public String A0C(Iterable iterable) {
        ArrayList arrayList = new ArrayList();
        Iterator it = iterable.iterator();
        boolean z = false;
        while (it.hasNext()) {
            AnonymousClass02N r1 = (AnonymousClass02N) it.next();
            if (this.A00.A09(r1)) {
                z = true;
            } else {
                C007003k A0A = this.A01.A0A(r1);
                if (!arrayList.contains(A0A)) {
                    arrayList.add(A0A);
                }
            }
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            C007003k r2 = (C007003k) it2.next();
            String A08 = A08(r2, false);
            if (A08 != null) {
                if (r2.A07()) {
                    arrayList3.add(A08);
                } else {
                    arrayList2.add(A08);
                }
            }
        }
        Collections.sort(arrayList2, A0E());
        Collections.sort(arrayList3);
        arrayList2.addAll(arrayList3);
        if (z) {
            arrayList2.add(this.A02.A06(R.string.you));
        }
        return C002001d.A1g(this.A02, true, arrayList2);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r7v0, resolved type: java.lang.String[] */
    /* JADX WARN: Multi-variable type inference failed */
    public String A0D(Iterable iterable, boolean z) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            C007003k r2 = (C007003k) it.next();
            String A08 = A08(r2, false);
            if (A08 != null) {
                if (r2.A07()) {
                    arrayList2.add(A08);
                } else {
                    arrayList.add(A08);
                }
            }
        }
        Collections.sort(arrayList, A0E());
        Collections.sort(arrayList2);
        arrayList.addAll(arrayList2);
        if (z) {
            arrayList.add(this.A02.A06(R.string.you));
        }
        int size = arrayList.size();
        if (size <= 3) {
            return C002001d.A1g(this.A02, true, arrayList);
        }
        String[] strArr = new String[4];
        int i = 0;
        do {
            strArr[i] = arrayList.get(i);
            i++;
        } while (i < 3);
        AnonymousClass01X r5 = this.A02;
        int i2 = size - 2;
        strArr[3] = r5.A0A(R.plurals.names_others, (long) i2, Integer.valueOf(i2));
        return C002001d.A1g(r5, true, Arrays.asList(strArr));
    }

    public Collator A0E() {
        Collator instance = Collator.getInstance(this.A02.A0I());
        instance.setDecomposition(1);
        return instance;
    }

    public boolean A0F(C007003k r4) {
        if (r4.A08 == null) {
            return false;
        }
        String str = r4.A0F;
        String A042 = r4.A04();
        return !TextUtils.isEmpty(A042) && !TextUtils.isEmpty(str) && C003701u.A03(str).equals(C003701u.A03(A042));
    }

    public boolean A0G(C007003k r7, List list, boolean z) {
        String A002;
        if (list != null && !list.isEmpty()) {
            if (!TextUtils.isEmpty(r7.A0F)) {
                A002 = C002001d.A1j(r7.A0F);
            } else if (AnonymousClass1VY.A0T(r7.A09)) {
                Jid A022 = r7.A02(AnonymousClass0OP.class);
                if (A022 != null) {
                    A002 = A0A((AnonymousClass02X) A022);
                } else {
                    throw null;
                }
            } else {
                A002 = C12420i4.A00(r7);
            }
            AnonymousClass01X r1 = this.A02;
            if (!AnonymousClass1YB.A04(A002, list, r1, z) && ((!r7.A08() || !r7.A06() || !AnonymousClass1YB.A04(r7.A04(), list, r1, z)) && !AnonymousClass1YB.A04(r7.A0I, list, r1, z) && !AnonymousClass1YB.A04(r7.A0E, list, r1, z) && !AnonymousClass1YB.A04(r7.A0M, list, r1, z))) {
                if (AnonymousClass1VY.A0T(r7.A09) || r7.A09()) {
                    return false;
                }
                Jid A023 = r7.A02(AnonymousClass02N.class);
                if (A023 == null) {
                    throw null;
                } else if (TextUtils.isEmpty(A023.user)) {
                    return false;
                } else {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        String str = (String) it.next();
                        String str2 = A023.user;
                        if (z) {
                            if (!str2.contains(str)) {
                                return false;
                            }
                        } else if (!str2.equals(str)) {
                            return false;
                        }
                    }
                    return true;
                }
            }
        }
        return true;
    }
}
