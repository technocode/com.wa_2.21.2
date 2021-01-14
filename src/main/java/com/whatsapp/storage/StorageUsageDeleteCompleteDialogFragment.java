package com.whatsapp.storage;

import X.AnonymousClass01X;
import X.AnonymousClass02M;
import X.AnonymousClass037;
import X.AnonymousClass0MB;
import X.AnonymousClass0MC;
import X.AnonymousClass0Q7;
import X.AnonymousClass24Q;
import X.AnonymousClass3RY;
import X.C002001d;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.DialogFragment;
import com.google.android.search.verification.client.R;
import com.whatsapp.base.WaDialogFragment;

public class StorageUsageDeleteCompleteDialogFragment extends WaDialogFragment {
    public final AnonymousClass02M A00 = AnonymousClass02M.A00();
    public final AnonymousClass01X A01 = AnonymousClass01X.A00();

    @Override // X.AnonymousClass037
    public void A0e() {
        this.A0U = true;
        ((DialogFragment) this).A03.getWindow().setLayout(A02().getDimensionPixelSize(R.dimen.storage_usage_delete_complete_dialog_width), -2);
    }

    @Override // androidx.fragment.app.DialogFragment
    public Dialog A0p(Bundle bundle) {
        Context A002 = A00();
        Bundle bundle2 = ((AnonymousClass037) this).A06;
        if (bundle2 != null) {
            View inflate = LayoutInflater.from(A002).inflate(R.layout.storage_usage_delete_complete_dialog, (ViewGroup) null, false);
            ImageView imageView = (ImageView) AnonymousClass0Q7.A0D(inflate, R.id.check_mark_image_view);
            AnonymousClass24Q A003 = AnonymousClass24Q.A00(A002, R.drawable.storage_usage_check_mark_icon);
            if (A003 != null) {
                imageView.setImageDrawable(A003);
                A003.start();
                A003.A02(new AnonymousClass3RY(this));
                ((TextView) AnonymousClass0Q7.A0D(inflate, R.id.title_text_view)).setText(C002001d.A1V(this.A01, R.plurals.storage_usage_delete_completed_text, bundle2.getLong("deleted_disk_size"), true));
                AnonymousClass0MB r2 = new AnonymousClass0MB(A002);
                AnonymousClass0MC r1 = r2.A01;
                r1.A0C = inflate;
                r1.A01 = 0;
                r1.A0J = true;
                return r2.A00();
            }
            throw null;
        }
        throw null;
    }
}
