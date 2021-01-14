package X;

import com.whatsapp.registration.RegisterPhone;
import com.whatsapp.util.Log;

/* renamed from: X.1k2  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C35251k2 implements AbstractC011906z {
    public final /* synthetic */ AnonymousClass0HX A00;

    public /* synthetic */ C35251k2(AnonymousClass0HX r1) {
        this.A00 = r1;
    }

    @Override // X.AbstractC011906z
    public final void AKi(Object obj) {
        AnonymousClass0HX r1 = this.A00;
        Log.i("registerphone/smsretriever/onsuccess");
        ((RegisterPhone) r1).A0a(true);
    }
}
