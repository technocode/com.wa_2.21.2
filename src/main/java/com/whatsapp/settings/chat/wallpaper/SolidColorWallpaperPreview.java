package com.whatsapp.settings.chat.wallpaper;

import X.AbstractC000400g;
import X.ActivityC004702f;
import X.AnonymousClass0TX;
import X.AnonymousClass1PO;
import X.AnonymousClass1VY;
import X.AnonymousClass31J;
import X.AnonymousClass31S;
import X.AnonymousClass31T;
import X.C000300f;
import X.C002801l;
import X.C004302a;
import X.C08420b5;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.Pair;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.CheckBox;
import com.facebook.redex.ViewOnClickEBaseShape8S0100000_I1_6;
import com.google.android.search.verification.client.R;
import com.whatsapp.collections.MarginCorrectedViewPager;

public class SolidColorWallpaperPreview extends AnonymousClass1PO {
    public float A00;
    public float A01;
    public int A02;
    public int A03;
    public View A04;
    public View A05;
    public View A06;
    public View A07;
    public CheckBox A08;
    public MarginCorrectedViewPager A09;
    public boolean A0A = false;
    public boolean A0B = false;
    public int[] A0C;
    public int[] A0D;

    public final void A0V(int i) {
        int i2;
        int i3;
        if (this.A0A) {
            this.A0B = true;
            this.A09.setScrollEnabled(false);
            DecelerateInterpolator decelerateInterpolator = new DecelerateInterpolator();
            if (i != getIntent().getIntExtra("scw_preview_color", -1)) {
                this.A02 = 0;
                this.A03 = 0;
                i2 = this.A09.getWidth() >> 1;
                i3 = this.A09.getWidth() >> 1;
            } else {
                i2 = 0;
                i3 = 0;
            }
            this.A09.setPivotX((float) i2);
            this.A09.setPivotY((float) i3);
            this.A05.setBackgroundColor(0);
            this.A09.animate().setDuration(250).alpha(0.0f).scaleX(this.A00).scaleY(this.A01).translationX((float) this.A02).translationY((float) this.A03).setInterpolator(decelerateInterpolator).setListener(new AnonymousClass31T(this));
            this.A04.animate().setDuration(250).alpha(0.0f).setInterpolator(decelerateInterpolator);
            this.A06.animate().setDuration(250).alpha(0.0f).setInterpolator(decelerateInterpolator);
            return;
        }
        finish();
    }

    public void finish() {
        super.finish();
        if (this.A0A && this.A0B) {
            overridePendingTransition(0, 0);
        }
    }

    public /* synthetic */ void lambda$onCreate$2503$SolidColorWallpaperPreview(View view) {
        setResult(0, null);
        A0V(this.A09.getCurrentItem());
    }

    @Override // X.ActivityC004702f, X.AnonymousClass02i
    public void onBackPressed() {
        setResult(0, null);
        A0V(this.A09.getCurrentItem());
    }

    @Override // X.AnonymousClass2C0, X.ActivityC004602e, X.ActivityC004802g, X.ActivityC004702f, X.AnonymousClass1U5, X.AnonymousClass1PO, X.AnonymousClass02i, X.ActivityC004902h, X.ActivityC005002j
    public void onCreate(Bundle bundle) {
        C08420b5 r3;
        super.onCreate(bundle);
        this.A05 = AnonymousClass0TX.A0A(this, R.id.wallpaper_preview_container);
        this.A04 = AnonymousClass0TX.A0A(this, R.id.appbar);
        this.A07 = AnonymousClass0TX.A0A(this, R.id.transition_view);
        int[] A0f = AnonymousClass1VY.A0f(this, SolidColorWallpaper.A03);
        int length = A0f.length;
        int[] iArr = new int[length];
        for (int i = 0; i < length; i++) {
            iArr[i] = i;
        }
        Pair pair = new Pair(A0f, iArr);
        this.A0C = (int[]) pair.first;
        this.A0D = (int[]) pair.second;
        MarginCorrectedViewPager marginCorrectedViewPager = (MarginCorrectedViewPager) AnonymousClass0TX.A0A(this, R.id.wallpaper_preview);
        this.A09 = marginCorrectedViewPager;
        marginCorrectedViewPager.setSaveEnabled(false);
        C000300f r4 = ((ActivityC004702f) this).A0G;
        C002801l r5 = AbstractC000400g.A2e;
        if (r4.A0D(r5)) {
            CheckBox checkBox = (CheckBox) AnonymousClass0TX.A0A(this, R.id.color_wallpaper_add_doodles);
            this.A08 = checkBox;
            checkBox.setVisibility(0);
            this.A08.setText(R.string.wallpaper_solid_color_add_whatsapp_doodle);
            r3 = new C08420b5(this, this);
            r3.A00 = this.A08.isChecked();
            this.A08.setOnCheckedChangeListener(new AnonymousClass31J(r3));
        } else {
            r3 = new C08420b5(this, this);
        }
        this.A09.setAdapter(r3);
        this.A09.setPageMargin((int) (getResources().getDisplayMetrics().density * 15.0f));
        this.A06 = AnonymousClass0TX.A0A(this, R.id.control_holder);
        if (r4.A0D(r5)) {
            View view = this.A06;
            Drawable A032 = C004302a.A03(this, R.drawable.wallpaper_color_confirmation_background);
            if (A032 != null) {
                view.setBackgroundDrawable(A032);
            } else {
                throw null;
            }
        }
        AnonymousClass0TX.A0A(this, R.id.cancel_button).setOnClickListener(new ViewOnClickEBaseShape8S0100000_I1_6(this, 34));
        int i2 = AnonymousClass1VY.A0f(this, r4)[getIntent().getIntExtra("scw_preview_color", 0)];
        int i3 = 0;
        int i4 = 0;
        while (true) {
            int[] iArr2 = this.A0C;
            if (i4 >= iArr2.length) {
                break;
            } else if (iArr2[i4] == i2) {
                i3 = i4;
                break;
            } else {
                i4++;
            }
        }
        this.A09.setCurrentItem(i3);
        this.A0B = false;
        boolean booleanExtra = getIntent().getBooleanExtra("wallpaper_preview_intent_extra_animate", false);
        this.A0A = booleanExtra;
        if (booleanExtra) {
            overridePendingTransition(0, 0);
            Intent intent = getIntent();
            this.A0B = true;
            this.A09.setScrollEnabled(false);
            this.A07.getViewTreeObserver().addOnPreDrawListener(new AnonymousClass31S(this, intent.getIntExtra("wallpaper_preview_intent_extra_x", 0), intent.getIntExtra("wallpaper_preview_intent_extra_y", 0), intent.getIntExtra("wallpaper_preview_intent_extra_width", 0), intent.getIntExtra("wallpaper_preview_intent_extra_height", 0)));
            return;
        }
        this.A05.setBackgroundColor(getResources().getColor(R.color.white));
    }

    @Override // X.ActivityC004702f
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return false;
        }
        setResult(0, null);
        A0V(this.A09.getCurrentItem());
        return true;
    }

    public void onRestoreInstanceState(Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        int i = AnonymousClass1VY.A0f(this, ((ActivityC004702f) this).A0G)[bundle.getInt("selected_index")];
        int i2 = 0;
        int i3 = 0;
        while (true) {
            int[] iArr = this.A0C;
            if (i3 >= iArr.length) {
                break;
            } else if (iArr[i3] == i) {
                i2 = i3;
                break;
            } else {
                i3++;
            }
        }
        this.A09.setCurrentItem(i2);
    }

    @Override // X.ActivityC004802g, X.AnonymousClass02i, X.ActivityC004902h, X.ActivityC005002j
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("selected_index", this.A0D[this.A09.getCurrentItem()]);
    }
}
