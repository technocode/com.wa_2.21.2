package X;

import android.database.AbstractWindowedCursor;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.os.Build;

/* renamed from: X.0qW  reason: invalid class name and case insensitive filesystem */
public class C16830qW {
    public static Cursor A00(AbstractC16780qQ r7, AbstractC17050qt r8, boolean z) {
        int i;
        r7.A00();
        r7.A01();
        Cursor A00 = ((C30761bu) r7.A00.A9w()).A00(r8);
        if (z && (A00 instanceof AbstractWindowedCursor)) {
            AbstractWindowedCursor abstractWindowedCursor = (AbstractWindowedCursor) A00;
            int count = abstractWindowedCursor.getCount();
            if (abstractWindowedCursor.hasWindow()) {
                i = abstractWindowedCursor.getWindow().getNumRows();
            } else {
                i = count;
            }
            if (Build.VERSION.SDK_INT < 23 || i < count) {
                try {
                    MatrixCursor matrixCursor = new MatrixCursor(abstractWindowedCursor.getColumnNames(), abstractWindowedCursor.getCount());
                    while (abstractWindowedCursor.moveToNext()) {
                        Object[] objArr = new Object[abstractWindowedCursor.getColumnCount()];
                        for (int i2 = 0; i2 < abstractWindowedCursor.getColumnCount(); i2++) {
                            int type = abstractWindowedCursor.getType(i2);
                            if (type == 0) {
                                objArr[i2] = null;
                            } else if (type == 1) {
                                objArr[i2] = Long.valueOf(abstractWindowedCursor.getLong(i2));
                            } else if (type == 2) {
                                objArr[i2] = Double.valueOf(abstractWindowedCursor.getDouble(i2));
                            } else if (type == 3) {
                                objArr[i2] = abstractWindowedCursor.getString(i2);
                            } else if (type == 4) {
                                objArr[i2] = abstractWindowedCursor.getBlob(i2);
                            } else {
                                throw new IllegalStateException();
                            }
                        }
                        matrixCursor.addRow(objArr);
                    }
                    return matrixCursor;
                } finally {
                    abstractWindowedCursor.close();
                }
            }
        }
        return A00;
    }
}
