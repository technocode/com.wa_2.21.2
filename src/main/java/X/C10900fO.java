package X;

import android.view.MenuItem;
import android.view.View;
import com.whatsapp.jid.UserJid;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: X.0fO  reason: invalid class name and case insensitive filesystem */
public class C10900fO extends AnonymousClass0JW {
    public final C000300f A00 = C000300f.A00();
    public final AnonymousClass01A A01 = AnonymousClass01A.A00();
    public final C014308b A02 = C014308b.A00();
    public final AnonymousClass01X A03 = AnonymousClass01X.A00();
    public final WeakReference A04;
    public final Set A05 = new HashSet();

    public C10900fO(AnonymousClass0QH r5, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            this.A05.add(((C007003k) it.next()).A02(UserJid.class));
        }
        this.A04 = new WeakReference(r5);
    }

    @Override // X.AnonymousClass0JW
    public void A03(Object obj) {
        List list = (List) obj;
        AnonymousClass0QH r4 = (AnonymousClass0QH) this.A04.get();
        if (r4 != null) {
            r4.A0H = null;
            r4.A0K = list;
            r4.A0a();
            int i = 0;
            if (r4.A0M) {
                HashSet hashSet = new HashSet();
                List list2 = r4.A0L;
                if (list2 != null && !list2.isEmpty()) {
                    for (C007003k r6 : r4.A0K) {
                        if (r4.A0L.contains(r6.A02(UserJid.class))) {
                            r6.A0V = true;
                            if (!hashSet.contains(r6.A02(UserJid.class))) {
                                List list3 = r4.A0b;
                                list3.add(r6);
                                hashSet.add(r6.A02(UserJid.class));
                                if (list3.size() >= r4.A0V()) {
                                    break;
                                }
                            } else {
                                continue;
                            }
                        }
                    }
                    r4.A0W.A01.A00();
                }
                r4.A0M = false;
            }
            List list4 = r4.A0b;
            int size = list4.size();
            r4.A0g(size);
            r4.A0f(size);
            View view = r4.A05;
            if (list4.isEmpty()) {
                i = 4;
            }
            view.setVisibility(i);
            if (!list4.isEmpty()) {
                r4.A0c();
            }
            MenuItem menuItem = r4.A04;
            if (menuItem != null) {
                menuItem.setVisible(!r4.A0K.isEmpty());
            }
        }
    }
}
