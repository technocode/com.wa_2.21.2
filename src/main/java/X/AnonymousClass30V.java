package X;

import android.os.CountDownTimer;
import android.widget.ProgressBar;
import com.google.android.search.verification.client.R;
import com.whatsapp.registration.VerifySms;
import com.whatsapp.util.Log;

/* renamed from: X.30V  reason: invalid class name */
public class AnonymousClass30V extends CountDownTimer {
    public final /* synthetic */ long A00;
    public final /* synthetic */ VerifySms A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass30V(VerifySms verifySms, long j, long j2) {
        super(j, 1000);
        this.A01 = verifySms;
        this.A00 = j2;
    }

    public void onFinish() {
        VerifySms verifySms = this.A01;
        verifySms.A03 = null;
        verifySms.A0A.setEnabled(true);
        verifySms.A08.setProgress(100);
        verifySms.A09.setText(((AnonymousClass2C0) verifySms).A01.A0D(R.string.verify_description_bottom, Integer.valueOf(VerifySms.A0u)));
        verifySms.A0O = false;
        verifySms.A0b();
        String A0V = verifySms.A0V();
        if (A0V != null) {
            Log.i("verifysms/countdowntimer/done/try-savedcode");
            verifySms.A00 = 0;
            AnonymousClass00T r1 = verifySms.A0t;
            String str = verifySms.A0L;
            String str2 = verifySms.A0M;
            if (str2 != null) {
                r1.ANC(new C09910dj(str, str2, "sms", AnonymousClass2Nx.TAPPED_LINK, verifySms, ((ActivityC004702f) verifySms).A0J, verifySms.A0n, verifySms.A0J), A0V);
                return;
            }
            throw null;
        }
    }

    public void onTick(long j) {
        ProgressBar progressBar = this.A01.A08;
        long j2 = this.A00;
        progressBar.setProgress((int) ((((double) (j2 - j)) * 100.0d) / ((double) j2)));
    }
}
