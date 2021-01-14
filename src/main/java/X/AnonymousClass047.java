package X;

import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.nio.channels.FileLock;

/* renamed from: X.047  reason: invalid class name */
public final class AnonymousClass047 implements Closeable {
    public final FileOutputStream A00;
    public final FileLock A01;

    public AnonymousClass047(File file) {
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        this.A00 = fileOutputStream;
        try {
            FileLock lock = fileOutputStream.getChannel().lock();
            if (lock == null) {
            }
            this.A01 = lock;
        } finally {
            this.A00.close();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        try {
            FileLock fileLock = this.A01;
            if (fileLock != null) {
                fileLock.release();
            }
        } finally {
            this.A00.close();
        }
    }
}
