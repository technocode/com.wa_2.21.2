package X;

import com.whatsapp.conversation.conversationrow.ConversationRowAudioPreview;
import com.whatsapp.search.views.itemviews.AudioPlayerView;

/* renamed from: X.3ZR  reason: invalid class name */
public class AnonymousClass3ZR extends AbstractC51912aF {
    public final /* synthetic */ AbstractC47602Ip A00;
    public final /* synthetic */ AnonymousClass3OI A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass3ZR(AnonymousClass3OI r1, AudioPlayerView audioPlayerView, AbstractC47592Io r3, AbstractC47602Ip r4, ConversationRowAudioPreview conversationRowAudioPreview, AbstractC47602Ip r6) {
        super(audioPlayerView, r3, r4, conversationRowAudioPreview);
        this.A01 = r1;
        this.A00 = r6;
    }

    @Override // X.AbstractC47572Im
    public AnonymousClass0MP A6J() {
        return ((AnonymousClass312) this.A01).A00;
    }

    @Override // X.AbstractC47572Im
    public void AFP(boolean z) {
        C28301Tu r0 = (C28301Tu) this.A01.A03.get();
        if (r0 != null && r0.A0S == null) {
            this.A00.AK7(z);
        }
    }
}
