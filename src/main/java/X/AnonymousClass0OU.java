package X;

import com.whatsapp.jid.Jid;
import com.whatsapp.protocol.VoipStanzaChildNode;
import java.util.Map;

/* renamed from: X.0OU  reason: invalid class name */
public class AnonymousClass0OU {
    public final byte A00;
    public final Jid A01;
    public final VoipStanzaChildNode A02;
    public final VoipStanzaChildNode A03;
    public final String A04;
    public final String A05;
    public final Map A06;

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0060, code lost:
        r1 = com.whatsapp.jid.DeviceJid.of(r2.A01);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0066, code lost:
        if (r1 == null) goto L_0x007f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0068, code lost:
        r0 = X.C002001d.A12(r10, "enc");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x006e, code lost:
        if (r0 == null) goto L_0x007a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0070, code lost:
        r0 = r0.getDataCopy();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0074, code lost:
        r7.put(r1, r0);
        r5 = r5 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x007a, code lost:
        r0 = null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass0OU(com.whatsapp.jid.Jid r14, java.lang.String r15, com.whatsapp.protocol.VoipStanzaChildNode r16, java.lang.String r17) {
        /*
        // Method dump skipped, instructions count: 216
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0OU.<init>(com.whatsapp.jid.Jid, java.lang.String, com.whatsapp.protocol.VoipStanzaChildNode, java.lang.String):void");
    }

    public String toString() {
        StringBuilder A0S = AnonymousClass008.A0S("jid=");
        A0S.append(this.A01);
        A0S.append(" callId=");
        A0S.append(this.A04);
        A0S.append(" payload=");
        A0S.append(this.A03);
        A0S.append(" format=");
        A0S.append(this.A02 != null ? "fan-out" : "legacy");
        return A0S.toString();
    }
}
