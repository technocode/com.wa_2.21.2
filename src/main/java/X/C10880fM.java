package X;

import com.whatsapp.contact.picker.PhoneContactsSelector;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: X.0fM  reason: invalid class name and case insensitive filesystem */
public class C10880fM extends AnonymousClass0JW {
    public WeakReference A00;
    public final AnonymousClass01X A01 = AnonymousClass01X.A00();
    public final ArrayList A02;
    public final List A03;

    public C10880fM(PhoneContactsSelector phoneContactsSelector, List list, List list2) {
        ArrayList arrayList;
        this.A00 = new WeakReference(phoneContactsSelector);
        if (list != null) {
            arrayList = new ArrayList(list);
        } else {
            arrayList = null;
        }
        this.A02 = arrayList;
        this.A03 = new ArrayList(list2);
    }

    @Override // X.AnonymousClass0JW
    public void A03(Object obj) {
        Collection collection = (Collection) obj;
        PhoneContactsSelector phoneContactsSelector = (PhoneContactsSelector) this.A00.get();
        if (phoneContactsSelector != null && !C002001d.A3D(phoneContactsSelector)) {
            phoneContactsSelector.A08 = null;
            ArrayList arrayList = phoneContactsSelector.A0Q;
            arrayList.clear();
            arrayList.addAll(collection);
            phoneContactsSelector.A07.notifyDataSetChanged();
            phoneContactsSelector.A0V();
        }
    }
}
