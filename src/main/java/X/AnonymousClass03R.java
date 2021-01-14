package X;

import android.os.Build;
import android.os.Environment;
import android.os.UserManager;
import com.whatsapp.util.Log;
import java.io.File;

/* renamed from: X.03R  reason: invalid class name */
public class AnonymousClass03R {
    public static volatile AnonymousClass03R A03;
    public final AnonymousClass00G A00;
    public final AnonymousClass00D A01;
    public final File A02;

    public AnonymousClass03R(AnonymousClass00G r7, AnonymousClass00D r8) {
        File A032;
        this.A00 = r7;
        this.A01 = r8;
        if (!A01()) {
            A032 = new File(Environment.getExternalStorageDirectory(), "WhatsApp");
        } else {
            String string = this.A01.A00.getString("external_storage_type", null);
            StringBuilder sb = new StringBuilder("externaldir/saved storage is ");
            sb.append(string);
            Log.d(sb.toString());
            if ("legacy".equals(string)) {
                A032 = new File(Environment.getExternalStorageDirectory(), "WhatsApp");
            } else {
                A032 = A03();
                if (A032 == null) {
                    Log.d("externaldir/scoped dir is supported, but isn't provided by the system");
                    A032 = new File(Environment.getExternalStorageDirectory(), "WhatsApp");
                } else if (!"scoped".equals(string)) {
                    A032 = new File(Environment.getExternalStorageDirectory(), "WhatsApp");
                    AnonymousClass008.A16("externaldir/set storage to ", "legacy");
                    this.A01.A00.edit().putString("external_storage_type", "legacy").commit();
                }
            }
        }
        this.A02 = A032;
    }

    public static AnonymousClass03R A00() {
        if (A03 == null) {
            synchronized (AnonymousClass03R.class) {
                if (A03 == null) {
                    A03 = new AnonymousClass03R(AnonymousClass00G.A01, AnonymousClass00D.A00());
                }
            }
        }
        return A03;
    }

    public static boolean A01() {
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            return !UserManager.supportsMultipleUsers() || Build.VERSION.PREVIEW_SDK_INT > 0 || i >= 30;
        }
        return false;
    }

    public File A02() {
        return new File(this.A02, "Backups");
    }

    public File A03() {
        File[] externalMediaDirs;
        File file;
        if (!A01() || (externalMediaDirs = this.A00.A00.getExternalMediaDirs()) == null || externalMediaDirs.length <= 0 || (file = externalMediaDirs[0]) == null) {
            return null;
        }
        return new File(file, "WhatsApp");
    }

    public File A04(File file) {
        if (file == null) {
            return null;
        }
        if (!file.isAbsolute()) {
            return new File(this.A02, file.getPath());
        }
        int indexOf = file.getAbsolutePath().indexOf("Media/WhatsApp ");
        if (A06(file) || indexOf <= 0) {
            return file;
        }
        return new File(this.A02, file.getAbsolutePath().substring(indexOf));
    }

    public String A05(File file) {
        if (!file.isAbsolute()) {
            return file.getPath();
        }
        String absolutePath = file.getAbsolutePath();
        StringBuilder sb = new StringBuilder();
        sb.append(this.A02.getAbsolutePath());
        sb.append("/");
        return absolutePath.replace(sb.toString(), "");
    }

    public boolean A06(File file) {
        return file.getAbsolutePath().startsWith(this.A02.getAbsolutePath());
    }
}
