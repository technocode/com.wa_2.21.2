package X;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.os.CountDownTimer;
import android.widget.Button;
import android.widget.TextView;
import com.google.android.search.verification.client.R;
import com.whatsapp.util.Log;

/* renamed from: X.302  reason: invalid class name */
public class AnonymousClass302 {
    public long A00;
    public CountDownTimer A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final Button A06;
    public final TextView A07;
    public final AnonymousClass01X A08;
    public final String A09;

    public AnonymousClass302(AnonymousClass01X r3, Activity activity, String str, int i, int i2, int i3, int i4, int i5, int i6) {
        this.A08 = r3;
        this.A09 = str;
        this.A05 = i3;
        this.A02 = i4;
        this.A04 = i5;
        this.A03 = i6;
        this.A06 = (Button) activity.findViewById(i);
        this.A07 = (TextView) activity.findViewById(i2);
        this.A06.setAllCaps(false);
        A02(true);
    }

    public void A00() {
        CountDownTimer countDownTimer = this.A01;
        if (countDownTimer != null) {
            if (this.A00 <= 300000) {
                countDownTimer.cancel();
                this.A01 = null;
                this.A00 = 0;
            } else {
                return;
            }
        }
        A01(300000, false);
    }

    public final void A01(long j, boolean z) {
        if (j < 3000) {
            A02(true);
            return;
        }
        A02(false);
        CountDownTimer countDownTimer = this.A01;
        if (countDownTimer != null) {
            countDownTimer.cancel();
            this.A00 = 0;
        }
        StringBuilder A0S = AnonymousClass008.A0S("buttonwithprogress/");
        String str = this.A09;
        A0S.append(str);
        A0S.append("/disabling for ");
        A0S.append(j);
        Log.d(A0S.toString());
        this.A07.setText(C002001d.A1W(this.A08, j / 1000));
        StringBuilder sb = new StringBuilder();
        sb.append("buttonwithprogress/");
        sb.append(str);
        sb.append("/stating progress for ");
        sb.append(j);
        sb.append(" at ");
        sb.append(System.currentTimeMillis());
        Log.d(sb.toString());
        this.A01 = new AnonymousClass301(this, j, z).start();
    }

    public void A02(boolean z) {
        Button button = this.A06;
        button.setEnabled(z);
        if (z) {
            CountDownTimer countDownTimer = this.A01;
            if (countDownTimer != null) {
                countDownTimer.cancel();
                this.A01 = null;
            }
            button.setEnabled(true);
            AnonymousClass01X r6 = this.A08;
            button.setText(r6.A06(this.A04));
            Drawable A032 = C004302a.A03(button.getContext(), this.A05);
            if (A032 != null) {
                Drawable A0e = C002001d.A0e(A032, C004302a.A00(button.getContext(), R.color.verify_sms_enabled_icon_color));
                if (r6.A0M()) {
                    button.setCompoundDrawablesWithIntrinsicBounds(A0e, (Drawable) null, (Drawable) null, (Drawable) null);
                } else {
                    button.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, A0e, (Drawable) null);
                }
                this.A07.setVisibility(8);
                return;
            }
            throw null;
        }
        Drawable A033 = C004302a.A03(button.getContext(), this.A02);
        if (A033 != null) {
            Drawable A0e2 = C002001d.A0e(A033, C004302a.A00(button.getContext(), R.color.verify_sms_disabled_icon_color));
            if (this.A08.A0M()) {
                button.setCompoundDrawablesWithIntrinsicBounds(A0e2, (Drawable) null, (Drawable) null, (Drawable) null);
            } else {
                button.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, A0e2, (Drawable) null);
            }
            this.A07.setVisibility(8);
            return;
        }
        throw null;
    }
}
