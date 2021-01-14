package X;

import com.whatsapp.jid.Jid;
import com.whatsapp.protocol.VoipStanzaChildNode;
import com.whatsapp.util.Log;

/* renamed from: X.1Iq  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class RunnableC25871Iq extends RunnableEmptyBase implements Runnable {
    public final /* synthetic */ AnonymousClass0XK A00;
    public final /* synthetic */ Jid A01;
    public final /* synthetic */ Jid A02;
    public final /* synthetic */ VoipStanzaChildNode A03;
    public final /* synthetic */ AnonymousClass3LL A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ String A06;

    public /* synthetic */ RunnableC25871Iq(AnonymousClass0XK r1, String str, Jid jid, VoipStanzaChildNode voipStanzaChildNode, Jid jid2, String str2, AnonymousClass3LL r7) {
        this.A00 = r1;
        this.A05 = str;
        this.A01 = jid;
        this.A03 = voipStanzaChildNode;
        this.A02 = jid2;
        this.A06 = str2;
        this.A04 = r7;
    }

    public final void run() {
        AnonymousClass0XK r7 = this.A00;
        String str = this.A05;
        Jid jid = this.A01;
        VoipStanzaChildNode voipStanzaChildNode = this.A03;
        Jid jid2 = this.A02;
        String str2 = this.A06;
        AnonymousClass3LL r2 = this.A04;
        int A012 = AnonymousClass0XK.A01(str, jid, 5, voipStanzaChildNode);
        if (A012 != 200) {
            r7.A05(jid2, str2, A012);
            StringBuilder sb = new StringBuilder("app/xmpp/recv/web_action_relay_call_rekey_message call-id: ");
            sb.append(str);
            sb.append(" failed in voip stack");
            Log.d(sb.toString());
            return;
        }
        r7.A06(r2);
        r7.A04(jid2, str2);
    }
}
