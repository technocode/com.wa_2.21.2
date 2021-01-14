package X;

import android.widget.Filter;
import com.whatsapp.jid.UserJid;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: X.1Mb  reason: invalid class name */
public class AnonymousClass1Mb extends Filter {
    public final /* synthetic */ AnonymousClass1t2 A00;

    public AnonymousClass1Mb(AnonymousClass1t2 r1) {
        this.A00 = r1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00b7, code lost:
        if (X.AnonymousClass1YB.A04(r1.A0O, r2, r8, true) != false) goto L_0x0096;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.widget.Filter.FilterResults performFiltering(java.lang.CharSequence r11) {
        /*
        // Method dump skipped, instructions count: 214
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1Mb.performFiltering(java.lang.CharSequence):android.widget.Filter$FilterResults");
    }

    public void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
        String str;
        Set set;
        AnonymousClass1t2 r6 = this.A00;
        List list = (List) filterResults.values;
        r6.A07 = list;
        C26701Mc r0 = r6.A04;
        if (r0 != null) {
            Collections.sort(list, r0);
        }
        List list2 = r6.A07;
        C26701Mc r02 = r6.A04;
        int i = -1;
        if (r02 != null && (set = r02.A00) != null) {
            Iterator it = list2.iterator();
            int i2 = -1;
            while (true) {
                if (it.hasNext()) {
                    if (!set.contains(((C007003k) it.next()).A02(UserJid.class))) {
                        i = i2;
                        break;
                    }
                    i2++;
                } else {
                    break;
                }
            }
        }
        r6.A01 = i;
        if (charSequence != null) {
            str = charSequence.toString().toLowerCase();
        } else {
            str = "";
        }
        r6.A05 = str;
        ((AbstractC16300pa) r6).A01.A00();
    }
}
