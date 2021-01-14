package com.whatsapp;

import X.AnonymousClass01X;
import X.C002701k;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import com.google.android.search.verification.client.R;
import com.whatsapp.base.WaFragment;

public abstract class BaseViewStubFragment extends WaFragment {
    public ViewStub A00;
    public boolean A01 = false;
    public final C002701k A02;

    public BaseViewStubFragment() {
        AnonymousClass01X.A00();
        this.A02 = C002701k.A00();
    }

    @Override // X.AnonymousClass037, com.whatsapp.base.WaFragment
    public void A0T(boolean z) {
        ViewStub viewStub;
        super.A0T(z);
        if (z && (viewStub = this.A00) != null && !this.A01) {
            viewStub.inflate();
            this.A01 = true;
        }
    }

    @Override // X.AnonymousClass037
    public void A0Y() {
        this.A0U = true;
        this.A01 = false;
    }

    @Override // X.AnonymousClass037
    public View A0Z(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.fragment_viewstub, viewGroup, false);
        ViewStub viewStub = (ViewStub) inflate.findViewById(R.id.fragmentViewStub);
        this.A00 = viewStub;
        viewStub.setLayoutResource(R.layout.camera_controls);
        if (!this.A01 && (this.A0k || !this.A02.A0E(128))) {
            this.A00.inflate();
            this.A01 = true;
        }
        return inflate;
    }
}
