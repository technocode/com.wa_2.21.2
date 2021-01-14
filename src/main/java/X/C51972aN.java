package X;

import android.os.SystemClock;
import com.google.android.search.verification.client.R;
import com.whatsapp.conversation.conversationrow.message.StarredMessagesActivity;
import java.lang.ref.WeakReference;

/* renamed from: X.2aN  reason: invalid class name and case insensitive filesystem */
public class C51972aN extends AnonymousClass0JW {
    public final long A00 = SystemClock.elapsedRealtime();
    public final AnonymousClass0CG A01 = AnonymousClass0CG.A00();
    public final AnonymousClass02N A02;
    public final C02360Br A03 = C02360Br.A00();
    public final WeakReference A04;

    public C51972aN(StarredMessagesActivity starredMessagesActivity, AnonymousClass02N r4) {
        this.A04 = new WeakReference(starredMessagesActivity);
        this.A02 = r4;
    }

    @Override // X.AnonymousClass0JW
    public void A03(Object obj) {
        Boolean bool = (Boolean) obj;
        StarredMessagesActivity starredMessagesActivity = (StarredMessagesActivity) this.A04.get();
        if (starredMessagesActivity != null && !C002001d.A3D(starredMessagesActivity)) {
            ((ActivityC004702f) starredMessagesActivity).A0K.A00();
            if (bool.booleanValue()) {
                AbstractC15640oQ.A00(starredMessagesActivity).A02(0, null, starredMessagesActivity);
                starredMessagesActivity.A0Z();
                return;
            }
            ((ActivityC004702f) starredMessagesActivity).A0F.A0C(((AnonymousClass2C0) starredMessagesActivity).A01.A08(R.plurals.unstar_while_clearing_error, 2), 0);
        }
    }
}
