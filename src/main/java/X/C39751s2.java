package X;

import android.os.Build;
import com.whatsapp.Conversation;

/* renamed from: X.1s2  reason: invalid class name and case insensitive filesystem */
public class C39751s2 extends AnonymousClass0LH {
    public final /* synthetic */ Conversation A00;

    public C39751s2(Conversation conversation) {
        this.A00 = conversation;
    }

    @Override // X.AnonymousClass0LH
    public void A00(AnonymousClass0QM r4) {
        AnonymousClass377 r1;
        C28301Tu.A03();
        Conversation conversation = this.A00;
        conversation.invalidateOptionsMenu();
        if (Build.VERSION.SDK_INT >= 19 && (r1 = conversation.A1D) != null && r1.A0E) {
            r1.A03();
        }
    }
}
