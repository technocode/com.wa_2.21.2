package X;

import java.io.File;

/* renamed from: X.04i  reason: invalid class name */
public class AnonymousClass04i {
    public static volatile AnonymousClass04i A01;
    public final AnonymousClass00G A00;

    public AnonymousClass04i(AnonymousClass00G r1) {
        this.A00 = r1;
    }

    public static AnonymousClass04i A00() {
        if (A01 == null) {
            synchronized (AnonymousClass04i.class) {
                A01 = new AnonymousClass04i(AnonymousClass00G.A01);
            }
        }
        return A01;
    }

    public static File[] A01(AnonymousClass00G r7) {
        File[] fileArr;
        File file = new File(r7.A00.getCacheDir(), "traces");
        if (!file.exists() || (fileArr = file.listFiles(AnonymousClass36L.A00)) == null) {
            fileArr = new File[0];
        }
        if (fileArr.length > 0) {
            return fileArr;
        }
        String[] strArr = {"traces.txt", "traces_com.whatsapp.txt"};
        int i = 0;
        do {
            File file2 = new File("/data/anr/", strArr[i]);
            if (file2.exists()) {
                return new File[]{file2};
            }
            i++;
        } while (i < 2);
        return new File[0];
    }
}
