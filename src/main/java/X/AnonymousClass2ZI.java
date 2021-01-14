package X;

import com.whatsapp.conversation.conversationrow.ConversationRowAudioPreview;
import com.whatsapp.conversation.conversationrow.WaveformVisualizerView;

/* renamed from: X.2ZI  reason: invalid class name */
public final /* synthetic */ class AnonymousClass2ZI implements AbstractC47582In {
    public final /* synthetic */ C60332pG A00;

    public /* synthetic */ AnonymousClass2ZI(C60332pG r1) {
        this.A00 = r1;
    }

    @Override // X.AbstractC47582In
    public final void ALn(byte[] bArr) {
        ConversationRowAudioPreview conversationRowAudioPreview = this.A00.A03;
        if (conversationRowAudioPreview != null) {
            WaveformVisualizerView waveformVisualizerView = conversationRowAudioPreview.A02;
            waveformVisualizerView.A00 = bArr;
            waveformVisualizerView.invalidate();
        }
    }
}
