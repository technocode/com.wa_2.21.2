package X;

import android.content.res.Resources;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.Handler;
import android.os.Vibrator;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.search.verification.client.R;
import com.whatsapp.util.Log;

/* renamed from: X.2MZ  reason: invalid class name */
public abstract class AnonymousClass2MZ {
    public boolean A00 = false;
    public final Resources A01;
    public final Paint A02;
    public final RectF A03;
    public final Handler A04;
    public final Vibrator A05;
    public final View A06;
    public final ViewGroup A07;
    public final Runnable A08;
    public final Runnable A09;

    public AnonymousClass2MZ(Handler handler, ViewGroup viewGroup, RectF rectF, Vibrator vibrator) {
        int i;
        this.A04 = handler;
        this.A07 = viewGroup;
        this.A03 = rectF;
        this.A05 = vibrator;
        this.A01 = viewGroup.getResources();
        Paint paint = new Paint();
        Resources resources = this.A01;
        if (!(this instanceof AnonymousClass2c9)) {
            i = R.color.status_grid_center;
        } else {
            i = R.color.status_grid_rotation;
        }
        paint.setColor(resources.getColor(i));
        paint.setStrokeWidth((float) this.A01.getDimensionPixelSize(R.dimen.media_guideline_stroke_width));
        paint.setStyle(Paint.Style.STROKE);
        this.A02 = paint;
        AnonymousClass2MY r2 = new AnonymousClass2MY(this, viewGroup.getContext());
        r2.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        r2.setVisibility(4);
        this.A06 = r2;
        viewGroup.addView(r2, 0);
        View view = this.A06;
        this.A09 = new RunnableC27961Sh(view, 0, 0.0f, 1.0f);
        this.A08 = new RunnableC27961Sh(view, 4, 1.0f, 0.0f);
    }

    public void A00() {
        Handler handler = this.A04;
        handler.removeCallbacks(this.A09);
        handler.post(this.A08);
        this.A00 = false;
    }

    public void A01() {
        Vibrator vibrator;
        Handler handler = this.A04;
        handler.removeCallbacks(this.A08);
        handler.post(this.A09);
        if (!this.A00 && (vibrator = this.A05) != null) {
            try {
                vibrator.vibrate(3);
            } catch (NullPointerException e) {
                Log.e("Vibrator is broken on this device.", e);
            }
        }
        this.A00 = true;
    }
}
