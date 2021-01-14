package X;

import android.view.ViewGroup;
import com.whatsapp.voipcalling.VideoCallParticipantView;
import com.whatsapp.voipcalling.VideoCallParticipantViewLayout;
import com.whatsapp.voipcalling.VoipActivityV2;
import com.whatsapp.voipcalling.VoipCallNewParticipantBanner;

/* renamed from: X.3UH  reason: invalid class name */
public class AnonymousClass3UH {
    public final /* synthetic */ VoipActivityV2 A00;

    public AnonymousClass3UH(VoipActivityV2 voipActivityV2) {
        this.A00 = voipActivityV2;
    }

    public void A00(int i, float f) {
        int translationY;
        int i2;
        int i3;
        if (f <= 0.0f) {
            VoipActivityV2 voipActivityV2 = this.A00;
            float height = ((float) voipActivityV2.A0S.getHeight()) * f;
            VideoCallParticipantViewLayout videoCallParticipantViewLayout = voipActivityV2.A0t;
            if (videoCallParticipantViewLayout.A0I) {
                translationY = i;
            } else {
                translationY = (int) (height - voipActivityV2.A0S.getTranslationY());
            }
            VideoCallParticipantView videoCallParticipantView = videoCallParticipantViewLayout.A0N;
            if (videoCallParticipantView.getLayoutMode() == 1) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) videoCallParticipantView.getLayoutParams();
                AnonymousClass008.A0y("VideoCallParticipantViewLayout/movePiPViewWithOutAnimation xOffset: ", 0, ", yOffset: ", translationY);
                AnonymousClass01X r7 = videoCallParticipantViewLayout.A0L;
                if (r7.A0M()) {
                    i2 = marginLayoutParams.leftMargin;
                } else {
                    i2 = marginLayoutParams.rightMargin;
                }
                int i4 = marginLayoutParams.topMargin;
                if (r7.A0M()) {
                    i3 = marginLayoutParams.rightMargin;
                } else {
                    i3 = marginLayoutParams.leftMargin;
                }
                AnonymousClass0SE.A07(r7, videoCallParticipantView, i2, i4, i3, marginLayoutParams.bottomMargin);
                marginLayoutParams.topMargin += translationY;
                videoCallParticipantView.setLayoutParams(marginLayoutParams);
            }
            VoipCallNewParticipantBanner voipCallNewParticipantBanner = voipActivityV2.A13;
            if (voipCallNewParticipantBanner != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) voipCallNewParticipantBanner.getLayoutParams();
                AnonymousClass008.A0v("VoipCallNewParticipantBanner/moveBannerYPosition yOffset: ", i);
                marginLayoutParams2.bottomMargin -= i;
                voipCallNewParticipantBanner.setLayoutParams(marginLayoutParams2);
            }
            voipActivityV2.A0S.setTranslationY(height);
            return;
        }
        this.A00.A0S.setTranslationY(0.0f);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002e, code lost:
        if (r2 != 3) goto L_0x0030;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x004e, code lost:
        if (r1 == false) goto L_0x0050;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001a, code lost:
        if (r4.A1A != false) goto L_0x001c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A01(boolean r8) {
        /*
        // Method dump skipped, instructions count: 174
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3UH.A01(boolean):void");
    }
}
