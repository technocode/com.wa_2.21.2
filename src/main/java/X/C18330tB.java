package X;

import android.opengl.GLES20;
import java.nio.Buffer;
import java.nio.FloatBuffer;

/* renamed from: X.0tB  reason: invalid class name and case insensitive filesystem */
public class C18330tB {
    public C18360tE A00;
    public final C18300t8 A01 = new C18300t8(EnumC18290t7.FULL_RECTANGLE);

    public C18330tB(C18360tE r3) {
        this.A00 = r3;
    }

    public int A00() {
        C18360tE r4 = this.A00;
        if (r4 != null) {
            int[] iArr = new int[1];
            GLES20.glGenTextures(1, iArr, 0);
            C18340tC.A04("glGenTextures");
            int i = iArr[0];
            GLES20.glBindTexture(r4.A01, i);
            StringBuilder sb = new StringBuilder("glBindTexture ");
            sb.append(i);
            C18340tC.A04(sb.toString());
            GLES20.glTexParameterf(36197, 10241, 9728.0f);
            GLES20.glTexParameterf(36197, 10240, 9729.0f);
            GLES20.glTexParameteri(36197, 10242, 33071);
            GLES20.glTexParameteri(36197, 10243, 33071);
            C18340tC.A04("glTexParameter");
            return i;
        }
        throw null;
    }

    public void A01(int i, float[] fArr) {
        C18360tE r1 = this.A00;
        float[] fArr2 = C18340tC.A00;
        C18300t8 r0 = this.A01;
        FloatBuffer floatBuffer = r0.A06;
        int i2 = r0.A02;
        int i3 = r0.A00;
        int i4 = r0.A03;
        FloatBuffer floatBuffer2 = r0.A05;
        int i5 = r0.A01;
        if (r1 != null) {
            C18340tC.A04("draw start");
            GLES20.glUseProgram(r1.A00);
            C18340tC.A04("glUseProgram");
            GLES20.glActiveTexture(33984);
            GLES20.glBindTexture(r1.A01, i);
            GLES20.glUniformMatrix4fv(r1.A06, 1, false, fArr2, 0);
            C18340tC.A04("glUniformMatrix4fv");
            GLES20.glUniformMatrix4fv(r1.A07, 1, false, fArr, 0);
            C18340tC.A04("glUniformMatrix4fv");
            GLES20.glEnableVertexAttribArray(r1.A02);
            C18340tC.A04("glEnableVertexAttribArray");
            GLES20.glVertexAttribPointer(r1.A02, i3, 5126, false, i4, (Buffer) floatBuffer);
            C18340tC.A04("glVertexAttribPointer");
            GLES20.glEnableVertexAttribArray(r1.A03);
            C18340tC.A04("glEnableVertexAttribArray");
            GLES20.glVertexAttribPointer(r1.A03, 2, 5126, false, i5, (Buffer) floatBuffer2);
            C18340tC.A04("glVertexAttribPointer");
            int i6 = r1.A05;
            if (i6 >= 0) {
                GLES20.glUniform1fv(i6, 9, r1.A09, 0);
                GLES20.glUniform2fv(r1.A08, 9, r1.A0A, 0);
                GLES20.glUniform1f(r1.A04, 0.0f);
            }
            GLES20.glDrawArrays(5, 0, i2);
            C18340tC.A04("glDrawArrays");
            GLES20.glDisableVertexAttribArray(r1.A02);
            GLES20.glDisableVertexAttribArray(r1.A03);
            GLES20.glBindTexture(r1.A01, 0);
            GLES20.glUseProgram(0);
            return;
        }
        throw null;
    }
}
