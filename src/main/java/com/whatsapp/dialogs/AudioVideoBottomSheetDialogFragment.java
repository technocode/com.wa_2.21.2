package com.whatsapp.dialogs;

import X.AbstractC03720Hj;
import X.AnonymousClass008;
import X.AnonymousClass0Q7;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.redex.ViewOnClickEBaseShape5S0100000_I1_3;
import com.google.android.search.verification.client.R;
import com.whatsapp.RoundedBottomSheetDialogFragment;

public class AudioVideoBottomSheetDialogFragment extends RoundedBottomSheetDialogFragment {
    public AbstractC03720Hj A00;

    @Override // X.AnonymousClass037, androidx.fragment.app.DialogFragment
    public void A0Y() {
        super.A0Y();
        this.A00 = null;
    }

    @Override // X.AnonymousClass037
    public View A0Z(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        A03();
        View inflate = layoutInflater.inflate(R.layout.audio_video_bottom_sheet, viewGroup, false);
        View A0D = AnonymousClass0Q7.A0D(inflate, R.id.audio_call_button);
        View A0D2 = AnonymousClass0Q7.A0D(inflate, R.id.video_call_button);
        A0D.setOnClickListener(new ViewOnClickEBaseShape5S0100000_I1_3(this, 36));
        A0D2.setOnClickListener(new ViewOnClickEBaseShape5S0100000_I1_3(this, 35));
        return inflate;
    }

    @Override // X.AnonymousClass037, androidx.fragment.app.DialogFragment
    public void A0a(Context context) {
        super.A0a(context);
        if (context instanceof AbstractC03720Hj) {
            this.A00 = (AbstractC03720Hj) context;
            return;
        }
        StringBuilder A0S = AnonymousClass008.A0S("Activity must implement ");
        A0S.append("AudioVideoBottomSheetDialogFragment$AudioVideoBottomSheetDialogListener");
        throw new IllegalStateException(A0S.toString());
    }
}
