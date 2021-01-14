package X;

import android.content.Context;
import com.whatsapp.videoplayback.VideoSurfaceView;

/* renamed from: X.3T4  reason: invalid class name */
public class AnonymousClass3T4 extends VideoSurfaceView {
    public final /* synthetic */ AnonymousClass3T5 A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass3T4(AnonymousClass3T5 r1, Context context) {
        super(context);
        this.A00 = r1;
    }

    @Override // com.whatsapp.videoplayback.VideoSurfaceView
    public void start() {
        AnonymousClass3T5 r1;
        AnonymousClass37K r0;
        if (A04() && (r0 = (r1 = this.A00).A03) != null) {
            r0.AKK(r1);
        }
        super.start();
    }
}
