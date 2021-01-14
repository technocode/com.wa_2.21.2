package com.whatsapp.twofactor;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.redex.ViewOnClickEBaseShape9S0100000_I1_7;
import com.google.android.search.verification.client.R;
import com.whatsapp.base.WaFragment;

public class DoneFragment extends WaFragment {
    @Override // X.AnonymousClass037
    public View A0Z(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.fragment_two_factor_auth_done, viewGroup, false);
    }

    @Override // X.AnonymousClass037
    public void A0l(View view, Bundle bundle) {
        view.findViewById(R.id.done_button).setOnClickListener(new ViewOnClickEBaseShape9S0100000_I1_7(this, 2));
        TwoFactorAuthActivity twoFactorAuthActivity = (TwoFactorAuthActivity) A0A();
        twoFactorAuthActivity.A0V(view, twoFactorAuthActivity.A05.length);
    }
}
