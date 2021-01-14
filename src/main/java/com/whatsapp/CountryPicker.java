package com.whatsapp;

import X.ActivityC03630Ha;
import X.AnonymousClass008;
import X.AnonymousClass01X;
import X.AnonymousClass0CO;
import X.AnonymousClass0YP;
import X.AnonymousClass1LH;
import X.AnonymousClass1LI;
import X.AnonymousClass1LJ;
import X.AnonymousClass2C0;
import X.C002001d;
import X.C004302a;
import X.C03190Fd;
import X.C06470Tj;
import X.C39871sF;
import X.C39881sG;
import X.C39891sH;
import android.animation.Animator;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
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
import com.facebook.redex.ViewOnClickEBaseShape2S0100000_I1_0;
import com.google.android.search.verification.client.R;
import com.whatsapp.util.Log;

public class CountryPicker extends ActivityC03630Ha {
    public static final int A06;
    public static final int A07;
    public static final String A08;
    public static final String A09;
    public View A00;
    public SearchView A01;
    public Toolbar A02;
    public AnonymousClass1LJ A03;
    public final AnonymousClass0CO A04 = AnonymousClass0CO.A00();
    public final C03190Fd A05 = C03190Fd.A00();

    static {
        StringBuilder sb = new StringBuilder();
        String name = CountryPicker.class.getName();
        sb.append(name);
        sb.append(".EXTRA_COUNTRY_ISO");
        A09 = sb.toString();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(name);
        sb2.append(".EXTRA_COUNTRY_DISPLAY_NAME");
        A08 = sb2.toString();
        int i = Build.VERSION.SDK_INT;
        int i2 = 250;
        int i3 = 220;
        if (i >= 21) {
            i3 = 250;
        }
        A06 = i3;
        if (i < 21) {
            i2 = 220;
        }
        A07 = i2;
    }

    public final void A0V() {
        int width;
        if (A0W()) {
            this.A01.A0E("");
            AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
            long j = (long) A07;
            alphaAnimation.setDuration(j);
            this.A02.startAnimation(alphaAnimation);
            if (Build.VERSION.SDK_INT >= 21) {
                int width2 = (this.A00.getWidth() - getResources().getDimensionPixelSize(R.dimen.abc_action_button_min_width_overflow_material)) - ((getResources().getDimensionPixelSize(R.dimen.abc_action_button_min_width_material) * 3) >> 1);
                View view = this.A00;
                if (((AnonymousClass2C0) this).A01.A0M()) {
                    width = width2;
                } else {
                    width = this.A00.getWidth() - width2;
                }
                Animator createCircularReveal = ViewAnimationUtils.createCircularReveal(view, width, this.A00.getHeight() >> 1, (float) width2, 0.0f);
                createCircularReveal.setDuration(j);
                createCircularReveal.addListener(new AnonymousClass1LI(this));
                createCircularReveal.start();
                return;
            }
            AlphaAnimation alphaAnimation2 = new AlphaAnimation(1.0f, 0.0f);
            TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, 0.0f, (float) (-this.A00.getHeight()));
            AnimationSet animationSet = new AnimationSet(true);
            animationSet.addAnimation(alphaAnimation2);
            animationSet.addAnimation(translateAnimation);
            animationSet.setDuration(j);
            animationSet.setAnimationListener(new C39891sH(this));
            this.A00.startAnimation(animationSet);
        }
    }

    public final boolean A0W() {
        StringBuilder A0S = AnonymousClass008.A0S("Visible");
        boolean z = false;
        if (this.A00.getVisibility() == 0) {
            z = true;
        }
        AnonymousClass008.A1a(A0S, z);
        if (this.A00.getVisibility() != 0) {
            return false;
        }
        return true;
    }

    @Override // X.ActivityC004702f
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        try {
            return super.dispatchTouchEvent(motionEvent);
        } catch (IllegalArgumentException unused) {
            return false;
        }
    }

    public /* synthetic */ void lambda$initSearchView$945$CountryPicker(View view) {
        A0V();
    }

    @Override // X.ActivityC004702f, X.AnonymousClass02i
    public void onBackPressed() {
        if (A0W()) {
            A0V();
        } else {
            super.onBackPressed();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00da, code lost:
        if (r0 == false) goto L_0x00dc;
     */
    @Override // X.AnonymousClass2C0, X.ActivityC004602e, X.ActivityC004802g, X.ActivityC004702f, X.AnonymousClass02i, X.ActivityC004902h, X.ActivityC005002j
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r18) {
        /*
        // Method dump skipped, instructions count: 406
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.CountryPicker.onCreate(android.os.Bundle):void");
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        Drawable A032 = C004302a.A03(this, R.drawable.ic_action_search_teal);
        if (A032 != null) {
            menu.add(0, R.id.menuitem_search, 0, ((AnonymousClass2C0) this).A01.A06(R.string.search)).setIcon(C002001d.A0e(A032, C004302a.A00(this, R.color.reg_toolbar_icon_color))).setShowAsAction(2);
            return true;
        }
        throw null;
    }

    @Override // X.ActivityC004702f
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        int width;
        StringBuilder A0S = AnonymousClass008.A0S("item.getItemId()");
        A0S.append(menuItem.getItemId());
        boolean z = false;
        if (menuItem.getItemId() == R.id.menuitem_search) {
            z = true;
        }
        A0S.append(z);
        Log.i(A0S.toString());
        int itemId = menuItem.getItemId();
        if (itemId == 16908332) {
            super.onBackPressed();
        } else if (itemId == R.id.menuitem_search) {
            if (!A0W()) {
                if (this.A01 == null) {
                    AnonymousClass0YP.A00(this.A00);
                    getLayoutInflater().inflate(R.layout.home_search_view_layout, (ViewGroup) this.A00, true);
                    SearchView searchView = (SearchView) this.A00.findViewById(R.id.search_view);
                    this.A01 = searchView;
                    TextView textView = (TextView) searchView.findViewById(R.id.search_src_text);
                    textView.setTextColor(C004302a.A00(this, R.color.body_gray));
                    textView.setHintTextColor(C004302a.A00(this, R.color.body_light_gray));
                    this.A01.setIconifiedByDefault(false);
                    SearchView searchView2 = this.A01;
                    AnonymousClass01X r5 = ((AnonymousClass2C0) this).A01;
                    searchView2.setQueryHint(r5.A06(R.string.search_country_hint));
                    SearchView searchView3 = this.A01;
                    searchView3.A0B = new C39871sF(this);
                    ((ImageView) searchView3.findViewById(R.id.search_mag_icon)).setImageDrawable(new AnonymousClass1LH(C004302a.A03(this, R.drawable.ic_back_teal)));
                    ImageView imageView = (ImageView) this.A01.findViewById(R.id.search_close_btn);
                    if (imageView != null) {
                        imageView.setImageResource(R.drawable.ic_backup_cancel);
                    }
                    ImageView imageView2 = (ImageView) this.A00.findViewById(R.id.search_back);
                    imageView2.setImageDrawable(new C06470Tj(r5, C004302a.A03(this, R.drawable.ic_back_teal)));
                    imageView2.setOnClickListener(new ViewOnClickEBaseShape2S0100000_I1_0(this, 18));
                    this.A01.setMaxWidth(Integer.MAX_VALUE);
                }
                this.A02.setVisibility(8);
                this.A00.setVisibility(0);
                AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
                alphaAnimation.setDuration((long) A07);
                alphaAnimation.setAnimationListener(new C39881sG(this));
                this.A02.startAnimation(alphaAnimation);
                if (Build.VERSION.SDK_INT < 21) {
                    TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, (float) (-this.A02.getHeight()), 0.0f);
                    translateAnimation.setDuration((long) A06);
                    this.A00.clearAnimation();
                    this.A00.startAnimation(translateAnimation);
                    return true;
                } else if (this.A00.isAttachedToWindow()) {
                    int width2 = (this.A02.getWidth() - getResources().getDimensionPixelSize(R.dimen.abc_action_button_min_width_overflow_material)) - ((getResources().getDimensionPixelSize(R.dimen.abc_action_button_min_width_material) * 3) >> 1);
                    View view = this.A00;
                    if (((AnonymousClass2C0) this).A01.A0M()) {
                        width = width2;
                    } else {
                        width = this.A02.getWidth() - width2;
                    }
                    Animator createCircularReveal = ViewAnimationUtils.createCircularReveal(view, width, this.A02.getHeight() >> 1, 0.0f, (float) width2);
                    createCircularReveal.setDuration((long) A06);
                    createCircularReveal.start();
                    Log.i("Detach");
                }
            }
            return true;
        }
        return false;
    }
}
