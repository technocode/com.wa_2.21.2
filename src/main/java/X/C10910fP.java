package X;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: X.0fP  reason: invalid class name and case insensitive filesystem */
public class C10910fP extends AnonymousClass0JW {
    public final C014308b A00 = C014308b.A00();
    public final WeakReference A01;
    public final ArrayList A02;
    public final List A03;

    public C10910fP(AnonymousClass0QH r2, List list, List list2) {
        ArrayList arrayList;
        if (list != null) {
            arrayList = new ArrayList(list);
        } else {
            arrayList = null;
        }
        this.A02 = arrayList;
        this.A03 = list2;
        this.A01 = new WeakReference(r2);
    }

    @Override // X.AnonymousClass0JW
    public void A03(Object obj) {
        Collection collection = (Collection) obj;
        AnonymousClass0QH r1 = (AnonymousClass0QH) this.A01.get();
        if (r1 != null) {
            r1.A0G = null;
            ArrayList arrayList = r1.A0a;
            arrayList.clear();
            arrayList.addAll(collection);
            AnonymousClass2GV r0 = r1.A0F;
            if (r0 != null) {
                r0.notifyDataSetChanged();
            }
            r1.A0d();
        }
    }
}
