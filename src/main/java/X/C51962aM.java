package X;

import android.os.Bundle;
import com.whatsapp.conversation.conversationrow.message.StarredMessagesActivity;

/* renamed from: X.2aM  reason: invalid class name and case insensitive filesystem */
public class C51962aM implements AnonymousClass0YR {
    public final /* synthetic */ StarredMessagesActivity A00;

    @Override // X.AnonymousClass0YR
    public boolean AIz(String str) {
        return false;
    }

    public C51962aM(StarredMessagesActivity starredMessagesActivity) {
        this.A00 = starredMessagesActivity;
    }

    @Override // X.AnonymousClass0YR
    public boolean AIy(String str) {
        StarredMessagesActivity starredMessagesActivity = this.A00;
        starredMessagesActivity.A05 = str;
        starredMessagesActivity.A06 = AnonymousClass1YB.A03(str, ((AnonymousClass2C0) starredMessagesActivity).A01);
        Bundle bundle = new Bundle();
        bundle.putString("query", str);
        if (starredMessagesActivity != null) {
            AbstractC15640oQ.A00(starredMessagesActivity).A02(0, bundle, starredMessagesActivity);
            return false;
        }
        throw null;
    }
}
