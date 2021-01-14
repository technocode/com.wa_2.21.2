package X;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import androidx.core.view.inputmethod.EditorInfoCompat;
import com.facebook.redex.ViewOnClickEBaseShape3S0100000_I1_1;
import com.google.android.search.verification.client.R;
import com.whatsapp.StatusesFragment;

/* renamed from: X.1tp  reason: invalid class name and case insensitive filesystem */
public class C40781tp implements AbstractC27051Nt {
    public View A00;
    public View A01;
    public final /* synthetic */ StatusesFragment A02;

    public C40781tp(StatusesFragment statusesFragment) {
        this.A02 = statusesFragment;
    }

    public final void A00(boolean z, boolean z2) {
        int measuredHeight = this.A01.getMeasuredHeight();
        if (this.A01.getVisibility() != 0) {
            this.A01.measure(View.MeasureSpec.makeMeasureSpec(this.A00.getMeasuredWidth(), EditorInfoCompat.IME_FLAG_FORCE_ASCII), View.MeasureSpec.makeMeasureSpec(0, 0));
            measuredHeight = this.A01.getMeasuredHeight();
        }
        StatusesFragment statusesFragment = this.A02;
        ValueAnimator valueAnimator = statusesFragment.A01;
        if (valueAnimator == null || (!valueAnimator.isRunning() && !statusesFragment.A01.isStarted())) {
            int i = 8;
            float f = 100.0f;
            float f2 = 0.0f;
            if (z) {
                i = 0;
                f2 = 100.0f;
                f = 0.0f;
            }
            int i2 = 1;
            if (z2) {
                i2 = 500;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f2, f);
            statusesFragment.A01 = ofFloat;
            ofFloat.setDuration((long) i2);
            statusesFragment.A01.setInterpolator(new AccelerateDecelerateInterpolator());
            statusesFragment.A01.addUpdateListener(new C25991Jc(this, measuredHeight));
            statusesFragment.A01.addListener(new C27031Nr(this, z, i));
            if (z) {
                statusesFragment.A01.setStartDelay(700);
            }
            statusesFragment.A01.start();
        }
    }

    @Override // X.AbstractC27051Nt
    public View A9j(int i, View view, ViewGroup viewGroup, Context context) {
        if (view != null) {
            this.A00 = view;
            this.A01 = view.findViewById(R.id.status_sharing_row_view);
            return this.A00;
        }
        View inflate = LayoutInflater.from(context).inflate(R.layout.statuses_row_cross_post, viewGroup, false);
        this.A00 = inflate;
        this.A01 = inflate.findViewById(R.id.status_sharing_row_view);
        StatusesFragment statusesFragment = this.A02;
        statusesFragment.A08.A00 = new C39071qu(this);
        View view2 = this.A00;
        AnonymousClass01X r2 = statusesFragment.A0e;
        view2.setContentDescription(r2.A06(R.string.share_to_facebook_story));
        C002001d.A2w(r2, this.A00, R.string.share_to_facebook_story);
        this.A00.setOnClickListener(new ViewOnClickEBaseShape3S0100000_I1_1(this, 31));
        this.A00.findViewById(R.id.status_row_share_to_third_party_button).setOnClickListener(new ViewOnClickEBaseShape3S0100000_I1_1(this, 32));
        C09520d5 r0 = statusesFragment.A08.A03;
        A00(r0.A00, r0.A01);
        return this.A00;
    }
}
