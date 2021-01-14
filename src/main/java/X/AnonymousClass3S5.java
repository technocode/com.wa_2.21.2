package X;

import android.util.Pair;
import androidx.work.ListenableWorker;
import com.whatsapp.usernotice.UserNoticeStageUpdateWorker;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.TreeMap;

/* renamed from: X.3S5  reason: invalid class name */
public class AnonymousClass3S5 implements AnonymousClass09O {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ C13910lD A03;
    public final /* synthetic */ UserNoticeStageUpdateWorker A04;

    public AnonymousClass3S5(UserNoticeStageUpdateWorker userNoticeStageUpdateWorker, int i, int i2, int i3, C13910lD r5) {
        this.A04 = userNoticeStageUpdateWorker;
        this.A00 = i;
        this.A02 = i2;
        this.A01 = i3;
        this.A03 = r5;
    }

    @Override // X.AnonymousClass09O
    public void AEv(String str) {
        Log.e("UserNoticeStageUpdateWorker/onDeliveryFailure");
        if (((ListenableWorker) this.A04).A01.A00 > 4) {
            this.A03.A00(new C30961cI());
        } else {
            this.A03.A00(new C30971cJ());
        }
    }

    @Override // X.AnonymousClass09O
    public void AFd(String str, AnonymousClass0M5 r5) {
        Pair A0j = C002001d.A0j(r5);
        StringBuilder sb = new StringBuilder("UserNoticeStageUpdateWorker/onError ");
        sb.append(A0j);
        Log.e(sb.toString());
        if (A0j != null && ((Number) A0j.first).intValue() == 400) {
            this.A04.A01.A02(1);
        }
        if (((ListenableWorker) this.A04).A01.A00 > 4) {
            this.A03.A00(new C30961cI());
        } else {
            this.A03.A00(new C30971cJ());
        }
    }

    @Override // X.AnonymousClass09O
    public void AKk(String str, AnonymousClass0M5 r13) {
        Log.i("UserNoticeStageUpdateWorker/success");
        AnonymousClass0M5 A0D = r13.A0D("notice");
        if (A0D != null) {
            AnonymousClass0HE r2 = this.A04.A02;
            int i = this.A00;
            int i2 = this.A02;
            if (r2 != null) {
                StringBuilder sb = new StringBuilder("UserNoticeManager/handleStaleClientStage/notice id: ");
                sb.append(i);
                Log.i(sb.toString());
                r2.A05.A04(new AnonymousClass357(i, A0D.A04("stage"), A0D.A06("t") * 1000, i2));
            } else {
                throw null;
            }
        }
        if (this.A01 == 5) {
            AnonymousClass0HE r3 = this.A04.A02;
            int i3 = this.A00;
            if (r3 != null) {
                StringBuilder sb2 = new StringBuilder("UserNoticeManager/handleCleanup/notice id: ");
                sb2.append(i3);
                Log.i(sb2.toString());
                StringBuilder sb3 = new StringBuilder("UserNoticeManager/deleteUserNotice/notice id: ");
                sb3.append(i3);
                Log.i(sb3.toString());
                r3.A04.A04(i3);
                AnonymousClass0HH r22 = r3.A05;
                TreeMap treeMap = r22.A02;
                treeMap.remove(Integer.valueOf(i3));
                AnonymousClass357 A022 = r22.A02();
                if (A022 != null && A022.A00 == i3) {
                    r22.A01().edit().remove("current_user_notice_id").remove("current_user_notice_stage").remove("current_user_notice_stage_timestamp").remove("current_user_notice_version").remove("current_user_notice_duration_repeat_index").remove("current_user_notice_duration_repeat_timestamp").apply();
                }
                r22.A05(new ArrayList(treeMap.values()));
                r3.A03();
            } else {
                throw null;
            }
        }
        this.A03.A00(new C30981cK());
    }
}
