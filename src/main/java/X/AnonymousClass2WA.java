package X;

import android.graphics.Point;
import android.view.MotionEvent;
import android.view.View;
import com.whatsapp.WaEditText;
import java.util.List;

/* renamed from: X.2WA  reason: invalid class name */
public final /* synthetic */ class AnonymousClass2WA implements View.OnTouchListener {
    public final /* synthetic */ C58762mT A00;
    public final /* synthetic */ List A01;

    public /* synthetic */ AnonymousClass2WA(C58762mT r1, List list) {
        this.A00 = r1;
        this.A01 = list;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        C58762mT r4 = this.A00;
        List<WaEditText> list = this.A01;
        if (!(motionEvent.getActionMasked() == 2 || motionEvent.getActionMasked() == 1)) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            int[] iArr = new int[2];
            view.getLocationOnScreen(iArr);
            Point point = new Point(((int) x) + iArr[0], ((int) y) + iArr[1]);
            for (WaEditText waEditText : list) {
                if (AnonymousClass1MI.A00(point, waEditText) && waEditText.A02(point)) {
                    r4.A03(waEditText);
                    return true;
                }
            }
            if (motionEvent.getY() < 0.0f) {
                return true;
            }
        }
        r4.A01.A0E.onTouch(view, motionEvent);
        return false;
    }
}
