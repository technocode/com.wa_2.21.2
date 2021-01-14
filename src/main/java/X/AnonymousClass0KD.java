package X;

import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.util.Pair;
import androidx.core.content.FileProvider;
import com.whatsapp.util.Log;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.0KD  reason: invalid class name */
public class AnonymousClass0KD implements AnonymousClass0KE {
    public AnonymousClass0KF[] A00;
    public final AnonymousClass00G A01;
    public final AnonymousClass0KC A02;

    public AnonymousClass0KD(AnonymousClass00G r4, AnonymousClass0KC r5) {
        this.A01 = r4;
        this.A02 = r5;
        this.A00 = new AnonymousClass0KF[]{new AnonymousClass0KG(r4), new AnonymousClass0KH(r4)};
    }

    @Override // X.AnonymousClass0KE
    public AnonymousClass32C A94(List list, Context context) {
        double d;
        AnonymousClass00E.A00();
        if (list.isEmpty()) {
            return null;
        }
        AnonymousClass32C r6 = new AnonymousClass32C();
        int i = 0;
        while (true) {
            AnonymousClass0KF[] r1 = this.A00;
            if (i >= r1.length) {
                return r6;
            }
            AnonymousClass0KF r9 = r1[i];
            if (r9.ABg()) {
                ArrayList arrayList = new ArrayList();
                AnonymousClass32E A002 = AnonymousClass32E.A00(this.A02, context, list);
                int i2 = A002.A00;
                if (i2 == 0) {
                    return r6;
                }
                Map map = A002.A01;
                ArrayList arrayList2 = new ArrayList();
                Iterator it = map.entrySet().iterator();
                while (true) {
                    int i3 = 0;
                    if (it.hasNext()) {
                        Map.Entry entry = (Map.Entry) it.next();
                        AbstractC007503q r2 = (AbstractC007503q) entry.getKey();
                        AnonymousClass32B r5 = (AnonymousClass32B) entry.getValue();
                        File file = r5.A00;
                        try {
                            Uri A9b = FileProvider.A00(this.A01.A00, "com.whatsapp.fileprovider").A9b(file);
                            Pair create = Pair.create(0, 0);
                            boolean z = r2 instanceof AnonymousClass0MI;
                            String str = "";
                            if (z || (r2 instanceof AnonymousClass0MO)) {
                                String A0v = ((AnonymousClass0M3) r2).A0v();
                                if (A0v != null) {
                                    str = A0v;
                                }
                                if (z) {
                                    BitmapFactory.Options options = new BitmapFactory.Options();
                                    options.inJustDecodeBounds = true;
                                    BitmapFactory.decodeFile(file.getAbsolutePath(), options);
                                    create = new Pair(Integer.valueOf(options.outHeight), Integer.valueOf(options.outWidth));
                                } else {
                                    create = C02230Bd.A0H(file);
                                }
                            } else if (r2 instanceof C05490Ot) {
                                BitmapFactory.Options options2 = new BitmapFactory.Options();
                                options2.inJustDecodeBounds = true;
                                BitmapFactory.decodeFile(file.getAbsolutePath(), options2);
                                create = new Pair(Integer.valueOf(options2.outHeight), Integer.valueOf(options2.outWidth));
                            }
                            if (A9b == null) {
                                continue;
                            } else {
                                Object obj = create.first;
                                if (obj != null) {
                                    double intValue = (double) ((Number) obj).intValue();
                                    Object obj2 = create.second;
                                    if (obj2 != null) {
                                        double intValue2 = (double) ((Number) obj2).intValue();
                                        if (intValue == 0.0d) {
                                            d = 0.0d;
                                        } else {
                                            d = intValue2 / intValue;
                                        }
                                        int A08 = C02230Bd.A08(file);
                                        String str2 = r5.A01;
                                        arrayList2.add(A9b);
                                        arrayList.add(new AnonymousClass32D(A08, d, A9b, str, str2));
                                    } else {
                                        throw null;
                                    }
                                } else {
                                    throw null;
                                }
                            }
                        } catch (IllegalArgumentException unused) {
                            Log.w("getSharingIntent: Attempting to share file failed");
                        }
                    } else {
                        Intent A93 = r9.A93(i2, arrayList);
                        r6.A01 = A93;
                        r6.A02 = arrayList2;
                        if (A93 == null) {
                            if (r9 instanceof AnonymousClass0KG) {
                                if (i2 == 5) {
                                    i3 = 1;
                                } else if (i2 == 4) {
                                    i3 = 2;
                                }
                            }
                            r6.A00 = i3;
                            return r6;
                        }
                        if (arrayList2.size() > 0) {
                            ClipData newRawUri = ClipData.newRawUri(null, (Uri) arrayList2.get(0));
                            for (int i4 = 1; i4 < arrayList2.size(); i4++) {
                                newRawUri.addItem(new ClipData.Item((Uri) arrayList2.get(i4)));
                            }
                            if (newRawUri != null) {
                                A93.setClipData(newRawUri);
                            }
                        }
                        A93.addFlags(1);
                        return r6;
                    }
                }
            } else {
                i++;
            }
        }
    }
}
