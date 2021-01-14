package X;

import com.whatsapp.protocol.VoipStanzaChildNode;

/* renamed from: X.391  reason: invalid class name */
public class AnonymousClass391 {
    public static final AnonymousClass391 A04 = new AnonymousClass391(1, (byte) 0);
    public final byte A00;
    public final int A01;
    public final VoipStanzaChildNode A02;
    public final byte[] A03;

    public AnonymousClass391(int i, byte b) {
        this.A01 = i;
        this.A02 = null;
        this.A00 = b;
        this.A03 = null;
    }

    public AnonymousClass391(VoipStanzaChildNode voipStanzaChildNode, byte b, byte[] bArr) {
        this.A01 = 0;
        this.A02 = voipStanzaChildNode;
        this.A00 = b;
        this.A03 = bArr;
    }
}
