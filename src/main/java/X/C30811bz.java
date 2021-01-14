package X;

import android.graphics.Rect;
import android.view.View;
import java.util.Map;

/* renamed from: X.1bz  reason: invalid class name and case insensitive filesystem */
public class C30811bz extends AbstractC09350ck {
    public static final String[] A00 = {"android:clipBounds:clip"};

    public static final void A02(C17280rH r4) {
        View view = r4.A00;
        if (view.getVisibility() != 8) {
            Rect A0A = AnonymousClass0Q7.A0A(view);
            Map map = r4.A02;
            map.put("android:clipBounds:clip", A0A);
            if (A0A == null) {
                map.put("android:clipBounds:bounds", new Rect(0, 0, view.getWidth(), view.getHeight()));
            }
        }
    }
}
