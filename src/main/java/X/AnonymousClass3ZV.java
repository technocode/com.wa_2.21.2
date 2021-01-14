package X;

import com.whatsapp.search.views.itemviews.AudioPlayerView;

/* renamed from: X.3ZV  reason: invalid class name */
public class AnonymousClass3ZV extends AbstractC51912aF {
    public final /* synthetic */ AbstractC47602Ip A00;
    public final /* synthetic */ AnonymousClass3OK A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass3ZV(AnonymousClass3OK r2, AudioPlayerView audioPlayerView, AbstractC47592Io r4, AbstractC47602Ip r5, AbstractC47602Ip r6) {
        super(audioPlayerView, r4, r5, null);
        this.A01 = r2;
        this.A00 = r6;
    }

    @Override // X.AbstractC47572Im
    public AnonymousClass0MP A6J() {
        return ((AnonymousClass312) this.A01).A00;
    }

    @Override // X.AbstractC47572Im
    public void AFP(boolean z) {
        C28301Tu r0 = (C28301Tu) this.A01.A08.get();
        if (r0 != null && r0.A0S == null) {
            this.A00.AK7(z);
        }
    }
}
