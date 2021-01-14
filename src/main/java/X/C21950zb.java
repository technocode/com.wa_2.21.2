package X;

import android.util.SparseArray;

/* renamed from: X.0zb  reason: invalid class name and case insensitive filesystem */
public class C21950zb {
    public final SparseArray A00 = new SparseArray();
    public final SparseArray A01 = new SparseArray();
    public final SparseArray A02 = new SparseArray();

    public C33331gZ A00(AnonymousClass0VV r3) {
        SparseArray sparseArray = this.A02;
        r3.A01();
        return (C33331gZ) sparseArray.get(r3.mCameraId);
    }

    public AnonymousClass0VO A01(AnonymousClass0VV r3) {
        SparseArray sparseArray = this.A00;
        r3.A01();
        return (AnonymousClass0VO) sparseArray.get(r3.mCameraId);
    }

    public AnonymousClass0VN A02(AnonymousClass0VV r3) {
        SparseArray sparseArray = this.A01;
        r3.A01();
        return (AnonymousClass0VN) sparseArray.get(r3.mCameraId);
    }
}
