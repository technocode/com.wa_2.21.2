package X;

import com.whatsapp.jid.Jid;
import com.whatsapp.protocol.VoipStanzaChildNode;

/* renamed from: X.1XB  reason: invalid class name */
public class AnonymousClass1XB {
    public final Jid A00;
    public final VoipStanzaChildNode A01;
    public final String A02;
    public final String A03;
    public final boolean A04;

    public AnonymousClass1XB(String str, Jid jid, String str2, VoipStanzaChildNode voipStanzaChildNode, boolean z) {
        if (AnonymousClass1VY.A0V(jid)) {
            this.A03 = str;
            this.A00 = jid;
            this.A02 = str2;
            this.A01 = voipStanzaChildNode;
            this.A04 = z;
            return;
        }
        StringBuilder sb = new StringBuilder("CallStanza:Wrong jid type: ");
        sb.append(jid);
        throw new IllegalArgumentException(sb.toString());
    }
}
