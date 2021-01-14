package X;

import com.facebook.msys.mci.network.common.DataTask;
import com.facebook.msys.mci.network.common.DataTaskListener;
import com.whatsapp.util.Log;
import java.util.concurrent.RejectedExecutionException;

/* renamed from: X.3Vw  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C73203Vw implements DataTaskListener {
    public final /* synthetic */ AnonymousClass3W0 A00;

    public /* synthetic */ C73203Vw(AnonymousClass3W0 r1) {
        this.A00 = r1;
    }

    @Override // com.facebook.msys.mci.network.common.DataTaskListener
    public final void onNewTask(DataTask dataTask, AnonymousClass04B r6) {
        AnonymousClass3W0 r3 = this.A00;
        try {
            r3.A04.ANF(new RunnableEBaseShape2S0300000_I1(r3, dataTask, r6, 47));
        } catch (RejectedExecutionException e) {
            Log.e("wa-msys/NetworkSession: DataTask rejected for execution", e);
            throw e;
        }
    }
}
