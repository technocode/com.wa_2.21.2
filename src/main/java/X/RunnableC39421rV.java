package X;

import com.whatsapp.util.Log;

/* renamed from: X.1rV  reason: invalid class name and case insensitive filesystem */
public class RunnableC39421rV extends AnonymousClass1NN implements Runnable, AnonymousClass1XK {
    public int A00 = 60;
    public AnonymousClass0OP A01;
    public final AnonymousClass0A8 A02;
    public final AnonymousClass0C4 A03;

    public RunnableC39421rV(AnonymousClass0C4 r2, AnonymousClass0A8 r3, AnonymousClass0OP r4) {
        this.A03 = r2;
        this.A02 = r3;
        this.A01 = r4;
    }

    @Override // X.AnonymousClass1NN
    public void A00() {
        AnonymousClass008.A1L(AnonymousClass008.A0S("groupmgr/group_request/timeout/type:"), this.A00);
        super.A01 = true;
        this.A02.A07(this.A01, false);
    }

    @Override // X.AnonymousClass1XK
    public void AN9(int i) {
        StringBuilder A0T = AnonymousClass008.A0T("BroadcastListResponseHandler/request failed : ", i, " | ");
        A0T.append(this.A01);
        A0T.append(" | ");
        A0T.append(this.A00);
        Log.e(A0T.toString());
        super.A02.cancel();
        this.A02.A07(this.A01, false);
    }

    public void run() {
        super.A02.cancel();
        AnonymousClass008.A1L(new StringBuilder("BroadcastListResponseHandler/request success/"), this.A00);
    }
}
