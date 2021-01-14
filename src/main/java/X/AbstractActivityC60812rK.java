package X;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.search.verification.client.R;
import com.whatsapp.companiondevice.LinkedDevicesActivity;
import com.whatsapp.companiondevice.LinkedDevicesDetailDialogFragment;
import com.whatsapp.companiondevice.PairedDevicesActivity;
import com.whatsapp.qrcode.DevicePairQrScannerActivity;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.2rK  reason: invalid class name and case insensitive filesystem */
public abstract class AbstractActivityC60812rK extends ActivityC004602e {
    public ProgressDialog A00;
    public final C51052Xd A01;
    public final AnonymousClass04j A02 = AnonymousClass04j.A00();
    public final AnonymousClass0By A03;
    public final C02430Bz A04 = C02430Bz.A00();
    public final C015908r A05 = C015908r.A00();
    public final AbstractC28721Vm A06;
    public final C02360Br A07 = C02360Br.A00();
    public final AnonymousClass00T A08 = C002101e.A00();
    public final C02400Bv A09 = C02400Bv.A00();
    public final AnonymousClass0KL A0A;
    public final AnonymousClass0C4 A0B = AnonymousClass0C4.A00();
    public final C67883Aw A0C;

    public AbstractActivityC60812rK() {
        AbstractC28721Vm r0 = AbstractC28721Vm.A00;
        if (r0 != null) {
            this.A06 = r0;
            this.A0C = new C67883Aw();
            this.A0A = new C51032Xb(this);
            this.A03 = new C51042Xc(this);
            this.A01 = new C51052Xd(this);
            return;
        }
        throw null;
    }

    public static Intent A04(Context context, C000300f r3, C015808q r4) {
        if (C28051Sr.A1r(r3, r4)) {
            return new Intent(context, LinkedDevicesActivity.class);
        }
        return new Intent(context, PairedDevicesActivity.class);
    }

    public static void A05(AbstractActivityC60812rK r3) {
        if (r3.A00 == null) {
            ProgressDialog progressDialog = new ProgressDialog(r3);
            r3.A00 = progressDialog;
            progressDialog.setMessage(((AnonymousClass2C0) r3).A01.A06(R.string.logging_out_device));
            r3.A00.setCancelable(false);
        }
        r3.A00.show();
    }

    public void A0T() {
        if (!(this instanceof PairedDevicesActivity)) {
            LinkedDevicesActivity linkedDevicesActivity = (LinkedDevicesActivity) this;
            linkedDevicesActivity.A0V(Collections.emptyList());
            linkedDevicesActivity.A0W(Collections.emptyList());
            List emptyList = Collections.emptyList();
            C51022Xa r0 = linkedDevicesActivity.A02;
            r0.A01 = emptyList;
            r0.A08();
            ((AbstractC16300pa) r0).A01.A00();
            return;
        }
        if (!A0P()) {
            startActivity(new Intent(this, DevicePairQrScannerActivity.class));
        }
        finish();
    }

    public void A0U() {
        this.A08.ANC(new C10960fU(this.A0B, this.A04, this.A06, new AnonymousClass2XN(this)), new Void[0]);
    }

    public void A0V(List list) {
        if (!(this instanceof PairedDevicesActivity)) {
            LinkedDevicesActivity linkedDevicesActivity = (LinkedDevicesActivity) this;
            linkedDevicesActivity.A06 = list;
            C51022Xa r5 = linkedDevicesActivity.A02;
            r5.A00.clear();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                r5.A00.add(new AnonymousClass2XO((AnonymousClass1VI) it.next()));
            }
            r5.A08();
            ((AbstractC16300pa) r5).A01.A00();
            LinkedDevicesDetailDialogFragment linkedDevicesDetailDialogFragment = linkedDevicesActivity.A03;
            if (linkedDevicesDetailDialogFragment != null && linkedDevicesDetailDialogFragment.A02 != null) {
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    AnonymousClass1VI r2 = (AnonymousClass1VI) it2.next();
                    if (r2.A05.equals(linkedDevicesActivity.A03.A02.A05)) {
                        LinkedDevicesDetailDialogFragment linkedDevicesDetailDialogFragment2 = linkedDevicesActivity.A03;
                        linkedDevicesDetailDialogFragment2.A02 = r2;
                        linkedDevicesDetailDialogFragment2.A04 = null;
                        linkedDevicesDetailDialogFragment2.A03 = null;
                        if (linkedDevicesDetailDialogFragment2.A01 != null) {
                            linkedDevicesDetailDialogFragment2.A0x();
                            return;
                        }
                        return;
                    }
                }
                return;
            }
            return;
        }
        PairedDevicesActivity pairedDevicesActivity = (PairedDevicesActivity) this;
        AnonymousClass2FE r0 = pairedDevicesActivity.A02;
        r0.A00 = list;
        r0.notifyDataSetChanged();
        int i = 8;
        if (pairedDevicesActivity.A02.getCount() > 0) {
            i = 0;
        }
        pairedDevicesActivity.A01.setVisibility(i);
        pairedDevicesActivity.A00.setVisibility(i);
    }

    public void A0W(List list) {
        if (!(this instanceof PairedDevicesActivity)) {
            LinkedDevicesActivity linkedDevicesActivity = (LinkedDevicesActivity) this;
            Collections.sort(list, linkedDevicesActivity.A0I);
            C51022Xa r0 = linkedDevicesActivity.A02;
            r0.A03 = list;
            r0.A08();
            ((AbstractC16300pa) r0).A01.A00();
            LinkedDevicesDetailDialogFragment linkedDevicesDetailDialogFragment = linkedDevicesActivity.A03;
            if (linkedDevicesDetailDialogFragment != null && linkedDevicesDetailDialogFragment.A04 != null) {
                Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    AnonymousClass0K4 r4 = (AnonymousClass0K4) it.next();
                    String str = r4.A0I;
                    LinkedDevicesDetailDialogFragment linkedDevicesDetailDialogFragment2 = linkedDevicesActivity.A03;
                    if (str.equals(linkedDevicesDetailDialogFragment2.A04.A0I)) {
                        linkedDevicesDetailDialogFragment2.A04 = r4;
                        linkedDevicesDetailDialogFragment2.A02 = null;
                        linkedDevicesDetailDialogFragment2.A03 = null;
                        if (linkedDevicesDetailDialogFragment2.A01 != null) {
                            linkedDevicesDetailDialogFragment2.A0x();
                        }
                    }
                }
            }
            if (list.isEmpty()) {
                C015808q r42 = linkedDevicesActivity.A0G;
                if (r42.A03() && r42.A02.A06(AbstractC000400g.A3P) == 2 && !r42.A03.A00.getBoolean("md_automatic_opt_in_used", false)) {
                    AnonymousClass00D r43 = linkedDevicesActivity.A0J;
                    if (!r43.A00.getBoolean("companion_reg_opt_in_enabled", false)) {
                        AnonymousClass008.A0n(r43, "companion_reg_opt_in_enabled", true);
                        ((AbstractC16300pa) linkedDevicesActivity.A02).A01.A00();
                        linkedDevicesActivity.A0A.A02();
                        ((AbstractActivityC60812rK) linkedDevicesActivity).A08.ANF(new RunnableEBaseShape8S0100000_I1_3(linkedDevicesActivity.A0B, 24));
                    }
                    AnonymousClass008.A0n(r43, "md_automatic_opt_in_used", true);
                    return;
                }
                return;
            }
            return;
        }
        PairedDevicesActivity pairedDevicesActivity = (PairedDevicesActivity) this;
        AnonymousClass2FE r1 = pairedDevicesActivity.A02;
        Collections.sort(list, ((AbstractActivityC60812rK) r1.A02).A0C);
        r1.A01 = list;
        r1.notifyDataSetChanged();
        int i = 8;
        if (pairedDevicesActivity.A02.getCount() > 0) {
            i = 0;
        }
        pairedDevicesActivity.A01.setVisibility(i);
        pairedDevicesActivity.A00.setVisibility(i);
    }

    @Override // X.AnonymousClass2C0, X.ActivityC004602e, X.ActivityC004802g, X.ActivityC004702f, X.AnonymousClass02i, X.ActivityC004902h, X.ActivityC005002j
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        AnonymousClass0C4 r0 = this.A0B;
        AnonymousClass0KL r2 = this.A0A;
        List list = r0.A0S;
        if (!list.contains(r2)) {
            list.add(r2);
        }
        this.A04.A00(this.A03);
    }

    @Override // X.ActivityC004802g, X.ActivityC004702f, X.ActivityC004902h
    public void onDestroy() {
        super.onDestroy();
        AnonymousClass0C4 r0 = this.A0B;
        r0.A0S.remove(this.A0A);
        this.A04.A01(this.A03);
    }
}
