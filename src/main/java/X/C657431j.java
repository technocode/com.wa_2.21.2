package X;

import android.app.Application;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: X.31j  reason: invalid class name and case insensitive filesystem */
public class C657431j {
    public static volatile C657431j A03;
    public final AnonymousClass0CL A00;
    public final AnonymousClass00G A01;
    public final C007703s A02;

    public C657431j(AnonymousClass00G r1, AnonymousClass0CL r2, C007703s r3) {
        this.A01 = r1;
        this.A00 = r2;
        this.A02 = r3;
    }

    public C657731m A00() {
        File A022 = A02(false);
        if (A022.exists() && new File(A022, "thumbnails").exists()) {
            return new C657731m(A03("dark"), A03("light"));
        }
        return null;
    }

    public File A01(String str) {
        File A022 = A02(false);
        if (!A022.exists()) {
            return null;
        }
        File file = new File(A022, AnonymousClass008.A0K(str, ".jpg"));
        if (file.exists()) {
            return file;
        }
        return null;
    }

    public File A02(boolean z) {
        Application application = this.A01.A00;
        if (!z) {
            return new File(application.getFilesDir(), "downloadable/wallpaper");
        }
        return new File(application.getCacheDir(), "downloadable/wallpaper_tmp");
    }

    public final List A03(String str) {
        File A022 = A02(false);
        if (!A022.exists()) {
            return new ArrayList();
        }
        File file = new File(A022, "thumbnails");
        if (!file.exists()) {
            return new ArrayList();
        }
        File file2 = new File(file, str);
        if (!file2.exists()) {
            return new ArrayList();
        }
        File[] listFiles = file2.listFiles();
        if (listFiles == null) {
            return new ArrayList();
        }
        Arrays.sort(listFiles, AnonymousClass31i.A00);
        return Arrays.asList(listFiles);
    }
}
