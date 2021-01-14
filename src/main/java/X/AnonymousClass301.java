package X;

import android.os.CountDownTimer;
import android.widget.Button;
import android.widget.TextView;

/* renamed from: X.301  reason: invalid class name */
public class AnonymousClass301 extends CountDownTimer {
    public final /* synthetic */ AnonymousClass302 A00;
    public final /* synthetic */ boolean A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass301(AnonymousClass302 r3, long j, boolean z) {
        super(j, 1000);
        this.A00 = r3;
        this.A01 = z;
    }

    public void onFinish() {
        AnonymousClass302 r1 = this.A00;
        r1.A02(true);
        r1.A01 = null;
    }

    public void onTick(long j) {
        AnonymousClass302 r2 = this.A00;
        r2.A00 = j;
        if (!this.A01) {
            r2.A06.setText(r2.A08.A06(r2.A04));
            r2.A07.setVisibility(8);
        } else if (j > 3600000) {
            int ceil = (int) Math.ceil(((double) j) / 3600000.0d);
            r2.A06.setText(r2.A08.A0A(r2.A03, (long) ceil, Integer.valueOf(ceil)));
        } else {
            Button button = r2.A06;
            AnonymousClass01X r3 = r2.A08;
            button.setText(r3.A06(r2.A04));
            TextView textView = r2.A07;
            textView.setVisibility(0);
            textView.setText(C002001d.A1W(r3, j / 1000));
        }
    }
}
