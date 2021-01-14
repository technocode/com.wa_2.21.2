package X;

import android.opengl.GLES20;
import android.opengl.Matrix;
import android.util.Log;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;

/* renamed from: X.1OC  reason: invalid class name */
public class AnonymousClass1OC {
    public int A00;
    public int A01;
    public int A02;
    public int A03 = -12345;
    public int A04;
    public int A05;
    public FloatBuffer A06;
    public float[] A07 = new float[16];
    public float[] A08 = new float[16];
    public final float[] A09 = {-1.0f, -1.0f, 0.0f, 0.0f, 0.0f, 1.0f, -1.0f, 0.0f, 1.0f, 0.0f, -1.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f, 0.0f, 1.0f, 1.0f};

    public AnonymousClass1OC() {
        FloatBuffer asFloatBuffer = ByteBuffer.allocateDirect(80).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.A06 = asFloatBuffer;
        asFloatBuffer.put(this.A09);
        asFloatBuffer.position(0);
        Matrix.setIdentityM(this.A08, 0);
    }

    public static void A00(String str) {
        int glGetError = GLES20.glGetError();
        if (glGetError != 0) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(": glError ");
            sb.append(glGetError);
            Log.e("TextureRender", sb.toString());
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str);
            sb2.append(": glError ");
            sb2.append(glGetError);
            throw new RuntimeException(sb2.toString());
        }
    }

    public final int A01(int i, String str) {
        int glCreateShader = GLES20.glCreateShader(i);
        StringBuilder sb = new StringBuilder("glCreateShader type=");
        sb.append(i);
        A00(sb.toString());
        GLES20.glShaderSource(glCreateShader, str);
        GLES20.glCompileShader(glCreateShader);
        int[] iArr = new int[1];
        GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
        if (iArr[0] != 0) {
            return glCreateShader;
        }
        StringBuilder sb2 = new StringBuilder("Could not compile shader ");
        sb2.append(i);
        sb2.append(":");
        Log.e("TextureRender", sb2.toString());
        StringBuilder sb3 = new StringBuilder(" ");
        sb3.append(GLES20.glGetShaderInfoLog(glCreateShader));
        Log.e("TextureRender", sb3.toString());
        GLES20.glDeleteShader(glCreateShader);
        return 0;
    }
}
