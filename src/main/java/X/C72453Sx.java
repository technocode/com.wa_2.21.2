package X;

import android.view.animation.Animation;

/* renamed from: X.3Sx  reason: invalid class name and case insensitive filesystem */
public class C72453Sx extends AnonymousClass0YU {
    public final /* synthetic */ AnonymousClass374 A00;

    public C72453Sx(AnonymousClass374 r1) {
        this.A00 = r1;
    }

    @Override // X.AnonymousClass0YU
    public void onAnimationEnd(Animation animation) {
        AnonymousClass374 r1 = this.A00;
        r1.removeCallbacks(r1.A0Y);
        r1.A08 = false;
        r1.A0G.setVisibility(4);
    }
}
