package X;

import android.animation.Animator;
import android.app.Activity;
import android.graphics.drawable.NinePatchDrawable;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewAnimationUtils;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.AnimationSet;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.SearchView;
import androidx.appcompat.widget.Toolbar;
import com.facebook.redex.ViewOnClickEBaseShape0S0100000_I0_0;
import com.google.android.search.verification.client.R;

/* renamed from: X.0YP  reason: invalid class name */
public class AnonymousClass0YP {
    public static final int A07;
    public static final int A08;
    public int A00;
    public SearchView A01;
    public final Activity A02;
    public final View A03;
    public final AnonymousClass0YR A04;
    public final Toolbar A05;
    public final AnonymousClass01X A06;

    static {
        int i = Build.VERSION.SDK_INT;
        int i2 = 250;
        int i3 = 220;
        if (i >= 21) {
            i3 = 250;
        }
        A07 = i3;
        if (i < 21) {
            i2 = 220;
        }
        A08 = i2;
    }

    public AnonymousClass0YP(Activity activity, AnonymousClass01X r2, View view, Toolbar toolbar, AnonymousClass0YR r5) {
        this.A02 = activity;
        this.A06 = r2;
        this.A03 = view;
        this.A05 = toolbar;
        this.A04 = r5;
    }

    public static void A00(View view) {
        view.setBackgroundResource(R.drawable.search_background);
        if (Build.VERSION.SDK_INT < 21 && (view.getBackground() instanceof NinePatchDrawable)) {
            C002001d.A0e(view.getBackground(), C004302a.A00(view.getContext(), R.color.searchBackgroundLegacyTint));
        }
    }

    public void A01() {
        int width;
        int i;
        if (!A05()) {
            if (this.A01 == null) {
                View view = this.A03;
                A00(view);
                Activity activity = this.A02;
                activity.getLayoutInflater().inflate(R.layout.home_search_view_layout, (ViewGroup) view, true);
                SearchView searchView = (SearchView) view.findViewById(R.id.search_view);
                this.A01 = searchView;
                ((TextView) searchView.findViewById(R.id.search_src_text)).setTextColor(C004302a.A00(activity, R.color.search_text_color));
                this.A01.setIconifiedByDefault(false);
                SearchView searchView2 = this.A01;
                AnonymousClass01X r5 = this.A06;
                searchView2.setQueryHint(r5.A06(R.string.search_hint));
                SearchView searchView3 = this.A01;
                searchView3.A0B = this.A04;
                ((ImageView) searchView3.findViewById(R.id.search_mag_icon)).setImageDrawable(new AnonymousClass1NT(C004302a.A03(activity, R.drawable.ic_back_teal)));
                ImageView imageView = (ImageView) view.findViewById(R.id.search_back);
                imageView.setImageDrawable(new C06470Tj(r5, C004302a.A03(activity, R.drawable.ic_back_teal)));
                imageView.setOnClickListener(new ViewOnClickEBaseShape0S0100000_I0_0(this, 26));
            }
            View view2 = this.A03;
            view2.setVisibility(0);
            if (Build.VERSION.SDK_INT < 21) {
                AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
                alphaAnimation.setDuration((long) A07);
                alphaAnimation.setAnimationListener(new C40541tR(this));
                view2.clearAnimation();
                view2.startAnimation(alphaAnimation);
                AlphaAnimation alphaAnimation2 = new AlphaAnimation(1.0f, 0.0f);
                Toolbar toolbar = this.A05;
                TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, 0.0f, (float) ((-toolbar.getHeight()) >> 3));
                AnimationSet animationSet = new AnimationSet(true);
                animationSet.addAnimation(alphaAnimation2);
                animationSet.addAnimation(translateAnimation);
                animationSet.setDuration((long) A08);
                toolbar.startAnimation(animationSet);
                toolbar.setVisibility(4);
            } else if (view2.isAttachedToWindow()) {
                View findViewById = this.A05.findViewById(R.id.menuitem_search);
                if (findViewById != null) {
                    int[] iArr = new int[2];
                    findViewById.getLocationInWindow(iArr);
                    if (this.A06.A0M()) {
                        width = (view2.getWidth() - iArr[0]) - (findViewById.getWidth() / 2);
                    } else {
                        width = (findViewById.getWidth() / 2) + iArr[0];
                    }
                    this.A00 = width;
                } else {
                    width = view2.getWidth() / 2;
                    this.A00 = width;
                }
                int max = Math.max(width, view2.getWidth() - this.A00);
                if (this.A06.A0M()) {
                    i = view2.getWidth() - this.A00;
                } else {
                    i = this.A00;
                }
                Animator createCircularReveal = ViewAnimationUtils.createCircularReveal(view2, i, view2.getHeight() / 2, 0.0f, (float) max);
                createCircularReveal.setDuration((long) A07);
                createCircularReveal.addListener(new AnonymousClass1NR(this));
                createCircularReveal.start();
            }
            if (Build.VERSION.SDK_INT >= 21) {
                Activity activity2 = this.A02;
                activity2.getWindow().setStatusBarColor(C004302a.A00(activity2, R.color.black_alpha_54));
            }
        }
    }

    public void A02(Bundle bundle) {
        CharSequence charSequence;
        if (bundle != null && (charSequence = bundle.getCharSequence("search_text")) != null) {
            A01();
            this.A00 = bundle.getInt("search_button_x_pos");
            this.A01.A0E(charSequence);
        }
    }

    public void A03(Bundle bundle) {
        if (this.A01 != null && A05()) {
            bundle.putCharSequence("search_text", this.A01.A0k.getText());
            bundle.putInt("search_button_x_pos", this.A00);
        }
    }

    public void A04(boolean z) {
        int i;
        if (A05()) {
            this.A01.A0E("");
            Toolbar toolbar = this.A05;
            toolbar.setVisibility(0);
            if (!z) {
                SearchView searchView = this.A01;
                if (1 != 0) {
                    searchView.A05();
                } else {
                    searchView.A0G(false);
                    SearchView.SearchAutoComplete searchAutoComplete = searchView.A0k;
                    searchAutoComplete.requestFocus();
                    searchAutoComplete.setImeVisibility(true);
                    View.OnClickListener onClickListener = searchView.A07;
                    if (onClickListener != null) {
                        onClickListener.onClick(searchView);
                    }
                }
                this.A03.setVisibility(4);
            } else if (Build.VERSION.SDK_INT >= 21) {
                int i2 = this.A00;
                View view = this.A03;
                int width = view.getWidth();
                int i3 = this.A00;
                int max = Math.max(i2, width - i3);
                if (i3 == 0) {
                    this.A00 = view.getWidth() >> 1;
                }
                if (this.A06.A0M()) {
                    i = view.getWidth() - this.A00;
                } else {
                    i = this.A00;
                }
                Animator createCircularReveal = ViewAnimationUtils.createCircularReveal(view, i, view.getHeight() >> 1, (float) max, 0.0f);
                createCircularReveal.setDuration((long) A08);
                createCircularReveal.addListener(new AnonymousClass1NS(this));
                createCircularReveal.start();
            } else {
                AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
                long j = (long) A08;
                alphaAnimation.setDuration(j);
                alphaAnimation.setAnimationListener(new C40551tS(this));
                this.A03.startAnimation(alphaAnimation);
                AlphaAnimation alphaAnimation2 = new AlphaAnimation(0.0f, 1.0f);
                TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, (float) ((-toolbar.getHeight()) / 4), 0.0f);
                AnimationSet animationSet = new AnimationSet(true);
                animationSet.addAnimation(alphaAnimation2);
                animationSet.addAnimation(translateAnimation);
                animationSet.setDuration(j);
                toolbar.startAnimation(animationSet);
            }
            if (Build.VERSION.SDK_INT >= 21) {
                Activity activity = this.A02;
                activity.getWindow().setStatusBarColor(C004302a.A00(activity, R.color.primary_dark));
            }
        }
    }

    public boolean A05() {
        return this.A03.getVisibility() == 0;
    }
}
