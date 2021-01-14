package X;

import android.os.CountDownTimer;
import com.whatsapp.companiondevice.PairedDevicesActivity;
import java.util.Collections;
import java.util.List;

/* renamed from: X.2FD  reason: invalid class name */
public class AnonymousClass2FD extends CountDownTimer {
    public final /* synthetic */ PairedDevicesActivity A00;
    public final /* synthetic */ String A01;

    public void onTick(long j) {
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass2FD(PairedDevicesActivity pairedDevicesActivity, long j, String str) {
        super(j, 60000);
        this.A00 = pairedDevicesActivity;
        this.A01 = str;
    }

    public void onFinish() {
        PairedDevicesActivity pairedDevicesActivity = this.A00;
        AnonymousClass0C4 r3 = ((AbstractActivityC60812rK) pairedDevicesActivity).A0B;
        String str = this.A01;
        r3.A0H(false, str);
        pairedDevicesActivity.A03.remove(str);
        AnonymousClass2FE r2 = pairedDevicesActivity.A02;
        List A04 = r3.A04();
        Collections.sort(A04, ((AbstractActivityC60812rK) r2.A02).A0C);
        r2.A01 = A04;
        r2.notifyDataSetChanged();
    }
}
