package X;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import com.google.android.search.verification.client.R;
import com.whatsapp.jid.UserJid;
import com.whatsapp.voipcalling.VideoCallParticipantView;
import com.whatsapp.voipcalling.VoipActivityV2;

/* renamed from: X.38D  reason: invalid class name */
public final /* synthetic */ class AnonymousClass38D implements View.OnTouchListener {
    public final /* synthetic */ VoipActivityV2 A00;

    public /* synthetic */ AnonymousClass38D(VoipActivityV2 voipActivityV2) {
        this.A00 = voipActivityV2;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        VideoCallParticipantView videoCallParticipantView;
        VoipActivityV2 voipActivityV2 = this.A00;
        VideoCallParticipantView videoCallParticipantView2 = (VideoCallParticipantView) view;
        if (videoCallParticipantView2.A09()) {
            UserJid userJid = videoCallParticipantView2.A0N;
            int action = motionEvent.getAction();
            boolean z = true;
            if (action != 0) {
                if (action == 1) {
                    z = false;
                }
            }
            DecelerateInterpolator decelerateInterpolator = new DecelerateInterpolator(2.0f);
            if (z) {
                int dimensionPixelSize = videoCallParticipantView2.getResources().getDimensionPixelSize(R.dimen.group_video_call_grid_touch_shrink_size);
                int width = videoCallParticipantView2.getWidth();
                int height = videoCallParticipantView2.getHeight();
                if (width > dimensionPixelSize && height > dimensionPixelSize) {
                    videoCallParticipantView2.animate().setDuration((long) VideoCallParticipantView.A0P).setInterpolator(decelerateInterpolator).scaleX(((float) (width - dimensionPixelSize)) / ((float) width)).scaleY(((float) (height - dimensionPixelSize)) / ((float) height));
                }
                videoCallParticipantView2.A03(videoCallParticipantView2.getResources().getDimensionPixelSize(R.dimen.group_video_call_grid_touch_rounded_corner));
            } else {
                videoCallParticipantView2.animate().setDuration((long) VideoCallParticipantView.A0P).scaleX(1.0f).scaleY(1.0f).setInterpolator(decelerateInterpolator);
                videoCallParticipantView2.A03(0);
            }
            for (AnonymousClass39R r1 : voipActivityV2.A18.values()) {
                if (!r1.A03.equals(userJid) && (videoCallParticipantView = r1.A00) != null) {
                    AccelerateInterpolator accelerateInterpolator = new AccelerateInterpolator(1.5f);
                    ViewPropertyAnimator duration = videoCallParticipantView.A0E.animate().setDuration((long) VideoCallParticipantView.A0P);
                    float f = 0.0f;
                    if (z) {
                        f = 1.0f;
                    }
                    duration.alpha(f).setInterpolator(accelerateInterpolator);
                }
            }
        }
        return false;
    }
}
