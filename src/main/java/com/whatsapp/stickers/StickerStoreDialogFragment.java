package com.whatsapp.stickers;

import X.AnonymousClass01X;
import X.AnonymousClass037;
import X.AnonymousClass0Q7;
import X.AnonymousClass1E4;
import X.AnonymousClass333;
import X.AnonymousClass3QX;
import X.AnonymousClass3QY;
import X.AnonymousClass3QZ;
import X.C002001d;
import X.C06470Tj;
import X.C08450b8;
import X.C14270lr;
import X.C36931nA;
import android.app.Dialog;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.fragment.app.DialogFragment;
import androidx.viewpager.widget.ViewPager;
import com.facebook.redex.ViewOnClickEBaseShape8S0100000_I1_6;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.tabs.TabLayout;
import com.google.android.search.verification.client.R;
import com.whatsapp.base.WaDialogFragment;

public class StickerStoreDialogFragment extends WaDialogFragment {
    public View A00;
    public ViewPager A01;
    public BottomSheetBehavior A02;
    public TabLayout A03;
    public C08450b8 A04;
    public StickerStoreFeaturedTabFragment A05;
    public StickerStoreMyTabFragment A06;
    public final AnonymousClass01X A07 = AnonymousClass01X.A00();

    @Override // X.AnonymousClass037
    public View A0Z(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        super.A0i(bundle);
        View inflate = A05().inflate(R.layout.sticker_store, (ViewGroup) null, false);
        this.A00 = inflate;
        View findViewById = inflate.findViewById(R.id.store_container);
        this.A03 = (TabLayout) this.A00.findViewById(R.id.sticker_store_tabs);
        this.A01 = (ViewPager) this.A00.findViewById(R.id.sticker_store_pager);
        this.A04 = new C08450b8(A0C());
        this.A05 = new StickerStoreFeaturedTabFragment();
        this.A06 = new StickerStoreMyTabFragment();
        StickerStoreFeaturedTabFragment stickerStoreFeaturedTabFragment = this.A05;
        boolean z = false;
        if (bundle == null) {
            z = true;
        }
        stickerStoreFeaturedTabFragment.A01 = z;
        AnonymousClass0Q7.A0X(this.A03, 0);
        AnonymousClass01X r6 = this.A07;
        if (r6.A0M()) {
            A0x(this.A05, R.string.sticker_store_featured_tab_title);
            A0x(this.A06, R.string.sticker_store_my_tab_title);
        } else {
            A0x(this.A06, R.string.sticker_store_my_tab_title);
            A0x(this.A05, R.string.sticker_store_featured_tab_title);
        }
        this.A01.setAdapter(this.A04);
        this.A01.A0F(new C36931nA(this.A03));
        this.A01.A0F(new AnonymousClass3QX(this));
        this.A01.A0B(!r6.A0M(), false);
        TabLayout tabLayout = this.A03;
        AnonymousClass3QY r1 = new AnonymousClass3QY(this);
        if (!tabLayout.A0c.contains(r1)) {
            tabLayout.A0c.add(r1);
        }
        Toolbar toolbar = (Toolbar) findViewById.findViewById(R.id.toolbar);
        toolbar.setNavigationIcon(new C06470Tj(r6, C002001d.A0b(A00(), R.drawable.ic_back_teal, R.color.tealActionBarItemDrawableTint)));
        toolbar.setNavigationContentDescription(R.string.sticker_store_back_button_content_description);
        toolbar.setTitle(r6.A06(R.string.sticker_store_title));
        toolbar.setNavigationOnClickListener(new ViewOnClickEBaseShape8S0100000_I1_6(this, 40));
        AnonymousClass3 r12 = new BottomSheetBehavior() {
            /* class com.whatsapp.stickers.StickerStoreDialogFragment.AnonymousClass3 */

            @Override // com.google.android.material.bottomsheet.BottomSheetBehavior, X.AbstractC07570Yg
            public boolean A04(CoordinatorLayout coordinatorLayout, View view, int i) {
                super.A04(coordinatorLayout, view, i);
                return true;
            }
        };
        this.A02 = r12;
        r12.A0J = true;
        r12.A0D(4);
        this.A02.A0N = true;
        BottomSheetBehavior bottomSheetBehavior = this.A02;
        ((C14270lr) findViewById.getLayoutParams()).A00(bottomSheetBehavior);
        bottomSheetBehavior.A0E = new AnonymousClass3QZ(this);
        return this.A00;
    }

    @Override // X.AnonymousClass037, com.whatsapp.base.WaDialogFragment, androidx.fragment.app.DialogFragment
    public void A0f() {
        super.A0f();
        Dialog dialog = ((DialogFragment) this).A03;
        if (dialog != null) {
            Window window = dialog.getWindow();
            if (window != null) {
                window.setLayout(-1, -1);
                window.setBackgroundDrawable(new ColorDrawable(0));
            }
            dialog.setCanceledOnTouchOutside(false);
            dialog.setCancelable(false);
            dialog.setOnKeyListener(new AnonymousClass333(this));
        }
        BottomSheetBehavior bottomSheetBehavior = this.A02;
        if (bottomSheetBehavior != null && bottomSheetBehavior.A0B == 4) {
            this.A00.post(new RunnableEBaseShape12S0100000_I1_7(this, 48));
        }
    }

    @Override // X.AnonymousClass037
    public void A0g(int i, int i2, Intent intent) {
        if (i == 1 && i2 == 1 && this.A04 != null) {
            this.A01.postDelayed(new RunnableEBaseShape12S0100000_I1_7(this, 47), 300);
        }
    }

    public final void A0x(AnonymousClass037 r4, int i) {
        this.A04.A00.add(r4);
        TabLayout tabLayout = this.A03;
        AnonymousClass1E4 A032 = tabLayout.A03();
        A032.A01(this.A07.A06(i));
        tabLayout.A0E(A032, tabLayout.A0d.isEmpty());
    }
}
