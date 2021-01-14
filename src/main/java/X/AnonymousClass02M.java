package X;

import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
import com.google.android.search.verification.client.R;
import com.whatsapp.util.Log;
import java.util.concurrent.Executor;

/* renamed from: X.02M  reason: invalid class name */
public class AnonymousClass02M {
    public static volatile AnonymousClass02M A07;
    public AbstractC004502c A00;
    public AnonymousClass1M2 A01;
    public final Handler A02 = new Handler(Looper.getMainLooper());
    public final AnonymousClass04j A03;
    public final AnonymousClass00G A04;
    public final AnonymousClass01X A05;
    public final Executor A06 = new AnonymousClass093(this);

    public AnonymousClass02M(AnonymousClass00G r3, AnonymousClass01X r4, AnonymousClass04j r5) {
        this.A04 = r3;
        this.A05 = r4;
        this.A03 = r5;
    }

    public static AnonymousClass02M A00() {
        if (A07 == null) {
            synchronized (AnonymousClass02M.class) {
                if (A07 == null) {
                    A07 = new AnonymousClass02M(AnonymousClass00G.A01, AnonymousClass01X.A00(), AnonymousClass04j.A00());
                }
            }
        }
        return A07;
    }

    public final Toast A01(CharSequence charSequence, int i) {
        AnonymousClass00G r4 = this.A04;
        Toast makeText = Toast.makeText(r4.A00, charSequence, i);
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 26 && i2 <= 28) {
            String str = Build.MANUFACTURER;
            if ("google".equalsIgnoreCase(str) || "oneplus".equalsIgnoreCase(str)) {
                View view = makeText.getView();
                Drawable background = view.getBackground();
                TextView textView = (TextView) view.findViewById(16908299);
                if (!(background == null || textView == null)) {
                    background.setColorFilter(C004302a.A00(r4.A00, R.color.toast_background), PorterDuff.Mode.SRC_IN);
                    textView.setTextColor(C004302a.A00(r4.A00, R.color.toast_text));
                }
            }
        }
        return makeText;
    }

    public void A02() {
        StringBuilder A0S = AnonymousClass008.A0S("app/progress-spinner/remove dt=");
        A0S.append(this.A00);
        Log.i(A0S.toString());
        this.A01 = null;
        AbstractC004502c r0 = this.A00;
        if (r0 != null) {
            r0.AMi();
        } else {
            C06090Rr.A02 = false;
        }
        Log.i("app/progress-spinner/remove done");
    }

    public final void A03(int i) {
        this.A02.post(new RunnableEBaseShape0S0101000_I0(this, i, 1));
    }

    public void A04(int i, int i2) {
        AbstractC004502c r0 = this.A00;
        if (r0 != null) {
            r0.APo(i);
        } else {
            A0C(this.A05.A06(i), i2);
        }
    }

    public void A05(int i, int i2) {
        StringBuilder A0S = AnonymousClass008.A0S("app/progress-spinner/show dt=");
        A0S.append(this.A00);
        Log.i(A0S.toString());
        this.A01 = new AnonymousClass1M2(i, i2);
        AbstractC004502c r0 = this.A00;
        if (r0 != null) {
            r0.APv(i, i2);
        }
        Log.i("app/progress-spinner/show done");
    }

    public void A06(int i, int i2) {
        A0C(this.A05.A06(i), i2);
    }

    public void A07(AbstractC004502c r3) {
        StringBuilder sb = new StringBuilder("app/dt/clear dt=");
        sb.append(r3);
        sb.append(" dialog_toast=");
        sb.append(this.A00);
        Log.i(sb.toString());
        AbstractC004502c r1 = this.A00;
        if (r1 == r3) {
            if (this.A01 != null) {
                r1.AMi();
            }
            this.A00 = null;
        }
        Log.i("app/dt/clear done");
    }

    public void A08(AbstractC004502c r3) {
        if (r3 == null && (r3 = this.A00) == null) {
            AnonymousClass00E.A08(false, "dialogToast == null");
            Log.w("app/removeProgressSpinner/ignore dialogToast == null");
            return;
        }
        r3.AMi();
    }

    public void A09(AbstractC004502c r4) {
        StringBuilder sb = new StringBuilder("app/dt/set ");
        sb.append(r4);
        Log.i(sb.toString());
        this.A00 = r4;
        AnonymousClass1M2 r2 = this.A01;
        if (r2 != null) {
            StringBuilder A0S = AnonymousClass008.A0S("app/dt/set show_progress_data=");
            A0S.append(r2);
            A0S.append(" dialog_toast=");
            A0S.append(this.A00);
            Log.i(A0S.toString());
            AbstractC004502c r22 = this.A00;
            AnonymousClass1M2 r0 = this.A01;
            r22.APv(r0.A02, r0.A01);
            if (this.A01.A00 != null) {
                Log.i("app/dt/set/update");
                this.A00.AQu(this.A01.A00);
            }
        }
        Log.i("app/dt/set done");
    }

    public void A0A(AbstractC004502c r4) {
        if (r4 == null && (r4 = this.A00) == null) {
            AnonymousClass00E.A08(false, "dialogToast == null");
            A0C(this.A05.A06(R.string.register_wait_message), 0);
            return;
        }
        r4.APv(0, R.string.register_wait_message);
    }

    public void A0B(AbstractC004502c r2, String str) {
        if (r2 != null) {
            r2.APr(str);
        } else {
            A0G(str, 0);
        }
    }

    public void A0C(CharSequence charSequence, int i) {
        Toast A012 = A01(charSequence, i);
        A012.setGravity(17, 0, 0);
        A012.show();
    }

    public void A0D(CharSequence charSequence, int i) {
        if (C003701u.A0D()) {
            Toast A012 = A01(charSequence, i);
            A012.setGravity(17, 0, 0);
            A012.show();
            return;
        }
        this.A02.post(new RunnableEBaseShape0S0201000_I0(this, i, charSequence, 5));
    }

    public void A0E(Runnable runnable) {
        if (C003701u.A0D()) {
            runnable.run();
        } else {
            this.A02.post(runnable);
        }
    }

    public void A0F(String str) {
        StringBuilder A0S = AnonymousClass008.A0S("app/progress-spinner/update-message dt=");
        A0S.append(this.A00);
        Log.i(A0S.toString());
        AnonymousClass1M2 r0 = this.A01;
        if (r0 != null) {
            r0.A00 = str;
        } else {
            Log.w("app/progress-spinner/update-message no progress data");
        }
        AbstractC004502c r02 = this.A00;
        if (r02 != null) {
            r02.AQu(str);
        }
        Log.i("app/progress-spinner/update-message done");
    }

    public void A0G(String str, int i) {
        AbstractC004502c r0 = this.A00;
        if (r0 != null) {
            r0.APr(str);
            return;
        }
        Toast A012 = A01(str, i);
        A012.setGravity(17, 0, 0);
        A012.show();
    }

    public boolean A0H() {
        if (this.A03.A05()) {
            return true;
        }
        boolean A022 = AnonymousClass04j.A02(this.A04.A00);
        int i = R.string.network_required;
        if (A022) {
            i = R.string.network_required_airplane_on;
        }
        A06(i, 0);
        return false;
    }
}
