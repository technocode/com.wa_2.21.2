package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.SparseArray;
import com.google.android.search.verification.client.R;

/* renamed from: X.08F  reason: invalid class name */
public class AnonymousClass08F {
    public static final AnonymousClass08F A02 = new AnonymousClass08F();
    public boolean A00;
    public final SparseArray A01 = new SparseArray();

    public synchronized Bitmap A00(Context context, int i) {
        if (C002001d.A3E(context) != this.A00) {
            this.A01.clear();
            boolean z = false;
            if (!this.A00) {
                z = true;
            }
            this.A00 = z;
        }
        SparseArray sparseArray = this.A01;
        Bitmap bitmap = (Bitmap) sparseArray.get(i);
        if (bitmap != null) {
            return bitmap;
        }
        Bitmap A012 = AnonymousClass0HJ.A01(context, i, context.getResources().getDimensionPixelSize(R.dimen.small_avatar_size), context.getResources().getDimension(R.dimen.small_avatar_radius));
        sparseArray.put(i, A012);
        return A012;
    }
}
