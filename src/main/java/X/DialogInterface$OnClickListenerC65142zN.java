package X;

import android.content.DialogInterface;
import com.whatsapp.registration.RegisterPhone;
import java.util.concurrent.Executor;

/* renamed from: X.2zN  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class DialogInterface$OnClickListenerC65142zN implements DialogInterface.OnClickListener {
    public final /* synthetic */ RegisterPhone A00;

    public /* synthetic */ DialogInterface$OnClickListenerC65142zN(RegisterPhone registerPhone) {
        this.A00 = registerPhone;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        RegisterPhone registerPhone = this.A00;
        C002001d.A2N(registerPhone, 21);
        ((ActivityC004702f) registerPhone).A0J.A0Z(AnonymousClass0HU.A0N, AnonymousClass0HU.A0O);
        AnonymousClass00G r1 = registerPhone.A0Q;
        if (C002001d.A3F(r1.A00)) {
            AbstractC011406u A01 = new AnonymousClass26F(r1.A00).A01(new AnonymousClass26G());
            C35251k2 r0 = new C35251k2(registerPhone);
            if (A01 != null) {
                Executor executor = AnonymousClass070.A00;
                A01.A02(executor, r0);
                A01.A01(executor, new C35231k0(registerPhone));
                return;
            }
            throw null;
        }
        registerPhone.A0W();
    }
}
