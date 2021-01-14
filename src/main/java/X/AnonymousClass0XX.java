package X;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.util.Pair;
import android.view.View;
import com.google.android.search.verification.client.R;
import com.whatsapp.HomeActivity;

/* renamed from: X.0XX  reason: invalid class name */
public class AnonymousClass0XX implements View.OnLayoutChangeListener {
    public final /* synthetic */ HomeActivity A00;

    public AnonymousClass0XX(HomeActivity homeActivity) {
        this.A00 = homeActivity;
    }

    public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        HomeActivity homeActivity = this.A00;
        int dimensionPixelSize = homeActivity.getResources().getDimensionPixelSize(R.dimen.tab_height) + homeActivity.A0T();
        if (homeActivity.A05 == null) {
            int i9 = i4 - dimensionPixelSize;
            int i10 = i4 - i2;
            Pair A06 = HomeActivity.A06(HomeActivity.A1w, Math.abs(i3 - i), i10, i10);
            Animator A0V = homeActivity.A0V(i9);
            Animator A0W = homeActivity.A0W(homeActivity.A09.getHeight(), i4, true);
            AnimatorSet animatorSet = new AnimatorSet();
            homeActivity.A05 = animatorSet;
            animatorSet.setStartDelay((long) ((Number) A06.second).intValue());
            homeActivity.A05.setDuration((long) ((Number) A06.first).intValue());
            homeActivity.A05.setInterpolator(homeActivity.A0Y);
            homeActivity.A05.playTogether(A0W, A0V);
            homeActivity.A05.addListener(new AnonymousClass1M6(this));
            homeActivity.A05.start();
        }
    }
}
