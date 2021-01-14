package X;

import com.whatsapp.util.crash.SigquitBasedANRDetector;
import java.io.File;

/* renamed from: X.3SK  reason: invalid class name */
public class AnonymousClass3SK {
    public final File A00;
    public final /* synthetic */ SigquitBasedANRDetector A01;

    public AnonymousClass3SK(SigquitBasedANRDetector sigquitBasedANRDetector, File file) {
        this.A01 = sigquitBasedANRDetector;
        this.A00 = file;
    }

    public final void A00() {
        SigquitBasedANRDetector sigquitBasedANRDetector = this.A01;
        if (sigquitBasedANRDetector.A09 != null) {
            sigquitBasedANRDetector.A09.post(new RunnableEBaseShape13S0100000_I1_8(this, 24));
        }
    }
}
