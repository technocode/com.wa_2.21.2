package X;

import android.opengl.GLES20;
import android.util.Log;

/* renamed from: X.0tE  reason: invalid class name and case insensitive filesystem */
public class C18360tE {
    public int A00;
    public int A01 = 36197;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public float[] A09 = new float[9];
    public float[] A0A;

    public C18360tE(EnumC18350tD r11) {
        int A002 = C18340tC.A00();
        this.A00 = A002;
        if (A002 != 0) {
            StringBuilder A0S = AnonymousClass008.A0S("Created program ");
            A0S.append(A002);
            A0S.append(" (");
            A0S.append(r11);
            A0S.append(")");
            Log.d("Grafika", A0S.toString());
            int glGetAttribLocation = GLES20.glGetAttribLocation(this.A00, "aPosition");
            this.A02 = glGetAttribLocation;
            C18340tC.A03(glGetAttribLocation, "aPosition");
            int glGetAttribLocation2 = GLES20.glGetAttribLocation(this.A00, "aTextureCoord");
            this.A03 = glGetAttribLocation2;
            C18340tC.A03(glGetAttribLocation2, "aTextureCoord");
            int glGetUniformLocation = GLES20.glGetUniformLocation(this.A00, "uMVPMatrix");
            this.A06 = glGetUniformLocation;
            C18340tC.A03(glGetUniformLocation, "uMVPMatrix");
            int glGetUniformLocation2 = GLES20.glGetUniformLocation(this.A00, "uTexMatrix");
            this.A07 = glGetUniformLocation2;
            C18340tC.A03(glGetUniformLocation2, "uTexMatrix");
            int glGetUniformLocation3 = GLES20.glGetUniformLocation(this.A00, "uKernel");
            this.A05 = glGetUniformLocation3;
            if (glGetUniformLocation3 < 0) {
                this.A05 = -1;
                this.A08 = -1;
                this.A04 = -1;
                return;
            }
            int glGetUniformLocation4 = GLES20.glGetUniformLocation(this.A00, "uTexOffset");
            this.A08 = glGetUniformLocation4;
            C18340tC.A03(glGetUniformLocation4, "uTexOffset");
            int glGetUniformLocation5 = GLES20.glGetUniformLocation(this.A00, "uColorAdjust");
            this.A04 = glGetUniformLocation5;
            C18340tC.A03(glGetUniformLocation5, "uColorAdjust");
            System.arraycopy(new float[]{0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f}, 0, this.A09, 0, 9);
            float f = 1.0f / ((float) 256);
            float f2 = -f;
            this.A0A = new float[]{f2, f2, 0.0f, f2, f, f2, f2, 0.0f, 0.0f, 0.0f, f, 0.0f, f2, f, 0.0f, f, f, f};
            return;
        }
        throw new RuntimeException("Unable to create program");
    }
}
