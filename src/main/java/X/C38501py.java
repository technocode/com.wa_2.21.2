package X;

import com.google.android.search.verification.client.R;
import com.whatsapp.Conversation;
import java.util.List;

/* renamed from: X.1py  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C38501py implements AnonymousClass0SG {
    public final /* synthetic */ Conversation A00;

    public /* synthetic */ C38501py(Conversation conversation) {
        this.A00 = conversation;
    }

    @Override // X.AnonymousClass0SG
    public final void ADy(Object obj) {
        Conversation conversation = this.A00;
        if (((List) obj).size() > 0) {
            conversation.A0U.setColorFilter(conversation.getResources().getColor(R.color.sticker_update_badge_color));
        } else {
            conversation.A0U.setColorFilter(conversation.getResources().getColor(R.color.transparent));
        }
    }
}
