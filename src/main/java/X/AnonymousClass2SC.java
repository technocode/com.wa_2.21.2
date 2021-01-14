package X;

import android.util.Pair;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.jobqueue.job.SendFinalLiveLocationRetryJob;
import com.whatsapp.util.Log;

/* renamed from: X.2SC  reason: invalid class name */
public final /* synthetic */ class AnonymousClass2SC extends RunnableEmptyBase implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ Pair A02;
    public final /* synthetic */ DeviceJid A03;
    public final /* synthetic */ AnonymousClass0XI A04;
    public final /* synthetic */ C007303n A05;
    public final /* synthetic */ AnonymousClass1XX A06;

    public /* synthetic */ AnonymousClass2SC(AnonymousClass0XI r1, DeviceJid deviceJid, int i, AnonymousClass1XX r4, int i2, C007303n r6, Pair pair) {
        this.A04 = r1;
        this.A03 = deviceJid;
        this.A00 = i;
        this.A06 = r4;
        this.A01 = i2;
        this.A05 = r6;
        this.A02 = pair;
    }

    public final void run() {
        AnonymousClass0XI r4 = this.A04;
        DeviceJid deviceJid = this.A03;
        int i = this.A00;
        AnonymousClass1XX r3 = this.A06;
        int i2 = this.A01;
        C007303n r13 = this.A05;
        Pair pair = this.A02;
        UserJid userJid = deviceJid.userJid;
        AnonymousClass0E6 A0A = C001801b.A0A(deviceJid);
        byte[] bArr = null;
        StringBuilder sb = new StringBuilder("RecvLocationMessageListener/onFinalLiveLocationRetryNotification; axolotl checking sessions due to retry receipt; recipient=");
        sb.append(A0A);
        sb.append("; targetJid=");
        sb.append(userJid);
        Log.i(sb.toString());
        C001000o r10 = r4.A04;
        if (r10.A0W(A0A)) {
            AnonymousClass1UO r7 = r10.A0D(A0A).A01;
            if (r7.A00.A03 != i) {
                AnonymousClass008.A14("RecvLocationMessageListener/onFinalLiveLocationRetryNotification; axolotl deleting session due to registration id change; stop retrying; targetJid=", userJid);
                r10.A0H.A00();
                r10.A0C.A01(A0A);
                r10.A0M(A0A);
                r4.A08.A0M(r3);
                return;
            }
            if (i2 >= 2) {
                StringBuilder sb2 = new StringBuilder("RecvLocationMessageListener/onFinalLiveLocationRetryNotification; axolotl requiring new session before resending; targetJid=");
                sb2.append(userJid);
                Log.i(sb2.toString());
                bArr = r7.A00.A05.A01();
            }
            if (i2 > 2) {
                r10.A0H.A00();
                if (r10.A0X(A0A, new C007303n(userJid, true, "location_msg_id"))) {
                    Log.i("RecvLocationMessageListener/onFinalLiveLocationRetryNotification; axolotl will wait to send notification until a new prekey has been fetched");
                    r4.A08.A0M(r3);
                    return;
                }
            }
            if (i2 == 2) {
                Log.i("RecvLocationMessageListener/onFinalLiveLocationRetryNotification; axolotl will record the base key used to send");
                r10.A0H.A00();
                r10.A0Q(A0A, new C007303n(userJid, true, "location_msg_id"), bArr);
            }
        }
        StringBuilder sb3 = new StringBuilder("RecvLocationMessageListener/onFinalLiveLocationRetryNotification; create new SendFinalLiveLocationRetryJob; messageKey=");
        sb3.append(r13);
        sb3.append("; targetJid=");
        sb3.append(userJid);
        sb3.append("; timeOffset=");
        sb3.append(pair.second);
        sb3.append("; retryCount=");
        sb3.append(i2);
        Log.i(sb3.toString());
        AnonymousClass01J r1 = r4.A03;
        r1.A00.A01(new SendFinalLiveLocationRetryJob(r13, deviceJid, (C02900Dx) pair.first, ((Number) pair.second).intValue(), bArr, i2));
        r4.A08.A0M(r3);
    }
}
