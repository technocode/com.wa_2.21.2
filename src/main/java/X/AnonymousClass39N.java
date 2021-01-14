package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.whatsapp.util.Log;
import com.whatsapp.voipcalling.VideoCallParticipantViewLayout;
import com.whatsapp.voipcalling.VoipActivityV2;

/* renamed from: X.39N  reason: invalid class name */
public class AnonymousClass39N extends AnimatorListenerAdapter {
    public final /* synthetic */ VideoCallParticipantViewLayout A00;

    public AnonymousClass39N(VideoCallParticipantViewLayout videoCallParticipantViewLayout) {
        this.A00 = videoCallParticipantViewLayout;
    }

    public void onAnimationCancel(Animator animator) {
        Log.i("VideoCallParticipantViewLayout/animatePiPView onAnimationCancel");
        AnonymousClass3UE r0 = this.A00.A0F;
        if (r0 != null) {
            VoipActivityV2 voipActivityV2 = r0.A00;
            voipActivityV2.A1N = false;
            voipActivityV2.A0w();
        }
    }

    public void onAnimationEnd(Animator animator) {
        Log.i("VideoCallParticipantViewLayout/animatePiPView onAnimationEnd");
        AnonymousClass3UE r0 = this.A00.A0F;
        if (r0 != null) {
            VoipActivityV2 voipActivityV2 = r0.A00;
            voipActivityV2.A1N = false;
            voipActivityV2.A0w();
        }
    }

    public void onAnimationRepeat(Animator animator) {
        Log.i("VideoCallParticipantViewLayout/animatePiPView onAnimationRepeat");
    }

    public void onAnimationStart(Animator animator) {
        Log.i("VideoCallParticipantViewLayout/animatePiPView onAnimationStart");
        AnonymousClass3UE r0 = this.A00.A0F;
        if (r0 != null) {
            VoipActivityV2 voipActivityV2 = r0.A00;
            voipActivityV2.A1N = true;
            if (voipActivityV2.A11 != null) {
                voipActivityV2.A0n();
            }
        }
    }
}
