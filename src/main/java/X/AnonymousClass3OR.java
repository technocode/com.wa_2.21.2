package X;

import com.whatsapp.service.RestoreChatConnectionWorker;
import com.whatsapp.util.Log;

/* renamed from: X.3OR  reason: invalid class name */
public final /* synthetic */ class AnonymousClass3OR implements AnonymousClass0DJ {
    public final /* synthetic */ RestoreChatConnectionWorker A00;

    public /* synthetic */ AnonymousClass3OR(RestoreChatConnectionWorker restoreChatConnectionWorker) {
        this.A00 = restoreChatConnectionWorker;
    }

    @Override // X.AnonymousClass0DJ
    public final void ADz(boolean z) {
        RestoreChatConnectionWorker restoreChatConnectionWorker = this.A00;
        if (z) {
            Log.d("RestoreChatConnectionWorker finished successfully!");
            restoreChatConnectionWorker.A01.A08(new C30981cK());
        }
    }
}
