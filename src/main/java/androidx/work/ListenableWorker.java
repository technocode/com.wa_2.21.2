package androidx.work;

import X.AnonymousClass008;
import X.AnonymousClass09H;
import X.AnonymousClass0EU;
import X.AnonymousClass0M5;
import X.AnonymousClass0OS;
import X.AnonymousClass1EY;
import X.AnonymousClass3OR;
import X.AnonymousClass3S5;
import X.C13910lD;
import X.C17550rj;
import X.C29781aB;
import X.C30961cI;
import X.C30981cK;
import X.C453624k;
import X.C665834y;
import android.content.Context;
import androidx.work.impl.workers.ConstraintTrackingWorker;
import com.whatsapp.service.RestoreChatConnectionWorker;
import com.whatsapp.usernotice.UserNoticeStageUpdateWorker;
import com.whatsapp.util.Log;
import java.util.concurrent.Executor;

public abstract class ListenableWorker {
    public Context A00;
    public WorkerParameters A01;
    public boolean A02;

    public ListenableWorker(Context context, WorkerParameters workerParameters) {
        if (context == null) {
            throw new IllegalArgumentException("Application Context is null");
        } else if (workerParameters != null) {
            this.A00 = context;
            this.A01 = workerParameters;
        } else {
            throw new IllegalArgumentException("WorkerParameters is null");
        }
    }

    public AnonymousClass1EY A00() {
        Object obj;
        if (this instanceof UserNoticeStageUpdateWorker) {
            UserNoticeStageUpdateWorker userNoticeStageUpdateWorker = (UserNoticeStageUpdateWorker) this;
            C13910lD r11 = new C13910lD();
            C29781aB r10 = new C29781aB(r11);
            r11.A00 = r10;
            r11.A02 = C665834y.class;
            try {
                C17550rj r3 = ((ListenableWorker) userNoticeStageUpdateWorker).A01.A01;
                int A022 = r3.A02("notice_id");
                int A023 = r3.A02("stage");
                int A024 = r3.A02("version");
                if (A022 == -1 || A023 == -1 || A024 == -1) {
                    obj = new C30961cI();
                } else {
                    AnonymousClass008.A0y("UserNoticeStageUpdateWorker/startWork/noticeId: ", A022, " stage: ", A023);
                    AnonymousClass09H r0 = userNoticeStageUpdateWorker.A00;
                    String A025 = r0.A02();
                    AnonymousClass0M5 r4 = new AnonymousClass0M5("notice", new AnonymousClass0OS[]{new AnonymousClass0OS("id", Integer.toString(A022), null, (byte) 0), new AnonymousClass0OS("stage", Integer.toString(A023), null, (byte) 0)}, null, null);
                    r0.A0B(254, A025, new AnonymousClass0M5("iq", new AnonymousClass0OS[]{new AnonymousClass0OS("to", "s.whatsapp.net", null, (byte) 0), new AnonymousClass0OS("type", "set", null, (byte) 0), new AnonymousClass0OS("xmlns", "tos", null, (byte) 0), new AnonymousClass0OS("id", A025, null, (byte) 0)}, r4), new AnonymousClass3S5(userNoticeStageUpdateWorker, A022, A024, A023, r11), 32000);
                    obj = "Send Stage Update";
                }
                r11.A02 = obj;
                return r10;
            } catch (Exception e) {
                r10.A00.A05(e);
                return r10;
            }
        } else if (this instanceof RestoreChatConnectionWorker) {
            RestoreChatConnectionWorker restoreChatConnectionWorker = (RestoreChatConnectionWorker) this;
            Log.d("RestoreChatConnectionWorker/doWork start");
            AnonymousClass0EU r1 = restoreChatConnectionWorker.A04;
            if (r1.A03()) {
                Log.i("RestoreChatConnectionWorker/doWork nothing to do");
                C453624k r5 = restoreChatConnectionWorker.A01;
                r5.A08(new C30981cK());
                return r5;
            }
            AnonymousClass3OR r2 = new AnonymousClass3OR(restoreChatConnectionWorker);
            r1.A00(r2);
            C453624k r52 = restoreChatConnectionWorker.A01;
            RunnableEBaseShape9S0200000_I1_4 runnableEBaseShape9S0200000_I1_4 = new RunnableEBaseShape9S0200000_I1_4(restoreChatConnectionWorker, r2, 9);
            Executor executor = restoreChatConnectionWorker.A02.A06;
            r52.A1o(runnableEBaseShape9S0200000_I1_4, executor);
            RunnableEBaseShape12S0100000_I1_7 runnableEBaseShape12S0100000_I1_7 = new RunnableEBaseShape12S0100000_I1_7(restoreChatConnectionWorker, 35);
            restoreChatConnectionWorker.A00.postDelayed(runnableEBaseShape12S0100000_I1_7, 30000);
            r52.A1o(new RunnableEBaseShape9S0200000_I1_4(restoreChatConnectionWorker, runnableEBaseShape12S0100000_I1_7, 10), executor);
            restoreChatConnectionWorker.A05.A0G(false, true, false, false, false, null, null, restoreChatConnectionWorker.A03.A06(), 0);
            return r52;
        } else if (!(this instanceof ConstraintTrackingWorker)) {
            Worker worker = (Worker) this;
            worker.A00 = new C453624k();
            worker.A01.A04.execute(new RunnableEBaseShape5S0100000_I1_0(worker, 19));
            return worker.A00;
        } else {
            ConstraintTrackingWorker constraintTrackingWorker = (ConstraintTrackingWorker) this;
            ((ListenableWorker) constraintTrackingWorker).A01.A04.execute(new RunnableEBaseShape5S0100000_I1_0(constraintTrackingWorker, 23));
            return constraintTrackingWorker.A02;
        }
    }

    public void A01() {
        ListenableWorker listenableWorker;
        if (this instanceof RestoreChatConnectionWorker) {
            Log.d("RestoreChatConnectionWorker stopped");
            ((RestoreChatConnectionWorker) this).A01.cancel(true);
        } else if ((this instanceof ConstraintTrackingWorker) && (listenableWorker = ((ConstraintTrackingWorker) this).A00) != null) {
            listenableWorker.A01();
        }
    }
}
