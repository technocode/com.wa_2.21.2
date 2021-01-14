package X;

import android.text.TextUtils;
import android.widget.Filter;
import com.google.android.search.verification.client.R;
import com.whatsapp.conversationslist.ConversationsFragment;
import com.whatsapp.jid.Jid;
import com.whatsapp.util.Log;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.2Jf  reason: invalid class name and case insensitive filesystem */
public class C47702Jf extends Filter {
    public boolean A00;
    public boolean A01;
    public final /* synthetic */ C47712Jg A02;

    public C47702Jf(C47712Jg r1) {
        this.A02 = r1;
    }

    public Filter.FilterResults performFiltering(CharSequence charSequence) {
        ArrayList arrayList;
        Filter.FilterResults filterResults = new Filter.FilterResults();
        this.A00 = true;
        this.A01 = true;
        C04600Kz r4 = new C04600Kz("conversations/filter/performFiltering");
        if (TextUtils.isEmpty(charSequence)) {
            arrayList = this.A02.A03.A0r();
        } else {
            arrayList = new ArrayList();
            C47712Jg r11 = this.A02;
            ConversationsFragment conversationsFragment = r11.A03;
            AnonymousClass01X r7 = conversationsFragment.A19;
            ArrayList A03 = AnonymousClass1YB.A03((String) charSequence, r7);
            Log.d("conversations/filter/chats");
            HashSet hashSet = new HashSet();
            ArrayList arrayList2 = new ArrayList();
            if (!A03.isEmpty()) {
                ArrayList arrayList3 = new ArrayList(arrayList2);
                arrayList2.add(new C39491rc(conversationsFragment.A1C, conversationsFragment.A0v, A03));
                C08680bX r0 = conversationsFragment.A1I;
                r0.A0A = arrayList3;
                r0.A09 = charSequence;
                r0.A03 = null;
                r0.A04(A03);
            }
            C08680bX r8 = conversationsFragment.A1I;
            AnonymousClass0XB r1 = r11.A00;
            List list = r1.A02;
            if (list == null) {
                list = new ArrayList();
                r1.A02 = list;
            }
            r8.A0D = list;
            r8.A00 = 0;
            r8.A01 = 100;
            r4.A00();
            List<AbstractC007503q> list2 = (List) conversationsFragment.A1H.A08(r8, null).second;
            r4.A00();
            Iterator it = ((AbstractCollection) conversationsFragment.A1F.A0A()).iterator();
            while (it.hasNext()) {
                AnonymousClass02N r12 = (AnonymousClass02N) it.next();
                if (AnonymousClass0AQ.A01(arrayList2, r12)) {
                    hashSet.add(r12);
                    if (this.A01) {
                        arrayList.add(new C11610gd(r7.A06(R.string.search_section_chats)));
                        this.A01 = false;
                    }
                    arrayList.add(new C10760f9(r12));
                }
            }
            r4.A00();
            for (C007003k r2 : conversationsFragment.A1C.A03()) {
                if (r2.A08 != null && !hashSet.contains(r2.A02(AnonymousClass02N.class))) {
                    Jid A022 = r2.A02(AnonymousClass02N.class);
                    if (A022 == null) {
                        throw null;
                    } else if (AnonymousClass0AQ.A01(arrayList2, (AnonymousClass02N) A022)) {
                        if (this.A00) {
                            arrayList.add(new C11610gd(r7.A06(R.string.search_section_contacts)));
                            this.A00 = false;
                        }
                        arrayList.add(new C52242ao(r2));
                    }
                }
            }
            r4.A00();
            ArrayList arrayList4 = new ArrayList();
            ArrayList arrayList5 = new ArrayList();
            if (list2 != null) {
                for (AbstractC007503q r13 : list2) {
                    if (r13.A0n.A00 == null) {
                        throw null;
                    } else if (r13.A0j) {
                        arrayList4.add(r13);
                    } else {
                        arrayList5.add(r13);
                    }
                }
                if (arrayList4.size() > 0) {
                    arrayList.add(new C11610gd(r7.A06(R.string.search_section_starred_messages)));
                }
                Iterator it2 = arrayList4.iterator();
                while (it2.hasNext()) {
                    arrayList.add(new C52392b3((AbstractC007503q) it2.next()));
                }
                if (arrayList5.size() > 0) {
                    arrayList.add(new C11610gd(r7.A06(R.string.search_section_messages)));
                }
                Iterator it3 = arrayList5.iterator();
                while (it3.hasNext()) {
                    arrayList.add(new C52392b3((AbstractC007503q) it3.next()));
                }
            } else {
                throw null;
            }
        }
        filterResults.values = arrayList;
        filterResults.count = arrayList.size();
        r4.A01();
        return filterResults;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x005d, code lost:
        if (r4.A00 <= 0) goto L_0x005f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0072, code lost:
        if (r4.A18.A00.getInt("delete_chat_count", 0) >= 3) goto L_0x0074;
     */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0096  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x009e  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00aa  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00b7  */
    /* JADX WARNING: Removed duplicated region for block: B:54:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void publishResults(java.lang.CharSequence r13, android.widget.Filter.FilterResults r14) {
        /*
        // Method dump skipped, instructions count: 345
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C47702Jf.publishResults(java.lang.CharSequence, android.widget.Filter$FilterResults):void");
    }
}
