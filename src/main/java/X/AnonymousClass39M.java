package X;

import android.animation.ValueAnimator;
import android.view.ViewGroup;
import com.whatsapp.voipcalling.VideoCallParticipantView;
import com.whatsapp.voipcalling.VideoCallParticipantViewLayout;

/* renamed from: X.39M  reason: invalid class name */
public class AnonymousClass39M implements ValueAnimator.AnimatorUpdateListener {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public final /* synthetic */ int A04;
    public final /* synthetic */ int A05;
    public final /* synthetic */ long A06;
    public final /* synthetic */ VideoCallParticipantViewLayout A07;

    public AnonymousClass39M(VideoCallParticipantViewLayout videoCallParticipantViewLayout, long j, int i, int i2) {
        this.A07 = videoCallParticipantViewLayout;
        this.A06 = j;
        this.A04 = i;
        this.A05 = i2;
    }

    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i;
        int i2;
        float animatedFraction = valueAnimator.getAnimatedFraction();
        VideoCallParticipantViewLayout videoCallParticipantViewLayout = this.A07;
        VideoCallParticipantView videoCallParticipantView = videoCallParticipantViewLayout.A0N;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) videoCallParticipantView.getLayoutParams();
        AnonymousClass01X r4 = videoCallParticipantViewLayout.A0L;
        if (r4 != null) {
            if (animatedFraction == 0.0f) {
                this.A02 = marginLayoutParams.topMargin;
                if (r4.A0M()) {
                    i2 = marginLayoutParams.leftMargin;
                } else {
                    i2 = marginLayoutParams.rightMargin;
                }
                this.A01 = i2;
                this.A03 = videoCallParticipantView.getWidth();
                this.A00 = videoCallParticipantView.getHeight();
            }
            int i3 = ((int) (((float) this.A04) * animatedFraction)) + this.A01;
            int i4 = marginLayoutParams.topMargin;
            if (r4.A0M()) {
                i = marginLayoutParams.rightMargin;
            } else {
                i = marginLayoutParams.leftMargin;
            }
            AnonymousClass0SE.A07(r4, videoCallParticipantView, i3, i4, i, marginLayoutParams.bottomMargin);
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) videoCallParticipantView.getLayoutParams();
            marginLayoutParams2.topMargin = this.A02 + ((int) (((float) this.A05) * animatedFraction));
            videoCallParticipantView.setLayoutParams(marginLayoutParams2);
            return;
        }
        throw null;
    }
}
