package com.whatsapp.settings.chat.wallpaper.downloadable.picker;

import X.AnonymousClass00T;
import X.AnonymousClass01X;
import X.AnonymousClass02R;
import X.AnonymousClass0JW;
import X.AnonymousClass0PA;
import X.AnonymousClass0TX;
import X.AnonymousClass1U5;
import X.AnonymousClass1VY;
import X.C002101e;
import X.C02270Bi;
import X.C40181sl;
import X.C71283Oh;
import X.C71353Oo;
import X.C71373Oq;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.redex.ViewOnClickEBaseShape2S0200000_I1_1;
import com.google.android.search.verification.client.R;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.List;

public class DownloadableWallpaperPickerActivity extends AnonymousClass1U5 {
    public Resources A00 = null;
    public View A01;
    public View A02;
    public AnonymousClass02R A03;
    public RecyclerView A04;
    public C71353Oo A05;
    public List A06 = new ArrayList();
    public final AnonymousClass01X A07 = AnonymousClass01X.A00();
    public final AnonymousClass0PA A08 = AnonymousClass0PA.A00();
    public final AnonymousClass00T A09 = C002101e.A00();

    @Override // X.ActivityC004902h
    public void onActivityResult(int i, int i2, Intent intent) {
        if (i != 111) {
            super.onActivityResult(i, i2, intent);
        } else if (i2 == -1) {
            setResult(i2, intent);
            finish();
        }
    }

    @Override // X.AnonymousClass2C0, X.ActivityC004602e, X.ActivityC004802g, X.ActivityC004702f, X.AnonymousClass1U5, X.AnonymousClass02i, X.ActivityC004902h, X.ActivityC005002j
    public void onCreate(Bundle bundle) {
        String string;
        super.onCreate(bundle);
        boolean booleanExtra = getIntent().getBooleanExtra("IS_BRIGHT_KEY", true);
        if (booleanExtra) {
            string = getString(R.string.wallpaper_categories_bright);
        } else {
            string = getString(R.string.wallpaper_categories_dark);
        }
        setTitle(string);
        try {
            Resources resourcesForApplication = getPackageManager().getResourcesForApplication("com.whatsapp.wallpaper");
            this.A00 = resourcesForApplication;
            this.A03 = AnonymousClass1VY.A07(resourcesForApplication);
        } catch (PackageManager.NameNotFoundException e) {
            Log.e("WallpaperCurrentPreviewActivity/com.whatsapp.wallpaper could not be found.", e);
        }
        this.A02 = AnonymousClass0TX.A0A(this, R.id.wallpaper_thumbnails_progress_container);
        this.A01 = AnonymousClass0TX.A0A(this, R.id.wallpaper_thumbnail_error_container);
        this.A04 = (RecyclerView) AnonymousClass0TX.A0A(this, R.id.wallpaper_thumbnail_recyclerview);
        C71353Oo r2 = new C71353Oo(this.A0N, this.A09, this.A00, new C71373Oq(this));
        this.A05 = r2;
        this.A04.setLayoutManager(new DownloadableWallpaperGridLayoutManager(r2));
        this.A04.A0j(new C40181sl(this.A07, getResources().getDimensionPixelOffset(R.dimen.wallpaper_thumbnail_spacing)));
        this.A04.setAdapter(this.A05);
        AnonymousClass0PA r1 = this.A08;
        C02270Bi r3 = r1.A00;
        if (r3.A01() == null) {
            r1.A02();
        }
        Button button = (Button) AnonymousClass0TX.A0A(this, R.id.wallpaper_thumbnail_reload_button);
        button.setOnClickListener(new ViewOnClickEBaseShape2S0200000_I1_1(this, button, 39));
        r3.A03(this, new C71283Oh(this, booleanExtra, button));
    }

    @Override // X.ActivityC004802g, X.ActivityC004702f, X.ActivityC004902h
    public void onDestroy() {
        super.onDestroy();
        for (AnonymousClass0JW r0 : this.A05.A05.values()) {
            r0.A00.cancel(true);
        }
    }

    @Override // X.ActivityC004702f
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return false;
        }
        setResult(0, null);
        finish();
        return true;
    }
}
