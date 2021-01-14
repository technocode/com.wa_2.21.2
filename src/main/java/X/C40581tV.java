package X;

import android.app.Application;
import android.net.Uri;
import android.util.Pair;
import com.google.android.search.verification.client.R;
import com.whatsapp.util.Log;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.List;

/* renamed from: X.1tV  reason: invalid class name and case insensitive filesystem */
public class C40581tV extends AnonymousClass0JW {
    public final Uri A00;
    public final AnonymousClass088 A01;
    public final AnonymousClass02M A02;
    public final C000300f A03;
    public final C04360Kb A04;
    public final AnonymousClass03P A05;
    public final AnonymousClass00G A06;
    public final AnonymousClass01X A07;
    public final C002701k A08;
    public final AnonymousClass00Y A09;
    public final AnonymousClass0CP A0A;
    public final C02240Be A0B;
    public final AbstractC007503q A0C;
    public final C02220Bc A0D;
    public final String A0E;
    public final WeakReference A0F;
    public final List A0G;
    public final boolean A0H;

    public C40581tV(AnonymousClass00G r3, C002701k r4, AnonymousClass02M r5, AnonymousClass088 r6, AnonymousClass00Y r7, C000300f r8, C04360Kb r9, AnonymousClass0CP r10, C02220Bc r11, AnonymousClass03P r12, AnonymousClass01X r13, C02240Be r14, List list, Uri uri, String str, AbstractC007503q r18, AbstractC004502c r19, boolean z) {
        this.A06 = r3;
        this.A08 = r4;
        this.A02 = r5;
        this.A01 = r6;
        this.A09 = r7;
        this.A03 = r8;
        this.A04 = r9;
        this.A0A = r10;
        this.A0D = r11;
        this.A05 = r12;
        this.A07 = r13;
        this.A0B = r14;
        this.A0G = list;
        this.A00 = uri;
        this.A0E = str;
        this.A0C = r18;
        this.A0F = new WeakReference(r19);
        this.A0H = z;
    }

    @Override // X.AnonymousClass0JW
    public void A01() {
        AbstractC004502c r2 = (AbstractC004502c) this.A0F.get();
        if (r2 != null) {
            r2.APv(0, R.string.media_loading);
        }
    }

    @Override // X.AnonymousClass0JW
    public void A03(Object obj) {
        AbstractC004502c r3 = (AbstractC004502c) this.A0F.get();
        if (r3 != null) {
            r3.AMi();
        }
        if (obj instanceof AnonymousClass35V) {
            this.A02.A0B(r3, this.A07.A06(R.string.error_file_is_not_a_document));
        } else if (obj instanceof AnonymousClass35W) {
            Application application = this.A06.A00;
            int A062 = this.A03.A06(AbstractC000400g.A32);
            AnonymousClass02M r10 = this.A02;
            AnonymousClass01X r11 = this.A07;
            r10.A0B(r3, r11.A0D(R.string.file_too_large_with_placeholder, r11.A09(280, (long) A062, String.format(application.getResources().getConfiguration().locale, "%d", Integer.valueOf(A062)))));
        } else if (obj instanceof IOException) {
            Throwable th = (Throwable) obj;
            StringBuilder sb = new StringBuilder("sendmedia/senddocumentasync/ioerror ");
            sb.append(th);
            Log.e(sb.toString());
            if (th.getMessage() == null || !th.getMessage().contains("No space")) {
                this.A02.A06(R.string.share_failed, 0);
            } else {
                this.A02.A0B(r3, this.A07.A06(R.string.error_no_disc_space));
            }
        } else if (obj instanceof Pair) {
            Pair pair = (Pair) obj;
            this.A04.A07((C40531tQ) pair.first, (byte[]) pair.second);
        }
    }
}
