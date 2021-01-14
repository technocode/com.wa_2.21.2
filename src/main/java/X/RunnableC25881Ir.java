package X;

import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.protocol.VoipStanzaChildNode;
import com.whatsapp.util.Log;

/* renamed from: X.1Ir  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class RunnableC25881Ir extends RunnableEmptyBase implements Runnable {
    public final /* synthetic */ AnonymousClass0XK A00;
    public final /* synthetic */ Jid A01;
    public final /* synthetic */ UserJid A02;
    public final /* synthetic */ VoipStanzaChildNode A03;
    public final /* synthetic */ AnonymousClass3LL A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ boolean A07;

    public /* synthetic */ RunnableC25881Ir(AnonymousClass0XK r1, String str, UserJid userJid, VoipStanzaChildNode voipStanzaChildNode, Jid jid, String str2, boolean z, AnonymousClass3LL r8) {
        this.A00 = r1;
        this.A05 = str;
        this.A02 = userJid;
        this.A03 = voipStanzaChildNode;
        this.A01 = jid;
        this.A06 = str2;
        this.A07 = z;
        this.A04 = r8;
    }

    public final void run() {
        AnonymousClass0XK r4 = this.A00;
        String str = this.A05;
        UserJid userJid = this.A02;
        VoipStanzaChildNode voipStanzaChildNode = this.A03;
        Jid jid = this.A01;
        String str2 = this.A06;
        boolean z = this.A07;
        AnonymousClass3LL r1 = this.A04;
        int A012 = AnonymousClass0XK.A01(str, userJid, 4, voipStanzaChildNode);
        if (A012 != 200) {
            r4.A05(jid, str2, A012);
            StringBuilder sb = new StringBuilder();
            sb.append("app/xmpp/recv/web_action_relay_call_message call-id: ");
            sb.append(str);
            sb.append(" failed in voip stack");
            Log.d(sb.toString());
            return;
        }
        String A1n = C002001d.A1n(str);
        AnonymousClass0FS r7 = r4.A0P;
        if (r7.A04(new C09260ca(userJid, true, A1n, -1)) != null) {
            AnonymousClass008.A1C("app/xmpp/recv/web_action_relay_call_message call-id: ", str, " exists in call log");
        } else {
            long A052 = r4.A0L.A05();
            Log.d("CallsMessageStore/addCallLog ");
            r7.A03(userJid, true, A1n, -1, A052, z, true);
        }
        r4.A06(r1);
        r4.A04(jid, str2);
    }
}
