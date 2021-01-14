package X;

import android.net.Uri;
import com.google.android.search.verification.client.R;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.IOException;
import java.lang.ref.WeakReference;

/* renamed from: X.3SF  reason: invalid class name */
public class AnonymousClass3SF extends AnonymousClass0JW {
    public final Uri A00;
    public final AnonymousClass02M A01;
    public final AnonymousClass01X A02;
    public final AnonymousClass35j A03;
    public final C02220Bc A04;
    public final WeakReference A05;

    public AnonymousClass3SF(AnonymousClass02M r2, C02220Bc r3, AnonymousClass01X r4, AbstractC004502c r5, Uri uri, AnonymousClass35j r7) {
        this.A01 = r2;
        this.A04 = r3;
        this.A02 = r4;
        this.A05 = new WeakReference(r5);
        this.A00 = uri;
        this.A03 = r7;
    }

    @Override // X.AnonymousClass0JW
    public void A01() {
        AbstractC004502c r2 = (AbstractC004502c) this.A05.get();
        if (r2 != null) {
            r2.APv(0, R.string.media_loading);
        }
    }

    @Override // X.AnonymousClass0JW
    public Object A02(Object[] objArr) {
        try {
            return this.A04.A09(this.A00);
        } catch (IOException e) {
            return e;
        }
    }

    @Override // X.AnonymousClass0JW
    public void A03(Object obj) {
        AbstractC004502c r3 = (AbstractC004502c) this.A05.get();
        if (r3 != null) {
            r3.AMi();
        }
        if (obj instanceof File) {
            this.A03.AG2((File) obj);
        } else if (obj instanceof IOException) {
            Throwable th = (Throwable) obj;
            StringBuilder sb = new StringBuilder("mediafileutils/getfilefrommediastoreasync/ioerror ");
            sb.append(th);
            Log.e(sb.toString());
            if (th.getMessage() == null || !th.getMessage().contains("No space")) {
                this.A01.A06(R.string.share_failed, 0);
            } else {
                this.A01.A0B(r3, this.A02.A06(R.string.error_no_disc_space));
            }
        } else {
            this.A01.A06(R.string.share_failed, 0);
        }
    }
}
