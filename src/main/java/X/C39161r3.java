package X;

import android.content.Intent;
import com.whatsapp.registration.RegisterPhone;
import com.whatsapp.util.Log;

/* renamed from: X.1r3  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C39161r3 implements AnonymousClass0SG {
    public final /* synthetic */ AnonymousClass0GE A00;

    public /* synthetic */ C39161r3(AnonymousClass0GE r1) {
        this.A00 = r1;
    }

    @Override // X.AnonymousClass0SG
    public final void ADy(Object obj) {
        AnonymousClass0GE r2 = this.A00;
        if (((Number) obj).intValue() == 0) {
            Log.e("VerifyMessageStoreActivity/messagestoreverified/missing-params bounce to regphone");
            r2.A0O.A0C(1);
            r2.startActivity(new Intent(r2, RegisterPhone.class));
            r2.finish();
        }
    }
}
