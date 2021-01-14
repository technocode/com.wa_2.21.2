package X;

import android.animation.Animator;
import android.os.Build;
import android.view.ViewAnimationUtils;
import android.view.ViewTreeObserver;
import android.view.animation.AnimationSet;
import com.whatsapp.components.CircularRevealView;

/* renamed from: X.2HC  reason: invalid class name */
public class AnonymousClass2HC implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ AnonymousClass2HD A01;
    public final /* synthetic */ boolean A02;

    public AnonymousClass2HC(AnonymousClass2HD r1, boolean z, int i) {
        this.A01 = r1;
        this.A02 = z;
        this.A00 = i;
    }

    public void onGlobalLayout() {
        boolean z;
        AnonymousClass2HD r6 = this.A01;
        CircularRevealView circularRevealView = r6.A0C;
        circularRevealView.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        r6.A05();
        int i = Build.VERSION.SDK_INT;
        if (i < 18 && ((z = this.A02) || r6.A05)) {
            int[] iArr = new int[2];
            r6.A07.getLocationOnScreen(iArr);
            AnimationSet A002 = AnonymousClass2HD.A00(r6.A00 + iArr[0], z, true);
            A002.setDuration((long) this.A00);
            circularRevealView.A00();
            circularRevealView.setBackgroundColor(0);
            A002.setDuration((long) circularRevealView.A04);
            A002.setAnimationListener(circularRevealView.A09);
            circularRevealView.startAnimation(A002);
        } else if (i < 21) {
            circularRevealView.A00();
            circularRevealView.setWillNotDraw(false);
            circularRevealView.setBackgroundColor(0);
            C46872Fi r2 = new C46872Fi(circularRevealView, false);
            circularRevealView.A0A = r2;
            r2.setDuration((long) circularRevealView.A04);
            circularRevealView.A0A.setAnimationListener(circularRevealView.A09);
            circularRevealView.startAnimation(circularRevealView.A0A);
        } else {
            circularRevealView.setVisibility(0);
            Animator createCircularReveal = ViewAnimationUtils.createCircularReveal(circularRevealView, circularRevealView.A01, circularRevealView.A02, 0.0f, (float) Math.max(circularRevealView.getWidth(), circularRevealView.getHeight()));
            createCircularReveal.setDuration((long) circularRevealView.A04);
            createCircularReveal.addListener(circularRevealView.A05);
            createCircularReveal.start();
        }
    }
}
