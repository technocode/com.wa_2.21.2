package X;

import android.os.Handler;
import android.os.Vibrator;
import android.view.View;
import com.google.android.search.verification.client.R;

/* renamed from: X.2NF  reason: invalid class name */
public class AnonymousClass2NF {
    public boolean A00;
    public final Handler A01;
    public final Vibrator A02;
    public final View A03;
    public final AnonymousClass2NE A04;
    public final Runnable A05;
    public final Runnable A06;

    public AnonymousClass2NF(AnonymousClass01X r5, View view, AnonymousClass2NE r7, Handler handler) {
        this.A03 = view;
        this.A04 = r7;
        this.A01 = handler;
        view.setBackground(new C06470Tj(r5, r7));
        this.A06 = new RunnableC27961Sh(view, 0, 0.0f, 1.0f);
        this.A05 = new RunnableC27961Sh(view, 4, 1.0f, 0.0f);
        this.A02 = (Vibrator) view.getContext().getSystemService("vibrator");
        A00();
    }

    public final void A00() {
        AnonymousClass2NE r2 = this.A04;
        r2.A00 = this.A03.getContext().getResources().getColor(R.color.trashNormalBackground);
        r2.invalidateSelf();
    }

    public final boolean A01(float f, float f2) {
        View view = this.A03;
        return f >= ((float) view.getLeft()) && f <= ((float) view.getRight()) && f2 >= ((float) view.getTop()) && f2 <= ((float) view.getBottom());
    }
}
