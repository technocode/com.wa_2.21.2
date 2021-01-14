package X;

import com.whatsapp.voipcalling.VideoPort;

/* renamed from: X.3U1  reason: invalid class name */
public class AnonymousClass3U1 implements AnonymousClass39S {
    public final /* synthetic */ AnonymousClass39R A00;

    public AnonymousClass3U1(AnonymousClass39R r1) {
        this.A00 = r1;
    }

    public void A00(VideoPort videoPort) {
        StringBuilder sb = new StringBuilder();
        AnonymousClass39R r1 = this.A00;
        sb.append(r1.A07);
        sb.append("onConnected ");
        sb.append(videoPort.hashCode());
        sb.append(" for ");
        AnonymousClass008.A1Q(sb, r1.A03);
        r1.A02 = true;
        r1.A04();
    }

    public void A01(VideoPort videoPort) {
        StringBuilder sb = new StringBuilder();
        AnonymousClass39R r1 = this.A00;
        sb.append(r1.A07);
        sb.append("onDisconnecting ");
        sb.append(videoPort.hashCode());
        sb.append(" for ");
        AnonymousClass008.A1Q(sb, r1.A03);
        r1.A02();
        r1.A02 = false;
    }
}
