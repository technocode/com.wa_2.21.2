package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.View;

/* renamed from: X.2IA  reason: invalid class name */
public class AnonymousClass2IA extends View {
    public boolean A00;
    public final Rect A01 = new Rect();
    public final /* synthetic */ AbstractC51572Zg A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass2IA(AbstractC51572Zg r2, Context context) {
        super(context);
        this.A02 = r2;
    }

    public boolean isSelected() {
        return this.A00;
    }

    public void onDraw(Canvas canvas) {
        boolean z;
        boolean z2;
        int i;
        int i2;
        int i3;
        int i4;
        super.onDraw(canvas);
        if (this.A00) {
            Rect rect = this.A01;
            getDrawingRect(rect);
            AbstractC51572Zg r2 = this.A02;
            if (((AnonymousClass2I2) r2).A0K) {
                rect.top = r2.getPaddingTop() + rect.top;
                rect.bottom -= r2.getPaddingBottom();
            } else {
                C51822a5 r4 = ((AnonymousClass2I2) r2).A0T;
                if (!(r4 instanceof C59272nN)) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    if (r2.A0J) {
                        rect.top = ((AnonymousClass2I2) r2).A0C.getTop() + rect.top;
                    }
                    if (!(r2 instanceof C60442pR)) {
                        z2 = !(r2 instanceof C60432pQ);
                    } else {
                        z2 = false;
                    }
                    if (z2) {
                        Rect rect2 = ((AnonymousClass2I2) r2).A08;
                        int i5 = rect2.top;
                        if (!(r4 instanceof C59272nN)) {
                            i3 = r4.A02.A0F;
                        } else {
                            i3 = 0;
                        }
                        rect.top = i5 - i3;
                        int i6 = rect2.bottom;
                        if (!(r4 instanceof C59272nN)) {
                            i4 = r4.A02.A0E;
                        } else {
                            i4 = 0;
                        }
                        rect.bottom = i4 + i6;
                    } else {
                        int i7 = rect.top;
                        if (!(r4 instanceof C59272nN)) {
                            i = r4.A02.A0F;
                        } else {
                            i = 0;
                        }
                        rect.top = i7 - i;
                        int i8 = rect.bottom;
                        if (!(r4 instanceof C59272nN)) {
                            i2 = r4.A02.A0E;
                        } else {
                            i2 = 0;
                        }
                        rect.bottom = i2 + i8;
                    }
                }
            }
            canvas.drawRect(rect, ((AnonymousClass2I2) r2).A0T.A01);
        }
    }

    public void setRowSelected(boolean z) {
        if (this.A00 != z) {
            this.A00 = z;
            setSelected(z);
            invalidate();
        }
    }
}
