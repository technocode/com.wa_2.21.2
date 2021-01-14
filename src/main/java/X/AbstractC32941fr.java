package X;

import android.graphics.BitmapFactory;
import android.os.Build;
import com.facebook.imagepipeline.platform.PreverificationHelper;
import java.nio.ByteBuffer;

/* renamed from: X.1fr  reason: invalid class name and case insensitive filesystem */
public abstract class AbstractC32941fr {
    public static final byte[] A03 = {-1, -39};
    public final C30101aj A00;
    public final AnonymousClass251 A01;
    public final PreverificationHelper A02;

    public abstract int A00(int i, int i2, BitmapFactory.Options options);

    public AbstractC32941fr(AnonymousClass251 r4, int i, C30101aj r6) {
        PreverificationHelper preverificationHelper;
        if (Build.VERSION.SDK_INT >= 26) {
            preverificationHelper = new PreverificationHelper();
        } else {
            preverificationHelper = null;
        }
        this.A02 = preverificationHelper;
        this.A01 = r4;
        this.A00 = r6;
        for (int i2 = 0; i2 < i; i2++) {
            this.A00.A01(ByteBuffer.allocate(16384));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0098, code lost:
        if (r6 == false) goto L_0x009a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.AbstractC20030w0 A01(X.C20620x1 r12, android.graphics.Bitmap.Config r13, int r14) {
        /*
        // Method dump skipped, instructions count: 325
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC32941fr.A01(X.0x1, android.graphics.Bitmap$Config, int):X.0w0");
    }
}
