package X;

import android.graphics.Bitmap;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;

/* renamed from: X.28d  reason: invalid class name and case insensitive filesystem */
public class C461128d implements AnonymousClass251 {
    public final Set A00 = Collections.newSetFromMap(new IdentityHashMap());

    @Override // X.AbstractC32511f4, X.AbstractC20050w2
    public void AMT(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        if (bitmap != null) {
            this.A00.remove(bitmap);
            bitmap.recycle();
            return;
        }
        throw null;
    }

    @Override // X.AbstractC32511f4
    public Object get(int i) {
        Bitmap createBitmap = Bitmap.createBitmap(1, (int) Math.ceil(((double) i) / 2.0d), Bitmap.Config.RGB_565);
        this.A00.add(createBitmap);
        return createBitmap;
    }
}
