package X;

import android.view.animation.Animation;
import android.widget.FrameLayout;
import com.whatsapp.contact.picker.PhoneContactsSelector;

/* renamed from: X.2Gd  reason: invalid class name and case insensitive filesystem */
public class animation.Animation$AnimationListenerC47022Gd implements Animation.AnimationListener {
    public int A00;
    public final /* synthetic */ PhoneContactsSelector A01;

    public void onAnimationRepeat(Animation animation) {
    }

    public void onAnimationStart(Animation animation) {
    }

    public animation.Animation$AnimationListenerC47022Gd(PhoneContactsSelector phoneContactsSelector, int i) {
        this.A01 = phoneContactsSelector;
        this.A00 = i;
    }

    public void onAnimationEnd(Animation animation) {
        PhoneContactsSelector phoneContactsSelector = this.A01;
        phoneContactsSelector.A03.clearAnimation();
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) phoneContactsSelector.A03.getLayoutParams();
        layoutParams.setMargins(layoutParams.leftMargin, this.A00, layoutParams.rightMargin, layoutParams.bottomMargin);
        phoneContactsSelector.A03.setLayoutParams(layoutParams);
    }
}
