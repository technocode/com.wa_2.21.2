package X;

import android.os.SystemClock;
import com.google.android.search.verification.client.SearchActionVerificationClientService;
import com.whatsapp.util.Log;

/* renamed from: X.1O7  reason: invalid class name */
public class AnonymousClass1O7 {
    public static final AnonymousClass00Z A04 = new AnonymousClass00Z(1, 1, 10, true);
    public long A00 = -1;
    public final long A01;
    public final AnonymousClass00Y A02;
    public final C43961zH A03;

    public AnonymousClass1O7(AnonymousClass00Y r3) {
        this.A02 = r3;
        this.A03 = new C43961zH();
        this.A01 = SystemClock.uptimeMillis();
    }

    public void A00() {
        long j = this.A00;
        boolean z = false;
        if (j > 0) {
            z = true;
        }
        AnonymousClass00E.A07(z);
        C43961zH r4 = this.A03;
        r4.A02 = Boolean.FALSE;
        r4.A09 = Long.valueOf(SystemClock.uptimeMillis() - j);
        r4.A0L = Long.valueOf(SystemClock.uptimeMillis() - this.A01);
        this.A02.A0B(r4, A04, false);
    }

    public void A01() {
        long j = this.A00;
        boolean z = false;
        if (j > 0) {
            z = true;
        }
        AnonymousClass00E.A07(z);
        C43961zH r4 = this.A03;
        r4.A09 = Long.valueOf(SystemClock.uptimeMillis() - j);
        StringBuilder A0S = AnonymousClass008.A0S("mediatranscodequeue/srcLength");
        A0S.append(r4.A0I);
        A0S.append(" destinationSize=");
        A0S.append(r4.A07);
        A0S.append(" compressionRate=");
        A0S.append(((float) r4.A07.longValue()) / ((float) r4.A0I.longValue()));
        A0S.append(" duration=");
        A0S.append(r4.A09);
        A0S.append(" width=");
        A0S.append(r4.A08);
        A0S.append(" height=");
        A0S.append(r4.A06);
        A0S.append(" isProgressiveJpeg=");
        A0S.append(r4.A03);
        A0S.append(" firstScanLength=");
        A0S.append(r4.A0A);
        A0S.append(" thumbnailLength=");
        A0S.append(r4.A0K);
        Log.i(A0S.toString());
        r4.A02 = Boolean.TRUE;
        r4.A0L = Long.valueOf(SystemClock.uptimeMillis() - this.A01);
        this.A02.A07(r4);
    }

    public void A02(int i, int i2) {
        C43961zH r2 = this.A03;
        r2.A08 = Long.valueOf((long) i);
        r2.A06 = Long.valueOf((long) i2);
    }

    public void A03(AnonymousClass36I r6) {
        C43961zH r4 = this.A03;
        r4.A0J = Long.valueOf((long) r6.A03);
        r4.A0H = Long.valueOf((long) r6.A01);
        r4.A0F = Long.valueOf((long) (r6.A00() / SearchActionVerificationClientService.CONNECTION_TIMEOUT_IN_MS));
        r4.A0G = Long.valueOf(r6.A04 / 1000);
    }
}
