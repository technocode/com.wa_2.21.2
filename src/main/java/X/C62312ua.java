package X;

import android.content.Intent;
import android.text.TextUtils;
import android.view.View;
import android.widget.AdapterView;
import com.whatsapp.payments.ui.IndiaUpiBankPickerActivity;
import com.whatsapp.payments.ui.IndiaUpiDeviceBindActivity;

/* renamed from: X.2ua  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C62312ua implements AdapterView.OnItemClickListener {
    public final /* synthetic */ IndiaUpiBankPickerActivity A00;

    public /* synthetic */ C62312ua(IndiaUpiBankPickerActivity indiaUpiBankPickerActivity) {
        this.A00 = indiaUpiBankPickerActivity;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        IndiaUpiBankPickerActivity indiaUpiBankPickerActivity = this.A00;
        ((AnonymousClass1PY) indiaUpiBankPickerActivity).A0C.A02(view);
        adapterView.setEnabled(false);
        indiaUpiBankPickerActivity.A00 = view;
        AbstractC43781yw r4 = (AbstractC43781yw) indiaUpiBankPickerActivity.A05.A00.get(i);
        if (r4 != null) {
            Intent intent = new Intent(indiaUpiBankPickerActivity, IndiaUpiDeviceBindActivity.class);
            indiaUpiBankPickerActivity.A0c(intent);
            intent.putExtra("extra_selected_bank", r4);
            indiaUpiBankPickerActivity.startActivity(intent);
            indiaUpiBankPickerActivity.finish();
            AnonymousClass20E r2 = indiaUpiBankPickerActivity.A0B;
            String str = indiaUpiBankPickerActivity.A08;
            r2.A07 = str;
            r2.A04 = Boolean.valueOf(!TextUtils.isEmpty(str));
            r2.A06 = r4.A05();
            r2.A05 = Long.valueOf((long) i);
            ((AnonymousClass1PY) indiaUpiBankPickerActivity).A0A.A07(r2);
            return;
        }
        C018809u r3 = indiaUpiBankPickerActivity.A0F;
        StringBuilder sb = new StringBuilder("onCreate could not get bank accounts as selected bank is null at pos: ");
        sb.append(i);
        r3.A06("onboarding", sb.toString(), null);
    }
}
