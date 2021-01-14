package X;

import dalvik.system.DexFile;
import java.io.File;
import java.lang.reflect.Constructor;

/* renamed from: X.1bE  reason: invalid class name and case insensitive filesystem */
public class C30361bE implements AbstractC15760of {
    public final Constructor A00;

    public C30361bE(Class cls) {
        Constructor constructor = cls.getConstructor(File.class, File.class, DexFile.class);
        this.A00 = constructor;
        constructor.setAccessible(true);
    }

    @Override // X.AbstractC15760of
    public Object ACJ(File file, DexFile dexFile) {
        return this.A00.newInstance(file, file, dexFile);
    }
}
