package X;

import android.net.Uri;
import com.google.android.search.verification.client.R;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.IOException;
import java.util.List;

/* renamed from: X.1ql  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C38981ql implements AnonymousClass35j {
    public final /* synthetic */ Uri A00;
    public final /* synthetic */ AbstractC004502c A01;
    public final /* synthetic */ AnonymousClass1NW A02;
    public final /* synthetic */ C04350Ka A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ List A05;
    public final /* synthetic */ boolean A06;

    public /* synthetic */ C38981ql(C04350Ka r1, boolean z, List list, String str, AnonymousClass1NW r5, Uri uri, AbstractC004502c r7) {
        this.A03 = r1;
        this.A06 = z;
        this.A05 = list;
        this.A04 = str;
        this.A02 = r5;
        this.A00 = uri;
        this.A01 = r7;
    }

    @Override // X.AnonymousClass35j
    public final void AG2(File file) {
        C04350Ka r5 = this.A03;
        boolean z = this.A06;
        List list = this.A05;
        String str = this.A04;
        AnonymousClass1NW r2 = this.A02;
        Uri uri = this.A00;
        AbstractC004502c r3 = this.A01;
        try {
            if (!r5.A07(z, list, file, AnonymousClass1XO.A05, true, str, null, false)) {
                r2.AFq();
            }
            r2.ALY(uri);
        } catch (IOException e) {
            if (e.getMessage() == null || !e.getMessage().contains("No space")) {
                r5.A01.A06(R.string.share_failed, 0);
            } else {
                r5.A01.A0B(r3, r5.A06.A06(R.string.error_no_disc_space));
            }
            Log.e("sendmedia/sendaudio/ioerror ", e);
        }
    }
}
