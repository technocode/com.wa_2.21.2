package X;

import android.app.Activity;
import com.google.android.search.verification.client.R;
import com.whatsapp.StatusRecipientsActivity;
import java.lang.ref.WeakReference;
import java.util.Collection;

/* renamed from: X.1to  reason: invalid class name and case insensitive filesystem */
public class C40771to extends AnonymousClass0JW {
    public final AnonymousClass02M A00 = AnonymousClass02M.A00();
    public final AnonymousClass01J A01 = AnonymousClass01J.A00();
    public final AnonymousClass01X A02 = AnonymousClass01X.A00();
    public final AnonymousClass09E A03 = AnonymousClass09E.A00();
    public final WeakReference A04;
    public final Collection A05;
    public final boolean A06;

    public C40771to(StatusRecipientsActivity statusRecipientsActivity, Collection collection, boolean z) {
        this.A04 = new WeakReference(statusRecipientsActivity);
        this.A05 = collection;
        this.A06 = z;
    }

    @Override // X.AnonymousClass0JW
    public void A03(Object obj) {
        Activity activity = (Activity) this.A04.get();
        if (activity != null && !C002001d.A3D(activity)) {
            this.A00.A0C(this.A02.A06(R.string.status_settings_updated), 1);
            activity.finish();
        }
    }
}
