package X;

import com.google.android.search.verification.client.SearchActionVerificationClientService;
import com.whatsapp.conversation.conversationrow.ConversationRowAudioPreview;
import com.whatsapp.search.views.itemviews.AudioPlayerView;

/* renamed from: X.2aF  reason: invalid class name and case insensitive filesystem */
public abstract class AbstractC51912aF implements AbstractC47572Im {
    public int A00 = -1;
    public final ConversationRowAudioPreview A01;
    public final AbstractC47592Io A02;
    public final AbstractC47602Ip A03;
    public final AudioPlayerView A04;

    public AbstractC51912aF(AudioPlayerView audioPlayerView, AbstractC47592Io r3, AbstractC47602Ip r4, ConversationRowAudioPreview conversationRowAudioPreview) {
        this.A04 = audioPlayerView;
        this.A02 = r3;
        this.A03 = r4;
        this.A01 = conversationRowAudioPreview;
    }

    @Override // X.AbstractC47572Im
    public void AIK(int i) {
        AudioPlayerView audioPlayerView = this.A04;
        audioPlayerView.setPlayButtonState(0);
        audioPlayerView.setSeekbarMax(((AnonymousClass0M3) A6J()).A00 * SearchActionVerificationClientService.CONNECTION_TIMEOUT_IN_MS);
        audioPlayerView.setSeekbarProgress(i);
        audioPlayerView.setSeekbarContentDescription((long) i);
        this.A02.AFO(((AnonymousClass0M3) A6J()).A00);
        ConversationRowAudioPreview conversationRowAudioPreview = this.A01;
        if (conversationRowAudioPreview != null) {
            conversationRowAudioPreview.A00();
        }
    }

    @Override // X.AbstractC47572Im
    public void AIr(int i) {
        int i2 = this.A00;
        int i3 = i / SearchActionVerificationClientService.CONNECTION_TIMEOUT_IN_MS;
        if (i2 != i3) {
            this.A00 = i3;
            this.A02.AFO(i3);
        }
        AudioPlayerView audioPlayerView = this.A04;
        audioPlayerView.setSeekbarProgress(i);
        audioPlayerView.setSeekbarContentDescription((long) i);
    }

    @Override // X.AbstractC47572Im
    public void AJj() {
        this.A04.setPlayButtonState(1);
        ConversationRowAudioPreview conversationRowAudioPreview = this.A01;
        if (conversationRowAudioPreview != null) {
            conversationRowAudioPreview.A01();
        }
    }

    @Override // X.AbstractC47572Im
    public void AKJ(int i) {
        AudioPlayerView audioPlayerView = this.A04;
        audioPlayerView.setPlayButtonState(1);
        audioPlayerView.setSeekbarMax(i);
        this.A00 = -1;
        ConversationRowAudioPreview conversationRowAudioPreview = this.A01;
        if (conversationRowAudioPreview != null) {
            conversationRowAudioPreview.A01();
        }
    }

    @Override // X.AbstractC47572Im
    public void AKb(int i) {
        AudioPlayerView audioPlayerView = this.A04;
        audioPlayerView.setPlayButtonState(0);
        audioPlayerView.setSeekbarProgress(0);
        this.A02.AFO(i / SearchActionVerificationClientService.CONNECTION_TIMEOUT_IN_MS);
        ConversationRowAudioPreview conversationRowAudioPreview = this.A01;
        if (conversationRowAudioPreview != null) {
            conversationRowAudioPreview.A00();
        }
        this.A03.AK7(false);
    }
}
