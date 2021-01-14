package X;

import com.whatsapp.util.Log;
import java.io.File;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.1WE  reason: invalid class name */
public class AnonymousClass1WE {
    public final long A00;
    public final File A01;
    public final AtomicBoolean A02;
    public final AtomicInteger A03 = new AtomicInteger();

    public AnonymousClass1WE(File file, boolean z) {
        this.A01 = file;
        this.A02 = new AtomicBoolean(z);
        long length = file.length();
        this.A00 = length;
        if (length == 0 && !file.exists()) {
            StringBuilder sb = new StringBuilder("mediafilereference/file does not exist: ");
            sb.append(file);
            Log.e(sb.toString());
        }
    }
}
