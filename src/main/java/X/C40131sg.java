package X;

import com.google.android.search.verification.client.R;
import com.whatsapp.GdprReportActivity;
import java.lang.ref.WeakReference;

/* renamed from: X.1sg  reason: invalid class name and case insensitive filesystem */
public class C40131sg extends AnonymousClass0JW {
    public final C03500Gm A00;
    public final AnonymousClass02M A01;
    public final AnonymousClass0AR A02;
    public final WeakReference A03;

    public C40131sg(GdprReportActivity gdprReportActivity, AnonymousClass02M r3, C03500Gm r4, AnonymousClass0AR r5) {
        this.A03 = new WeakReference(gdprReportActivity);
        this.A01 = r3;
        this.A00 = r4;
        this.A02 = r5;
    }

    @Override // X.AnonymousClass0JW
    public void A01() {
        ActivityC004702f r2 = (ActivityC004702f) this.A03.get();
        if (r2 != null && !C002001d.A3D(r2)) {
            r2.APv(0, R.string.register_wait_message);
        }
    }

    @Override // X.AnonymousClass0JW
    public void A03(Object obj) {
        GdprReportActivity gdprReportActivity = (GdprReportActivity) this.A03.get();
        if (gdprReportActivity != null && !C002001d.A3D(gdprReportActivity)) {
            gdprReportActivity.A0K.A00();
            gdprReportActivity.A0T();
        }
    }
}
