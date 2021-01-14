package X;

import java.io.File;

/* renamed from: X.0mv  reason: invalid class name and case insensitive filesystem */
public class C14810mv {
    public final File A00;
    public final File A01;

    public C14810mv(File file) {
        this.A01 = file;
        StringBuilder sb = new StringBuilder();
        sb.append(file.getPath());
        sb.append(".bak");
        this.A00 = new File(sb.toString());
    }
}
