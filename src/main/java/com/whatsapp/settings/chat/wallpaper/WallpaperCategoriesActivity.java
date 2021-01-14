package com.whatsapp.settings.chat.wallpaper;

import X.AbstractC005802u;
import X.AbstractC16300pa;
import X.AbstractC28311Tv;
import X.ActivityC004602e;
import X.ActivityC004702f;
import X.AnonymousClass008;
import X.AnonymousClass009;
import X.AnonymousClass00G;
import X.AnonymousClass00T;
import X.AnonymousClass01X;
import X.AnonymousClass02J;
import X.AnonymousClass02M;
import X.AnonymousClass02N;
import X.AnonymousClass03P;
import X.AnonymousClass03S;
import X.AnonymousClass08D;
import X.AnonymousClass0JW;
import X.AnonymousClass0S2;
import X.AnonymousClass0TX;
import X.AnonymousClass0XO;
import X.AnonymousClass1VY;
import X.AnonymousClass2C0;
import X.AnonymousClass2JG;
import X.AnonymousClass3OV;
import X.AnonymousClass3OW;
import X.AnonymousClass3OY;
import X.C000300f;
import X.C002001d;
import X.C002101e;
import X.C007703s;
import X.C02200Ba;
import X.C02270Bi;
import X.C40181sl;
import X.C450822x;
import X.C52152af;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.Menu;
import android.view.MenuItem;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.search.verification.client.R;
import com.whatsapp.backup.google.PromptDialogFragment;
import java.util.ArrayList;

public class WallpaperCategoriesActivity extends ActivityC004602e implements AbstractC005802u {
    public RecyclerView A00;
    public AbstractC28311Tv A01;
    public C52152af A02;
    public AnonymousClass02N A03 = null;
    public AnonymousClass3OY A04;
    public boolean A05;
    public boolean A06 = false;
    public final AnonymousClass009 A07 = AnonymousClass009.A00();
    public final C000300f A08 = C000300f.A00();
    public final AnonymousClass08D A09 = AnonymousClass08D.A00();
    public final AnonymousClass2JG A0A = new AnonymousClass2JG();
    public final AnonymousClass03P A0B = AnonymousClass03P.A00();
    public final AnonymousClass00G A0C = AnonymousClass00G.A01;
    public final AnonymousClass03S A0D = AnonymousClass03S.A00();
    public final AnonymousClass0XO A0E = AnonymousClass0XO.A00();
    public final AnonymousClass02J A0F = AnonymousClass02J.A02();
    public final C007703s A0G = C007703s.A00();
    public final AnonymousClass00T A0H = C002101e.A00();

    @Override // X.AbstractC005802u
    public void AF5(int i) {
    }

    @Override // X.AbstractC005802u
    public void AF6(int i) {
    }

    @Override // X.AbstractC005802u
    public void AF7(int i) {
        if (i == 112) {
            AnonymousClass02J r3 = this.A0F;
            AnonymousClass02N r2 = this.A03;
            if (r3 instanceof C02200Ba) {
                ((C02200Ba) r3).A0F(r2, null, this);
            }
            setResult(-1);
            finish();
        } else if (i == 113) {
            AnonymousClass02J r32 = this.A0F;
            if (r32 instanceof C02200Ba) {
                C02200Ba r33 = (C02200Ba) r32;
                r33.A08.ANF(new RunnableEBaseShape4S0100000_I0_4(r33, 21));
            }
        }
    }

    @Override // X.ActivityC004902h
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i2 != 0) {
            setResult(i2);
            if (this.A02.onActivityResult(i, i2, intent)) {
                finish();
            }
        }
    }

    @Override // X.AnonymousClass2C0, X.ActivityC004602e, X.ActivityC004802g, X.ActivityC004702f, X.AnonymousClass02i, X.ActivityC004902h, X.ActivityC005002j
    public void onCreate(Bundle bundle) {
        C02270Bi r4;
        super.onCreate(bundle);
        setContentView(R.layout.activity_wallpaper_categories);
        AnonymousClass02M r6 = ((ActivityC004702f) this).A0F;
        C450822x r5 = new C450822x(r6);
        this.A01 = r5;
        C000300f r1 = this.A08;
        AnonymousClass03P r42 = this.A0B;
        AnonymousClass01X r8 = ((AnonymousClass2C0) this).A01;
        AnonymousClass02J r3 = this.A0F;
        this.A02 = new C52152af(this, r6, r1, r42, r8, r3, this, r5, this.A0A);
        this.A03 = AnonymousClass1VY.A08(getIntent());
        this.A06 = getIntent().getBooleanExtra("is_using_global_wallpaper", false);
        A0C((Toolbar) AnonymousClass0TX.A0A(this, R.id.wallpaper_categories_toolbar));
        AnonymousClass0S2 A092 = A09();
        if (A092 != null) {
            A092.A0A(true);
            if (this.A03 != null && !this.A06) {
                setTitle(r8.A06(R.string.wallpaper_custom_wallpaper_header));
            } else if (C002001d.A3E(this)) {
                setTitle(r8.A06(R.string.wallpaper_dark_theme_header));
            } else {
                setTitle(r8.A06(R.string.wallpaper_light_theme_header));
            }
            this.A03 = AnonymousClass1VY.A08(getIntent());
            AnonymousClass03S r52 = this.A0D;
            this.A05 = r52.A06();
            if (!(r3 instanceof C02200Ba)) {
                r4 = null;
            } else {
                r4 = ((C02200Ba) r3).A00;
            }
            if (r4 != null) {
                r4.A03(this, new AnonymousClass3OW(this));
                ArrayList arrayList = new ArrayList();
                arrayList.add(0);
                arrayList.add(1);
                arrayList.add(2);
                arrayList.add(3);
                arrayList.add(5);
                boolean z = r3.A05(this.A03, this).A03;
                if (!z) {
                    arrayList.add(4);
                }
                this.A00 = (RecyclerView) AnonymousClass0TX.A0A(this, R.id.categories);
                AnonymousClass3OY r7 = new AnonymousClass3OY(r8, arrayList, new AnonymousClass3OV(this, z), new Handler(Looper.getMainLooper()), getContentResolver(), this.A09, this.A0N, this.A07, this.A0C, this.A0H, r1, this.A0E, r52, this.A0G);
                this.A04 = r7;
                this.A00.setLayoutManager(new WallpaperGridLayoutManager(r7));
                this.A00.A0j(new C40181sl(r8, getResources().getDimensionPixelSize(R.dimen.wallpaper_category_view_padding)));
                this.A00.setAdapter(this.A04);
                return;
            }
            throw null;
        }
        throw null;
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        if (this.A03 == null) {
            menu.add(0, 999, 0, R.string.wallpaper_reset_wallpapers_overflow_menu_option).setShowAsAction(0);
        }
        return super.onCreateOptionsMenu(menu);
    }

    @Override // X.ActivityC004802g, X.ActivityC004702f, X.ActivityC004902h
    public void onDestroy() {
        super.onDestroy();
        for (AnonymousClass0JW r0 : this.A04.A0F.values()) {
            r0.A00.cancel(true);
        }
    }

    @Override // X.ActivityC004702f
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == 999) {
            Bundle A012 = AnonymousClass008.A01("dialog_id", 113);
            A012.putString("message", getString(R.string.wallpaper_reset_wallpapers_dialog_description));
            A012.putString("positive_button", getString(R.string.wallpaper_reset_wallpapers_dialog_reset_button));
            A012.putString("negative_button", getString(R.string.cancel));
            PromptDialogFragment promptDialogFragment = new PromptDialogFragment();
            promptDialogFragment.A0N(A012);
            APm(promptDialogFragment);
        }
        return super.onOptionsItemSelected(menuItem);
    }

    @Override // X.ActivityC004602e, X.ActivityC004702f, X.ActivityC004902h
    public void onResume() {
        super.onResume();
        boolean z = this.A05;
        AnonymousClass03S r1 = this.A0D;
        if (z != r1.A06()) {
            this.A05 = r1.A06();
            ((AbstractC16300pa) this.A04).A01.A00();
        }
    }
}
