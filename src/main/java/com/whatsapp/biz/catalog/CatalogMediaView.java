package com.whatsapp.biz.catalog;

import X.AbstractC07270Wu;
import X.ActivityC004602e;
import X.ActivityC004802g;
import X.AnonymousClass008;
import X.AnonymousClass037;
import X.AnonymousClass0LW;
import X.AnonymousClass0QB;
import X.AnonymousClass1PN;
import X.AnonymousClass1S6;
import X.AnonymousClass2UT;
import X.C002001d;
import X.C48052Ks;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import com.google.android.search.verification.client.R;
import com.whatsapp.jid.UserJid;
import com.whatsapp.mediaview.MediaViewBaseFragment;

public class CatalogMediaView extends ActivityC004602e implements AbstractC07270Wu {
    @Override // X.AbstractC07270Wu
    public void AFB() {
    }

    @Override // X.AbstractC07270Wu
    public void AKp() {
    }

    @Override // X.AbstractC07270Wu
    public boolean APe() {
        return true;
    }

    public static void A04(Context context, C48052Ks r4, AnonymousClass1PN r5, int i, View view, UserJid userJid) {
        Intent intent = new Intent(context, CatalogMediaView.class);
        intent.putExtra("product", r4);
        intent.putExtra("target_image_index", i);
        intent.putExtra("cached_jid", userJid.getRawString());
        Context A0O = C002001d.A0O(context);
        if (A0O instanceof ActivityC004802g) {
            intent.putExtra("animation_bundle", AnonymousClass2UT.A00((Activity) A0O, view));
        }
        AnonymousClass2UT.A03(context, r5, intent, view, AnonymousClass008.A0K("thumb-transition-", AnonymousClass1S6.A01(r4.A06, i)));
    }

    @Override // X.AbstractC07270Wu
    public void AHi() {
        finish();
    }

    @Override // X.AnonymousClass2C0, X.ActivityC004602e, X.ActivityC004802g, X.ActivityC004702f, X.AnonymousClass02i, X.ActivityC004902h, X.ActivityC005002j
    public void onCreate(Bundle bundle) {
        if (AnonymousClass2UT.A00) {
            Window window = getWindow();
            window.requestFeature(12);
            window.requestFeature(13);
        }
        super.onCreate(bundle);
        Intent intent = getIntent();
        if (intent != null) {
            setContentView(R.layout.media_view_activity);
            AnonymousClass0LW A04 = A04();
            AnonymousClass037 A01 = A04.A0Q.A01("catalog_media_view_fragment");
            if (A01 == null) {
                A01 = new CatalogMediaViewFragment();
            }
            Bundle bundle2 = new Bundle();
            bundle2.putParcelable("product", intent.getParcelableExtra("product"));
            bundle2.putInt("target_image_index", intent.getIntExtra("target_image_index", 0));
            bundle2.putString("cached_jid", intent.getStringExtra("cached_jid"));
            bundle2.putBundle("animation_bundle", intent.getBundleExtra("animation_bundle"));
            A01.A0N(bundle2);
            AnonymousClass0QB r1 = new AnonymousClass0QB(A04);
            r1.A06(R.id.media_view_fragment_container, A01, "catalog_media_view_fragment");
            r1.A00();
        }
    }

    @Override // X.ActivityC004802g, X.ActivityC004902h
    public void onStop() {
        super.onStop();
        MediaViewBaseFragment.A00(this, true);
    }
}
