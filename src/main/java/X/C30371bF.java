package X;

import dalvik.system.DexFile;
import java.io.File;
import java.lang.reflect.Constructor;

/* renamed from: X.1bF  reason: invalid class name and case insensitive filesystem */
public class C30371bF implements AbstractC15760of {
    public final Constructor A00;

    public C30371bF(Class cls) {
        Constructor constructor = cls.getConstructor(File.class, Boolean.TYPE, File.class, DexFile.class);
        this.A00 = constructor;
        constructor.setAccessible(true);
    }

    @Override // X.AbstractC15760of
    public Object ACJ(File file, DexFile dexFile) {
        return this.A00.newInstance(file, Boolean.FALSE, file, dexFile);
    }
}
