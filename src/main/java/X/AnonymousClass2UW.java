package X;

import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import com.whatsapp.mediaview.MediaViewBaseFragment;

/* renamed from: X.2UW  reason: invalid class name */
public class AnonymousClass2UW implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ int A03;
    public final /* synthetic */ View A04;
    public final /* synthetic */ AnonymousClass2US A05;
    public final /* synthetic */ C57662kf A06;

    public AnonymousClass2UW(C57662kf r1, View view, int i, int i2, int i3, int i4, AnonymousClass2US r7) {
        this.A06 = r1;
        this.A04 = view;
        this.A01 = i;
        this.A02 = i2;
        this.A03 = i3;
        this.A00 = i4;
        this.A05 = r7;
    }

    public boolean onPreDraw() {
        View view = this.A04;
        view.getViewTreeObserver().removeOnPreDrawListener(this);
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        C57662kf r2 = this.A06;
        r2.A02 = this.A01 - iArr[0];
        r2.A04 = this.A02 - iArr[1];
        float f = (float) this.A03;
        r2.A01 = f / ((float) view.getWidth());
        float f2 = (float) this.A00;
        float height = f2 / ((float) view.getHeight());
        r2.A00 = height;
        float f3 = r2.A01;
        if (f3 < height) {
            r2.A01 = height;
            r2.A02 = (int) (((float) r2.A02) - (((((float) view.getWidth()) * r2.A01) - f) / 2.0f));
        } else {
            r2.A00 = f3;
            r2.A04 = (int) (((float) r2.A04) - (((((float) view.getHeight()) * r2.A00) - f2) / 2.0f));
        }
        AnonymousClass2US r5 = this.A05;
        MediaViewBaseFragment mediaViewBaseFragment = r2.A06;
        r2.A03 = mediaViewBaseFragment.A02().getConfiguration().orientation;
        ObjectAnimator ofInt = ObjectAnimator.ofInt(r2.A05, "alpha", 0, 255);
        ofInt.setDuration(220L);
        ofInt.setInterpolator(new AccelerateInterpolator());
        ofInt.start();
        C60632pq r10 = mediaViewBaseFragment.A09;
        r10.setPivotX(0.0f);
        r10.setPivotY(0.0f);
        r10.setScaleX(r2.A01);
        r10.setScaleY(r2.A00);
        r10.setTranslationX((float) r2.A02);
        r10.setTranslationY((float) r2.A04);
        View findViewWithTag = mediaViewBaseFragment.A09.findViewWithTag(mediaViewBaseFragment.A0p());
        if (findViewWithTag != null) {
            findViewWithTag.setAlpha(0.0f);
            findViewWithTag.animate().setDuration(110).alpha(1.0f).setInterpolator(new DecelerateInterpolator(2.0f));
        }
        r10.animate().setDuration(220).scaleX(1.0f).scaleY(1.0f).translationX(0.0f).translationY(0.0f).setListener(new AnonymousClass2UY(r2, r5));
        return true;
    }
}
