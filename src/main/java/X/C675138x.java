package X;

import android.widget.Filter;
import com.whatsapp.util.Log;
import com.whatsapp.voipcalling.CallsFragment;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: X.38x  reason: invalid class name and case insensitive filesystem */
public class C675138x extends Filter {
    public ArrayList A00;
    public boolean A01;
    public final Object A02 = new Object();
    public final /* synthetic */ CallsFragment A03;

    public C675138x(CallsFragment callsFragment) {
        this.A03 = callsFragment;
    }

    public final ArrayList A00(Collection collection) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            C11260fz r2 = (C11260fz) it.next();
            if (C002001d.A3M(this.A03.A03)) {
                ArrayList arrayList3 = r2.A03;
                if (!arrayList3.isEmpty() && ((AnonymousClass0QM) arrayList3.get(0)).A0D) {
                    arrayList2.add(new C72513Td(r2));
                }
            }
            arrayList.add(new C72483Ta(r2));
        }
        if (!arrayList2.isEmpty()) {
            arrayList.addAll(0, arrayList2);
        }
        return arrayList;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0099, code lost:
        if (r10.A01.A0G(r1, r6, true) != false) goto L_0x009b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.widget.Filter.FilterResults performFiltering(java.lang.CharSequence r14) {
        /*
        // Method dump skipped, instructions count: 308
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C675138x.performFiltering(java.lang.CharSequence):android.widget.Filter$FilterResults");
    }

    public void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
        CallsFragment callsFragment;
        String charSequence2;
        Object obj = filterResults.values;
        if (obj == null) {
            Log.e("voip/CallsFragment/publishResults got null values: exception in performFiltering?");
            callsFragment = this.A03;
            callsFragment.A0A = A00(callsFragment.A0B.values());
        } else {
            callsFragment = this.A03;
            callsFragment.A0A = (ArrayList) obj;
        }
        callsFragment.A08 = charSequence;
        if (charSequence == null) {
            charSequence2 = null;
        } else {
            charSequence2 = charSequence.toString();
        }
        callsFragment.A09 = AnonymousClass1YB.A03(charSequence2, callsFragment.A0Q);
        callsFragment.A0s();
        callsFragment.A06.notifyDataSetChanged();
    }
}
