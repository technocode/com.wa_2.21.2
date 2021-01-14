package X;

import com.google.android.exoplayer2.ui.AspectRatioFrameLayout;
import com.whatsapp.util.Log;
import com.whatsapp.videoplayback.ExoPlaybackControlView;
import java.util.List;

/* renamed from: X.3Su  reason: invalid class name and case insensitive filesystem */
public final class C72423Su implements AnonymousClass12G, AnonymousClass14I, AnonymousClass168 {
    public final /* synthetic */ C670136w A00;

    @Override // X.AnonymousClass12G
    public void AHH(boolean z) {
    }

    @Override // X.AnonymousClass12G
    public void AIV(AnonymousClass12F r1) {
    }

    @Override // X.AnonymousClass12G
    public void AIX(AnonymousClass11w r1) {
    }

    @Override // X.AnonymousClass12G
    public /* synthetic */ void AIZ(int i) {
    }

    @Override // X.AnonymousClass12G
    public /* synthetic */ void AJu() {
    }

    @Override // X.AnonymousClass168
    public /* synthetic */ void AKo(int i, int i2) {
    }

    @Override // X.AnonymousClass12G
    public /* synthetic */ void AKz(AnonymousClass12R r1, Object obj, int i) {
    }

    @Override // X.AnonymousClass12G
    public void ALC(AnonymousClass14A r1, C232214w r2) {
    }

    public C72423Su(C670136w r1) {
        this.A00 = r1;
    }

    @Override // X.AnonymousClass14I
    public void AEn(List list) {
        this.A00.A0A.setCues(list);
    }

    @Override // X.AnonymousClass12G
    public void AIY(boolean z, int i) {
        String str;
        StringBuilder A0S = AnonymousClass008.A0S("WAExoPlayerView/playbackstate=");
        if (i != 1) {
            str = i != 2 ? i != 3 ? i != 4 ? "STATE_INVALID" : "STATE_ENDED" : "STATE_READY" : "STATE_BUFFERING";
        } else {
            str = "STATE_IDLE";
        }
        A0S.append(str);
        A0S.append(", playWhenReady=");
        A0S.append(z);
        Log.d(A0S.toString());
        C670136w r2 = this.A00;
        r2.A00 = i;
        if (i == 3) {
            C669836s r0 = r2.A03;
            if (r0 != null) {
                r0.A00();
                return;
            }
            return;
        }
        ExoPlaybackControlView exoPlaybackControlView = r2.A02;
        if (exoPlaybackControlView != null && i == 4) {
            if (!exoPlaybackControlView.A07()) {
                r2.A02.A01();
            }
            C669836s r02 = r2.A03;
            if (r02 != null) {
                r02.A00();
            }
            AnonymousClass25O r1 = r2.A01;
            if (r1 != null) {
                r1.AOo(false);
                r2.A01.ANW(0);
                return;
            }
            throw null;
        } else if (i == 2) {
            C669836s r12 = r2.A03;
            if (r12 == null) {
                return;
            }
            if (r2.A06) {
                r12.A02(r2.A05);
            } else {
                r12.A01();
            }
        } else {
            C669836s r03 = r2.A03;
            if (r03 != null) {
                r03.A00();
            }
        }
    }

    @Override // X.AnonymousClass168
    public void AJI() {
        this.A00.A07.setVisibility(8);
    }

    @Override // X.AnonymousClass168
    public void ALj(int i, int i2, int i3, float f) {
        AnonymousClass008.A0v("WAExoPlayerView/onVideoSizeChanged/unappliedRotationDegrees=", i3);
        C670136w r1 = this.A00;
        float f2 = 1.0f;
        if (!r1.A0C) {
            ((AnonymousClass37F) r1.A08).setRotationAngle(i3);
            if (i3 == 90 || i3 == 270) {
                AspectRatioFrameLayout aspectRatioFrameLayout = r1.A09;
                if (i2 != 0) {
                    f2 = ((float) i2) / (((float) i) * f);
                }
                aspectRatioFrameLayout.setAspectRatio(f2);
                return;
            }
            AspectRatioFrameLayout aspectRatioFrameLayout2 = r1.A09;
            if (i2 != 0) {
                f2 = (((float) i) * f) / ((float) i2);
            }
            aspectRatioFrameLayout2.setAspectRatio(f2);
            return;
        }
        AspectRatioFrameLayout aspectRatioFrameLayout3 = r1.A09;
        if (i2 != 0) {
            f2 = (((float) i) * f) / ((float) i2);
        }
        aspectRatioFrameLayout3.setAspectRatio(f2);
    }
}
