package X;

import android.text.TextUtils;
import android.view.View;
import android.widget.AdapterView;
import com.whatsapp.payments.ui.IndiaUpiBankAccountPickerActivity;
import com.whatsapp.util.Log;
import java.util.ArrayList;

/* renamed from: X.2uZ  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C62302uZ implements AdapterView.OnItemClickListener {
    public final /* synthetic */ IndiaUpiBankAccountPickerActivity A00;

    public /* synthetic */ C62302uZ(IndiaUpiBankAccountPickerActivity indiaUpiBankAccountPickerActivity) {
        this.A00 = indiaUpiBankAccountPickerActivity;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        IndiaUpiBankAccountPickerActivity indiaUpiBankAccountPickerActivity = this.A00;
        indiaUpiBankAccountPickerActivity.A00 = view;
        adapterView.setEnabled(false);
        indiaUpiBankAccountPickerActivity.A0b();
        C74463ay r9 = (C74463ay) indiaUpiBankAccountPickerActivity.A08.get(i);
        indiaUpiBankAccountPickerActivity.A03 = r9;
        AnonymousClass3EN r14 = indiaUpiBankAccountPickerActivity.A05;
        boolean z = ((AnonymousClass1PY) indiaUpiBankAccountPickerActivity).A09;
        C68923Fb r6 = new C68923Fb(indiaUpiBankAccountPickerActivity);
        if (r14 != null) {
            Log.i("PAY: IndiaUpiPaymentSetup registerVpa called");
            C61082sT r5 = ((C61432tA) r14).A00;
            r5.A03("upi-register-vpa");
            ArrayList arrayList = new ArrayList();
            if (!TextUtils.isEmpty(r9.A0D)) {
                arrayList.add(new AnonymousClass0OS("vpa", r9.A0D, null, (byte) 0));
            }
            if (!TextUtils.isEmpty(r9.A0E)) {
                arrayList.add(new AnonymousClass0OS("vpa-id", r9.A0E, null, (byte) 0));
            }
            arrayList.add(new AnonymousClass0OS("action", "upi-register-vpa", null, (byte) 0));
            arrayList.add(new AnonymousClass0OS("device-id", r14.A09.A02(), null, (byte) 0));
            String str = r9.A0A;
            if (str == null) {
                str = "";
            }
            arrayList.add(new AnonymousClass0OS("upi-bank-info", str, null, (byte) 0));
            String str2 = "1";
            String str3 = "0";
            if (z) {
                str3 = str2;
            }
            arrayList.add(new AnonymousClass0OS("default-debit", str3, null, (byte) 0));
            if (!z) {
                str2 = "0";
            }
            arrayList.add(new AnonymousClass0OS("default-credit", str2, null, (byte) 0));
            String A04 = r14.A05.A04();
            if (!TextUtils.isEmpty(A04)) {
                AnonymousClass008.A1F("provider-type", A04, arrayList);
            }
            r14.A00 = r9;
            ((C61432tA) r14).A01.A09(true, new AnonymousClass0M5("account", (AnonymousClass0OS[]) arrayList.toArray(new AnonymousClass0OS[0]), null, null), new C74703bM(r14, r14.A02, r14.A03, r14.A04, r14.A07, r5, r6), 0);
            indiaUpiBankAccountPickerActivity.A0I.AQ7();
            AnonymousClass20F r2 = indiaUpiBankAccountPickerActivity.A0B;
            r2.A01 = Long.valueOf((long) i);
            ((AnonymousClass1PY) indiaUpiBankAccountPickerActivity).A0A.A07(r2);
            return;
        }
        throw null;
    }
}
