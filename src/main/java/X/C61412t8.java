package X;

import android.os.HandlerThread;
import com.whatsapp.util.Log;

/* renamed from: X.2t8  reason: invalid class name and case insensitive filesystem */
public class C61412t8 {
    public static final long[] A0G = {3, 2, 15};
    public int A00;
    public HandlerThread A01;
    public AbstractC61392t6 A02;
    public HandlerC61402t7 A03;
    public String A04;
    public String A05;
    public final AnonymousClass02M A06 = AnonymousClass02M.A00();
    public final AnonymousClass04j A07 = AnonymousClass04j.A00();
    public final AnonymousClass00G A08 = AnonymousClass00G.A01;
    public final C60922sD A09 = C60922sD.A00();
    public final C68393Da A0A = C68393Da.A00();
    public final AnonymousClass0GP A0B = AnonymousClass0GP.A00();
    public final C61082sT A0C;
    public final C03340Fu A0D = C03340Fu.A00();
    public final C63822x4 A0E = C63822x4.A00();
    public final C63842x6 A0F = C63842x6.A00();

    public C61412t8(C74463ay r10, AbstractC61392t6 r11) {
        C60922sD r1 = this.A09;
        this.A0C = r1.A04;
        this.A02 = r11;
        this.A04 = r1.A04(r10);
        this.A05 = this.A09.A05(r10);
        HandlerThread handlerThread = new HandlerThread("PAY: device binding iq sender");
        this.A01 = handlerThread;
        handlerThread.start();
        this.A03 = new HandlerC61402t7(this, this.A0F, this.A09, this.A0A, this.A04, r10, this.A01.getLooper());
    }

    public void A00() {
        long j;
        Log.i("PAY: IndiaUpiGetBankAccountsAction: delayedDeviceVerifIqHandlerMessage");
        this.A00++;
        this.A03.removeMessages(0);
        HandlerC61402t7 r4 = this.A03;
        int i = this.A00 - 1;
        long[] jArr = A0G;
        if (i < jArr.length) {
            j = jArr[i];
        } else {
            j = ((long) i) * 5;
        }
        r4.sendEmptyMessageDelayed(0, j * 1000);
    }
}
