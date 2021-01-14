package X;

import com.google.android.search.verification.client.R;
import java.lang.ref.WeakReference;
import java.util.List;

/* renamed from: X.2fu  reason: invalid class name and case insensitive filesystem */
public class C55042fu extends AnonymousClass0JW {
    public final AnonymousClass02M A00 = AnonymousClass02M.A00();
    public final AnonymousClass01A A01 = AnonymousClass01A.A00();
    public final C014308b A02 = C014308b.A00();
    public final AnonymousClass01X A03 = AnonymousClass01X.A00();
    public final AnonymousClass0EO A04 = AnonymousClass0EO.A00();
    public final AnonymousClass02U A05;
    public final AnonymousClass0AR A06 = AnonymousClass0AR.A00();
    public final WeakReference A07;
    public final List A08;
    public final List A09;

    public C55042fu(ActivityC004702f r2, AnonymousClass02U r3, List list, List list2) {
        this.A07 = new WeakReference(r2);
        this.A05 = r3;
        this.A09 = list;
        this.A08 = list2;
    }

    @Override // X.AnonymousClass0JW
    public void A01() {
        ActivityC004702f r2 = (ActivityC004702f) this.A07.get();
        if (r2 != null && !r2.isFinishing()) {
            r2.APv(R.string.updating_group_admins, R.string.register_wait_message);
        }
    }

    @Override // X.AnonymousClass0JW
    public void A03(Object obj) {
        ActivityC004702f r1 = (ActivityC004702f) this.A07.get();
        if (r1 != null && !r1.isFinishing()) {
            r1.AMi();
        }
    }
}
