package X;

import android.content.Context;
import android.text.TextPaint;
import android.text.style.URLSpan;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.search.verification.client.R;
import java.util.Map;

/* renamed from: X.3Rn  reason: invalid class name and case insensitive filesystem */
public class C72103Rn extends URLSpan implements AbstractC05700Ps {
    public int A00;
    public int A01;
    public boolean A02;
    public final AnonymousClass3S0 A03;
    public final String A04;
    public final Map A05;

    public C72103Rn(Context context, String str, String str2, Map map, AnonymousClass3S0 r7) {
        super(str);
        this.A04 = str2;
        this.A05 = map;
        this.A03 = r7;
        int A002 = C004302a.A00(context, R.color.link_color);
        this.A01 = A002;
        this.A00 = C004402b.A03(A002, 72);
    }

    @Override // X.AbstractC05700Ps
    public void AL3(View view, MotionEvent motionEvent) {
        boolean z = true;
        if (motionEvent.getAction() == 1 && this.A02) {
            this.A03.A00(this.A04, this.A05);
        }
        if (motionEvent.getAction() != 0) {
            z = false;
        }
        this.A02 = z;
        view.invalidate();
    }

    @Override // X.AbstractC05700Ps
    public void onClick(View view) {
        this.A03.A00(this.A04, this.A05);
    }

    public void updateDrawState(TextPaint textPaint) {
        int i;
        super.updateDrawState(textPaint);
        textPaint.setColor(this.A01);
        if (this.A02) {
            i = this.A00;
        } else {
            i = 0;
        }
        textPaint.bgColor = i;
        textPaint.setUnderlineText(false);
    }
}
