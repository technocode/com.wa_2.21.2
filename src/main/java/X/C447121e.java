package X;

import android.os.Handler;
import com.whatsapp.util.Log;

/* renamed from: X.21e  reason: invalid class name and case insensitive filesystem */
public class C447121e extends AnonymousClass0BP {
    public final /* synthetic */ AnonymousClass280 A00;

    public C447121e(AnonymousClass280 r1) {
        this.A00 = r1;
    }

    public final void A01() {
        AnonymousClass280 r1 = this.A00;
        if (r1.A03.A01()) {
            Log.d("InstrumentationObserverImpl/onContactsChanged");
            for (AbstractC28671Vh r12 : r1.A04.A00()) {
                if (r12 instanceof C446721a) {
                    C446721a r13 = (C446721a) r12;
                    Handler handler = r13.A00;
                    handler.removeCallbacksAndMessages(null);
                    handler.postDelayed(new RunnableEBaseShape10S0100000_I1_5(r13, 31), 2000);
                }
            }
        }
    }
}
