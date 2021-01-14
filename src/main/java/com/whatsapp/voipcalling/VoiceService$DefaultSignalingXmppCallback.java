package com.whatsapp.voipcalling;

import X.AnonymousClass00S;
import X.AnonymousClass01I;
import X.AnonymousClass3U7;
import X.C675038w;

public class VoiceService$DefaultSignalingXmppCallback implements SignalingXmppCallback {
    public final C675038w callSendMethods;
    public final AnonymousClass01I meManager;
    public final AnonymousClass3U7 service;
    public final AnonymousClass00S time;

    public VoiceService$DefaultSignalingXmppCallback(AnonymousClass3U7 r1, AnonymousClass00S r2, AnonymousClass01I r3, C675038w r4) {
        this.service = r1;
        this.time = r2;
        this.meManager = r3;
        this.callSendMethods = r4;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0040, code lost:
        if (r5.equals("reject") != false) goto L_0x0056;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x004a, code lost:
        if (r5.equals("offer") == false) goto L_0x0019;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0054, code lost:
        if (r5.equals("video") != false) goto L_0x0056;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0067, code lost:
        if (r5.equals("enc_rekey") != false) goto L_0x0069;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x007d, code lost:
        if (r5.equals("terminate") == false) goto L_0x0019;
     */
    @Override // com.whatsapp.voipcalling.SignalingXmppCallback
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void sendCallStanza(com.whatsapp.jid.Jid r13, java.lang.String r14, com.whatsapp.protocol.VoipStanzaChildNode r15) {
        /*
        // Method dump skipped, instructions count: 194
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.voipcalling.VoiceService$DefaultSignalingXmppCallback.sendCallStanza(com.whatsapp.jid.Jid, java.lang.String, com.whatsapp.protocol.VoipStanzaChildNode):void");
    }
}
