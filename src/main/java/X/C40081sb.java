package X;

import android.content.Intent;
import android.net.Uri;
import com.google.android.search.verification.client.R;
import com.whatsapp.GdprReportActivity;
import java.lang.ref.WeakReference;

/* renamed from: X.1sb  reason: invalid class name and case insensitive filesystem */
public class C40081sb extends AnonymousClass0JW {
    public final AnonymousClass088 A00;
    public final AnonymousClass00S A01;
    public final WeakReference A02;

    public C40081sb(AnonymousClass00S r2, AnonymousClass088 r3, GdprReportActivity gdprReportActivity) {
        this.A01 = r2;
        this.A00 = r3;
        this.A02 = new WeakReference(gdprReportActivity);
    }

    @Override // X.AnonymousClass0JW
    public void A01() {
        ActivityC004702f r2 = (ActivityC004702f) this.A02.get();
        if (r2 != null && !C002001d.A3D(r2)) {
            r2.APv(0, R.string.register_wait_message);
        }
    }

    @Override // X.AnonymousClass0JW
    public void A03(Object obj) {
        String str = (String) obj;
        ActivityC004702f r2 = (ActivityC004702f) this.A02.get();
        if (r2 != null && !C002001d.A3D(r2)) {
            r2.A0K.A00();
            if (str != null) {
                Intent intent = new Intent("android.intent.action.SEND", Uri.parse("mailto:"));
                intent.putExtra("android.intent.extra.STREAM", new Uri.Builder().scheme("content").authority("com.whatsapp.provider.media").appendPath("gdpr_report").appendQueryParameter("id", str).build());
                intent.setType("application/zip");
                intent.addFlags(524288);
                r2.startActivityForResult(Intent.createChooser(intent, null), 0);
            }
        }
    }
}
