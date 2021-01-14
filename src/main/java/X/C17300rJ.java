package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import com.google.android.search.verification.client.R;

/* renamed from: X.0rJ  reason: invalid class name and case insensitive filesystem */
public class C17300rJ extends AnimatorListenerAdapter {
    public float A00;
    public float A01;
    public int[] A02;
    public final float A03;
    public final float A04;
    public final int A05;
    public final int A06;
    public final View A07;
    public final View A08;

    public C17300rJ(View view, View view2, int i, int i2, float f, float f2) {
        this.A07 = view;
        this.A08 = view2;
        this.A05 = i - Math.round(view.getTranslationX());
        this.A06 = i2 - Math.round(this.A07.getTranslationY());
        this.A03 = f;
        this.A04 = f2;
        int[] iArr = (int[]) this.A08.getTag(R.id.transition_position);
        this.A02 = iArr;
        if (iArr != null) {
            this.A08.setTag(R.id.transition_position, null);
        }
    }

    public void onAnimationCancel(Animator animator) {
        int[] iArr = this.A02;
        if (iArr == null) {
            iArr = new int[2];
            this.A02 = iArr;
        }
        float f = (float) this.A05;
        View view = this.A07;
        iArr[0] = Math.round(view.getTranslationX() + f);
        this.A02[1] = Math.round(view.getTranslationY() + ((float) this.A06));
        this.A08.setTag(R.id.transition_position, this.A02);
    }

    public void onAnimationEnd(Animator animator) {
        View view = this.A07;
        view.setTranslationX(this.A03);
        view.setTranslationY(this.A04);
    }

    public void onAnimationPause(Animator animator) {
        View view = this.A07;
        this.A00 = view.getTranslationX();
        this.A01 = view.getTranslationY();
        view.setTranslationX(this.A03);
        view.setTranslationY(this.A04);
    }

    public void onAnimationResume(Animator animator) {
        View view = this.A07;
        view.setTranslationX(this.A00);
        view.setTranslationY(this.A01);
    }
}
