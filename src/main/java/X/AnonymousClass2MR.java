package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.whatsapp.doodle.TitleBarComponent;

/* renamed from: X.2MR  reason: invalid class name */
public class AnonymousClass2MR extends AnimatorListenerAdapter {
    public final /* synthetic */ TitleBarComponent A00;

    public AnonymousClass2MR(TitleBarComponent titleBarComponent) {
        this.A00 = titleBarComponent;
    }

    public void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        TitleBarComponent titleBarComponent = this.A00;
        titleBarComponent.A00.removeAllUpdateListeners();
        titleBarComponent.A00.removeAllListeners();
    }
}
