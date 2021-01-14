package X;

import com.whatsapp.util.Log;
import com.whatsapp.wabloks.ui.PrivacyNoticeFragment;
import java.io.InputStream;

/* renamed from: X.3VQ  reason: invalid class name */
public final /* synthetic */ class AnonymousClass3VQ implements AbstractC67753Ac {
    public final /* synthetic */ PrivacyNoticeFragment A00;

    public /* synthetic */ AnonymousClass3VQ(PrivacyNoticeFragment privacyNoticeFragment) {
        this.A00 = privacyNoticeFragment;
    }

    @Override // X.AbstractC67753Ac
    public final void AJS(InputStream inputStream, String str, Throwable th) {
        PrivacyNoticeFragment privacyNoticeFragment = this.A00;
        if (th == null) {
            try {
                privacyNoticeFragment.A00.setVisibility(8);
            } catch (Throwable th2) {
                Log.e("PrivacyNoticeFragment error: ", th2);
            }
        } else {
            throw th;
        }
    }
}
