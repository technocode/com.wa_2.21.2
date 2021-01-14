package com.whatsapp.settings.chat.wallpaper;

import X.ActivityC004702f;
import X.AnonymousClass01X;
import X.AnonymousClass0LB;
import X.AnonymousClass0S2;
import X.AnonymousClass1VY;
import X.AnonymousClass31P;
import X.C000300f;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.util.Pair;
import android.view.MenuItem;
import android.view.View;
import android.widget.AbsListView;
import android.widget.ListAdapter;
import androidx.appcompat.widget.Toolbar;
import com.google.android.search.verification.client.R;

public class SolidColorWallpaper extends ActivityC004702f {
    public static final C000300f A03 = C000300f.A00();
    public static final int[] A04 = {R.string.color_name_cinder_black, R.string.color_name_midnight_express, R.string.color_name_mandarian_orange, R.string.color_name_buccaneer_brown, R.string.color_name_breaker_bay, R.string.color_name_fjord_gray, R.string.color_name_tory_blue, R.string.color_name_pelorus_blue, R.string.color_name_seagull_blue, R.string.color_name_downy_green, R.string.color_name_cruise_green, R.string.color_name_scandal_green, R.string.color_name_monte_carlo_green, R.string.color_name_cape_honey_yellow, R.string.color_name_canary_yellow, R.string.color_name_radical_red, R.string.color_name_bittersweet_orange, R.string.color_name_rose_bud, R.string.color_name_flamingo_red, R.string.color_name_caramel_yellow, R.string.color_name_tusk_green, R.string.color_name_orinoco_green, R.string.color_name_brook_green, R.string.color_name_hawkes_blue, R.string.color_name_quartz_blue, R.string.color_name_very_light_gray, R.string.color_name_solitude_gray};
    public static final int[] A05 = {R.string.color_name_cruise_green, R.string.color_name_scandal_green, R.string.color_name_monte_carlo_green, R.string.color_name_hawkes_blue, R.string.color_name_downy_green, R.string.color_name_seagull_blue, R.string.color_name_quartz_blue, R.string.color_name_very_light_gray, R.string.color_name_orinoco_green, R.string.color_name_tusk_green, R.string.color_name_cape_honey_yellow, R.string.color_name_caramel_yellow, R.string.color_name_rose_bud, R.string.color_name_bittersweet_orange, R.string.color_name_radical_red, R.string.color_name_mandarian_orange, R.string.color_name_flamingo_red, R.string.color_name_buccaneer_brown, R.string.color_name_breaker_bay, R.string.color_name_pelorus_blue, R.string.color_name_tory_blue, R.string.color_name_fjord_gray, R.string.color_name_cinder_black, R.string.color_name_midnight_express, R.string.color_name_solitude_gray, R.string.color_name_canary_yellow, R.string.color_name_brook_green};
    public int[] A00;
    public int[] A01;
    public final AnonymousClass01X A02 = AnonymousClass01X.A00();

    public SolidColorWallpaper() {
        AnonymousClass0LB.A00();
    }

    @Override // X.ActivityC004902h
    public void onActivityResult(int i, int i2, Intent intent) {
        if (i != 1 || i2 != -1) {
            super.onActivityResult(i, i2, intent);
        } else if (intent == null || !intent.hasExtra("wallpaper_color_file")) {
            setResult(0, null);
            finish();
        } else {
            setResult(-1, intent);
            finish();
        }
    }

    @Override // X.AnonymousClass2C0, X.ActivityC004802g, X.ActivityC004702f, X.AnonymousClass02i, X.ActivityC004902h, X.ActivityC005002j
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTitle(this.A02.A06(R.string.solid_color_wallpaper));
        setContentView(R.layout.wallpaper_grid_preview);
        A0C((Toolbar) findViewById(R.id.toolbar));
        AnonymousClass0S2 A09 = A09();
        if (A09 != null) {
            A09.A0A(true);
            if (Build.VERSION.SDK_INT >= 21) {
                View findViewById = findViewById(R.id.separator);
                if (findViewById != null) {
                    findViewById.setVisibility(8);
                } else {
                    throw null;
                }
            }
            View findViewById2 = findViewById(R.id.color_grid);
            if (findViewById2 != null) {
                AbsListView absListView = (AbsListView) findViewById2;
                int[] A0f = AnonymousClass1VY.A0f(this, A03);
                int length = A0f.length;
                int[] iArr = new int[length];
                for (int i = 0; i < length; i++) {
                    iArr[i] = i;
                }
                Pair pair = new Pair(A0f, iArr);
                this.A00 = (int[]) pair.first;
                this.A01 = (int[]) pair.second;
                absListView.setAdapter((ListAdapter) new AnonymousClass31P(this, this));
                return;
            }
            throw null;
        }
        throw null;
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
