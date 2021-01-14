package X;

import android.opengl.GLES20;
import android.opengl.Matrix;
import android.util.Log;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;

/* renamed from: X.0tC  reason: invalid class name and case insensitive filesystem */
public class C18340tC {
    public static final float[] A00;

    static {
        float[] fArr = new float[16];
        A00 = fArr;
        Matrix.setIdentityM(fArr, 0);
    }

    public static int A00() {
        int A01;
        int A012 = A01(35633, "uniform mat4 uMVPMatrix;\nuniform mat4 uTexMatrix;\nattribute vec4 aPosition;\nattribute vec4 aTextureCoord;\nvarying vec2 vTextureCoord;\nvoid main() {\n    gl_Position = uMVPMatrix * aPosition;\n    vTextureCoord = (uTexMatrix * aTextureCoord).xy;\n}\n");
        if (A012 == 0 || (A01 = A01(35632, "#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nvarying vec2 vTextureCoord;\nuniform samplerExternalOES sTexture;\nvoid main() {\n    gl_FragColor = texture2D(sTexture, vTextureCoord);\n}\n")) == 0) {
            return 0;
        }
        int glCreateProgram = GLES20.glCreateProgram();
        A04("glCreateProgram");
        if (glCreateProgram == 0) {
            Log.e("Grafika", "Could not create program");
        }
        GLES20.glAttachShader(glCreateProgram, A012);
        A04("glAttachShader");
        GLES20.glAttachShader(glCreateProgram, A01);
        A04("glAttachShader");
        GLES20.glLinkProgram(glCreateProgram);
        int[] iArr = new int[1];
        GLES20.glGetProgramiv(glCreateProgram, 35714, iArr, 0);
        if (iArr[0] == 1) {
            return glCreateProgram;
        }
        Log.e("Grafika", "Could not link program: ");
        Log.e("Grafika", GLES20.glGetProgramInfoLog(glCreateProgram));
        GLES20.glDeleteProgram(glCreateProgram);
        return 0;
    }

    public static int A01(int i, String str) {
        int glCreateShader = GLES20.glCreateShader(i);
        StringBuilder sb = new StringBuilder("glCreateShader type=");
        sb.append(i);
        A04(sb.toString());
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
        Log.e("Grafika", sb2.toString());
        StringBuilder sb3 = new StringBuilder(" ");
        sb3.append(GLES20.glGetShaderInfoLog(glCreateShader));
        Log.e("Grafika", sb3.toString());
        GLES20.glDeleteShader(glCreateShader);
        return 0;
    }

    public static FloatBuffer A02(float[] fArr) {
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(fArr.length << 2);
        allocateDirect.order(ByteOrder.nativeOrder());
        FloatBuffer asFloatBuffer = allocateDirect.asFloatBuffer();
        asFloatBuffer.put(fArr);
        asFloatBuffer.position(0);
        return asFloatBuffer;
    }

    public static void A03(int i, String str) {
        if (i < 0) {
            throw new RuntimeException(AnonymousClass008.A0L("Unable to locate '", str, "' in program"));
        }
    }

    public static void A04(String str) {
        int glGetError = GLES20.glGetError();
        if (glGetError != 0) {
            StringBuilder A0Y = AnonymousClass008.A0Y(str, ": glError 0x");
            A0Y.append(Integer.toHexString(glGetError));
            String obj = A0Y.toString();
            Log.e("Grafika", obj);
            throw new RuntimeException(obj);
        }
    }
}
