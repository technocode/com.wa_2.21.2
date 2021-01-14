package X;

import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.Jid;
import com.whatsapp.protocol.VoipStanzaChildNode;

/* renamed from: X.3Jq  reason: invalid class name and case insensitive filesystem */
public class C70073Jq extends AnonymousClass1XB {
    public final long A00;
    public final long A01;
    public final DeviceJid A02;
    public final String A03;
    public final String A04;
    public final boolean A05;

    public C70073Jq(String str, Jid jid, String str2, VoipStanzaChildNode voipStanzaChildNode, DeviceJid deviceJid, String str3, String str4, long j, long j2, boolean z) {
        super(str, jid, str2, voipStanzaChildNode, false);
        this.A02 = deviceJid;
        this.A04 = str3;
        this.A03 = str4;
        this.A01 = j;
        this.A00 = j2;
        this.A05 = z;
    }

    public DeviceJid A00() {
        Jid jid = super.A00;
        if (jid instanceof DeviceJid) {
            return (DeviceJid) jid;
        }
        return null;
    }
}
