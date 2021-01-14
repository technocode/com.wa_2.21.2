package X;

import android.os.Build;
import com.whatsapp.Conversation;

/* renamed from: X.1s9  reason: invalid class name and case insensitive filesystem */
public class C39811s9 extends C47502If {
    public final /* synthetic */ Conversation A00;

    public C39811s9(Conversation conversation) {
        this.A00 = conversation;
    }

    @Override // X.C47502If
    public void A00() {
        AnonymousClass377 r1;
        Conversation conversation = this.A00;
        C27131Oe r12 = conversation.A0l;
        if (r12 != null) {
            if (r12.A0P()) {
                r12.A01();
            } else {
                AnonymousClass1Y0 r0 = r12.A0a;
                if (r0 != null && r0.A08()) {
                    conversation.A0l.A03();
                }
            }
        }
        if (Build.VERSION.SDK_INT >= 19 && (r1 = conversation.A1D) != null && r1.A0E) {
            r1.A03();
        }
    }
}
