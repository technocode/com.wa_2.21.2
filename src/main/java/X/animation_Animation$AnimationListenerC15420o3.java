package X;

import android.view.ViewGroup;
import android.view.animation.Animation;

/* renamed from: X.0o3  reason: invalid class name and case insensitive filesystem */
public final class animation.Animation$AnimationListenerC15420o3 implements Animation.AnimationListener {
    public final /* synthetic */ ViewGroup A00;
    public final /* synthetic */ C04080Iy A01;
    public final /* synthetic */ AnonymousClass037 A02;
    public final /* synthetic */ AnonymousClass0SW A03;

    public void onAnimationRepeat(Animation animation) {
    }

    public void onAnimationStart(Animation animation) {
    }

    public animation.Animation$AnimationListenerC15420o3(ViewGroup viewGroup, AnonymousClass037 r2, AnonymousClass0SW r3, C04080Iy r4) {
        this.A00 = viewGroup;
        this.A02 = r2;
        this.A03 = r3;
        this.A01 = r4;
    }

    public void onAnimationEnd(Animation animation) {
        this.A00.post(new RunnableEBaseShape5S0100000_I1_0(this, 13));
    }
}
