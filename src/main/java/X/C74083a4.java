package X;

import android.os.Handler;
import com.whatsapp.status.playback.MyStatusesActivity;
import java.util.Map;
import java.util.Set;

/* renamed from: X.3a4  reason: invalid class name and case insensitive filesystem */
public class C74083a4 extends AbstractC51922aG {
    public final /* synthetic */ MyStatusesActivity A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C74083a4(MyStatusesActivity myStatusesActivity, ActivityC004802g r29, AnonymousClass02M r30, AnonymousClass0Z6 r31, AnonymousClass320 r32, AnonymousClass01I r33, AnonymousClass00T r34, AnonymousClass325 r35, AnonymousClass00Y r36, C000300f r37, AnonymousClass0DH r38, C04360Kb r39, AbstractC658531u r40, C02780Dk r41, AnonymousClass01A r42, AnonymousClass03P r43, C014308b r44, AnonymousClass01X r45, AnonymousClass0EO r46, AnonymousClass31y r47, AnonymousClass322 r48, AnonymousClass0CG r49, AnonymousClass0CH r50, C04420Kh r51, AnonymousClass01T r52, AnonymousClass022 r53) {
        super(r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53);
        this.A00 = myStatusesActivity;
    }

    @Override // X.AbstractC06100Rs
    public void AEx(AbstractC06110Rt r7) {
        MyStatusesActivity myStatusesActivity = this.A00;
        Set set = myStatusesActivity.A0t;
        set.clear();
        Map map = myStatusesActivity.A0s;
        set.addAll(map.keySet());
        Handler handler = myStatusesActivity.A0A;
        Runnable runnable = myStatusesActivity.A0n;
        handler.removeCallbacks(runnable);
        handler.postDelayed(runnable, 200);
        map.clear();
        myStatusesActivity.A01 = null;
        myStatusesActivity.A06.notifyDataSetChanged();
    }
}
