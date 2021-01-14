package com.whatsapp.stickers;

import X.AbstractC16160pM;
import X.AbstractC16440po;
import X.AnonymousClass01X;
import X.AnonymousClass02M;
import X.AnonymousClass037;
import X.AnonymousClass0D1;
import X.AnonymousClass0VT;
import X.AnonymousClass33L;
import X.AnonymousClass33N;
import X.AnonymousClass33X;
import X.C002301g;
import X.C03570Gt;
import X.C03620Gz;
import X.C14890n3;
import X.C16170pN;
import X.C16190pP;
import X.C30511bT;
import X.C664334g;
import X.C71743Qd;
import X.C71803Qj;
import X.C71823Ql;
import X.C74153aF;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.redex.ViewOnClickEBaseShape8S0100000_I1_6;
import com.google.android.search.verification.client.R;
import com.whatsapp.base.WaFragment;
import java.util.ArrayList;
import java.util.List;

public abstract class StickerStoreTabFragment extends WaFragment {
    public int A00;
    public LayoutInflater A01;
    public View A02;
    public LinearLayoutManager A03;
    public RecyclerView A04;
    public C71823Ql A05;
    public List A06;
    public final ViewTreeObserver.OnGlobalLayoutListener A07 = new AnonymousClass33X(this);
    public final AnonymousClass02M A08 = AnonymousClass02M.A00();
    public final AnonymousClass01X A09 = AnonymousClass01X.A00();
    public final AnonymousClass0D1 A0A = AnonymousClass0D1.A00();
    public final AnonymousClass33L A0B = new C71803Qj(this);
    public final C03620Gz A0C = C03620Gz.A00();
    public final C03570Gt A0D = C03570Gt.A00();

    @Override // X.AnonymousClass037
    public void A0X() {
        this.A04.getViewTreeObserver().removeGlobalOnLayoutListener(this.A07);
        C03570Gt r2 = this.A0D;
        C664334g r0 = r2.A00;
        if (r0 != null) {
            r0.A01.A01(false);
            r2.A00 = null;
        }
        AnonymousClass0D1 r02 = this.A0A;
        if (r02 != null) {
            r02.A04();
        }
        this.A0C.A00(this.A0B);
        this.A0U = true;
    }

    @Override // X.AnonymousClass037
    public View A0Z(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i;
        this.A01 = layoutInflater;
        if (!(this instanceof StickerStoreMyTabFragment)) {
            i = R.layout.sticker_store_featured_layout;
        } else {
            i = R.layout.sticker_store_my_layout;
        }
        View inflate = layoutInflater.inflate(i, viewGroup, false);
        View findViewById = inflate.findViewById(R.id.store_recycler_view);
        if (findViewById != null) {
            this.A04 = (RecyclerView) findViewById;
            View findViewById2 = inflate.findViewById(R.id.store_progress);
            if (findViewById2 != null) {
                this.A02 = findViewById2;
                LinearLayoutManager linearLayoutManager = new LinearLayoutManager(1);
                this.A03 = linearLayoutManager;
                linearLayoutManager.A1A(1);
                ((AnonymousClass0VT) this.A03).A0A = true;
                this.A04.A0j(new C74153aF(this.A04.getContext(), this.A03.A01));
                this.A04.setLayoutManager(this.A03);
                this.A04.getViewTreeObserver().addOnGlobalLayoutListener(this.A07);
                this.A04.setNestedScrollingEnabled(true);
                this.A0C.A01(this.A0B);
                if (this instanceof StickerStoreMyTabFragment) {
                    StickerStoreMyTabFragment stickerStoreMyTabFragment = (StickerStoreMyTabFragment) this;
                    stickerStoreMyTabFragment.A00 = inflate.findViewById(R.id.empty);
                    TextView textView = (TextView) inflate.findViewById(R.id.get_stickers_button);
                    C002301g.A03(textView);
                    textView.setOnClickListener(new ViewOnClickEBaseShape8S0100000_I1_6(stickerStoreMyTabFragment, 42));
                } else if (this instanceof StickerStoreFeaturedTabFragment) {
                    ((StickerStoreFeaturedTabFragment) this).A00 = inflate.findViewById(R.id.empty);
                }
                A0n();
                if (!(this instanceof StickerStoreMyTabFragment)) {
                    StickerStoreFeaturedTabFragment stickerStoreFeaturedTabFragment = (StickerStoreFeaturedTabFragment) this;
                    ((StickerStoreTabFragment) stickerStoreFeaturedTabFragment).A02.setVisibility(0);
                    if (!stickerStoreFeaturedTabFragment.A01) {
                        stickerStoreFeaturedTabFragment.A0q();
                    }
                    return inflate;
                }
                StickerStoreMyTabFragment stickerStoreMyTabFragment2 = (StickerStoreMyTabFragment) this;
                stickerStoreMyTabFragment2.A03 = false;
                C30511bT r4 = new C30511bT(new C71743Qd(stickerStoreMyTabFragment2));
                stickerStoreMyTabFragment2.A01 = r4;
                RecyclerView recyclerView = ((StickerStoreTabFragment) stickerStoreMyTabFragment2).A04;
                RecyclerView recyclerView2 = r4.A0M;
                if (recyclerView2 != recyclerView) {
                    if (recyclerView2 != null) {
                        recyclerView2.A0k(r4);
                        RecyclerView recyclerView3 = r4.A0M;
                        AbstractC16440po r1 = r4.A0Q;
                        recyclerView3.A15.remove(r1);
                        if (recyclerView3.A0U == r1) {
                            recyclerView3.A0U = null;
                        }
                        List list = r4.A0M.A0a;
                        if (list != null) {
                            list.remove(r4);
                        }
                        for (int size = r4.A0O.size() - 1; size >= 0; size--) {
                            AbstractC16160pM.A00(((C16190pP) r4.A0O.get(0)).A0C);
                        }
                        r4.A0O.clear();
                        r4.A0G = null;
                        r4.A0A = -1;
                        VelocityTracker velocityTracker = r4.A0F;
                        if (velocityTracker != null) {
                            velocityTracker.recycle();
                            r4.A0F = null;
                        }
                        C16170pN r0 = r4.A0J;
                        if (r0 != null) {
                            r0.A00 = false;
                            r4.A0J = null;
                        }
                        if (r4.A0H != null) {
                            r4.A0H = null;
                        }
                    }
                    r4.A0M = recyclerView;
                    if (recyclerView != null) {
                        Resources resources = recyclerView.getResources();
                        r4.A07 = resources.getDimension(R.dimen.item_touch_helper_swipe_escape_velocity);
                        r4.A04 = resources.getDimension(R.dimen.item_touch_helper_swipe_escape_max_velocity);
                        r4.A0C = ViewConfiguration.get(r4.A0M.getContext()).getScaledTouchSlop();
                        r4.A0M.A0j(r4);
                        RecyclerView recyclerView4 = r4.A0M;
                        recyclerView4.A15.add(r4.A0Q);
                        List list2 = recyclerView4.A0a;
                        if (list2 == null) {
                            list2 = new ArrayList();
                            recyclerView4.A0a = list2;
                        }
                        list2.add(r4);
                        r4.A0J = new C16170pN(r4);
                        r4.A0H = new C14890n3(r4.A0M.getContext(), r4.A0J);
                    }
                }
                ((StickerStoreTabFragment) stickerStoreMyTabFragment2).A02.postDelayed(new RunnableEBaseShape13S0100000_I1_8(stickerStoreMyTabFragment2, 1), 300);
                return inflate;
            }
            throw null;
        }
        throw null;
    }

    public void A0n() {
        C71823Ql r0 = this.A05;
        if (r0 == null || r0.A05() != 0) {
            A0p(false);
        } else {
            A0p(true);
        }
    }

    public void A0o(AnonymousClass33N r5, int i) {
        String str;
        Intent intent = new Intent(A00(), StickerStorePackPreviewActivity.class);
        intent.putExtra("sticker_pack_id", r5.A0D);
        if (!(this instanceof StickerStoreMyTabFragment)) {
            str = "sticker_store_featured_tab";
        } else {
            str = "sticker_store_my_tab";
        }
        intent.putExtra("sticker_pack_preview_source", str);
        AnonymousClass037 r2 = super.A0D;
        if (r2 != null) {
            r2.A0M(intent, 1, null);
            return;
        }
        throw null;
    }

    public void A0p(boolean z) {
        if (!(this instanceof StickerStoreMyTabFragment)) {
            View view = ((StickerStoreFeaturedTabFragment) this).A00;
            if (view != null) {
                int i = 8;
                if (z) {
                    i = 0;
                }
                view.setVisibility(i);
                return;
            }
            return;
        }
        View view2 = ((StickerStoreMyTabFragment) this).A00;
        if (view2 != null) {
            int i2 = 8;
            if (z) {
                i2 = 0;
            }
            view2.setVisibility(i2);
        }
    }
}
