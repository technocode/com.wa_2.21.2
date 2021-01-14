package X;

import android.view.MenuItem;
import com.whatsapp.contact.picker.PhoneContactsSelector;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;

/* renamed from: X.0fL  reason: invalid class name and case insensitive filesystem */
public class C10870fL extends AnonymousClass0JW {
    public WeakReference A00;
    public final AnonymousClass03P A01 = AnonymousClass03P.A00();
    public final AnonymousClass00G A02 = AnonymousClass00G.A01;
    public final AnonymousClass03S A03 = AnonymousClass03S.A00();
    public final AnonymousClass01X A04 = AnonymousClass01X.A00();

    public C10870fL(PhoneContactsSelector phoneContactsSelector) {
        this.A00 = new WeakReference(phoneContactsSelector);
    }

    @Override // X.AnonymousClass0JW
    public void A03(Object obj) {
        Collection collection = (Collection) obj;
        PhoneContactsSelector phoneContactsSelector = (PhoneContactsSelector) this.A00.get();
        if (phoneContactsSelector != null && !C002001d.A3D(phoneContactsSelector)) {
            phoneContactsSelector.A09 = null;
            phoneContactsSelector.A0S.clear();
            ArrayList arrayList = phoneContactsSelector.A0R;
            arrayList.addAll(collection);
            MenuItem menuItem = phoneContactsSelector.A00;
            if (menuItem != null) {
                menuItem.setVisible(!arrayList.isEmpty());
            }
            PhoneContactsSelector.A05(phoneContactsSelector);
        }
    }
}
