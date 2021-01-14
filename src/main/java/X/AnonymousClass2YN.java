package X;

import com.google.android.search.verification.client.R;
import com.whatsapp.contact.picker.ContactPickerFragment;
import com.whatsapp.jid.Jid;
import java.lang.ref.WeakReference;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;

/* renamed from: X.2YN  reason: invalid class name */
public class AnonymousClass2YN extends AnonymousClass0JW {
    public final AnonymousClass01A A00;
    public final C014308b A01;
    public final AnonymousClass01X A02;
    public final C006903j A03;
    public final AnonymousClass01Q A04;
    public final AnonymousClass02N A05;
    public final AnonymousClass0BB A06;
    public final String A07;
    public final WeakReference A08;
    public final ArrayList A09;
    public final HashSet A0A;
    public final List A0B;
    public final List A0C;
    public final List A0D;
    public final List A0E;
    public final Set A0F;
    public final boolean A0G;
    public final boolean A0H;
    public final boolean A0I;
    public final boolean A0J;
    public final boolean A0K;
    public final boolean A0L;
    public final boolean A0M;
    public final boolean A0N;
    public final boolean A0O;
    public final boolean A0P;
    public final boolean A0Q;

    public AnonymousClass2YN(ContactPickerFragment contactPickerFragment, String str, List list, List list2, List list3, List list4, List list5, HashSet hashSet, AnonymousClass02N r10, Set set, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, C006903j r23, AnonymousClass01A r24, C014308b r25, AnonymousClass01X r26, AnonymousClass0BB r27, AnonymousClass01Q r28) {
        ArrayList arrayList;
        this.A08 = new WeakReference(contactPickerFragment);
        this.A07 = str;
        if (list != null) {
            arrayList = new ArrayList(list);
        } else {
            arrayList = null;
        }
        this.A09 = arrayList;
        this.A0B = list2;
        this.A0E = list3;
        this.A0C = list4;
        this.A0D = list5;
        this.A0A = hashSet;
        this.A05 = r10;
        this.A0F = set;
        this.A0J = z;
        this.A0Q = z2;
        this.A0I = z3;
        this.A0L = z4;
        this.A0P = z5;
        this.A0H = z6;
        this.A0K = z7;
        this.A0N = z8;
        this.A0O = z9;
        this.A0M = z10;
        this.A0G = z11;
        this.A03 = r23;
        this.A00 = r24;
        this.A01 = r25;
        this.A02 = r26;
        this.A06 = r27;
        this.A04 = r28;
    }

    @Override // X.AnonymousClass0JW
    public void A00(Object[] objArr) {
        AnonymousClass2GS[] r3 = (AnonymousClass2GS[]) objArr;
        ContactPickerFragment contactPickerFragment = (ContactPickerFragment) this.A08.get();
        if (contactPickerFragment != null && contactPickerFragment.A0U()) {
            contactPickerFragment.A13(r3[0]);
        }
    }

    @Override // X.AnonymousClass0JW
    public Object A02(Object[] objArr) {
        String A062;
        ArrayList arrayList;
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        ArrayList arrayList6 = new ArrayList();
        ArrayList arrayList7 = new ArrayList();
        ArrayList arrayList8 = new ArrayList();
        HashMap hashMap = new HashMap();
        HashSet hashSet = new HashSet();
        boolean z = this.A0L;
        if (z || this.A0Q || this.A0O || this.A0I || this.A0J) {
            for (C007003k r1 : this.A0E) {
                Jid A022 = r1.A02(AnonymousClass02N.class);
                if (A022 != null && !hashSet.contains(A022) && this.A01.A0G(r1, this.A09, true) && AnonymousClass1VY.A0S(r1.A09)) {
                    hashSet.add(A022);
                    arrayList3.add(r1);
                }
            }
            List list = this.A0B;
            HashMap hashMap2 = new HashMap(list.size(), 1.0f);
            ListIterator listIterator = list.listIterator(list.size());
            while (listIterator.hasPrevious()) {
                C007003k r2 = (C007003k) listIterator.previous();
                hashMap2.put(r2.A02(AnonymousClass02N.class), r2);
            }
            Iterator it = ((AbstractCollection) this.A06.A0F()).iterator();
            while (it.hasNext()) {
                AnonymousClass02N r6 = (AnonymousClass02N) it.next();
                if (!hashSet.contains(r6)) {
                    boolean z2 = this.A0Q;
                    if ((!z && !z2) || !AnonymousClass1VY.A0U(r6)) {
                        C007003k r22 = (C007003k) hashMap2.get(r6);
                        if (r22 == null) {
                            r22 = this.A00.A0A(r6);
                        }
                        if (this.A01.A0G(r22, this.A09, true) && AnonymousClass1VY.A0S(r6)) {
                            hashSet.add(r6);
                            arrayList4.add(r22);
                        }
                    }
                }
            }
            Iterator it2 = ((AbstractCollection) this.A04.A0A()).iterator();
            while (it2.hasNext()) {
                AnonymousClass02N r62 = (AnonymousClass02N) it2.next();
                if ((!z && !this.A0G && !this.A0Q) || !AnonymousClass1VY.A0U(r62)) {
                    if (!hashSet.contains(r62)) {
                        C007003k r23 = (C007003k) hashMap2.get(r62);
                        if (r23 == null) {
                            r23 = this.A00.A0A(r62);
                        }
                        if (this.A01.A0G(r23, this.A09, true) && r23.A0X && AnonymousClass1VY.A0S(r62)) {
                            hashSet.add(r62);
                            arrayList5.add(r23);
                        }
                    }
                    if (super.A00.isCancelled()) {
                        return new AnonymousClass2GS(new ArrayList(arrayList2), this.A09);
                    }
                }
            }
        }
        AsyncTaskC09770dV r0 = super.A00;
        if (r0.isCancelled()) {
            return new AnonymousClass2GS(new ArrayList(arrayList2), this.A09);
        }
        boolean z3 = this.A0N;
        if (z3 && (arrayList = this.A09) != null && !arrayList.isEmpty()) {
            for (C007003k r63 : this.A0C) {
                Jid A023 = r63.A02(AnonymousClass02N.class);
                if (A023 != null && !hashSet.contains(A023) && this.A01.A0G(r63, arrayList, true) && !AnonymousClass1VY.A0d(A023)) {
                    hashSet.add(A023);
                    arrayList7.add(r63);
                }
                if (r0.isCancelled()) {
                    return new AnonymousClass2GS(new ArrayList(arrayList2), arrayList);
                }
            }
        }
        if (r0.isCancelled()) {
            return new AnonymousClass2GS(new ArrayList(arrayList2), this.A09);
        }
        boolean z4 = this.A0P;
        if (z4) {
            for (C007003k r14 : this.A0B) {
                if (!hashSet.contains(r14.A09) && r14.A09() && this.A01.A0G(r14, this.A09, true)) {
                    arrayList6.add(r14);
                }
            }
        } else {
            for (C007003k r142 : this.A0B) {
                if (!hashSet.contains(r142.A09) && r142.A08 != null && !r142.A09() && this.A01.A0G(r142, this.A09, true)) {
                    if (this.A0K || !this.A0F.contains(r142.A09)) {
                        Jid jid = r142.A09;
                        if (!AnonymousClass1VY.A0a(jid) && !AnonymousClass1VY.A0b(jid)) {
                            arrayList6.add(r142);
                        }
                    }
                }
            }
        }
        if (r0.isCancelled()) {
            return new AnonymousClass2GS(new ArrayList(arrayList2), this.A09);
        }
        C006903j r15 = this.A03;
        C014308b r143 = this.A01;
        AnonymousClass01X r64 = this.A02;
        Collections.sort(arrayList5, new AnonymousClass1NK(r15, r143, r64));
        arrayList5.addAll(0, arrayList4);
        if (r0.isCancelled()) {
            return new AnonymousClass2GS(new ArrayList(arrayList2), this.A09);
        }
        Collections.sort(arrayList6, new C26381Kq(r143, r64));
        if (!arrayList3.isEmpty()) {
            arrayList2.add(new AnonymousClass2YY(r64.A06(R.string.contact_picker_section_frequent_chats)));
        }
        Iterator it3 = arrayList3.iterator();
        while (it3.hasNext()) {
            arrayList2.add(new AnonymousClass2YC((C007003k) it3.next()));
        }
        if (!arrayList5.isEmpty()) {
            arrayList2.add(new AnonymousClass2YY(r64.A06(R.string.contact_picker_section_recent_chats)));
        }
        Iterator it4 = arrayList5.iterator();
        while (it4.hasNext()) {
            arrayList2.add(new AnonymousClass2YC((C007003k) it4.next()));
        }
        if (!arrayList6.isEmpty() && (!arrayList3.isEmpty() || !arrayList5.isEmpty())) {
            arrayList2.add(new AnonymousClass2YY(r64.A06(R.string.contact_picker_section_other_contacts)));
        }
        Iterator it5 = arrayList6.iterator();
        while (it5.hasNext()) {
            arrayList2.add(new AnonymousClass2YC((C007003k) it5.next()));
        }
        if (!arrayList7.isEmpty()) {
            arrayList2.add(new AnonymousClass2YY(r64.A06(R.string.contact_picker_section_groups)));
        }
        Iterator it6 = arrayList7.iterator();
        while (it6.hasNext()) {
            arrayList2.add(new AnonymousClass2YC((C007003k) it6.next()));
        }
        if ((z || this.A0Q || this.A0O) && !AnonymousClass1VY.A0b(this.A05) && this.A09 == null && !this.A0M) {
            HashSet hashSet2 = this.A0A;
            boolean z5 = !hashSet2.isEmpty();
            Iterator it7 = hashSet2.iterator();
            while (true) {
                if (it7.hasNext()) {
                    int intValue = ((Number) it7.next()).intValue();
                    if (!(intValue == 1 || intValue == 3 || intValue == 13 || intValue == 0 || intValue == 25 || intValue == 27 || intValue == 28 || intValue == 29 || intValue == 32)) {
                        break;
                    }
                } else if (z5) {
                    arrayList2.add(0, new AnonymousClass2YC(this.A00.A0A(C12060hU.A00)));
                    if (this.A0G) {
                        arrayList2.add(0, new AnonymousClass2YY(r64.A06(R.string.contact_picker_section_status)));
                    }
                }
            }
        }
        ArrayList arrayList9 = new ArrayList(arrayList2);
        ArrayList arrayList10 = this.A09;
        r0.A00(new AnonymousClass2GS(arrayList9, arrayList10));
        if ((z3 || this.A0H) && arrayList10 != null && !arrayList10.isEmpty()) {
            for (C007003k r24 : this.A0D) {
                if (!r24.A0X && !hashSet.contains(r24.A02(AnonymousClass02N.class)) && r143.A0G(r24, arrayList10, true)) {
                    hashSet.add(r24.A02(AnonymousClass02N.class));
                    arrayList8.add(r24);
                    String A082 = r143.A08(r24, false);
                    if (hashMap.containsKey(A082)) {
                        hashMap.put(A082, Integer.valueOf(((Number) hashMap.get(A082)).intValue() + 1));
                    } else {
                        hashMap.put(A082, 1);
                    }
                }
            }
        }
        if (r0.isCancelled()) {
            return new AnonymousClass2GS(new ArrayList(arrayList2), arrayList10);
        }
        if (!arrayList8.isEmpty()) {
            arrayList2.add(new AnonymousClass2YY(r64.A06(R.string.contact_picker_section_invite_to_whatsapp)));
        }
        Iterator it8 = arrayList8.iterator();
        while (it8.hasNext()) {
            C007003k r3 = (C007003k) it8.next();
            arrayList2.add(new C58842md(r3, ((Number) hashMap.get(r143.A08(r3, false))).intValue()));
        }
        if (arrayList2.isEmpty()) {
            if (arrayList10 != null) {
                A062 = r64.A0D(R.string.search_no_results, this.A07);
            } else if (z4) {
                A062 = r64.A06(R.string.contact_picker_no_wa_groups);
            } else {
                A062 = r64.A06(R.string.contact_picker_no_wa_contacts);
            }
            arrayList2.add(new AnonymousClass2YU(A062));
        }
        return new AnonymousClass2GS(new ArrayList(arrayList2), arrayList10);
    }

    @Override // X.AnonymousClass0JW
    public void A03(Object obj) {
        AnonymousClass2GS r3 = (AnonymousClass2GS) obj;
        ContactPickerFragment contactPickerFragment = (ContactPickerFragment) this.A08.get();
        if (contactPickerFragment != null && contactPickerFragment.A0U()) {
            contactPickerFragment.A0L = null;
            contactPickerFragment.A13(r3);
        }
    }
}
