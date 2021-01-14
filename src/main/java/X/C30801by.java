package X;

import android.graphics.Rect;
import android.util.Property;
import android.view.View;
import java.util.Map;

/* renamed from: X.1by  reason: invalid class name and case insensitive filesystem */
public class C30801by extends AbstractC09350ck {
    public static C17210rA A01 = new C17210rA();
    public static final Property A02 = new C17130r1();
    public static final Property A03 = new C17120r0();
    public static final Property A04 = new C17100qy();
    public static final Property A05 = new C17150r3();
    public static final Property A06 = new C17140r2();
    public static final Property A07 = new C17110qz();
    public static final String[] A08 = {"android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY"};
    public int[] A00 = new int[2];

    public final void A0U(C17280rH r7) {
        View view = r7.A00;
        if (AnonymousClass0Q7.A0j(view) || view.getWidth() != 0 || view.getHeight() != 0) {
            Map map = r7.A02;
            map.put("android:changeBounds:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
            map.put("android:changeBounds:parent", r7.A00.getParent());
        }
    }
}
