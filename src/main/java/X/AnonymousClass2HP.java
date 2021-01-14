package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.FrameLayout;
import com.whatsapp.MentionPickerView;

/* renamed from: X.2HP  reason: invalid class name */
public class AnonymousClass2HP extends AnimatorListenerAdapter {
    public final /* synthetic */ int A00;
    public final /* synthetic */ AnonymousClass2ZA A01;

    public AnonymousClass2HP(AnonymousClass2ZA r1, int i) {
        this.A01 = r1;
        this.A00 = i;
    }

    public void onAnimationEnd(Animator animator) {
        AnonymousClass2ZA r2 = this.A01;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) r2.getLayoutParams();
        int i = this.A00;
        layoutParams.height = i;
        r2.setLayoutParams(layoutParams);
        if (i == 0) {
            r2.setVisibility(8);
            AnonymousClass1MU r0 = ((MentionPickerView) r2).A01;
            if (r0 != null) {
                r0.ADw(false);
            }
        }
    }

    public void onAnimationStart(Animator animator) {
        AnonymousClass2ZA r2 = this.A01;
        if (r2.getVisibility() != 0) {
            r2.A00();
            r2.setVisibility(0);
            AnonymousClass1MU r0 = ((MentionPickerView) r2).A01;
            if (r0 != null) {
                r0.ADw(true);
            }
        }
    }
}
