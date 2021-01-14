package X;

import com.whatsapp.videoplayback.ExoPlaybackControlView;

/* renamed from: X.3SW  reason: invalid class name */
public final /* synthetic */ class AnonymousClass3SW {
    public final /* synthetic */ C72403Ss A00;

    public /* synthetic */ AnonymousClass3SW(C72403Ss r1) {
        this.A00 = r1;
    }

    public final void A00(String str, boolean z, int i) {
        C72403Ss r2 = this.A00;
        boolean z2 = false;
        if (i == 1) {
            r2.A0L(str, z);
        } else if (i == 2) {
            ExoPlaybackControlView exoPlaybackControlView = r2.A0C;
            if (exoPlaybackControlView != null) {
                exoPlaybackControlView.setPlayControlVisibility(0);
            }
            r2.A08();
            r2.A07();
        }
        C670136w r3 = r2.A0Y;
        if (i == 1) {
            z2 = true;
        }
        r3.A05 = str;
        C669836s r22 = r3.A03;
        if (r22 != null && r3.A06 != z2) {
            if (z2) {
                if (r3.A00 == 2) {
                    r22.A02(str);
                }
            } else if (r3.A00 == 2) {
                r22.A01();
            }
            r3.A06 = z2;
        }
    }
}
