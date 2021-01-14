package X;

import android.app.Application;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import com.whatsapp.util.Log;
import java.io.File;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: X.00C  reason: invalid class name */
public class AnonymousClass00C {
    public static volatile AnonymousClass00C A08;
    public boolean A00;
    public boolean A01;
    public final AnonymousClass03R A02;
    public final AnonymousClass03S A03;
    public final AnonymousClass03T A04;
    public final AnonymousClass03T A05;
    public final AnonymousClass00T A06;
    public final List A07 = new CopyOnWriteArrayList();

    public AnonymousClass00C(AnonymousClass00G r5, AnonymousClass00T r6, AnonymousClass03R r7, AnonymousClass03S r8) {
        this.A06 = r6;
        this.A02 = r7;
        this.A03 = r8;
        Application application = r5.A00;
        this.A05 = new AnonymousClass03T(this, new File(r7.A02, ".trash"), r8);
        this.A04 = new AnonymousClass03T(this, new File(application.getFilesDir(), ".trash"), r8);
        String externalStorageState = Environment.getExternalStorageState();
        if ("mounted".equals(externalStorageState)) {
            this.A00 = false;
            this.A01 = false;
        } else if ("mounted_ro".equals(externalStorageState)) {
            this.A00 = false;
            this.A01 = true;
            Log.i("media-state-manager/main/media/read-only");
        } else {
            this.A00 = true;
            this.A01 = false;
            AnonymousClass008.A18("media-state-manager/main/media/unavailable ", externalStorageState);
        }
    }

    public static AnonymousClass00C A00() {
        if (A08 == null) {
            synchronized (AnonymousClass00C.class) {
                if (A08 == null) {
                    A08 = new AnonymousClass00C(AnonymousClass00G.A01, C002101e.A00(), AnonymousClass03R.A00(), AnonymousClass03S.A00());
                }
            }
        }
        return A08;
    }

    public static boolean A01() {
        try {
            return Environment.isExternalStorageRemovable();
        } catch (Exception e) {
            Log.w("media-state-manager/checkifremovable/error ", e);
            return true;
        }
    }

    public long A02() {
        try {
            StatFs statFs = new StatFs(Environment.getExternalStorageDirectory().getPath());
            if (Build.VERSION.SDK_INT < 18) {
                return ((long) statFs.getAvailableBlocks()) * ((long) statFs.getBlockSize());
            }
            return statFs.getBlockSizeLong() * statFs.getAvailableBlocksLong();
        } catch (ArithmeticException | IllegalArgumentException e) {
            Log.w("media-state-manager/avail-external-storage/error/", e);
            return 0;
        }
    }

    public long A03() {
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        if (Build.VERSION.SDK_INT < 18) {
            return ((long) statFs.getAvailableBlocks()) * ((long) statFs.getBlockSize());
        }
        return statFs.getBlockSizeLong() * statFs.getAvailableBlocksLong();
    }

    public long A04() {
        try {
            StatFs statFs = new StatFs(Environment.getExternalStorageDirectory().getPath());
            if (Build.VERSION.SDK_INT < 18) {
                return ((long) statFs.getBlockCount()) * ((long) statFs.getBlockSize());
            }
            return statFs.getBlockSizeLong() * statFs.getBlockCountLong();
        } catch (IllegalArgumentException e) {
            Log.w("media-state-manager/total-external-storage/error/illegal-arg", e);
            return 0;
        }
    }

    public long A05() {
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        if (Build.VERSION.SDK_INT < 18) {
            return ((long) statFs.getBlockCount()) * ((long) statFs.getBlockSize());
        }
        return statFs.getBlockSizeLong() * statFs.getBlockCountLong();
    }

    public File A06(File file) {
        if (this.A02.A06(file)) {
            return this.A05.A00("");
        }
        return this.A04.A00("");
    }

    public boolean A07() {
        return this.A00 || this.A01;
    }

    public boolean A08(AbstractC07200Wh r4) {
        String externalStorageState = Environment.getExternalStorageState();
        if (!"mounted".equals(externalStorageState) && !"mounted_ro".equals(externalStorageState)) {
            r4.ALM(externalStorageState);
            return false;
        } else if (Build.VERSION.SDK_INT < 23 || this.A03.A02("android.permission.READ_EXTERNAL_STORAGE") != -1) {
            return true;
        } else {
            r4.ALN();
            return false;
        }
    }

    public boolean A09(AbstractC07200Wh r4) {
        String externalStorageState = Environment.getExternalStorageState();
        if ("mounted_ro".equals(externalStorageState)) {
            r4.AJ0(externalStorageState);
            return false;
        } else if (!"mounted".equals(externalStorageState)) {
            r4.ALM(externalStorageState);
            return false;
        } else if (this.A03.A02("android.permission.WRITE_EXTERNAL_STORAGE") != -1) {
            return true;
        } else {
            r4.AJ1();
            return false;
        }
    }
}
