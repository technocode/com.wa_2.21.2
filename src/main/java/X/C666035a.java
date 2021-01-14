package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.whatsapp.util.FloatingChildLayout;

/* renamed from: X.35a  reason: invalid class name and case insensitive filesystem */
public class C666035a extends AnimatorListenerAdapter {
    public final /* synthetic */ FloatingChildLayout A00;
    public final /* synthetic */ Runnable A01;
    public final /* synthetic */ boolean A02;

    public C666035a(FloatingChildLayout floatingChildLayout, boolean z, Runnable runnable) {
        this.A00 = floatingChildLayout;
        this.A02 = z;
        this.A01 = runnable;
    }

    public void onAnimationEnd(Animator animator) {
        FloatingChildLayout floatingChildLayout = this.A00;
        floatingChildLayout.A07.setLayerType(0, null);
        boolean z = this.A02;
        int i = floatingChildLayout.A03;
        if (z) {
            if (i == 3) {
                floatingChildLayout.A03 = 4;
                Runnable runnable = this.A01;
                if (runnable != null) {
                    runnable.run();
                }
            }
        } else if (i == 1) {
            floatingChildLayout.A03 = 2;
            Runnable runnable2 = this.A01;
            if (runnable2 != null) {
                runnable2.run();
            }
        }
    }
}
