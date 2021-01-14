package X;

import android.view.View;
import com.whatsapp.mediaview.MediaViewBaseFragment;
import com.whatsapp.mediaview.MediaViewFragment;
import com.whatsapp.videoplayback.ExoPlaybackControlView;

/* renamed from: X.2kQ  reason: invalid class name and case insensitive filesystem */
public class C57512kQ implements AnonymousClass2PS {
    public final float A00;
    public final /* synthetic */ View A01;
    public final /* synthetic */ MediaViewBaseFragment A02;

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0014, code lost:
        if (r0 == false) goto L_0x0016;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C57512kQ(com.whatsapp.mediaview.MediaViewBaseFragment r3, android.view.View r4) {
        /*
            r2 = this;
            r2.A02 = r3
            r2.A01 = r4
            r2.<init>()
            com.whatsapp.mediaview.MediaViewBaseFragment r1 = r2.A02
            X.2UT r0 = r1.A0B
            boolean r0 = r0 instanceof X.C57662kf
            if (r0 != 0) goto L_0x0016
            boolean r0 = r1.A11()
            r1 = 0
            if (r0 != 0) goto L_0x0017
        L_0x0016:
            r1 = 1
        L_0x0017:
            r0 = 1061997773(0x3f4ccccd, float:0.8)
            if (r1 == 0) goto L_0x001e
            r0 = 1056964608(0x3f000000, float:0.5)
        L_0x001e:
            r2.A00 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C57512kQ.<init>(com.whatsapp.mediaview.MediaViewBaseFragment, android.view.View):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000d, code lost:
        if (r1.A11() == false) goto L_0x000f;
     */
    @Override // X.AnonymousClass2PS
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void AF9(android.view.View r3) {
        /*
            r2 = this;
            com.whatsapp.mediaview.MediaViewBaseFragment r1 = r2.A02
            X.2UT r0 = r1.A0B
            boolean r0 = r0 instanceof X.C57662kf
            if (r0 != 0) goto L_0x000f
            boolean r1 = r1.A11()
            r0 = 0
            if (r1 != 0) goto L_0x0010
        L_0x000f:
            r0 = 1
        L_0x0010:
            if (r0 == 0) goto L_0x0020
            com.whatsapp.mediaview.MediaViewBaseFragment r1 = r2.A02
            X.2UT r0 = r1.A0B
            boolean r0 = r0 instanceof X.C57652ke
            if (r0 == 0) goto L_0x0020
            X.2pq r1 = r1.A09
            r0 = 0
            r1.setAlpha(r0)
        L_0x0020:
            com.whatsapp.mediaview.MediaViewBaseFragment r0 = r2.A02
            r0.A0v()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C57512kQ.AF9(android.view.View):void");
    }

    @Override // X.AnonymousClass2PS
    public void AFL(int i) {
        AnonymousClass25O r0;
        MediaViewBaseFragment mediaViewBaseFragment = this.A02;
        if (mediaViewBaseFragment instanceof MediaViewFragment) {
            MediaViewFragment mediaViewFragment = (MediaViewFragment) mediaViewBaseFragment;
            C72403Ss r1 = mediaViewFragment.A0N;
            if (i == 1) {
                if (r1 != null) {
                    r1.A05();
                    ExoPlaybackControlView exoPlaybackControlView = mediaViewFragment.A0N.A0C;
                    if (exoPlaybackControlView != null && !exoPlaybackControlView.A07()) {
                        exoPlaybackControlView.A01();
                        exoPlaybackControlView.A06(3000);
                    }
                }
                mediaViewFragment.A13();
            } else if (r1 != null && r1.A0C == null && (r0 = r1.A08) != null) {
                r0.AOo(true);
            }
        }
    }

    @Override // X.AnonymousClass2PS
    public void AK2(View view) {
        AbstractC07270Wu r0 = (AbstractC07270Wu) this.A02.A0A();
        if (r0 != null) {
            r0.AKp();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x002f, code lost:
        if (r1.A11() == false) goto L_0x0031;
     */
    @Override // X.AnonymousClass2PS
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void AKE(android.view.View r7, float r8) {
        /*
            r6 = this;
            com.whatsapp.mediaview.MediaViewBaseFragment r4 = r6.A02
            X.02h r0 = r4.A0A()
            X.0Wu r0 = (X.AbstractC07270Wu) r0
            if (r0 == 0) goto L_0x000d
            r0.AFB()
        L_0x000d:
            r2 = 1065353216(0x3f800000, float:1.0)
            float r5 = r2 - r8
            float r1 = r6.A00
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x0057
            r5 = 0
        L_0x0018:
            android.view.View r0 = r6.A01
            r0.setAlpha(r5)
            androidx.appcompat.widget.Toolbar r0 = r4.A06
            r0.setAlpha(r5)
            com.whatsapp.mediaview.MediaViewBaseFragment r1 = r6.A02
            X.2UT r0 = r1.A0B
            boolean r0 = r0 instanceof X.C57662kf
            if (r0 != 0) goto L_0x0031
            boolean r1 = r1.A11()
            r0 = 0
            if (r1 != 0) goto L_0x0032
        L_0x0031:
            r0 = 1
        L_0x0032:
            if (r0 == 0) goto L_0x0039
            X.2pq r0 = r4.A09
            r0.setAlpha(r5)
        L_0x0039:
            X.2pq r0 = r4.A09
            int r3 = r0.getChildCount()
            r2 = 0
        L_0x0040:
            if (r2 >= r3) goto L_0x005b
            X.2pq r0 = r4.A09
            android.view.View r1 = r0.getChildAt(r2)
            r0 = 2131362921(0x7f0a0469, float:1.8345636E38)
            android.view.View r1 = r1.findViewById(r0)
            float r0 = r5 * r5
            r1.setAlpha(r0)
            int r2 = r2 + 1
            goto L_0x0040
        L_0x0057:
            float r5 = r5 - r1
            float r2 = r2 - r1
            float r5 = r5 / r2
            goto L_0x0018
        L_0x005b:
            r0 = 1
            r4.A10(r0, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C57512kQ.AKE(android.view.View, float):void");
    }
}
