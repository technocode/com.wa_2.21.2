package X;

import android.graphics.Rect;
import android.text.Layout;
import android.text.Spanned;
import android.widget.TextView;

/* renamed from: X.0Pu  reason: invalid class name and case insensitive filesystem */
public class C05720Pu extends AnonymousClass0Pz {
    public final Rect A00 = new Rect();
    public final TextView A01;
    public final AnonymousClass03P A02 = AnonymousClass03P.A00();

    public C05720Pu(TextView textView) {
        super(textView);
        this.A01 = textView;
    }

    public final AbstractC05700Ps A0F(int i) {
        CharSequence text = this.A01.getText();
        if (!(text instanceof Spanned)) {
            return null;
        }
        AbstractC05700Ps[] r2 = (AbstractC05700Ps[]) ((Spanned) text).getSpans(i, i, AbstractC05700Ps.class);
        if (r2.length == 1) {
            return r2[0];
        }
        return null;
    }

    public final void A0G(AbstractC05700Ps r7, Rect rect) {
        Layout layout;
        TextView textView = this.A01;
        CharSequence text = textView.getText();
        rect.setEmpty();
        if ((text instanceof Spanned) && (layout = textView.getLayout()) != null) {
            Spanned spanned = (Spanned) text;
            int spanStart = spanned.getSpanStart(r7);
            int spanEnd = spanned.getSpanEnd(r7);
            int lineForOffset = layout.getLineForOffset(spanStart);
            int lineForOffset2 = layout.getLineForOffset(spanEnd);
            layout.getLineBounds(lineForOffset, rect);
            if (lineForOffset2 != lineForOffset) {
                Rect rect2 = new Rect();
                while (true) {
                    lineForOffset++;
                    if (lineForOffset > lineForOffset2) {
                        break;
                    }
                    layout.getLineBounds(lineForOffset, rect2);
                    rect.union(rect2);
                }
            } else {
                rect.left = (int) layout.getPrimaryHorizontal(spanStart);
                rect.right = (int) layout.getPrimaryHorizontal(spanEnd);
            }
            rect.offset(textView.getTotalPaddingLeft(), textView.getTotalPaddingTop());
        }
    }
}
