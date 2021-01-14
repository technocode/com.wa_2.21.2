package X;

import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.search.verification.client.R;
import java.io.File;
import java.lang.ref.WeakReference;

/* renamed from: X.0eS  reason: invalid class name and case insensitive filesystem */
public class C10330eS extends AnonymousClass0JW {
    public WeakReference A00;
    public final AnonymousClass02M A01 = AnonymousClass02M.A00();
    public final AnonymousClass00Y A02 = AnonymousClass00Y.A00();
    public final C63922xE A03;
    public final File A04;

    public C10330eS(ActivityC004702f r2, File file) {
        this.A00 = new WeakReference(r2);
        this.A04 = file;
        this.A03 = new C63922xE();
    }

    @Override // X.AnonymousClass0JW
    public void A01() {
        ActivityC004702f r2 = (ActivityC004702f) this.A00.get();
        if (r2 != null && !r2.AB1()) {
            r2.APv(0, R.string.searching_image);
        }
    }

    @Override // X.AnonymousClass0JW
    public void A03(Object obj) {
        String str = (String) obj;
        ActivityC004702f r4 = (ActivityC004702f) this.A00.get();
        if (r4 != null && !r4.AB1()) {
            r4.AMi();
            if (TextUtils.isEmpty(str)) {
                this.A01.A04(R.string.search_by_image_failed, 0);
                return;
            }
            C44011zM r2 = new C44011zM();
            r2.A00 = Long.valueOf(this.A03.A00);
            this.A02.A09(r2, 1);
            AnonymousClass00Y.A01(r2, "");
            r4.A0I(new Intent("android.intent.action.VIEW", Uri.parse(str)), false);
        }
    }
}
