package X;

import android.graphics.Bitmap;
import android.util.SparseArray;
import java.util.concurrent.ExecutorService;

/* renamed from: X.1fG  reason: invalid class name and case insensitive filesystem */
public class C32601fG {
    public final Bitmap.Config A00;
    public final SparseArray A01 = new SparseArray();
    public final C32641fK A02;
    public final AbstractC20420wg A03;
    public final ExecutorService A04;

    public C32601fG(AbstractC20420wg r2, C32641fK r3, Bitmap.Config config, ExecutorService executorService) {
        this.A03 = r2;
        this.A02 = r3;
        this.A00 = config;
        this.A04 = executorService;
    }
}
