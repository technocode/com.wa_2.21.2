package X;

import com.whatsapp.payments.ui.IndiaUpiBankPickerActivity;
import java.util.ArrayList;

/* renamed from: X.3Gi  reason: invalid class name and case insensitive filesystem */
public class C69253Gi implements AnonymousClass0YR {
    public final /* synthetic */ IndiaUpiBankPickerActivity A00;

    @Override // X.AnonymousClass0YR
    public boolean AIz(String str) {
        return false;
    }

    public C69253Gi(IndiaUpiBankPickerActivity indiaUpiBankPickerActivity) {
        this.A00 = indiaUpiBankPickerActivity;
    }

    @Override // X.AnonymousClass0YR
    public boolean AIy(String str) {
        IndiaUpiBankPickerActivity indiaUpiBankPickerActivity = this.A00;
        indiaUpiBankPickerActivity.A08 = str;
        ArrayList A03 = AnonymousClass1YB.A03(str, ((AnonymousClass2C0) indiaUpiBankPickerActivity).A01);
        indiaUpiBankPickerActivity.A0A = A03;
        if (A03.isEmpty()) {
            indiaUpiBankPickerActivity.A0A = null;
        }
        C10120e5 r0 = indiaUpiBankPickerActivity.A06;
        if (r0 != null) {
            ((AnonymousClass0JW) r0).A00.cancel(true);
            indiaUpiBankPickerActivity.A06 = null;
        }
        C10120e5 r3 = new C10120e5(indiaUpiBankPickerActivity, indiaUpiBankPickerActivity.A0A);
        indiaUpiBankPickerActivity.A06 = r3;
        ((AnonymousClass1PY) indiaUpiBankPickerActivity).A0D.ANC(r3, new Void[0]);
        return false;
    }
}
