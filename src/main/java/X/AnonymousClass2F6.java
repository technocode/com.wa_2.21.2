package X;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import com.google.android.search.verification.client.R;
import com.whatsapp.companiondevice.LinkedDevicesLogoutOneDeviceConfirmationDialogFragment;
import com.whatsapp.companiondevice.PairedDevicesActivity;
import com.whatsapp.jid.DeviceJid;

/* renamed from: X.2F6  reason: invalid class name */
public final /* synthetic */ class AnonymousClass2F6 implements AdapterView.OnItemClickListener {
    public final /* synthetic */ PairedDevicesActivity A00;

    public /* synthetic */ AnonymousClass2F6(PairedDevicesActivity pairedDevicesActivity) {
        this.A00 = pairedDevicesActivity;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        PairedDevicesActivity pairedDevicesActivity = this.A00;
        if (!pairedDevicesActivity.A0Q(R.string.connectivity_check_connection)) {
            Object item = pairedDevicesActivity.A02.getItem(i - 1);
            if (item instanceof AnonymousClass0K4) {
                String str = ((AnonymousClass0K4) item).A0I;
                LinkedDevicesLogoutOneDeviceConfirmationDialogFragment linkedDevicesLogoutOneDeviceConfirmationDialogFragment = new LinkedDevicesLogoutOneDeviceConfirmationDialogFragment(((AbstractActivityC60812rK) pairedDevicesActivity).A01);
                Bundle bundle = new Bundle();
                bundle.putString("browserId", str);
                linkedDevicesLogoutOneDeviceConfirmationDialogFragment.A0N(bundle);
                linkedDevicesLogoutOneDeviceConfirmationDialogFragment.A0u(pairedDevicesActivity.A04(), null);
                return;
            }
            DeviceJid deviceJid = ((AnonymousClass1VI) item).A05;
            LinkedDevicesLogoutOneDeviceConfirmationDialogFragment linkedDevicesLogoutOneDeviceConfirmationDialogFragment2 = new LinkedDevicesLogoutOneDeviceConfirmationDialogFragment(((AbstractActivityC60812rK) pairedDevicesActivity).A01);
            Bundle bundle2 = new Bundle();
            bundle2.putString("deviceJid", deviceJid.getRawString());
            linkedDevicesLogoutOneDeviceConfirmationDialogFragment2.A0N(bundle2);
            linkedDevicesLogoutOneDeviceConfirmationDialogFragment2.A0u(pairedDevicesActivity.A04(), null);
        }
    }
}
