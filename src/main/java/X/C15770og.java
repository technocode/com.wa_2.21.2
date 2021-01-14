package X;

import java.io.File;
import java.io.FileFilter;

/* renamed from: X.0og  reason: invalid class name and case insensitive filesystem */
public class C15770og implements FileFilter {
    public final /* synthetic */ C003901w A00;

    public C15770og(C003901w r1) {
        this.A00 = r1;
    }

    public boolean accept(File file) {
        return !file.getName().equals("MultiDex.lock");
    }
}
