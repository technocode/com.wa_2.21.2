package X;

import android.graphics.Matrix;
import java.util.ArrayList;

/* renamed from: X.0VF  reason: invalid class name */
public class AnonymousClass0VF extends AnonymousClass0VG {
    public float A00 = 0.0f;
    public float A01 = 0.0f;
    public float A02 = 0.0f;
    public float A03 = 1.0f;
    public float A04 = 1.0f;
    public float A05 = 0.0f;
    public float A06 = 0.0f;
    public int A07;
    public String A08 = null;
    public int[] A09;
    public final Matrix A0A = new Matrix();
    public final Matrix A0B = new Matrix();
    public final ArrayList A0C = new ArrayList();

    public AnonymousClass0VF() {
        super(null);
    }

    public AnonymousClass0VF(AnonymousClass0VF r6, AnonymousClass05V r7) {
        super(null);
        AnonymousClass0VI r1;
        this.A02 = r6.A02;
        this.A00 = r6.A00;
        this.A01 = r6.A01;
        this.A03 = r6.A03;
        this.A04 = r6.A04;
        this.A05 = r6.A05;
        this.A06 = r6.A06;
        this.A09 = r6.A09;
        String str = r6.A08;
        this.A08 = str;
        this.A07 = r6.A07;
        if (str != null) {
            r7.put(str, this);
        }
        this.A0A.set(r6.A0A);
        ArrayList arrayList = r6.A0C;
        for (int i = 0; i < arrayList.size(); i++) {
            Object obj = arrayList.get(i);
            if (obj instanceof AnonymousClass0VF) {
                this.A0C.add(new AnonymousClass0VF((AnonymousClass0VF) obj, r7));
            } else {
                if (obj instanceof AnonymousClass0VH) {
                    r1 = new AnonymousClass0VH((AnonymousClass0VH) obj);
                } else if (obj instanceof AnonymousClass0VL) {
                    r1 = new AnonymousClass0VL((AnonymousClass0VL) obj);
                } else {
                    throw new IllegalStateException("Unknown object in the tree!");
                }
                this.A0C.add(r1);
                Object obj2 = r1.A02;
                if (obj2 != null) {
                    r7.put(obj2, r1);
                }
            }
        }
    }

    public final void A02() {
        Matrix matrix = this.A0A;
        matrix.reset();
        matrix.postTranslate(-this.A00, -this.A01);
        matrix.postScale(this.A03, this.A04);
        matrix.postRotate(this.A02, 0.0f, 0.0f);
        matrix.postTranslate(this.A05 + this.A00, this.A06 + this.A01);
    }

    public String getGroupName() {
        return this.A08;
    }

    public Matrix getLocalMatrix() {
        return this.A0A;
    }

    public float getPivotX() {
        return this.A00;
    }

    public float getPivotY() {
        return this.A01;
    }

    public float getRotation() {
        return this.A02;
    }

    public float getScaleX() {
        return this.A03;
    }

    public float getScaleY() {
        return this.A04;
    }

    public float getTranslateX() {
        return this.A05;
    }

    public float getTranslateY() {
        return this.A06;
    }

    public void setPivotX(float f) {
        if (f != this.A00) {
            this.A00 = f;
            A02();
        }
    }

    public void setPivotY(float f) {
        if (f != this.A01) {
            this.A01 = f;
            A02();
        }
    }

    public void setRotation(float f) {
        if (f != this.A02) {
            this.A02 = f;
            A02();
        }
    }

    public void setScaleX(float f) {
        if (f != this.A03) {
            this.A03 = f;
            A02();
        }
    }

    public void setScaleY(float f) {
        if (f != this.A04) {
            this.A04 = f;
            A02();
        }
    }

    public void setTranslateX(float f) {
        if (f != this.A05) {
            this.A05 = f;
            A02();
        }
    }

    public void setTranslateY(float f) {
        if (f != this.A06) {
            this.A06 = f;
            A02();
        }
    }
}
