package com.whatsapp.settings.chat.wallpaper;

import X.ActivityC004702f;
import X.AnonymousClass01X;
import X.AnonymousClass02N;
import X.AnonymousClass02R;
import X.AnonymousClass03P;
import X.AnonymousClass0LB;
import X.AnonymousClass0MB;
import X.AnonymousClass0MC;
import X.AnonymousClass1VY;
import X.AnonymousClass31K;
import X.AnonymousClass31L;
import X.AnonymousClass31M;
import X.AnonymousClass31N;
import X.AnonymousClass31O;
import X.AnonymousClass31Z;
import X.C002001d;
import android.app.Dialog;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.AbsListView;
import android.widget.ListAdapter;
import androidx.appcompat.widget.Toolbar;
import com.google.android.search.verification.client.R;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Collection;

public class WallpaperPicker extends ActivityC004702f {
    public Resources A00 = null;
    public AnonymousClass02N A01 = null;
    public AnonymousClass31Z A02;
    public boolean A03 = false;
    public final AnonymousClass03P A04 = AnonymousClass03P.A00();
    public final AnonymousClass01X A05 = AnonymousClass01X.A00();
    public final ArrayList A06 = new ArrayList();
    public final ArrayList A07 = new ArrayList();

    public WallpaperPicker() {
        AnonymousClass0LB.A00();
    }

    @Override // X.ActivityC004902h
    public void onActivityResult(int i, int i2, Intent intent) {
        if (i != 1) {
            super.onActivityResult(i, i2, intent);
        } else if (i2 == -1) {
            if (intent == null || !intent.hasExtra("selected_res_id")) {
                setResult(0, null);
            } else {
                setResult(-1, intent);
            }
            finish();
        }
    }

    @Override // X.AnonymousClass2C0, X.ActivityC004802g, X.ActivityC004702f, X.AnonymousClass02i, X.ActivityC004902h, X.ActivityC005002j
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTitle(this.A05.A06(R.string.wallpaper_package));
        setContentView(R.layout.wallpaper_grid_preview);
        A0C((Toolbar) findViewById(R.id.toolbar));
        A09().A0A(true);
        if (Build.VERSION.SDK_INT >= 21) {
            findViewById(R.id.separator).setVisibility(8);
        }
        this.A01 = AnonymousClass1VY.A08(getIntent());
        this.A03 = getIntent().getBooleanExtra("is_using_global_wallpaper", false);
        AnonymousClass31Z r0 = new AnonymousClass31Z(this, this);
        this.A02 = r0;
        ((AbsListView) findViewById(R.id.color_grid)).setAdapter((ListAdapter) r0);
        try {
            this.A00 = getPackageManager().getResourcesForApplication("com.whatsapp.wallpaper");
        } catch (PackageManager.NameNotFoundException e) {
            Log.e("wallpaperpicker/no application found for com.whatsapp.wallpaper", e);
            C002001d.A2O(this, 1);
        }
    }

    public Dialog onCreateDialog(int i) {
        if (i == 1) {
            AnonymousClass31L r4 = new AnonymousClass31L(this);
            AnonymousClass0MB r3 = new AnonymousClass0MB(this);
            AnonymousClass01X r1 = this.A05;
            String A062 = r1.A06(R.string.download_from_market);
            AnonymousClass0MC r2 = r3.A01;
            r2.A0E = A062;
            r3.A07(r1.A06(R.string.ok), r4);
            r3.A05(r1.A06(R.string.cancel), new AnonymousClass31M(this));
            r2.A02 = new AnonymousClass31K(this);
            return r3.A00();
        } else if (i != 2) {
            return null;
        } else {
            AnonymousClass0MB r32 = new AnonymousClass0MB(this);
            AnonymousClass01X r22 = this.A05;
            r32.A01.A0E = r22.A06(R.string.install_app_ineligible);
            r32.A07(r22.A06(R.string.allow), new AnonymousClass31O(this));
            r32.A05(r22.A06(R.string.cancel), new AnonymousClass31N(this));
            return r32.A00();
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

    @Override // X.ActivityC004702f, X.ActivityC004902h
    public void onResume() {
        super.onResume();
        ArrayList arrayList = this.A06;
        if (arrayList.size() > 0) {
            Log.i("wallpaperpicker/wallpapers already loaded.");
            return;
        }
        Resources resources = this.A00;
        if (resources == null) {
            Log.e("wallpaperpicker/resource is null");
            C002001d.A2O(this, 1);
        } else {
            AnonymousClass02R A072 = AnonymousClass1VY.A07(resources);
            ArrayList arrayList2 = this.A07;
            Object obj = A072.A00;
            if (obj != null) {
                arrayList2.addAll((Collection) obj);
                Object obj2 = A072.A01;
                if (obj2 != null) {
                    arrayList.addAll((Collection) obj2);
                } else {
                    throw null;
                }
            } else {
                throw null;
            }
        }
        if (arrayList.size() == 0) {
            C002001d.A2O(this, 1);
        } else {
            this.A02.notifyDataSetChanged();
        }
    }
}
