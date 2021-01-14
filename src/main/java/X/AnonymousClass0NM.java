package X;

import android.content.ContentUris;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Build;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* renamed from: X.0NM  reason: invalid class name */
public class AnonymousClass0NM {
    public static final AnonymousClass08V A00 = new AnonymousClass08V(16);
    public static final AnonymousClass05W A01 = new AnonymousClass05W();
    public static final AnonymousClass0NP A02 = new AnonymousClass0NP();
    public static final Object A03 = new Object();
    public static final Comparator A04 = new C14760mq();

    public static AnonymousClass0NN A00(Context context, AnonymousClass0N5 r23, int i) {
        C14770mr r0;
        Cursor cursor;
        Uri uri;
        boolean z;
        try {
            PackageManager packageManager = context.getPackageManager();
            Resources resources = context.getResources();
            String str = r23.A01;
            ProviderInfo resolveContentProvider = packageManager.resolveContentProvider(str, 0);
            if (resolveContentProvider != null) {
                String str2 = resolveContentProvider.packageName;
                String str3 = r23.A02;
                if (str2.equals(str3)) {
                    Signature[] signatureArr = packageManager.getPackageInfo(str2, 64).signatures;
                    ArrayList arrayList = new ArrayList();
                    for (Signature signature : signatureArr) {
                        arrayList.add(signature.toByteArray());
                    }
                    Comparator comparator = A04;
                    Collections.sort(arrayList, comparator);
                    List list = r23.A04;
                    if (list == null) {
                        list = AnonymousClass0N2.A0v(resources, 0);
                    }
                    int i2 = 0;
                    while (true) {
                        if (i2 >= list.size()) {
                            r0 = new C14770mr(1, null);
                            break;
                        }
                        ArrayList arrayList2 = new ArrayList((Collection) list.get(i2));
                        Collections.sort(arrayList2, comparator);
                        if (arrayList.size() == arrayList2.size()) {
                            for (int i3 = 0; i3 < arrayList.size(); i3++) {
                                if (Arrays.equals((byte[]) arrayList.get(i3), (byte[]) arrayList2.get(i3))) {
                                }
                            }
                            String str4 = resolveContentProvider.authority;
                            ArrayList arrayList3 = new ArrayList();
                            Uri build = new Uri.Builder().scheme("content").authority(str4).build();
                            Uri build2 = new Uri.Builder().scheme("content").authority(str4).appendPath("file").build();
                            if (Build.VERSION.SDK_INT > 16) {
                                cursor = context.getContentResolver().query(build, new String[]{"_id", "file_id", "font_ttc_index", "font_variation_settings", "font_weight", "font_italic", "result_code"}, "query = ?", new String[]{r23.A03}, null, null);
                            } else {
                                cursor = context.getContentResolver().query(build, new String[]{"_id", "file_id", "font_ttc_index", "font_variation_settings", "font_weight", "font_italic", "result_code"}, "query = ?", new String[]{r23.A03}, null);
                            }
                            if (cursor != null) {
                                try {
                                    if (cursor.getCount() > 0) {
                                        int columnIndex = cursor.getColumnIndex("result_code");
                                        arrayList3 = new ArrayList();
                                        int columnIndex2 = cursor.getColumnIndex("_id");
                                        int columnIndex3 = cursor.getColumnIndex("file_id");
                                        int columnIndex4 = cursor.getColumnIndex("font_ttc_index");
                                        int columnIndex5 = cursor.getColumnIndex("font_weight");
                                        int columnIndex6 = cursor.getColumnIndex("font_italic");
                                        while (cursor.moveToNext()) {
                                            int i4 = columnIndex != -1 ? cursor.getInt(columnIndex) : 0;
                                            int i5 = columnIndex4 != -1 ? cursor.getInt(columnIndex4) : 0;
                                            if (columnIndex3 == -1) {
                                                uri = ContentUris.withAppendedId(build, cursor.getLong(columnIndex2));
                                            } else {
                                                uri = ContentUris.withAppendedId(build2, cursor.getLong(columnIndex3));
                                            }
                                            int i6 = columnIndex5 != -1 ? cursor.getInt(columnIndex5) : 400;
                                            if (columnIndex6 != -1) {
                                                z = true;
                                                if (cursor.getInt(columnIndex6) == 1) {
                                                    arrayList3.add(new C14780ms(uri, i5, i6, z, i4));
                                                }
                                            }
                                            z = false;
                                            arrayList3.add(new C14780ms(uri, i5, i6, z, i4));
                                        }
                                    }
                                } finally {
                                    cursor.close();
                                }
                            }
                            r0 = new C14770mr(0, (C14780ms[]) arrayList3.toArray(new C14780ms[0]));
                        }
                        i2++;
                    }
                    int i7 = r0.A00;
                    int i8 = -3;
                    if (i7 == 0) {
                        Typeface A05 = AnonymousClass0My.A01.A05(context, null, r0.A01, i);
                        if (A05 != null) {
                            i8 = 0;
                        }
                        return new AnonymousClass0NN(A05, i8);
                    }
                    if (i7 == 1) {
                        i8 = -2;
                    }
                    return new AnonymousClass0NN(null, i8);
                }
                StringBuilder A0Z = AnonymousClass008.A0Z("Found content provider ", str, ", but package was not ");
                A0Z.append(str3);
                throw new PackageManager.NameNotFoundException(A0Z.toString());
            }
            throw new PackageManager.NameNotFoundException(AnonymousClass008.A0K("No package found for authority: ", str));
        } catch (PackageManager.NameNotFoundException unused) {
            return new AnonymousClass0NN(null, -1);
        }
    }
}
