package com.whatsapp.storage;

import X.AnonymousClass01X;
import X.AnonymousClass037;
import X.AnonymousClass343;
import X.AnonymousClass34D;
import X.AnonymousClass3RO;
import android.app.Dialog;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import androidx.fragment.app.DialogFragment;
import com.facebook.redex.ViewOnClickEBaseShape1S0101000_I1;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import com.google.android.search.verification.client.R;

public class StorageUsageGallerySortBottomSheet extends BottomSheetDialogFragment {
    public AnonymousClass3RO A00;
    public AnonymousClass34D A01;
    public AnonymousClass34D A02;
    public AnonymousClass34D A03;
    public AnonymousClass34D A04;
    public final AnonymousClass01X A05 = AnonymousClass01X.A00();

    @Override // X.AnonymousClass037, androidx.fragment.app.DialogFragment
    public void A0X() {
        super.A0X();
        this.A00 = null;
        this.A02 = null;
        this.A03 = null;
        this.A04 = null;
    }

    @Override // X.AnonymousClass037
    public View A0Z(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ViewGroup viewGroup2 = (ViewGroup) layoutInflater.inflate(R.layout.storage_usage_gallery_sort_bottom_sheet, viewGroup, false);
        AnonymousClass34D r1 = new AnonymousClass34D(A00());
        this.A02 = r1;
        AnonymousClass01X r9 = this.A05;
        r1.setText(r9.A06(R.string.sort_by_newest));
        this.A02.setOnClickListener(new ViewOnClickEBaseShape1S0101000_I1(this, 0, 10));
        viewGroup2.addView(this.A02);
        AnonymousClass34D r12 = new AnonymousClass34D(A00());
        this.A03 = r12;
        r12.setText(r9.A06(R.string.sort_by_oldest));
        this.A03.setOnClickListener(new ViewOnClickEBaseShape1S0101000_I1(this, 1, 10));
        viewGroup2.addView(this.A03);
        AnonymousClass34D r13 = new AnonymousClass34D(A00());
        this.A04 = r13;
        r13.setText(r9.A06(R.string.sort_by_size));
        this.A04.setOnClickListener(new ViewOnClickEBaseShape1S0101000_I1(this, 2, 10));
        viewGroup2.addView(this.A04);
        Bundle bundle2 = ((AnonymousClass037) this).A06;
        if (bundle2 != null) {
            if (bundle2.getBoolean("storage_usage_gallery_sort_bottom_sheet_show_forwarding_score", false)) {
                AnonymousClass34D r14 = new AnonymousClass34D(A00());
                this.A01 = r14;
                r14.setText(r9.A06(R.string.sort_by_forwarding_score));
                this.A01.setOnClickListener(new ViewOnClickEBaseShape1S0101000_I1(this, 3, 10));
                viewGroup2.addView(this.A01);
            }
            int i = bundle2.getInt("storage_usage_gallery_sort_bottom_sheet_selected_sort_row", 0);
            this.A02.setChecked(false);
            this.A03.setChecked(false);
            this.A04.setChecked(false);
            if (i == 0) {
                this.A02.setChecked(true);
            } else if (i == 1) {
                this.A03.setChecked(true);
            } else if (i == 2) {
                this.A04.setChecked(true);
            } else if (i == 3) {
                AnonymousClass34D r0 = this.A01;
                if (r0 != null) {
                    r0.setChecked(true);
                } else {
                    throw null;
                }
            }
            Dialog dialog = ((DialogFragment) this).A03;
            if (dialog != null) {
                Window window = dialog.getWindow();
                if (window != null) {
                    if (Build.VERSION.SDK_INT >= 21) {
                        window.getDecorView().setSystemUiVisibility(1280);
                        window.setStatusBarColor(0);
                    }
                    WindowManager.LayoutParams attributes = window.getAttributes();
                    attributes.width = -1;
                    attributes.gravity = 48;
                    window.setAttributes(attributes);
                    dialog.setOnShowListener(new AnonymousClass343(this));
                    return viewGroup2;
                }
                throw null;
            }
            throw null;
        }
        throw null;
    }

    @Override // X.AnonymousClass037, androidx.fragment.app.DialogFragment
    public void A0i(Bundle bundle) {
        super.A0i(bundle);
        A0s(0, 2131952160);
    }
}
