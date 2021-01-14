package X;

import java.io.File;

/* renamed from: X.1LY  reason: invalid class name */
public class AnonymousClass1LY {
    public final long A00;
    public final long A01;
    public final File A02;
    public final String A03;

    public AnonymousClass1LY(File file) {
        this.A02 = file;
        this.A00 = file.lastModified();
        this.A01 = file.length();
        this.A03 = file.getName();
    }

    public boolean equals(Object obj) {
        return (obj instanceof AnonymousClass1LY) && this.A02.equals(((AnonymousClass1LY) obj).A02);
    }
}
