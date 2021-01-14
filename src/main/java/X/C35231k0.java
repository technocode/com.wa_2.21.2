package X;

import com.whatsapp.registration.RegisterPhone;
import com.whatsapp.util.Log;

/* renamed from: X.1k0  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C35231k0 implements AbstractC011806y {
    public final /* synthetic */ AnonymousClass0HX A00;

    public /* synthetic */ C35231k0(AnonymousClass0HX r1) {
        this.A00 = r1;
    }

    @Override // X.AbstractC011806y
    public final void AFt(Exception exc) {
        AnonymousClass0HX r1 = this.A00;
        Log.e("registerphone/smsretriever/onfailure/ ", exc);
        ((RegisterPhone) r1).A0W();
    }
}
