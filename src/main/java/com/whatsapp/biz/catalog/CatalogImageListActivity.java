package com.whatsapp.biz.catalog;

import X.ActivityC004602e;
import X.AnonymousClass0Q7;
import X.AnonymousClass0S2;
import X.AnonymousClass0TX;
import X.AnonymousClass1PN;
import X.AnonymousClass1S0;
import X.AnonymousClass2UR;
import X.AnonymousClass2UT;
import X.C004302a;
import X.C27831Rq;
import X.C27881Ry;
import X.C42051w4;
import X.C42261wQ;
import X.C42271wR;
import X.C42281wS;
import X.C48052Ks;
import android.animation.TimeInterpolator;
import android.os.Build;
import android.os.Bundle;
import android.transition.ChangeBounds;
import android.transition.Fade;
import android.transition.TransitionSet;
import android.view.MenuItem;
import android.view.Window;
import android.view.animation.AccelerateDecelerateInterpolator;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.inputmethod.EditorInfoCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.search.verification.client.R;
import com.whatsapp.jid.UserJid;

public class CatalogImageListActivity extends ActivityC004602e {
    public static final boolean A0B;
    public int A00;
    public int A01;
    public LinearLayoutManager A02;
    public RecyclerView A03;
    public C42281wS A04;
    public AnonymousClass1S0 A05;
    public C48052Ks A06;
    public UserJid A07;
    public final AnonymousClass1PN A08 = AnonymousClass1PN.A00();
    public final C27831Rq A09 = C27831Rq.A00();
    public final C27881Ry A0A = C27881Ry.A00();

    static {
        boolean z = false;
        if (Build.VERSION.SDK_INT >= 21) {
            z = true;
        }
        A0B = z;
    }

    @Override // X.AnonymousClass2C0, X.ActivityC004602e, X.ActivityC004802g, X.ActivityC004702f, X.AnonymousClass02i, X.ActivityC004902h, X.ActivityC005002j
    public void onCreate(Bundle bundle) {
        boolean z = AnonymousClass2UT.A00;
        if (z) {
            Window window = getWindow();
            window.requestFeature(12);
            window.requestFeature(13);
        }
        super.onCreate(bundle);
        AnonymousClass1PN r1 = this.A08;
        if (z) {
            Window window2 = getWindow();
            AccelerateDecelerateInterpolator accelerateDecelerateInterpolator = new AccelerateDecelerateInterpolator();
            ChangeBounds changeBounds = new ChangeBounds();
            ChangeBounds changeBounds2 = new ChangeBounds();
            changeBounds.excludeTarget(r1.A01(R.string.transition_clipper_top), true);
            changeBounds.excludeTarget(r1.A01(R.string.transition_clipper_bottom), true);
            changeBounds2.excludeTarget(r1.A01(R.string.transition_clipper_top), true);
            changeBounds2.excludeTarget(r1.A01(R.string.transition_clipper_bottom), true);
            AnonymousClass2UR r2 = new AnonymousClass2UR(r1, true);
            AnonymousClass2UR r6 = new AnonymousClass2UR(r1, false);
            TransitionSet transitionSet = new TransitionSet();
            transitionSet.setDuration(220L);
            transitionSet.setInterpolator((TimeInterpolator) accelerateDecelerateInterpolator);
            transitionSet.addTransition(changeBounds);
            transitionSet.addTransition(r2);
            TransitionSet transitionSet2 = new TransitionSet();
            transitionSet2.setInterpolator((TimeInterpolator) accelerateDecelerateInterpolator);
            transitionSet2.setDuration(240L);
            transitionSet2.addTransition(changeBounds2);
            transitionSet2.addTransition(r6);
            window2.setSharedElementEnterTransition(transitionSet);
            window2.setSharedElementReturnTransition(transitionSet2);
            Fade fade = new Fade();
            Fade fade2 = new Fade();
            fade.excludeTarget(16908335, true);
            fade.excludeTarget(16908336, true);
            fade.excludeTarget(R.id.action_bar_container, true);
            fade.excludeTarget(R.id.catalog_image_list_toolbar, true);
            fade2.excludeTarget(16908335, true);
            fade2.excludeTarget(16908336, true);
            fade2.excludeTarget(R.id.action_bar_container, true);
            fade2.excludeTarget(R.id.catalog_image_list_toolbar, true);
            fade.setDuration(220);
            fade2.setDuration(240);
            window2.setEnterTransition(fade);
            window2.setReturnTransition(fade2);
            if (bundle == null) {
                AnonymousClass0TX.A0C(this);
            }
        }
        if (A0B) {
            getWindow().getDecorView().setSystemUiVisibility(1792);
            getWindow().addFlags(134217728);
            getWindow().addFlags(EditorInfoCompat.IME_FLAG_FORCE_ASCII);
            getWindow().setStatusBarColor(C004302a.A00(this, R.color.primary_dark));
        }
        UserJid nullable = UserJid.getNullable(getIntent().getStringExtra("cached_jid"));
        if (nullable != null) {
            this.A07 = nullable;
            this.A06 = (C48052Ks) getIntent().getParcelableExtra("product");
            this.A00 = getIntent().getIntExtra("image_index", 0);
            setContentView(R.layout.business_product_catalog_image_list);
            this.A03 = (RecyclerView) findViewById(R.id.catalog_image_list);
            A0C((Toolbar) findViewById(R.id.catalog_image_list_toolbar));
            AnonymousClass0S2 A092 = A09();
            if (A092 != null) {
                A092.A0A(true);
                A092.A08(this.A06.A08);
                this.A05 = new AnonymousClass1S0(this.A0A);
                C42271wR r12 = new C42271wR(this);
                this.A02 = new LinearLayoutManager(1);
                this.A03.setAdapter(r12);
                this.A03.setLayoutManager(this.A02);
                C42281wS r13 = new C42281wS(this.A06.A0A.size(), getResources().getDimensionPixelSize(R.dimen.actionbar_height));
                this.A04 = r13;
                this.A03.A0j(r13);
                AnonymousClass0Q7.A0e(this.A03, new C42051w4(this));
                int A002 = C004302a.A00(this, R.color.primary);
                int A003 = C004302a.A00(this, R.color.primary_dark);
                this.A03.A0l(new C42261wQ(this, A002, C004302a.A00(this, R.color.catalog_image_list_transparent_color), A092, A003));
                if (bundle == null) {
                    this.A09.A02(8, 27, null, this.A07);
                    return;
                }
                return;
            }
            throw null;
        }
        throw null;
    }

    @Override // X.ActivityC004802g, X.ActivityC004702f, X.ActivityC004902h
    public void onDestroy() {
        this.A05.A00();
        super.onDestroy();
    }

    @Override // X.ActivityC004702f
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        onBackPressed();
        return true;
    }
}
