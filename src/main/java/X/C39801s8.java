package X;

import android.os.Build;
import com.whatsapp.Conversation;

/* renamed from: X.1s8  reason: invalid class name and case insensitive filesystem */
public class C39801s8 extends AnonymousClass1OV {
    public final /* synthetic */ Conversation A00;

    public C39801s8(Conversation conversation) {
        this.A00 = conversation;
    }

    @Override // X.AnonymousClass1OV
    public void A00() {
        AnonymousClass377 r1;
        Conversation conversation = this.A00;
        conversation.invalidateOptionsMenu();
        if (Build.VERSION.SDK_INT >= 19 && (r1 = conversation.A1D) != null && r1.A0E) {
            r1.A03();
        }
    }
}
