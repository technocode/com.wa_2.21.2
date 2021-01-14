package X;

import android.view.View;
import com.facebook.redex.ViewOnClickEmptyBase;
import com.google.android.search.verification.client.R;
import com.whatsapp.payments.ui.IndiaUpiDeviceBindActivity;

/* renamed from: X.2ue  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class View$OnClickListenerC62352ue extends ViewOnClickEmptyBase implements View.OnClickListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ IndiaUpiDeviceBindActivity A02;

    public /* synthetic */ View$OnClickListenerC62352ue(IndiaUpiDeviceBindActivity indiaUpiDeviceBindActivity, int i, int i2) {
        this.A02 = indiaUpiDeviceBindActivity;
        this.A00 = i;
        this.A01 = i2;
    }

    public final void onClick(View view) {
        IndiaUpiDeviceBindActivity indiaUpiDeviceBindActivity = this.A02;
        int i = this.A00;
        int i2 = this.A01;
        indiaUpiDeviceBindActivity.A01 = i;
        indiaUpiDeviceBindActivity.findViewById(R.id.dual_sim_picker).setVisibility(8);
        indiaUpiDeviceBindActivity.A04.setText(((AnonymousClass2C0) indiaUpiDeviceBindActivity).A01.A06(R.string.register_wait_message));
        indiaUpiDeviceBindActivity.A04.setVisibility(0);
        indiaUpiDeviceBindActivity.A0e();
        AnonymousClass20G r2 = new AnonymousClass20G();
        r2.A01 = indiaUpiDeviceBindActivity.A0S.A02;
        r2.A00 = Long.valueOf((long) i2);
        ((AnonymousClass1PY) indiaUpiDeviceBindActivity).A0A.A07(r2);
    }
}
