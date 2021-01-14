package X;

import android.hardware.Camera;
import java.util.Comparator;

/* renamed from: X.2Dw  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C46572Dw implements Comparator {
    public static final /* synthetic */ C46572Dw A00 = new C46572Dw();

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        Camera.Size size = (Camera.Size) obj;
        Camera.Size size2 = (Camera.Size) obj2;
        int i = size.width * size.height;
        int i2 = size2.width * size2.height;
        if (i > i2) {
            return -1;
        }
        return i == i2 ? 0 : 1;
    }
}
