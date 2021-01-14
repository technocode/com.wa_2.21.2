package X;

import android.os.CountDownTimer;
import android.view.View;
import android.widget.TextView;
import com.google.android.search.verification.client.R;

/* renamed from: X.1xe  reason: invalid class name and case insensitive filesystem */
public class C43011xe extends AbstractC25311Gi {
    public static final C43011xe A01 = new C43011xe();
    public final AnonymousClass01X A00 = AnonymousClass01X.A00();

    public static void A00(View view, C46502As r3) {
        CountDownTimer countDownTimer = r3.A01;
        if (countDownTimer != null) {
            countDownTimer.cancel();
            r3.A01 = null;
        }
        ((TextView) view.findViewById(R.id.start_message)).setText("");
        ((TextView) view.findViewById(R.id.timer_text)).setText("");
        view.setVisibility(8);
    }

    public void A01(View view, AnonymousClass05q r14, C46502As r15, Object obj) {
        if (r15.A00 > 0) {
            view.setVisibility(0);
            ((TextView) view.findViewById(R.id.start_message)).setText(r15.A03);
            TextView textView = (TextView) view.findViewById(R.id.timer_text);
            r15.A01 = new AnonymousClass1TC(this, r15.A00, textView, view, r15, r14).start();
            if (obj != null) {
                textView.setText((String) obj);
            }
        }
    }
}
