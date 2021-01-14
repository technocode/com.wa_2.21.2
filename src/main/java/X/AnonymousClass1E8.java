package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.TextView;

/* renamed from: X.1E8  reason: invalid class name */
public class AnonymousClass1E8 extends AnimatorListenerAdapter {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ TextView A02;
    public final /* synthetic */ TextView A03;
    public final /* synthetic */ AnonymousClass1E9 A04;

    public AnonymousClass1E8(AnonymousClass1E9 r1, int i, TextView textView, int i2, TextView textView2) {
        this.A04 = r1;
        this.A01 = i;
        this.A02 = textView;
        this.A00 = i2;
        this.A03 = textView2;
    }

    public void onAnimationEnd(Animator animator) {
        TextView textView;
        AnonymousClass1E9 r3 = this.A04;
        r3.A00 = this.A01;
        r3.A06 = null;
        TextView textView2 = this.A02;
        if (textView2 != null) {
            textView2.setVisibility(4);
            if (this.A00 == 1 && (textView = r3.A0A) != null) {
                textView.setText((CharSequence) null);
            }
        }
    }

    public void onAnimationStart(Animator animator) {
        TextView textView = this.A03;
        if (textView != null) {
            textView.setVisibility(0);
        }
    }
}
