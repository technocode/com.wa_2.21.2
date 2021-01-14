package com.whatsapp.dialogs;

import X.AnonymousClass008;
import X.AnonymousClass00Y;
import X.AnonymousClass01X;
import X.AnonymousClass02N;
import X.AnonymousClass0Q7;
import X.C09190cR;
import android.content.DialogInterface;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.DialogFragment;
import com.facebook.redex.ViewOnClickEBaseShape0S0201000_I1;
import com.google.android.search.verification.client.R;
import com.whatsapp.RoundedBottomSheetDialogFragment;
import com.whatsapp.components.MaxHeightLinearLayout;

public class RoomsNUXBottomSheetDialogFragment extends RoundedBottomSheetDialogFragment {
    public MaxHeightLinearLayout A00;
    public final C09190cR A01 = C09190cR.A00();
    public final AnonymousClass01X A02 = AnonymousClass01X.A00();

    public RoomsNUXBottomSheetDialogFragment() {
        AnonymousClass00Y.A00();
    }

    @Override // X.AnonymousClass037
    public View A0Z(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Bundle A03 = A03();
        AnonymousClass02N A012 = AnonymousClass02N.A01(A03.getString("ref", null));
        int i = A03.getInt("entry_point");
        View inflate = layoutInflater.inflate(R.layout.rooms_bottom_sheet_nux, viewGroup, false);
        this.A00 = (MaxHeightLinearLayout) AnonymousClass0Q7.A0D(inflate, R.id.container);
        View A0D = AnonymousClass0Q7.A0D(inflate, R.id.continue_button);
        AnonymousClass01X r1 = this.A02;
        ((TextView) AnonymousClass0Q7.A0D(inflate, R.id.dialog_title)).setText(r1.A06(R.string.rooms_nux_title));
        ((TextView) AnonymousClass0Q7.A0D(inflate, R.id.dialog_message)).setText(r1.A06(R.string.rooms_create_link_in_messenger_nux));
        ((TextView) AnonymousClass0Q7.A0D(inflate, R.id.dialog_submessage)).setText(r1.A06(R.string.rooms_non_e2e_warning));
        ((ImageView) AnonymousClass0Q7.A0D(inflate, R.id.illustration)).setImageResource(R.drawable.ill_room);
        A0D.setOnClickListener(new ViewOnClickEBaseShape0S0201000_I1(this, A012, i, 4));
        A0z();
        return inflate;
    }

    public final void A0z() {
        if (A02().getConfiguration().orientation == 1) {
            this.A00.setMaxHeight((int) (((float) A0x()) * 0.75f));
        } else {
            this.A00.setMaxHeight(0);
        }
    }

    @Override // X.AnonymousClass037
    public void onConfigurationChanged(Configuration configuration) {
        this.A0U = true;
        A0z();
    }

    @Override // androidx.fragment.app.DialogFragment
    public void onDismiss(DialogInterface dialogInterface) {
        if (!((DialogFragment) this).A0C) {
            A0w(true, true);
        }
        AnonymousClass008.A0n(this.A01.A03, "rooms_nux_shown", true);
    }
}
