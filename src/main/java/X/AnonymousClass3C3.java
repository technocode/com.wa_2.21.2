package X;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.IdentityHashMap;
import java.util.Map;

/* renamed from: X.3C3  reason: invalid class name */
public class AnonymousClass3C3 {
    public static final FloatBuffer A01;
    public static final FloatBuffer A02;
    public final Map A00 = new IdentityHashMap();

    static {
        int i = 8 << 2;
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(i);
        allocateDirect.order(ByteOrder.nativeOrder());
        FloatBuffer asFloatBuffer = allocateDirect.asFloatBuffer();
        asFloatBuffer.put(new float[]{-1.0f, -1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f});
        asFloatBuffer.position(0);
        A01 = asFloatBuffer;
        ByteBuffer allocateDirect2 = ByteBuffer.allocateDirect(i);
        allocateDirect2.order(ByteOrder.nativeOrder());
        FloatBuffer asFloatBuffer2 = allocateDirect2.asFloatBuffer();
        asFloatBuffer2.put(new float[]{0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f});
        asFloatBuffer2.position(0);
        A02 = asFloatBuffer2;
    }
}
