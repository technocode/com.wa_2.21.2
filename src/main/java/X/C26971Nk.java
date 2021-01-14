package X;

import android.content.Intent;
import com.whatsapp.HomeActivity;
import com.whatsapp.SpamWarningActivity;

/* renamed from: X.1Nk  reason: invalid class name and case insensitive filesystem */
public class C26971Nk extends Thread {
    public final /* synthetic */ SpamWarningActivity A00;

    public C26971Nk(SpamWarningActivity spamWarningActivity) {
        this.A00 = spamWarningActivity;
    }

    public void run() {
        SpamWarningActivity.A02.block();
        SpamWarningActivity spamWarningActivity = this.A00;
        spamWarningActivity.startActivity(new Intent(null, null, spamWarningActivity, HomeActivity.class));
        spamWarningActivity.finish();
    }
}
