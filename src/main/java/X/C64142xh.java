package X;

import com.whatsapp.jid.Jid;
import com.whatsapp.protocol.VoipStanzaChildNode;

/* renamed from: X.2xh  reason: invalid class name and case insensitive filesystem */
public class C64142xh {
    public final int A00;
    public final Jid A01;
    public final String A02;
    public final boolean A03;
    public final VoipStanzaChildNode[] A04;

    public C64142xh(Jid jid, String str, int i, boolean z, VoipStanzaChildNode[] voipStanzaChildNodeArr) {
        if (AnonymousClass1VY.A0V(jid)) {
            this.A01 = jid;
            this.A02 = str;
            this.A00 = i;
            this.A03 = z;
            this.A04 = voipStanzaChildNodeArr;
            return;
        }
        StringBuilder sb = new StringBuilder("CallIncomingAck:Wrong jid type: ");
        sb.append(jid);
        throw new IllegalArgumentException(sb.toString());
    }
}
