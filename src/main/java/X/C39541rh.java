package X;

import android.view.MenuItem;
import com.whatsapp.StatusRecipientsActivity;
import com.whatsapp.group.GroupAddBlacklistPickerActivity;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/* renamed from: X.1rh  reason: invalid class name and case insensitive filesystem */
public class C39541rh extends AnonymousClass0JW {
    public final Set A00;
    public final /* synthetic */ AnonymousClass2DH A01;

    public C39541rh(AnonymousClass2DH r2, Set set) {
        this.A01 = r2;
        HashSet hashSet = new HashSet();
        this.A00 = hashSet;
        hashSet.addAll(set);
    }

    @Override // X.AnonymousClass0JW
    public void A03(Object obj) {
        boolean z;
        C26441Kw r8 = (C26441Kw) obj;
        AnonymousClass2DH r4 = this.A01;
        r4.A04 = null;
        Set set = r4.A0Q;
        set.clear();
        set.addAll(r8.A02);
        Set set2 = r4.A0O;
        set2.clear();
        set2.addAll(set);
        Set set3 = this.A00;
        if (!set3.isEmpty()) {
            for (Object obj2 : set3) {
                if (!(r4 instanceof GroupAddBlacklistPickerActivity)) {
                    z = !(r4 instanceof StatusRecipientsActivity) ? true : !r4.A0B;
                } else {
                    z = false;
                }
                if (!z || r8.A01.contains(obj2)) {
                    set.add(obj2);
                }
            }
            HashSet hashSet = new HashSet();
            for (Object obj3 : r8.A02) {
                if (!set3.contains(obj3)) {
                    hashSet.add(obj3);
                }
            }
            set.removeAll(hashSet);
        }
        r4.A0Y();
        ArrayList arrayList = r8.A00;
        r4.A09 = arrayList;
        r4.A0A = r8.A01;
        MenuItem menuItem = r4.A00;
        if (menuItem != null) {
            menuItem.setVisible(!arrayList.isEmpty());
        }
        AnonymousClass2DH.A04(r4);
    }
}
