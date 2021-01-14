package X;

import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.protocol.VoipStanzaChildNode;
import com.whatsapp.util.Log;
import com.whatsapp.voipcalling.CallInfo;
import com.whatsapp.voipcalling.Voip;
import java.util.Map;

/* renamed from: X.386  reason: invalid class name */
public final /* synthetic */ class AnonymousClass386 extends RunnableEmptyBase implements Runnable {
    public final /* synthetic */ Jid A00;
    public final /* synthetic */ VoipStanzaChildNode A01;
    public final /* synthetic */ AnonymousClass0OU A02;
    public final /* synthetic */ AnonymousClass3U7 A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ Map A06;
    public final /* synthetic */ boolean A07;
    public final /* synthetic */ boolean A08;

    public /* synthetic */ AnonymousClass386(AnonymousClass3U7 r1, boolean z, Jid jid, String str, Map map, AnonymousClass0OU r6, VoipStanzaChildNode voipStanzaChildNode, String str2, boolean z2) {
        this.A03 = r1;
        this.A07 = z;
        this.A00 = jid;
        this.A04 = str;
        this.A06 = map;
        this.A02 = r6;
        this.A01 = voipStanzaChildNode;
        this.A05 = str2;
        this.A08 = z2;
    }

    public final void run() {
        AnonymousClass3U7 r3 = this.A03;
        boolean z = this.A07;
        Jid jid = this.A00;
        String str = this.A04;
        Map map = this.A06;
        AnonymousClass0OU r2 = this.A02;
        VoipStanzaChildNode voipStanzaChildNode = this.A01;
        String str2 = this.A05;
        boolean z2 = this.A08;
        if (r3.A2B != 14) {
            r3.A2F = false;
            if (z) {
                UserJid convertToUserJid = Voip.JidHelper.convertToUserJid(jid);
                if (convertToUserJid != null) {
                    StringBuilder sb = new StringBuilder("VoiceService:sendOfferEcryptionTask, Call ID = ");
                    sb.append(str);
                    sb.append(", peer = ");
                    sb.append(convertToUserJid);
                    Log.i(sb.toString());
                    Map A0A = r3.A0A(map);
                    if (A0A != null) {
                        CallInfo callInfo = Voip.getCallInfo();
                        if (callInfo == null || !callInfo.isCaller || !callInfo.callId.equals(str) || !callInfo.peerJid.equals(convertToUserJid)) {
                            StringBuilder sb2 = new StringBuilder("VoiceService:sendOfferEcryptionTask(");
                            sb2.append(str);
                            sb2.append(", ");
                            sb2.append(convertToUserJid);
                            sb2.append(", call state does not match, do nothing)");
                            Log.w(sb2.toString());
                        } else {
                            voipStanzaChildNode = C002001d.A14(r2, A0A);
                        }
                    }
                    Log.i("VoiceService:sendOfferStanza sendOfferEcryptionTask skipped or failed");
                    r3.A2C = r2;
                }
                throw null;
            }
            StringBuilder sb3 = new StringBuilder("VoiceService:sendOfferStanza without enc (Call ID = ");
            sb3.append(str);
            sb3.append(", peer = ");
            sb3.append(jid);
            sb3.append(")");
            Log.i(sb3.toString());
            if (voipStanzaChildNode != null) {
                r3.A1s.A00(new AnonymousClass1XB(str2, jid, str, voipStanzaChildNode, z2));
                return;
            }
            r3.A2C = r2;
        }
    }
}
