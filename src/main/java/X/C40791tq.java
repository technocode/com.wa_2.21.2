package X;

import com.whatsapp.StatusesFragment;
import java.lang.ref.WeakReference;
import java.util.List;

/* renamed from: X.1tq  reason: invalid class name and case insensitive filesystem */
public class C40791tq extends AnonymousClass0JW {
    public final C03120Ew A00 = C03120Ew.A00();
    public final WeakReference A01;

    public C40791tq(StatusesFragment statusesFragment) {
        this.A01 = new WeakReference(statusesFragment);
    }

    @Override // X.AnonymousClass0JW
    public void A03(Object obj) {
        List<AbstractC007503q> list = (List) obj;
        StatusesFragment statusesFragment = (StatusesFragment) this.A01.get();
        if (statusesFragment != null) {
            statusesFragment.A03 = null;
            List list2 = statusesFragment.A0v;
            list2.clear();
            List list3 = statusesFragment.A0w;
            list3.clear();
            int size = list.size() - 1;
            for (AbstractC007503q r8 : list) {
                if (C12080hW.A00(r8.A08, 4) < 0) {
                    if (r8 instanceof AnonymousClass0M3) {
                        AnonymousClass0M4 r1 = ((AnonymousClass0M3) r8).A02;
                        if (r1 == null || r1.A0P || r1.A0a) {
                            list3.add(Integer.valueOf(size));
                        } else {
                            list2.add(Integer.valueOf(size));
                        }
                    } else {
                        list3.add(Integer.valueOf(size));
                    }
                }
                size--;
                AnonymousClass1VC r0 = statusesFragment.A05.A00;
                if (r0 != null && r0.A06 == r8.A0p) {
                    long j = r8.A0D;
                    if (j > 0) {
                        statusesFragment.A05.A00.A07 = j;
                    }
                }
            }
            statusesFragment.A06.getFilter().filter(statusesFragment.A0A);
        }
    }
}
