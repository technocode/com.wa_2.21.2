package X;

import android.view.View;
import com.google.android.search.verification.client.R;
import com.whatsapp.conversation.conversationrow.ConversationRowAudioPreview;
import com.whatsapp.search.views.itemviews.AudioPlayerView;

/* renamed from: X.2mx  reason: invalid class name and case insensitive filesystem */
public class C59042mx extends AbstractC51912aF {
    public final /* synthetic */ C60332pG A00;
    public final /* synthetic */ C28301Tu A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C59042mx(C60332pG r1, AudioPlayerView audioPlayerView, AbstractC47592Io r3, AbstractC47602Ip r4, ConversationRowAudioPreview conversationRowAudioPreview, C28301Tu r6) {
        super(audioPlayerView, r3, r4, conversationRowAudioPreview);
        this.A00 = r1;
        this.A01 = r6;
    }

    @Override // X.AbstractC47572Im
    public AnonymousClass0MP A6J() {
        return this.A00.getFMessage();
    }

    @Override // X.AbstractC47572Im
    public void AFP(boolean z) {
        View findViewById;
        if (this.A01.A0S == null && (findViewById = C02780Dk.A00(this.A00.getContext()).findViewById(R.id.proximity_overlay)) != null) {
            int i = 4;
            if (z) {
                i = 0;
            }
            findViewById.setVisibility(i);
        }
    }
}
