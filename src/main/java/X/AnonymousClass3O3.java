package X;

import com.whatsapp.conversation.conversationrow.WaveformVisualizerView;

/* renamed from: X.3O3  reason: invalid class name */
public final /* synthetic */ class AnonymousClass3O3 implements AbstractC47582In {
    public final /* synthetic */ AnonymousClass3OI A00;

    public /* synthetic */ AnonymousClass3O3(AnonymousClass3OI r1) {
        this.A00 = r1;
    }

    @Override // X.AbstractC47582In
    public final void ALn(byte[] bArr) {
        WaveformVisualizerView waveformVisualizerView = this.A00.A00.A02;
        waveformVisualizerView.A00 = bArr;
        waveformVisualizerView.invalidate();
    }
}
