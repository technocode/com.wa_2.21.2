package X;

import android.animation.AnimatorSet;
import android.text.TextUtils;
import android.widget.Filter;
import com.whatsapp.StatusesFragment;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.1Nu  reason: invalid class name and case insensitive filesystem */
public class C27061Nu extends Filter {
    public final /* synthetic */ StatusesFragment A00;

    public C27061Nu(StatusesFragment statusesFragment) {
        this.A00 = statusesFragment;
    }

    public List A00(List list, ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AnonymousClass1VC r4 = (AnonymousClass1VC) it.next();
            StatusesFragment statusesFragment = this.A00;
            if (statusesFragment.A0V.A0G(statusesFragment.A0S.A0A(r4.A0A), arrayList, true)) {
                arrayList2.add(new C40811ts(statusesFragment, r4));
            }
        }
        return arrayList2;
    }

    public Filter.FilterResults performFiltering(CharSequence charSequence) {
        Filter.FilterResults filterResults = new Filter.FilterResults();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = null;
        if (TextUtils.isEmpty(charSequence)) {
            StatusesFragment statusesFragment = this.A00;
            AnonymousClass1VC r7 = statusesFragment.A05.A00;
            if (r7 == null) {
                r7 = new AnonymousClass1VC(statusesFragment.A0a, AnonymousClass02Z.A00, -1, -1, -1, -1, -1, 0, 0, 0);
            }
            arrayList.add(new C40811ts(statusesFragment, r7));
            if (r7 != null) {
                if (statusesFragment.A0p != null) {
                    arrayList.add(new C40781tp(statusesFragment));
                } else {
                    throw null;
                }
            }
        }
        if (!TextUtils.isEmpty(charSequence)) {
            arrayList2 = AnonymousClass1YB.A03(charSequence.toString(), this.A00.A0e);
        }
        StatusesFragment statusesFragment2 = this.A00;
        List A002 = A00(statusesFragment2.A05.A02, arrayList2);
        List A003 = A00(statusesFragment2.A05.A03, arrayList2);
        List A004 = A00(statusesFragment2.A05.A01, arrayList2);
        if (!((AbstractCollection) A002).isEmpty()) {
            arrayList.add(new C40801tr(statusesFragment2, 0));
            arrayList.addAll(A002);
        }
        if (!((AbstractCollection) A003).isEmpty()) {
            arrayList.add(new C40801tr(statusesFragment2, 1));
            arrayList.addAll(A003);
        }
        filterResults.values = new C27041Ns(arrayList, A004);
        filterResults.count = arrayList.size();
        return filterResults;
    }

    public void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
        String charSequence2;
        Object obj = filterResults.values;
        if (obj != null) {
            C27041Ns r1 = (C27041Ns) obj;
            StatusesFragment statusesFragment = this.A00;
            statusesFragment.A0C = r1.A00;
            List list = r1.A01;
            statusesFragment.A0D = list;
            if (!list.isEmpty()) {
                statusesFragment.A0C.add(new C40801tr(statusesFragment, 2));
                if (!statusesFragment.A0K || statusesFragment.A0I || !statusesFragment.A0H) {
                    statusesFragment.A0C.addAll(statusesFragment.A0D);
                }
            }
        }
        StatusesFragment statusesFragment2 = this.A00;
        statusesFragment2.A0A = charSequence;
        if (charSequence == null) {
            charSequence2 = null;
        } else {
            charSequence2 = charSequence.toString();
        }
        statusesFragment2.A0B = AnonymousClass1YB.A03(charSequence2, statusesFragment2.A0e);
        statusesFragment2.A0r();
        AnimatorSet animatorSet = statusesFragment2.A00;
        if (animatorSet != null) {
            animatorSet.cancel();
            statusesFragment2.A00 = null;
        }
        statusesFragment2.A06.notifyDataSetChanged();
    }
}
