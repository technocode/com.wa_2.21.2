package X;

import android.graphics.Outline;
import android.graphics.Rect;

/* renamed from: X.1mt  reason: invalid class name and case insensitive filesystem */
public class C36791mt extends C08230ag {
    public void getOutline(Outline outline) {
        Rect rect = this.A0A;
        copyBounds(rect);
        outline.setOval(rect);
    }
}
