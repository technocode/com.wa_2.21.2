package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.util.SparseIntArray;

/* renamed from: X.0lh  reason: invalid class name and case insensitive filesystem */
public class C14200lh {
    public static SparseIntArray A0D;
    public float A00 = 0.0f;
    public float A01 = 0.0f;
    public float A02 = 0.0f;
    public float A03 = 0.0f;
    public float A04 = 1.0f;
    public float A05 = 1.0f;
    public float A06 = Float.NaN;
    public float A07 = Float.NaN;
    public float A08 = 0.0f;
    public float A09 = 0.0f;
    public float A0A = 0.0f;
    public boolean A0B = false;
    public boolean A0C = false;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        A0D = sparseIntArray;
        sparseIntArray.append(6, 1);
        A0D.append(7, 2);
        A0D.append(8, 3);
        A0D.append(4, 4);
        A0D.append(5, 5);
        A0D.append(0, 6);
        A0D.append(1, 7);
        A0D.append(2, 8);
        A0D.append(3, 9);
        A0D.append(9, 10);
        A0D.append(10, 11);
    }

    public void A00(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C14240ll.A0z);
        this.A0C = true;
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            switch (A0D.get(index)) {
                case 1:
                    this.A01 = obtainStyledAttributes.getFloat(index, this.A01);
                    break;
                case 2:
                    this.A02 = obtainStyledAttributes.getFloat(index, this.A02);
                    break;
                case 3:
                    this.A03 = obtainStyledAttributes.getFloat(index, this.A03);
                    break;
                case 4:
                    this.A04 = obtainStyledAttributes.getFloat(index, this.A04);
                    break;
                case 5:
                    this.A05 = obtainStyledAttributes.getFloat(index, this.A05);
                    break;
                case 6:
                    this.A06 = obtainStyledAttributes.getDimension(index, this.A06);
                    break;
                case 7:
                    this.A07 = obtainStyledAttributes.getDimension(index, this.A07);
                    break;
                case 8:
                    this.A08 = obtainStyledAttributes.getDimension(index, this.A08);
                    break;
                case 9:
                    this.A09 = obtainStyledAttributes.getDimension(index, this.A09);
                    break;
                case 10:
                    if (Build.VERSION.SDK_INT >= 21) {
                        this.A0A = obtainStyledAttributes.getDimension(index, this.A0A);
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (Build.VERSION.SDK_INT >= 21) {
                        this.A0B = true;
                        this.A00 = obtainStyledAttributes.getDimension(index, this.A00);
                        break;
                    } else {
                        break;
                    }
            }
        }
        obtainStyledAttributes.recycle();
    }
}
