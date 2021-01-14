package X;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.View;
import android.widget.Toast;

/* renamed from: X.2H3  reason: invalid class name */
public final /* synthetic */ class AnonymousClass2H3 implements View.OnLongClickListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ AnonymousClass2Z9 A01;

    public /* synthetic */ AnonymousClass2H3(AnonymousClass2Z9 r1, int i) {
        this.A01 = r1;
        this.A00 = i;
    }

    public final boolean onLongClick(View view) {
        AnonymousClass2Z9 r8 = this.A01;
        int i = this.A00;
        Context context = view.getContext();
        AnonymousClass01X r6 = r8.A0F;
        Toast makeText = Toast.makeText(context, r6.A06(i), 0);
        int[] iArr = new int[2];
        Rect rect = new Rect();
        view.getLocationOnScreen(iArr);
        view.getWindowVisibleDisplayFrame(rect);
        int height = (view.getHeight() + iArr[1]) - rect.top;
        int i2 = iArr[0];
        if (r6.A0M()) {
            Point point = new Point();
            r8.A02.getWindowManager().getDefaultDisplay().getSize(point);
            if (makeText.getView() != null) {
                makeText.getView().measure(point.x, point.y);
                i2 -= makeText.getView().getMeasuredWidth();
            }
        } else {
            i2 += view.getWidth();
        }
        makeText.setGravity(51, i2, height);
        makeText.show();
        return true;
    }
}
