package X;

import android.os.Handler;
import com.whatsapp.service.UnsentMessagesNetworkAvailableJob;

/* renamed from: X.3OU  reason: invalid class name */
public class AnonymousClass3OU extends AnonymousClass019 {
    public final /* synthetic */ UnsentMessagesNetworkAvailableJob A00;

    public AnonymousClass3OU(UnsentMessagesNetworkAvailableJob unsentMessagesNetworkAvailableJob) {
        this.A00 = unsentMessagesNetworkAvailableJob;
    }

    @Override // X.AnonymousClass019
    public void A00(AbstractC007503q r4, int i) {
        UnsentMessagesNetworkAvailableJob unsentMessagesNetworkAvailableJob = this.A00;
        if (!unsentMessagesNetworkAvailableJob.A05.A04()) {
            Handler handler = unsentMessagesNetworkAvailableJob.A01;
            handler.removeCallbacks(unsentMessagesNetworkAvailableJob.A08);
            unsentMessagesNetworkAvailableJob.A01();
            handler.post(new RunnableEBaseShape12S0100000_I1_7(this, 36));
        }
    }

    public /* synthetic */ void A04() {
        UnsentMessagesNetworkAvailableJob unsentMessagesNetworkAvailableJob = this.A00;
        unsentMessagesNetworkAvailableJob.A03.A00(unsentMessagesNetworkAvailableJob.A02);
    }
}
