package X;

import android.view.MotionEvent;
import android.view.View;
import android.view.animation.AlphaAnimation;
import com.whatsapp.voipcalling.VoipActivityV2;

/* renamed from: X.38J  reason: invalid class name */
public final /* synthetic */ class AnonymousClass38J implements View.OnTouchListener {
    public final /* synthetic */ View A00;
    public final /* synthetic */ View A01;
    public final /* synthetic */ VoipActivityV2 A02;

    public /* synthetic */ AnonymousClass38J(VoipActivityV2 voipActivityV2, View view, View view2) {
        this.A02 = voipActivityV2;
        this.A00 = view;
        this.A01 = view2;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        VoipActivityV2 voipActivityV2 = this.A02;
        View view2 = this.A00;
        View view3 = this.A01;
        int action = motionEvent.getAction();
        if (action != 0 && action != 5) {
            return false;
        }
        voipActivityV2.A0e.setVisibility(0);
        voipActivityV2.showView(view2);
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
        alphaAnimation.setDuration(1000);
        alphaAnimation.setStartOffset(1000);
        alphaAnimation.setFillAfter(true);
        alphaAnimation.setAnimationListener(new AnonymousClass3UI(voipActivityV2, view3, view2));
        voipActivityV2.A0e.startAnimation(alphaAnimation);
        return false;
    }
}
