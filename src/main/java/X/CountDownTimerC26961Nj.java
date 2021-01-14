package X;

import android.os.CountDownTimer;
import com.google.android.search.verification.client.SearchActionVerificationClientService;
import com.whatsapp.CircularProgressBar;
import com.whatsapp.SpamWarningActivity;
import com.whatsapp.util.Log;

/* renamed from: X.1Nj  reason: invalid class name and case insensitive filesystem */
public class CountDownTimerC26961Nj extends CountDownTimer {
    public final /* synthetic */ CircularProgressBar A00;
    public final /* synthetic */ SpamWarningActivity A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CountDownTimerC26961Nj(SpamWarningActivity spamWarningActivity, long j, CircularProgressBar circularProgressBar) {
        super(j, 10);
        this.A01 = spamWarningActivity;
        this.A00 = circularProgressBar;
    }

    public void onFinish() {
        this.A01.finish();
    }

    public void onTick(long j) {
        int i = (int) j;
        int i2 = i / SearchActionVerificationClientService.CONNECTION_TIMEOUT_IN_MS;
        StringBuilder A0S = AnonymousClass008.A0S("expiryInSeconds:");
        SpamWarningActivity spamWarningActivity = this.A01;
        A0S.append(spamWarningActivity.A00);
        A0S.append(" secondsPassed:");
        A0S.append(i2);
        Log.d(A0S.toString());
        CircularProgressBar circularProgressBar = this.A00;
        circularProgressBar.setCenterText(C002001d.A1W(((AnonymousClass2C0) spamWarningActivity).A01, (long) i2));
        circularProgressBar.setProgress(i);
    }
}
