package X;

import com.whatsapp.jid.DeviceJid;
import com.whatsapp.util.Log;
import com.whatsapp.voipcalling.Voip;
import java.util.Map;

/* renamed from: X.3U2  reason: invalid class name */
public class AnonymousClass3U2 {
    public final /* synthetic */ AnonymousClass3U7 A00;

    public AnonymousClass3U2(AnonymousClass3U7 r1) {
        this.A00 = r1;
    }

    public void A00(DeviceJid deviceJid) {
        byte byteValue;
        StringBuilder sb = new StringBuilder("VoiceService/notifyNewSessionEstablished ");
        sb.append(deviceJid);
        Log.i(sb.toString());
        AnonymousClass3U7 r4 = this.A00;
        r4.A0T(deviceJid, Voip.getCurrentCallId(), false);
        Map map = r4.A26;
        String str = (String) map.get(deviceJid);
        if (str != null) {
            StringBuilder sb2 = new StringBuilder("voip/sendOfferRetryRequest for jid:");
            sb2.append(deviceJid);
            Log.i(sb2.toString());
            map.remove(deviceJid);
            r4.A0o.execute(new RunnableEBaseShape1S1100000_I1(deviceJid, str, 26));
        }
        Number number = (Number) r4.A27.get(deviceJid);
        if (number != null && (byteValue = number.byteValue()) >= 0 && byteValue <= 4) {
            StringBuilder sb3 = new StringBuilder("voip/sendPendingRekeyRequest for jid:");
            sb3.append(deviceJid);
            sb3.append(", retry:");
            sb3.append(number);
            Log.i(sb3.toString());
            r4.A0o.execute(new RunnableEBaseShape2S0300000_I1(r4, deviceJid, number, 44));
        }
    }
}
