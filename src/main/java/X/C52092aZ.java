package X;

import android.graphics.Bitmap;
import com.whatsapp.jid.UserJid;

/* renamed from: X.2aZ  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C52092aZ implements AbstractC27871Rx {
    public final /* synthetic */ C59362nW A00;
    public final /* synthetic */ UserJid A01;

    public /* synthetic */ C52092aZ(C59362nW r1, UserJid userJid) {
        this.A00 = r1;
        this.A01 = userJid;
    }

    @Override // X.AbstractC27871Rx
    public final void AHF(C42301wU r5, Bitmap bitmap, boolean z) {
        C59362nW r3 = this.A00;
        UserJid userJid = this.A01;
        C27241Os r1 = r3.A00;
        if (r1 != null) {
            r1.A0E = C27241Os.A04(bitmap);
            r3.A02(userJid);
        }
    }
}
