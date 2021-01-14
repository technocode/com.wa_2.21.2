package X;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;
import com.facebook.redex.ViewOnClickEBaseShape2S0100000_I1_0;
import com.google.android.search.verification.client.R;
import com.whatsapp.util.Log;
import java.util.Date;
import java.util.TimeZone;

/* renamed from: X.1sj  reason: invalid class name and case insensitive filesystem */
public final class DialogC40161sj extends DialogC26681Ly {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ AnonymousClass03B A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DialogC40161sj(Activity activity, AnonymousClass01X r4, AnonymousClass03B r5, Activity activity2) {
        super(activity, r4, R.layout.clock_wrong, true);
        this.A01 = r5;
        this.A00 = activity2;
    }

    @Override // X.DialogC26681Ly
    public void onCreate(Bundle bundle) {
        long time;
        super.onCreate(bundle);
        Date date = new Date();
        StringBuilder A0S = AnonymousClass008.A0S("conversations/clock-wrong-time ");
        A0S.append(date.toString());
        Log.w(A0S.toString());
        Date date2 = this.A01.A00;
        if (date2 != null) {
            time = date2.getTime();
        } else {
            time = date.getTime();
        }
        AnonymousClass01X r7 = this.A02;
        ((TextView) findViewById(R.id.clock_wrong_date)).setText(r7.A0D(R.string.clock_wrong_report_current_date_time, AnonymousClass0OY.A05(r7, C001801b.A0e(r7, time), AnonymousClass0OZ.A00(r7, time)), TimeZone.getDefault().getDisplayName(r7.A0I())));
        findViewById(R.id.close).setOnClickListener(new ViewOnClickEBaseShape2S0100000_I1_0(this.A00, 24));
    }
}
