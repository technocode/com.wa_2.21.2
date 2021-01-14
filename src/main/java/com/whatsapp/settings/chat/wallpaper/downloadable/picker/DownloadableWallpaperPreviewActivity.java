package com.whatsapp.settings.chat.wallpaper.downloadable.picker;

import X.AnonymousClass00T;
import X.AnonymousClass0JW;
import X.AnonymousClass0PA;
import X.AnonymousClass0TX;
import X.AnonymousClass1PO;
import X.AnonymousClass1U5;
import X.AnonymousClass3Os;
import X.C002101e;
import X.C004302a;
import X.C08390b2;
import X.C71383Or;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.MenuItem;
import com.google.android.search.verification.client.R;
import com.whatsapp.collections.MarginCorrectedViewPager;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DownloadableWallpaperPreviewActivity extends AnonymousClass1PO {
    public Resources A00;
    public MarginCorrectedViewPager A01;
    public C08390b2 A02;
    public C71383Or A03 = new C71383Or(this);
    public List A04;
    public List A05;
    public List A06;
    public Set A07 = new HashSet();
    public final AnonymousClass0PA A08 = AnonymousClass0PA.A00();
    public final AnonymousClass00T A09 = C002101e.A00();

    @Override // X.ActivityC004702f, X.AnonymousClass02i
    public void onBackPressed() {
        setResult(0, null);
        finish();
    }

    @Override // X.AnonymousClass2C0, X.ActivityC004602e, X.ActivityC004802g, X.ActivityC004702f, X.AnonymousClass1U5, X.AnonymousClass1PO, X.AnonymousClass02i, X.ActivityC004902h, X.ActivityC005002j
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        AnonymousClass0TX.A0A(this, R.id.wallpaper_preview_container).setBackgroundColor(C004302a.A00(this, R.color.primary_surface));
        ((AnonymousClass1PO) this).A00.setEnabled(false);
        try {
            this.A00 = getPackageManager().getResourcesForApplication("com.whatsapp.wallpaper");
        } catch (PackageManager.NameNotFoundException e) {
            Log.e("DownloadableWallpaperPreviewActivity/com.whatsapp.wallpaper could not be found.", e);
        }
        ArrayList parcelableArrayListExtra = getIntent().getParcelableArrayListExtra("THUMBNAIL_URIS_KEY");
        if (parcelableArrayListExtra != null) {
            this.A04 = parcelableArrayListExtra;
            this.A06 = getIntent().getIntegerArrayListExtra("WHATSAPP_THUMBNAIL_RES_KEY");
            this.A05 = getIntent().getIntegerArrayListExtra("WHATSAPP_FULL_RES_KEY");
            this.A01 = (MarginCorrectedViewPager) AnonymousClass0TX.A0A(this, R.id.wallpaper_preview);
            C08390b2 r3 = new C08390b2(this, this.A09, this.A08, this.A00, this.A03, this.A04, this.A06, this.A05, ((AnonymousClass1U5) this).A00, ((AnonymousClass1U5) this).A01);
            this.A02 = r3;
            this.A01.setAdapter(r3);
            this.A01.setPageMargin(getResources().getDimensionPixelOffset(R.dimen.downloadable_wallpaper_pager_margin));
            this.A01.A0F(new AnonymousClass3Os(this));
            this.A01.setCurrentItem(getIntent().getIntExtra("STARTING_POSITION_KEY", 0));
            return;
        }
        throw null;
    }

    @Override // X.ActivityC004802g, X.ActivityC004702f, X.ActivityC004902h
    public void onDestroy() {
        for (AnonymousClass0JW r0 : this.A02.A07.values()) {
            r0.A00.cancel(true);
        }
        super.onDestroy();
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
