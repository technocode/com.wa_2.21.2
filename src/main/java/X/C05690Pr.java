package X;

import android.content.Context;
import android.net.Uri;
import android.text.TextPaint;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.google.android.search.verification.client.R;

/* renamed from: X.0Pr  reason: invalid class name and case insensitive filesystem */
public class C05690Pr extends AbstractC39391rQ {
    public AnonymousClass1MK A00;
    public Runnable A01;
    public boolean A02;
    public final AbstractC02790Dl A03;
    public final AnonymousClass02M A04;
    public final AnonymousClass03P A05;
    public final String A06;

    public C05690Pr(Context context, AnonymousClass02M r3, AnonymousClass03P r4, AbstractC02790Dl r5, String str) {
        super(context, R.color.link_color);
        this.A04 = r3;
        this.A05 = r4;
        this.A03 = r5;
        this.A06 = str;
    }

    @Override // X.AbstractC05700Ps, X.AbstractC39391rQ
    public void AL3(View view, MotionEvent motionEvent) {
        super.AL3(view, motionEvent);
        if (super.A04) {
            Uri parse = Uri.parse(this.A06);
            String scheme = parse.getScheme();
            if ("http".equals(scheme) || "https".equals(scheme) || "rtsp".equals(scheme) || "ftp".equals(scheme) || "tel".equals(scheme) || "wapay".equals(scheme)) {
                Runnable runnable = this.A01;
                if (runnable == null) {
                    runnable = new RunnableEBaseShape0S1300000_I0(this, parse, scheme, view, 1);
                    this.A01 = runnable;
                }
                AnonymousClass02M r3 = this.A04;
                r3.A02.postDelayed(runnable, (long) ViewConfiguration.getLongPressTimeout());
                return;
            }
            return;
        }
        Runnable runnable2 = this.A01;
        if (runnable2 != null) {
            this.A04.A02.removeCallbacks(runnable2);
        }
    }

    @Override // X.AbstractC05700Ps
    public void onClick(View view) {
        this.A03.ANL(view.getContext(), Uri.parse(this.A06));
        AnonymousClass1MK r0 = this.A00;
        if (r0 != null) {
            r0.A2l();
        }
    }

    @Override // X.AbstractC39391rQ
    public void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(this.A02);
    }
}
