package com.whatsapp.usernotice;

import X.AbstractC15110nW;
import X.AnonymousClass02M;
import X.AnonymousClass0HE;
import X.AnonymousClass0HG;
import X.AnonymousClass350;
import X.AnonymousClass351;
import X.AnonymousClass3S0;
import X.AnonymousClass3S2;
import X.AnonymousClass3S4;
import X.C002301g;
import X.C05710Pt;
import X.C05720Pu;
import X.C09070cF;
import X.C28051Sr;
import X.C665734x;
import X.C72213Rz;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.search.verification.client.R;
import com.whatsapp.RoundedBottomSheetDialogFragment;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.util.ViewOnClickCListenerShape14S0100000_I1_3;

public class UserNoticeBottomSheetDialogFragment extends RoundedBottomSheetDialogFragment {
    public int A00;
    public ValueAnimator A01;
    public View A02;
    public View A03;
    public ImageView A04;
    public LinearLayout A05;
    public TextView A06;
    public TextView A07;
    public NestedScrollView A08;
    public AnonymousClass3S4 A09;
    public UserNoticeModalIconView A0A;
    public Runnable A0B;
    public final View.OnClickListener A0C = new ViewOnClickCListenerShape14S0100000_I1_3(this, 17);
    public final AbstractC15110nW A0D = new C72213Rz(this);
    public final AnonymousClass02M A0E = AnonymousClass02M.A00();
    public final AnonymousClass3S0 A0F = new AnonymousClass3S0(this);
    public final C09070cF A0G = C09070cF.A00();
    public final AnonymousClass0HG A0H = AnonymousClass0HG.A00();
    public final AnonymousClass0HE A0I = AnonymousClass0HE.A00();

    @Override // X.AnonymousClass037, androidx.fragment.app.DialogFragment
    public void A0X() {
        super.A0X();
        this.A08.A0E = null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r13v1, resolved type: android.view.LayoutInflater */
    /* JADX DEBUG: Multi-variable search result rejected for r9v1, resolved type: android.text.SpannableString */
    /* JADX DEBUG: Multi-variable search result rejected for r8v4, resolved type: android.text.SpannableString */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARNING: Unknown variable types count: 1 */
    @Override // X.AnonymousClass037
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View A0Z(android.view.LayoutInflater r20, android.view.ViewGroup r21, android.os.Bundle r22) {
        /*
        // Method dump skipped, instructions count: 854
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.usernotice.UserNoticeBottomSheetDialogFragment.A0Z(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }

    @Override // com.whatsapp.RoundedBottomSheetDialogFragment
    public void A0y(View view) {
        super.A0y(view);
        BottomSheetBehavior A002 = BottomSheetBehavior.A00(view);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        int i = Resources.getSystem().getDisplayMetrics().heightPixels;
        if (C002301g.A0K != null) {
            layoutParams.height = i - C002301g.A00(view.getContext());
            view.setLayoutParams(layoutParams);
            A002.A0E = new AnonymousClass3S2(A002);
            A002.A0D(3);
            return;
        }
        throw null;
    }

    public final void A0z() {
        int i = 0;
        boolean z = false;
        if (((float) this.A08.getScrollY()) > this.A07.getY() - ((float) this.A00)) {
            z = true;
        }
        TextView textView = this.A07;
        int i2 = 0;
        if (z) {
            i2 = 4;
        }
        textView.setVisibility(i2);
        TextView textView2 = this.A06;
        if (!z) {
            i = 8;
        }
        textView2.setVisibility(i);
    }

    public final void A10(TextEmojiLabel textEmojiLabel, String str) {
        if (TextUtils.isEmpty(str)) {
            textEmojiLabel.setVisibility(8);
            return;
        }
        textEmojiLabel.setMovementMethod(new C05710Pt());
        textEmojiLabel.setAccessibilityHelper(new C05720Pu(textEmojiLabel));
        Context A012 = A01();
        if (str != null) {
            textEmojiLabel.setText(C28051Sr.A0Q(A012, str, false, this.A0F));
            return;
        }
        throw null;
    }

    public final void A11(boolean z, boolean z2) {
        long j;
        ValueAnimator valueAnimator = this.A01;
        if (valueAnimator == null) {
            ValueAnimator valueAnimator2 = new ValueAnimator();
            this.A01 = valueAnimator2;
            valueAnimator2.setInterpolator(new AccelerateDecelerateInterpolator());
            this.A01.addUpdateListener(new C665734x(this));
        } else {
            valueAnimator.cancel();
            this.A01.removeAllListeners();
        }
        this.A01.addListener(new AnonymousClass350(this, z));
        float alpha = this.A03.getAlpha();
        float f = 0.0f;
        if (z) {
            f = 1.0f;
        }
        this.A01.setFloatValues(alpha, f);
        ValueAnimator valueAnimator3 = this.A01;
        if (z2) {
            j = 400;
        } else {
            j = 0;
        }
        valueAnimator3.setDuration(j);
        this.A01.start();
    }

    @Override // X.AnonymousClass037
    public void onConfigurationChanged(Configuration configuration) {
        this.A0U = true;
        View findViewById = A0o().findViewById(R.id.design_bottom_sheet);
        if (findViewById != null) {
            A0y(findViewById);
            int dimensionPixelSize = A02().getDimensionPixelSize(R.dimen.user_notice_modal_default_icon_size);
            ImageView imageView = this.A04;
            ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.width = dimensionPixelSize;
                layoutParams.height = dimensionPixelSize;
                imageView.setLayoutParams(layoutParams);
            }
            int dimensionPixelSize2 = A02().getDimensionPixelSize(R.dimen.user_notice_modal_server_icon_size);
            UserNoticeModalIconView userNoticeModalIconView = this.A0A;
            ViewGroup.LayoutParams layoutParams2 = userNoticeModalIconView.getLayoutParams();
            if (layoutParams2 != null) {
                layoutParams2.width = dimensionPixelSize2;
                layoutParams2.height = dimensionPixelSize2;
                userNoticeModalIconView.setLayoutParams(layoutParams2);
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.A05.getLayoutParams();
            int dimensionPixelSize3 = A02().getDimensionPixelSize(R.dimen.user_notice_modal_bullets_horizontal_margin);
            marginLayoutParams.leftMargin = dimensionPixelSize3;
            marginLayoutParams.rightMargin = dimensionPixelSize3;
            this.A05.setLayoutParams(marginLayoutParams);
            int dimensionPixelSize4 = A02().getDimensionPixelSize(R.dimen.user_notice_modal_horizontal_padding);
            NestedScrollView nestedScrollView = this.A08;
            nestedScrollView.setPadding(dimensionPixelSize4, nestedScrollView.getPaddingTop(), dimensionPixelSize4, this.A08.getPaddingBottom());
            TextView textView = this.A06;
            textView.setPadding(dimensionPixelSize4, textView.getPaddingTop(), dimensionPixelSize4, this.A06.getPaddingBottom());
            this.A08.getViewTreeObserver().addOnGlobalLayoutListener(new AnonymousClass351(this));
            return;
        }
        throw null;
    }
}
