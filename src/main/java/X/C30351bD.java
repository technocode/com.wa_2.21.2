package X;

import dalvik.system.DexFile;
import java.io.File;
import java.lang.reflect.Constructor;
import java.util.zip.ZipFile;

/* renamed from: X.1bD  reason: invalid class name and case insensitive filesystem */
public class C30351bD implements AbstractC15760of {
    public final Constructor A00;

    public C30351bD(Class cls) {
        Constructor constructor = cls.getConstructor(File.class, ZipFile.class, DexFile.class);
        this.A00 = constructor;
        constructor.setAccessible(true);
    }

    @Override // X.AbstractC15760of
    public Object ACJ(File file, DexFile dexFile) {
        return this.A00.newInstance(file, new ZipFile(file), dexFile);
    }
}
