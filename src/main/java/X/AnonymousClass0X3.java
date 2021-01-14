package X;

import com.whatsapp.util.Log;

/* renamed from: X.0X3  reason: invalid class name */
public class AnonymousClass0X3 {
    public final /* synthetic */ AnonymousClass0X2 A00;

    public AnonymousClass0X3(AnonymousClass0X2 r1) {
        this.A00 = r1;
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x0378, code lost:
        if (r49.equals("sticker") == false) goto L_0x02ee;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x0384, code lost:
        if (r49.equals("invite") == false) goto L_0x02ee;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x0390, code lost:
        if (r49.equals("livelocation") == false) goto L_0x02ee;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x039c, code lost:
        if (r49.equals("product") == false) goto L_0x02ee;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x03a8, code lost:
        if (r49.equals("gif") == false) goto L_0x02ee;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x03b3, code lost:
        if (r49.equals("audio") == false) goto L_0x02ee;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x03be, code lost:
        if (r49.equals("image") == false) goto L_0x02ee;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x03ca, code lost:
        if (r49.equals("order") == false) goto L_0x02ee;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x03d6, code lost:
        if (r49.equals("video") == false) goto L_0x02ee;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x03e2, code lost:
        if (r49.equals("catalog") == false) goto L_0x02ee;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x03ee, code lost:
        if (r49.equals("document") == false) goto L_0x02ee;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x03fa, code lost:
        if (r49.equals("contact_array") == false) goto L_0x02ee;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x0405, code lost:
        if (r49.equals("contact") == false) goto L_0x02ee;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x0410, code lost:
        if (r49.equals("location") == false) goto L_0x02ee;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x0453, code lost:
        if (r54 != null) goto L_0x0455;
     */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x036a  */
    /* JADX WARNING: Removed duplicated region for block: B:141:0x0427  */
    /* JADX WARNING: Removed duplicated region for block: B:187:0x0552  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0165  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x01b4  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x01d2  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x01f6  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x01fb  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0309  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x030e  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x0325  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A00(X.C007303n r41, com.whatsapp.jid.Jid r42, long r43, int r45, com.whatsapp.jid.DeviceJid r46, com.whatsapp.jid.UserJid r47, java.lang.String r48, java.lang.String r49, X.EnumC05410Ok r50, X.AnonymousClass02P r51, java.util.Map r52, java.util.Map r53, java.util.List r54, int r55, int r56, java.lang.Integer r57, X.AnonymousClass0MH r58, java.util.Map r59, java.lang.Integer r60, java.lang.String r61, java.lang.String r62, boolean r63) {
        /*
        // Method dump skipped, instructions count: 1430
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0X3.A00(X.03n, com.whatsapp.jid.Jid, long, int, com.whatsapp.jid.DeviceJid, com.whatsapp.jid.UserJid, java.lang.String, java.lang.String, X.0Ok, X.02P, java.util.Map, java.util.Map, java.util.List, int, int, java.lang.Integer, X.0MH, java.util.Map, java.lang.Integer, java.lang.String, java.lang.String, boolean):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:9:0x0033  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A01(X.AbstractC007503q r13) {
        /*
        // Method dump skipped, instructions count: 108
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0X3.A01(X.03q):void");
    }

    public void A02(AnonymousClass1XX r3) {
        StringBuilder sb = new StringBuilder("xmpp/writer/before/write/send-stanza-received; stanzaKey=");
        sb.append(r3);
        Log.d(sb.toString());
        this.A00.A00.A0N(r3, r3.A01());
        StringBuilder sb2 = new StringBuilder("xmpp/writer/write/send-stanza-received; stanzaKey=");
        sb2.append(r3);
        Log.i(sb2.toString());
    }

    public void A03(AnonymousClass1XX r8, boolean z) {
        StringBuilder sb = new StringBuilder("xmpp/writer/before/write/read-receipt-received; stanzaKey=");
        sb.append(r8);
        sb.append("; disable=");
        sb.append(z);
        Log.d(sb.toString());
        AnonymousClass0OT r5 = this.A00.A00;
        AnonymousClass0M5 r4 = null;
        if (r5 != null) {
            if (z) {
                r4 = new AnonymousClass0M5("features", new AnonymousClass0OS[]{new AnonymousClass0OS("readreceipts", "disable", null, (byte) 0)}, null, null);
            }
            r5.A0N(r8, r4);
            StringBuilder sb2 = new StringBuilder("xmpp/writer/write/read-receipt-received; stanzaKey=");
            sb2.append(r8);
            sb2.append("; disable=");
            sb2.append(z);
            Log.i(sb2.toString());
            return;
        }
        throw null;
    }
}
