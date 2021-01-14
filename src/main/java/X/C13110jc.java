package X;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.drawable.Drawable;
import androidx.appcompat.widget.ActionBarContainer;

/* renamed from: X.0jc  reason: invalid class name and case insensitive filesystem */
public class C13110jc extends Drawable {
    public final ActionBarContainer A00;

    public int getOpacity() {
        return 0;
    }

    public void setAlpha(int i) {
    }

    public void setColorFilter(ColorFilter colorFilter) {
    }

    public C13110jc(ActionBarContainer actionBarContainer) {
        this.A00 = actionBarContainer;
    }

    public void draw(Canvas canvas) {
        ActionBarContainer actionBarContainer = this.A00;
        if (actionBarContainer.A07) {
            Drawable drawable = actionBarContainer.A02;
            if (drawable != null) {
                drawable.draw(canvas);
                return;
            }
            return;
        }
        Drawable drawable2 = actionBarContainer.A01;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        Drawable drawable3 = actionBarContainer.A03;
        if (drawable3 != null && actionBarContainer.A08) {
            drawable3.draw(canvas);
        }
    }

    public void getOutline(Outline outline) {
        ActionBarContainer actionBarContainer = this.A00;
        if (actionBarContainer.A07) {
            Drawable drawable = actionBarContainer.A02;
            if (drawable != null) {
                drawable.getOutline(outline);
                return;
            }
            return;
        }
        Drawable drawable2 = actionBarContainer.A01;
        if (drawable2 != null) {
            drawable2.getOutline(outline);
        }
    }
}
