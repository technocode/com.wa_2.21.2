package com.whatsapp.settings.chat.wallpaper;

import X.AnonymousClass0JW;
import X.AnonymousClass1PO;
import X.AnonymousClass31c;
import X.C08410b4;
import X.C657231f;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import com.facebook.redex.ViewOnClickEBaseShape8S0100000_I1_6;
import com.google.android.search.verification.client.R;
import com.whatsapp.collections.MarginCorrectedViewPager;
import com.whatsapp.util.Log;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WallpaperPreview extends AnonymousClass1PO {
    public float A00;
    public float A01;
    public int A02;
    public int A03;
    public Resources A04 = null;
    public View A05;
    public View A06;
    public View A07;
    public View A08;
    public MarginCorrectedViewPager A09;
    public List A0A;
    public List A0B;
    public boolean A0C;
    public final Map A0D = new HashMap();

    public final void A0V(int i) {
        int i2;
        int i3;
        this.A0C = true;
        MarginCorrectedViewPager marginCorrectedViewPager = this.A09;
        marginCorrectedViewPager.setScrollEnabled(false);
        StringBuilder sb = new StringBuilder("chatlayout-");
        sb.append(i);
        View findViewWithTag = marginCorrectedViewPager.findViewWithTag(sb.toString());
        DecelerateInterpolator decelerateInterpolator = new DecelerateInterpolator();
        if (i != getIntent().getIntExtra("wallpaper_preview_intent_starting_pos", -1)) {
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
        int i4 = (int) (getResources().getDisplayMetrics().density * 20.0f);
        this.A06.setBackgroundColor(0);
        if (findViewWithTag != null) {
            findViewWithTag.animate().setDuration(250).alpha(0.0f).translationY((float) i4).setInterpolator(decelerateInterpolator);
        }
        this.A07.animate().setDuration(250).alpha(0.0f).setInterpolator(decelerateInterpolator).setListener(new C657231f(this, decelerateInterpolator));
    }

    public void finish() {
        super.finish();
        if (this.A0C) {
            overridePendingTransition(0, 0);
        }
    }

    public /* synthetic */ void lambda$onCreate$2513$WallpaperPreview(View view) {
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
        super.onCreate(bundle);
        try {
            this.A04 = getPackageManager().getResourcesForApplication("com.whatsapp.wallpaper");
        } catch (PackageManager.NameNotFoundException e) {
            Log.e("wallpaperpreview/com.whatsapp.wallpaper could not be found.", e);
        }
        this.A06 = findViewById(R.id.wallpaper_preview_container);
        this.A05 = findViewById(R.id.appbar);
        this.A08 = findViewById(R.id.transition_view);
        this.A0A = getIntent().getIntegerArrayListExtra("wallpaper_preview_intent_image_res_ids");
        this.A0B = getIntent().getIntegerArrayListExtra("wallpaper_preview_intent_thumb_res_ids");
        this.A09 = (MarginCorrectedViewPager) findViewById(R.id.wallpaper_preview);
        this.A09.setAdapter(new C08410b4(this, this, this.A04));
        this.A09.setPageMargin((int) (getResources().getDisplayMetrics().density * 15.0f));
        this.A07 = findViewById(R.id.control_holder);
        findViewById(R.id.cancel_button).setOnClickListener(new ViewOnClickEBaseShape8S0100000_I1_6(this, 35));
        this.A09.setCurrentItem(getIntent().getIntExtra("wallpaper_preview_intent_starting_pos", 0));
        this.A0C = false;
        overridePendingTransition(0, 0);
        Intent intent = getIntent();
        this.A0C = true;
        this.A09.setScrollEnabled(false);
        this.A08.getViewTreeObserver().addOnPreDrawListener(new AnonymousClass31c(this, intent.getIntExtra("wallpaper_preview_intent_extra_x", 0), intent.getIntExtra("wallpaper_preview_intent_extra_y", 0), intent.getIntExtra("wallpaper_preview_intent_extra_width", 0), intent.getIntExtra("wallpaper_preview_intent_extra_height", 0)));
    }

    @Override // X.ActivityC004802g, X.ActivityC004702f, X.ActivityC004902h
    public void onDestroy() {
        for (Map.Entry entry : this.A0D.entrySet()) {
            ((AnonymousClass0JW) entry.getValue()).A00.cancel(true);
        }
        super.onDestroy();
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
}
