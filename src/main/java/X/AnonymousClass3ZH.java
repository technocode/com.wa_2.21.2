package X;

import android.text.TextPaint;
import android.text.style.URLSpan;
import android.view.View;
import java.util.Map;

/* renamed from: X.3ZH  reason: invalid class name */
public final class AnonymousClass3ZH extends AbstractC39391rQ {
    public final /* synthetic */ int A00;
    public final /* synthetic */ URLSpan A01;
    public final /* synthetic */ Map A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass3ZH(Map map, URLSpan uRLSpan, int i) {
        super(0, 0, 0);
        this.A02 = map;
        this.A01 = uRLSpan;
        this.A00 = i;
    }

    @Override // X.AbstractC05700Ps
    public void onClick(View view) {
        Runnable runnable = (Runnable) this.A02.get(this.A01.getURL());
        if (runnable != null) {
            runnable.run();
        }
    }

    @Override // X.AbstractC39391rQ
    public void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(false);
        int i = this.A00;
        if (i != 0) {
            textPaint.setColor(i);
        } else {
            textPaint.setColor(textPaint.linkColor);
        }
    }
}
