package X;

import com.whatsapp.GdprReportActivity;
import java.lang.ref.WeakReference;

/* renamed from: X.1se  reason: invalid class name and case insensitive filesystem */
public class C40111se extends AnonymousClass0JW {
    public final C03500Gm A00;
    public final AnonymousClass0AR A01;
    public final WeakReference A02;

    public C40111se(GdprReportActivity gdprReportActivity, C03500Gm r3, AnonymousClass0AR r4) {
        this.A02 = new WeakReference(gdprReportActivity);
        this.A00 = r3;
        this.A01 = r4;
    }

    @Override // X.AnonymousClass0JW
    public void A03(Object obj) {
        GdprReportActivity gdprReportActivity = (GdprReportActivity) this.A02.get();
        if (gdprReportActivity != null && !C002001d.A3D(gdprReportActivity)) {
            gdprReportActivity.A0T();
        }
    }
}
