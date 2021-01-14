package X;

import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.protocol.VoipStanzaChildNode;

/* renamed from: X.3LL  reason: invalid class name */
public class AnonymousClass3LL extends AnonymousClass1XB {
    public final Jid A00;
    public final boolean A01;

    public AnonymousClass3LL(String str, Jid jid, UserJid userJid, String str2, VoipStanzaChildNode voipStanzaChildNode) {
        super(str, userJid, str2, voipStanzaChildNode, true);
        this.A00 = jid;
        this.A01 = false;
    }

    public AnonymousClass3LL(String str, Jid jid, UserJid userJid, String str2, VoipStanzaChildNode voipStanzaChildNode, boolean z) {
        super(str, userJid, str2, voipStanzaChildNode, true);
        this.A00 = jid;
        this.A01 = z;
    }
}
