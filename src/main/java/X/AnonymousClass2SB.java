package X;

import android.os.Bundle;
import android.os.Message;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;

/* renamed from: X.2SB  reason: invalid class name */
public final /* synthetic */ class AnonymousClass2SB extends RunnableEmptyBase implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ AnonymousClass02N A02;
    public final /* synthetic */ DeviceJid A03;
    public final /* synthetic */ AnonymousClass0XI A04;
    public final /* synthetic */ AnonymousClass1XX A05;
    public final /* synthetic */ String A06;

    public /* synthetic */ AnonymousClass2SB(AnonymousClass0XI r1, AnonymousClass1XX r2, int i, int i2, AnonymousClass02N r5, DeviceJid deviceJid, String str) {
        this.A04 = r1;
        this.A05 = r2;
        this.A00 = i;
        this.A01 = i2;
        this.A02 = r5;
        this.A03 = deviceJid;
        this.A06 = str;
    }

    public final void run() {
        AnonymousClass0XI r5 = this.A04;
        AnonymousClass1XX r7 = this.A05;
        int i = this.A00;
        int i2 = this.A01;
        AnonymousClass02N r8 = this.A02;
        DeviceJid deviceJid = this.A03;
        String str = this.A06;
        StringBuilder sb = new StringBuilder("RecvLocationMessageListener/onFinalLocationNotification/need to send retry receipt; stanzaKey=");
        sb.append(r7);
        Log.i(sb.toString());
        if (i > 1) {
            r5.A02.A03();
        }
        StringBuilder sb2 = new StringBuilder("RecvLocationMessageListener/onFinalLocationNotification/axolotl sending retry receipt; stanzaKey=");
        sb2.append(r7);
        sb2.append("; localRegistrationId=");
        sb2.append(i2);
        Log.i(sb2.toString());
        AnonymousClass01S r10 = r5.A06;
        UserJid userJid = deviceJid.userJid;
        byte[] A042 = C05360Of.A04(i2);
        int i3 = i + 1;
        StringBuilder sb3 = new StringBuilder("LocationSharingManager/sendFinalLocationRetryRequest/jid=");
        sb3.append(r8);
        sb3.append("; participant=");
        sb3.append(userJid);
        sb3.append("; msgId=");
        sb3.append(str);
        sb3.append("; retryCount=");
        sb3.append(i3);
        Log.i(sb3.toString());
        if (i3 > 4) {
            StringBuilder sb4 = new StringBuilder("LocationSharingManager/sendFinalLocationRetryRequest/reached max retry; remote_resource=");
            sb4.append(userJid);
            sb4.append("; retryCount=");
            sb4.append(i3);
            Log.w(sb4.toString());
        } else if (r10.A07(new C007303n(r8, false, str)) == null) {
            StringBuilder sb5 = new StringBuilder("LocationSharingManager/sendFinalLocationRetryRequest/can't find the live location message; jid=");
            sb5.append(r8);
            sb5.append("; senderJid=");
            sb5.append(userJid);
            sb5.append("; msgId=");
            sb5.append(str);
            sb5.append("; retryCount=");
            sb5.append(i3);
            Log.w(sb5.toString());
        } else {
            AnonymousClass0AR r1 = r10.A0O;
            if (r1.A04.A06) {
                AnonymousClass09H r3 = r1.A08;
                Message obtain = Message.obtain(null, 0, 191, 0);
                Bundle data = obtain.getData();
                data.putParcelable("toJid", userJid);
                data.putParcelable("contextJid", r8);
                data.putString("msgId", str);
                data.putByteArray("registrationId", A042);
                data.putInt("retryCount", i3);
                r3.A09(obtain);
            }
        }
    }
}
