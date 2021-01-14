package X;

import android.content.Intent;
import com.google.android.search.verification.client.R;
import java.io.File;
import java.lang.ref.WeakReference;

/* renamed from: X.0dp  reason: invalid class name and case insensitive filesystem */
public class C09970dp extends AnonymousClass0JW {
    public final AnonymousClass088 A00 = AnonymousClass088.A00();
    public final AnonymousClass02M A01 = AnonymousClass02M.A00();
    public final AnonymousClass01I A02 = AnonymousClass01I.A00();
    public final AnonymousClass01X A03 = AnonymousClass01X.A00();
    public final String A04;
    public final WeakReference A05;

    public C09970dp(ActivityC004702f r2, String str) {
        this.A05 = new WeakReference(r2);
        this.A04 = str;
    }

    @Override // X.AnonymousClass0JW
    public void A03(Object obj) {
        File file = (File) obj;
        ActivityC004702f r3 = (ActivityC004702f) this.A05.get();
        if (r3 != null) {
            r3.AMi();
            if (file == null) {
                this.A01.A06(R.string.share_failed, 0);
                return;
            }
            Intent intent = new Intent("android.intent.action.SEND");
            AnonymousClass01X r8 = this.A03;
            Object[] objArr = new Object[2];
            AnonymousClass01I r5 = this.A02;
            objArr[0] = r5.A02();
            r5.A04();
            AnonymousClass0HR r0 = r5.A01;
            if (r0 != null) {
                objArr[1] = C12420i4.A00(r0);
                intent.putExtra("android.intent.extra.SUBJECT", r8.A0D(R.string.contact_qr_email_subject, objArr));
                intent.putExtra("android.intent.extra.TEXT", this.A04);
                intent.putExtra("android.intent.extra.STREAM", C006803i.A06(r3.getApplicationContext(), file));
                intent.setType("image/png");
                intent.addFlags(524288);
                r3.A0I(Intent.createChooser(intent, null), false);
                return;
            }
            throw null;
        }
    }
}
