package X;

import android.content.Context;
import java.io.File;
import java.io.FilenameFilter;

/* renamed from: X.10U  reason: invalid class name */
public class AnonymousClass10U {
    public static final FilenameFilter A06 = new AnonymousClass10Q();
    public static final FilenameFilter A07 = new AnonymousClass10R();
    public int A00 = 0;
    public long A01 = 0;
    public AnonymousClass10T A02 = new AnonymousClass10T();
    public File A03;
    public File A04;
    public final File A05;

    public AnonymousClass10U(Context context, File file) {
        if (file.exists() || file.mkdirs()) {
            this.A05 = file;
        } else {
            this.A05 = new File(context.getFilesDir(), "profilo");
            File file2 = new File(context.getCacheDir(), "profilo");
            if (file2.exists()) {
                file2.renameTo(this.A05);
            }
            if (!this.A05.exists() && !this.A05.mkdirs()) {
                throw new IllegalStateException("Unable to initialize Profilo folder");
            }
        }
        this.A04 = new File(this.A05, "upload");
        new File(this.A05, "crash_dumps");
        this.A03 = new File(this.A05, "mmap_buffer");
    }
}
